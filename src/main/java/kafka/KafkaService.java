package kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class KafkaService {
    static Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public KafkaProducer<String, String> createProducer(String ack, int linger, int batchSize) {
        Properties producerConfig = new Properties();
        producerConfig.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstant.KAFKA_BROKER);
        producerConfig.put(ProducerConfig.LINGER_MS_CONFIG, linger);
        producerConfig.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
        producerConfig.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        producerConfig.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        KafkaProducer kafkaProducer = new KafkaProducer<String, String>(producerConfig);
        logger.info("Create KafkaProducer: " + kafkaProducer);
        return kafkaProducer;
    }
}
