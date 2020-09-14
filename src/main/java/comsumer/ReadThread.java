package comsumer;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import view.App;

public class ReadThread extends Thread {
    private KafkaConsumer consumer;
    private Config config;
    private App app;

    public ReadThread(App app) {
        this.app = app;
        config = new Config();
        consumer = config.create();
    }

    @Override
    public void run() {
       config.listen(consumer, app);
    }
}
