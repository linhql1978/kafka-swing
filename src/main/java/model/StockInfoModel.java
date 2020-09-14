package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockInfoModel {

/*    [{"IDSymbol":"76781","DateNo":"596","Symbol":"VET","TotalListingQtty":"16000000.000000","PriorOpenPrice":"59800","PriorClosePrice":"59800","SecurityType":"ST",
            "IssueDate":"00010101-12:01:00","ReferenceStatus":"0","BasicPrice":"59800","SecurityTradingStatus":"0","ListingStatus":"0","CeilingPrice":"68700",
            "FloorPrice":"50900","Parvalue":"10000","TradingSessionID":"UPC_CON_NML","TradSecStatus":"90","TradingDate":"20200429","Time":"07:51:54","TradingUnit":"100",
            "BoardCode":"UPC_BRD_01","RemainForeignQtty":"7831500"}]*/
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
