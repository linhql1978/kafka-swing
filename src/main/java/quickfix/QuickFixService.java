package quickfix;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.messages.Message;
import quickfix.messages.MessageFactory;
import quickfix.messages.StockInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuickFixService {

  private DataDictionary dataDictionary;
  private Gson gson;
  Logger logger = LoggerFactory.getLogger(QuickFixService.class);

  public void init() {
    logger.info(this + " call init()");
    gson = new Gson();
    try {
      dataDictionary = new DataDictionary("spec/CustomFIX.xml");
    } catch (ConfigError configError) {
      logger.info(configError + " at " + configError.getStackTrace()[0]);
    }
  }

  public String convert(String str) {
    boolean check = false;
    try {
      str += ("10=" + MessageUtils.checksum(str) + "\u0001");
      Message message = (Message) MessageUtils.parse(new MessageFactory(), dataDictionary, str);
      List<JsonObject> listJsonData = new ArrayList<>();
      JsonObject jsonObject = new JsonObject();
      Iterator<Field<?>> iterator = message.iterator();
      while (iterator.hasNext()) {
        Field<?> field = iterator.next();
        jsonObject.addProperty(dataDictionary.getFieldName(field.getField()) != null ? dataDictionary.getFieldName(field.getField()) : "" + field.getTag() + "", (String) field.getObject());
        if (((String) field.getObject()).equals("VET") && dataDictionary.getFieldName(field.getField()).equals("Symbol")) {
          // if Symbol=VET
          check = true;
        }
      }
      listJsonData.add(jsonObject);
      Iterator<Integer> iteratorKeys = message.groupKeyIterator();
      int key;
      while (iteratorKeys.hasNext()) {
        key = iteratorKeys.next();
        for (Group group : message.getGroups(key)) {
          iterator = group.iterator();
          jsonObject = new JsonObject();
          while (iterator.hasNext()) {
            Field<?> field = iterator.next();
            jsonObject.addProperty(dataDictionary.getFieldName(field.getField()) != null ? dataDictionary.getFieldName(field.getField()) : "" + field.getTag() + "", (String) field.getObject());
          }
          listJsonData.add(jsonObject);
        }
      }
      if (((Message.Header) message.getHeader()).getMsgType().getObject().equals(StockInfo.MSGTYPE) && check) {
          return gson.toJson(listJsonData);
      }
    } catch (InvalidMessage | FieldNotFound | NoClassDefFoundError invalidMessage) {
      logger.info(invalidMessage + " at " + invalidMessage.getStackTrace()[0]);
    } catch (Exception e) {
      logger.info(e + " at " + e.getStackTrace()[0]);
    }

    return "";
  }
}
