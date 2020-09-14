package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockInfoModel {
    private String SymbolID;
    private String Symbol;
    private String BoardCode;
    private String TradingSessionID;
    private String TradeSesStatus;
    private String SecurityTradingStatus;
    private String ListingStatus;
}
