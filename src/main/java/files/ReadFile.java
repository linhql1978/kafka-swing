package files;

import kafka.KafkaConstant;
import kafka.KafkaService;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.QuickFixService;
import view.App;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile extends Thread {
  private String pathFile;
  private JProgressBar jProgressBar;
  volatile boolean paused;
  volatile boolean cancel;
  private App app;

  Logger logger = LoggerFactory.getLogger(ReadFile.class);

  public ReadFile(String pathFile, JProgressBar jProgressBar, App app) {
    this.pathFile = pathFile;
    this.jProgressBar = jProgressBar;
    this.app = app;
    paused = false;
    cancel = false;
    logger.info("init " + this);

  }

  public ReadFile(String pathFile, JProgressBar jProgressBar) {
    this.pathFile = pathFile;
    this.jProgressBar = jProgressBar;
    paused = false;
    cancel = false;
    logger.info("init " + this);
  }

  @Override
  public void run() {
    logger.info(this + " run...");
    long startTime = System.currentTimeMillis();
    QuickFixService quickFixService = new QuickFixService();
    quickFixService.init();
    KafkaService kafkaService = new KafkaService();
    KafkaProducer<String, String> kafkaProducer = kafkaService.createProducer("0", 5, 16834);
    AtomicInteger i = new AtomicInteger();
    List<String> stringList = new ArrayList<>();
    long size = 0;
    try {
      Stream<String> streamData = Files.lines(Paths.get(pathFile));
      List<String> listData = streamData.collect(Collectors.toList());
      String fileName = pathFile.split("/")[pathFile.split("/").length - 1];
      size = listData.size();
      long sizeBytes = (new File(pathFile)).length();
      {
        stringList.clear();
        stringList.add("File name: " + fileName);
        stringList.add("Size of file: " + sizeBytes + " bytes");
        stringList.add("--------------------------------------");
        stringList.add(" ");
        app.updateListMessage(stringList);
      }
      logger.info("File name: " + pathFile + "; Size: " + sizeBytes);
      String str;
      jProgressBar.setValue(0);
      jProgressBar.setString("read...");
      long count = 0;
      double percent;
      String strConvert;
      long startEachTime = System.currentTimeMillis();
      long endEachTime = System.currentTimeMillis();
      long countSendMessage = 0;
      for (int j = 0; j < size; j++) {
        while (paused && cancel == false) {
          jProgressBar.setString("pause");
        }
        if (cancel) {
          logger.info("Cancel process read file");
          jProgressBar.setString("cancel");
          jProgressBar.setValue(0);
          break;
        }
        str = listData.get(j);
        strConvert = quickFixService.convert(str);
        if (!strConvert.equals("")) {
          i.incrementAndGet();
          countSendMessage++;
          kafkaProducer.send(new ProducerRecord<>(KafkaConstant.TOPIC_NAME, strConvert));
        }
        endEachTime = System.currentTimeMillis();
        if ((endEachTime - startEachTime) >= KafkaConstant.TIME) {
          stringList.clear();
          stringList.add("KafkaProducer" + kafkaProducer.hashCode());
          stringList.add("    send each " + KafkaConstant.TIME + " ms: " + countSendMessage);
          stringList.add("    -----------------------------------");
          stringList.add(" ");
          app.updateListMessage(stringList);
          startEachTime = endEachTime;
          countSendMessage = 0;
        }
        count++;
        percent = ((double) count / size) * 100;
        percent = (double) Math.round(percent * 100) / 100;
        jProgressBar.setString(percent + " %");
        jProgressBar.setValue((int) percent);
        try {
          Thread.currentThread().sleep(0);
        } catch (InterruptedException e) {
          logger.error(e + " at " + e.getStackTrace()[0]);
        }
      }
    } catch (IOException exception) {
      logger.error(exception + " at " + exception.getStackTrace()[0]);
    } catch (Exception exception) {
      logger.error(exception + " at " + exception.getStackTrace()[0]);
    }
    if (!cancel) {
      jProgressBar.setValue(100);
      jProgressBar.setString("success");
      app.initBtnClick();
      cancel = true;
    }
    kafkaProducer.close();
    long endTime = System.currentTimeMillis();
    {
      stringList.clear();
      stringList.add("KafkaProducer" + kafkaProducer.hashCode());
      stringList.add("    Total line in file: " + size + ", line number sent: " + i.get());
      stringList.add("    Time to read file: " + (endTime - startTime) + " ms");
      stringList.add("    ------------------------------------");
      stringList.add(" ");
      app.updateListMessage(stringList);
    }
    logger.info("Total line in file: " + size + ", line number sent: " + i.get());
    logger.info("Time to read file: " + (endTime - startTime) + " ms");
    logger.info("End " + this + "----------------------------------------");
  }
}
