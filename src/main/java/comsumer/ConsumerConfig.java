package comsumer;

import kafka.KafkaConstant;
import kafka.KafkaService;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.ListConsumerGroupOffsetsResult;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import view.App;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutionException;


public class ConsumerConfig {
  private String group_id = "xxxaaaa";
  public KafkaConsumer create(String topic) {

        String bootstrapServers = "13.76.157.231:9092,20.184.4.77:9092,104.42.73.42:9092";
        String grp_id = String.valueOf(group_id);

        //Creating consumer properties
        Properties properties = new Properties();
        properties.setProperty(org.apache.kafka.clients.consumer.ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        properties.setProperty(org.apache.kafka.clients.consumer.ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(org.apache.kafka.clients.consumer.ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class.getName());
        properties.setProperty(org.apache.kafka.clients.consumer.ConsumerConfig.GROUP_ID_CONFIG, grp_id);

        //latest - earliest
        properties.setProperty(org.apache.kafka.clients.consumer.ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");

        //creating consumer
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);

        //Subscribing
        consumer.subscribe(Arrays.asList(topic));

        return consumer;
    }

    public void listen(KafkaConsumer consumer, App app, String topic) {
        AdminClient adminClient = (new KafkaService()).getAdminClient();
        ListConsumerGroupOffsetsResult listConsumerGroupOffsetsResult ;
        long startEachMinute = System.currentTimeMillis();
        long endEachMinute = System.currentTimeMillis();
        long countReceiveMessage = 0;
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(0));
            app.reRender(records, topic);
            endEachMinute = System.currentTimeMillis();
            if ((endEachMinute - startEachMinute) >= KafkaConstant.TIME) {
                listConsumerGroupOffsetsResult = adminClient.listConsumerGroupOffsets(group_id);
                try {
                    Map<TopicPartition, OffsetAndMetadata> metadataMap = listConsumerGroupOffsetsResult.partitionsToOffsetAndMetadata().get();
                    List<String> stringList = new ArrayList<>();
                    stringList.add("Consumer"+consumer.hashCode());
                    stringList.add("    poll each " + KafkaConstant.TIME + " ms: " + countReceiveMessage);
                    for (Map.Entry<TopicPartition, OffsetAndMetadata> entry : metadataMap.entrySet()) {
                        if (entry.getKey().topic().equals(topic)) {
                            stringList.add("    offset: " + entry.getValue().offset() + ", endOffsets: " + consumer.endOffsets(Collections.singleton(entry.getKey())));
                        }
                    }
                    stringList.add("    -------------------------------");
                    stringList.add(" ");
                    app.updateListMessage(stringList);
                    startEachMinute = endEachMinute;
                    countReceiveMessage = 0;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
            countReceiveMessage += records.count();
        }
    }
}