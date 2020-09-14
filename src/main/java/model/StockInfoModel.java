package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockInfoModel {
    private String SymbolID;
    private String Symbol;
    private String BoardCode;
    private String TradingSessionID;
    private String TradeSesStatus;
    private String SecurityTradingStatus;
    private String ListingStatus;

    @Override
    public String toString() {
        return "StockInfoModel{" +
                "SymbolID='" + SymbolID + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", BoardCode='" + BoardCode + '\'' +
                ", TradingSessionID='" + TradingSessionID + '\'' +
                ", TradeSesStatus='" + TradeSesStatus + '\'' +
                ", SecurityTradingStatus='" + SecurityTradingStatus + '\'' +
                ", ListingStatus='" + ListingStatus + '\'' +
                '}';
    }

    public String getSymbolID() {
        return SymbolID;
    }

    public void setSymbolID(String symbolID) {
        SymbolID = symbolID;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getBoardCode() {
        return BoardCode;
    }

    public void setBoardCode(String boardCode) {
        BoardCode = boardCode;
    }

    public String getTradingSessionID() {
        return TradingSessionID;
    }

    public void setTradingSessionID(String tradingSessionID) {
        TradingSessionID = tradingSessionID;
    }

    public String getTradeSesStatus() {
        return TradeSesStatus;
    }

    public void setTradeSesStatus(String tradeSesStatus) {
        TradeSesStatus = tradeSesStatus;
    }

    public String getSecurityTradingStatus() {
        return SecurityTradingStatus;
    }

    public void setSecurityTradingStatus(String securityTradingStatus) {
        SecurityTradingStatus = securityTradingStatus;
    }

    public String getListingStatus() {
        return ListingStatus;
    }

    public void setListingStatus(String listingStatus) {
        ListingStatus = listingStatus;
    }
}
