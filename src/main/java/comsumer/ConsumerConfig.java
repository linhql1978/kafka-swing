package comsumer;

import kafka.KafkaService;
import org.apache.kafka.clients.KafkaClient;
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
    private String group_id = String.valueOf(new Date().hashCode());

    public KafkaConsumer create() {
        String bootstrapServers = "13.76.157.231:9092,20.184.4.77:9092,104.42.73.42:9092";
        String grp_id = String.valueOf(group_id);
        String topic = "stock-info";

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

    public void listen(KafkaConsumer consumer, App app) {
        AdminClient adminClient = (new KafkaService()).getAdminClient();
        ListConsumerGroupOffsetsResult listConsumerGroupOffsetsResult ;
        long startEachMinute = System.currentTimeMillis();
        long endEachMinute = System.currentTimeMillis();
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(0));
            app.reRender(records);
            endEachMinute = System.currentTimeMillis();
            if ((endEachMinute - startEachMinute) >= 15000) {
                listConsumerGroupOffsetsResult = adminClient.listConsumerGroupOffsets(group_id);
                try {
                    Map<TopicPartition, OffsetAndMetadata> metadataMap = listConsumerGroupOffsetsResult.partitionsToOffsetAndMetadata().get();
                    for (Map.Entry<TopicPartition, OffsetAndMetadata> entry : metadataMap.entrySet()) {
                        System.out.println("topic: " + entry.getKey().topic() + ", partition: " + entry.getKey().partition() +
                                ", offset: " + entry.getValue().offset() + ", endOffsets: " + consumer.endOffsets(Collections.singleton(entry.getKey())));
                    }
                    System.out.println("-------------------------");
                    startEachMinute = endEachMinute;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}