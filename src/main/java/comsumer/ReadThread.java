package comsumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import view.App;

public class ReadThread extends Thread {
    private KafkaConsumer consumer;
    private ConsumerConfig consumerConfig;
    private App app;

    public ReadThread(App app) {
        this.app = app;
        consumerConfig = new ConsumerConfig();
        consumer = consumerConfig.create();
    }

    @Override
    public void run() {
        consumerConfig.listen(consumer, app);
    }
}
