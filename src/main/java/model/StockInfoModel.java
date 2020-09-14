package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockInfoModel {

    private String IDSymbol;
    private String Symbol;
    private String BoardCode;
    private String TradingSessionID;
    private String TradSecStatus;
    private String SecurityTradingStatus;
    private String ListingStatus;

    public String getIDSymbol() {
        return IDSymbol;
    }

    public void setIDSymbol(String IDSymbol) {
        this.IDSymbol = IDSymbol;
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

    public String getTradSecStatus() {
        return TradSecStatus;
    }

    public void setTradSecStatus(String tradSecStatus) {
        TradSecStatus = tradSecStatus;
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
