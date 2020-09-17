package comsumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import view.App;

public class ReadThread extends Thread {
    private KafkaConsumer consumer;
    private ConsumerConfig consumerConfig;
    private App app;
    private String topic;

    public ReadThread(App app, String topic) {
        this.app = app;
        consumerConfig = new ConsumerConfig();
        consumer = consumerConfig.create(topic);
        this.topic = topic;
    }

    @Override
    public void run() {
        consumerConfig.listen(consumer, app, topic);
    }
}
