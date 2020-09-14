package files;

import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import view.App;

import javax.swing.*;

@Setter
@Getter
public class FileService {

  private ReadFile readFile;
  private String pathFile;
  private JProgressBar jProgressBar;
  private App app;
  Logger logger = LoggerFactory.getLogger(FileService.class);

  public FileService(JProgressBar jProgressBar, App app) {
    this.jProgressBar = jProgressBar;
    this.app = app;
    logger.info("init "+this);
  }

  public FileService() {
    logger.info("init "+this);
  }

  public FileService(JProgressBar jProgressBar) {
    this.jProgressBar = jProgressBar;
    logger.info("init "+this);
  }

  public void send() {
    if ((readFile == null && pathFile != null) || (readFile != null && readFile.cancel == true)) {
      readFile = new ReadFile(pathFile,jProgressBar, app);
      readFile.start();
    } else {
      logger.info("send illegal");
    }
  }

  public void pause() {
    if (readFile != null && readFile.paused == false && readFile.cancel == false) {
      readFile.paused = true;
    } else {
      logger.info("pause illegal");
    }
  }

  public void resume() {
    if (readFile != null && readFile.paused == true && readFile.cancel == false) {
      readFile.paused = false;
    } else {
      logger.info("resume illegal");
    }
  }

  public void cancel() {
    if (readFile != null && readFile.cancel == false) {
      readFile.cancel = true;
    } else {
      logger.info("cancel illegal");
    }
  }

}
