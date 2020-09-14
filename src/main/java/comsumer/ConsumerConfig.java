package comsumer;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import view.App;

import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;


public class ConsumerConfig {
    public KafkaConsumer create() {
        String bootstrapServers = "13.76.157.231:9092,20.184.4.77:9092,104.42.73.42:9092";
        String grp_id = String.valueOf((new Date().hashCode()));
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
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(0));
            app.reRender(records);
        }
    }
}