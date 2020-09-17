package kafka;

import quickfix.messages.StockInfo;
import quickfix.messages.TopNPrice;

import java.util.HashMap;
import java.util.Map;

public class KafkaConstant {
    public static String KAFKA_BROKER =
            "13.76.157.231:9092,20.184.4.77:9092,104.42.73.42:9092";
    public static String TOPIC_NAME = "stock-info";
    public static Map<String, String> MY_TOPIC_NAME = new HashMap<>();
    {
        MY_TOPIC_NAME.put(StockInfo.MSGTYPE, "stock-info");
        MY_TOPIC_NAME.put(TopNPrice.MSGTYPE, "top-n-price");
    }
    public static String GROUP_ID = "first_app";
}
