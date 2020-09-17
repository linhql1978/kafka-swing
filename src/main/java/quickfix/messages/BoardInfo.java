
package quickfix.messages;

import quickfix.FieldNotFound;


public class BoardInfo extends Message {

    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "BI";


    public BoardInfo() {
        super();
        getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
    }

    public void set(quickfix.fields.BoardCode value) {
        setField(value);
    }

    public quickfix.fields.BoardCode get(quickfix.fields.BoardCode value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.BoardCode getBoardCode() throws FieldNotFound {
        return get(new quickfix.fields.BoardCode());
    }

    public boolean isSet(quickfix.fields.BoardCode field) {
        return isSetField(field);
    }

    public boolean isSetBoardCode() {
        return isSetField(425);
    }

    public void set(quickfix.fields.BoardStatus value) {
        setField(value);
    }

    public quickfix.fields.BoardStatus get(quickfix.fields.BoardStatus value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.BoardStatus getBoardStatus() throws FieldNotFound {
        return get(new quickfix.fields.BoardStatus());
    }

    public boolean isSet(quickfix.fields.BoardStatus field) {
        return isSetField(field);
    }

    public boolean isSetBoardStatus() {
        return isSetField(426);
    }

    public void set(quickfix.fields.TradingSessionID value) {
        setField(value);
    }

    public quickfix.fields.TradingSessionID get(quickfix.fields.TradingSessionID value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
        return get(new quickfix.fields.TradingSessionID());
    }

    public boolean isSet(quickfix.fields.TradingSessionID field) {
        return isSetField(field);
    }

    public boolean isSetTradingSessionID() {
        return isSetField(336);
    }

    public void set(quickfix.fields.TradSecStatus value) {
        setField(value);
    }

    public quickfix.fields.TradSecStatus get(quickfix.fields.TradSecStatus value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TradSecStatus getTradSecStatus() throws FieldNotFound {
        return get(new quickfix.fields.TradSecStatus());
    }

    public boolean isSet(quickfix.fields.TradSecStatus field) {
        return isSetField(field);
    }

    public boolean isSetTradSecStatus() {
        return isSetField(340);
    }

    public void set(quickfix.fields.Name value) {
        setField(value);
    }

    public quickfix.fields.Name get(quickfix.fields.Name value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.Name getName() throws FieldNotFound {
        return get(new quickfix.fields.Name());
    }

    public boolean isSet(quickfix.fields.Name field) {
        return isSetField(field);
    }

    public boolean isSetName() {
        return isSetField(421);
    }

    public void set(quickfix.fields.Shortname value) {
        setField(value);
    }

    public quickfix.fields.Shortname get(quickfix.fields.Shortname value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.Shortname getShortname() throws FieldNotFound {
        return get(new quickfix.fields.Shortname());
    }

    public boolean isSet(quickfix.fields.Shortname field) {
        return isSetField(field);
    }

    public boolean isSetShortname() {
        return isSetField(422);
    }

    public void set(quickfix.fields.TradingDate value) {
        setField(value);
    }

    public quickfix.fields.TradingDate get(quickfix.fields.TradingDate value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TradingDate getTradingDate() throws FieldNotFound {
        return get(new quickfix.fields.TradingDate());
    }

    public boolean isSet(quickfix.fields.TradingDate field) {
        return isSetField(field);
    }

    public boolean isSetTradingDate() {
        return isSetField(388);
    }

    public void set(quickfix.fields.Time value) {
        setField(value);
    }

    public quickfix.fields.Time get(quickfix.fields.Time value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.Time getTime() throws FieldNotFound {
        return get(new quickfix.fields.Time());
    }

    public boolean isSet(quickfix.fields.Time field) {
        return isSetField(field);
    }

    public boolean isSetTime() {
        return isSetField(399);
    }

    public void set(quickfix.fields.TotalTrade value) {
        setField(value);
    }

    public quickfix.fields.TotalTrade get(quickfix.fields.TotalTrade value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TotalTrade getTotalTrade() throws FieldNotFound {
        return get(new quickfix.fields.TotalTrade());
    }

    public boolean isSet(quickfix.fields.TotalTrade field) {
        return isSetField(field);
    }

    public boolean isSetTotalTrade() {
        return isSetField(270);
    }

    public void set(quickfix.fields.TotalStock value) {
        setField(value);
    }

    public quickfix.fields.TotalStock get(quickfix.fields.TotalStock value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TotalStock getTotalStock() throws FieldNotFound {
        return get(new quickfix.fields.TotalStock());
    }

    public boolean isSet(quickfix.fields.TotalStock field) {
        return isSetField(field);
    }

    public boolean isSetTotalStock() {
        return isSetField(22);
    }

    public void set(quickfix.fields.numSymbolAdvances value) {
        setField(value);
    }

    public quickfix.fields.numSymbolAdvances get(quickfix.fields.numSymbolAdvances value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.numSymbolAdvances getnumSymbolAdvances() throws FieldNotFound {
        return get(new quickfix.fields.numSymbolAdvances());
    }

    public boolean isSet(quickfix.fields.numSymbolAdvances field) {
        return isSetField(field);
    }

    public boolean isSetnumSymbolAdvances() {
        return isSetField(251);
    }

    public void set(quickfix.fields.numSymbolNochange value) {
        setField(value);
    }

    public quickfix.fields.numSymbolNochange get(quickfix.fields.numSymbolNochange value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.numSymbolNochange getnumSymbolNochange() throws FieldNotFound {
        return get(new quickfix.fields.numSymbolNochange());
    }

    public boolean isSet(quickfix.fields.numSymbolNochange field) {
        return isSetField(field);
    }

    public boolean isSetnumSymbolNochange() {
        return isSetField(252);
    }

    public void set(quickfix.fields.numSymbolDeclines value) {
        setField(value);
    }

    public quickfix.fields.numSymbolDeclines get(quickfix.fields.numSymbolDeclines value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.numSymbolDeclines getnumSymbolDeclines() throws FieldNotFound {
        return get(new quickfix.fields.numSymbolDeclines());
    }

    public boolean isSet(quickfix.fields.numSymbolDeclines field) {
        return isSetField(field);
    }

    public boolean isSetnumSymbolDeclines() {
        return isSetField(253);
    }

    public void set(quickfix.fields.DateNo value) {
        setField(value);
    }

    public quickfix.fields.DateNo get(quickfix.fields.DateNo value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.DateNo getDateNo() throws FieldNotFound {
        return get(new quickfix.fields.DateNo());
    }

    public boolean isSet(quickfix.fields.DateNo field) {
        return isSetField(field);
    }

    public boolean isSetDateNo() {
        return isSetField(17);
    }

    public void set(quickfix.fields.totalNormalTradedQttyRd value) {
        setField(value);
    }

    public quickfix.fields.totalNormalTradedQttyRd get(quickfix.fields.totalNormalTradedQttyRd value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalNormalTradedQttyRd gettotalNormalTradedQttyRd() throws FieldNotFound {
        return get(new quickfix.fields.totalNormalTradedQttyRd());
    }

    public boolean isSet(quickfix.fields.totalNormalTradedQttyRd field) {
        return isSetField(field);
    }

    public boolean isSettotalNormalTradedQttyRd() {
        return isSetField(220);
    }

    public void set(quickfix.fields.totalNormalTradedValueRd value) {
        setField(value);
    }

    public quickfix.fields.totalNormalTradedValueRd get(quickfix.fields.totalNormalTradedValueRd value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalNormalTradedValueRd gettotalNormalTradedValueRd() throws FieldNotFound {
        return get(new quickfix.fields.totalNormalTradedValueRd());
    }

    public boolean isSet(quickfix.fields.totalNormalTradedValueRd field) {
        return isSetField(field);
    }

    public boolean isSettotalNormalTradedValueRd() {
        return isSetField(221);
    }

    public void set(quickfix.fields.totalNormalTradedQttyOd value) {
        setField(value);
    }

    public quickfix.fields.totalNormalTradedQttyOd get(quickfix.fields.totalNormalTradedQttyOd value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalNormalTradedQttyOd gettotalNormalTradedQttyOd() throws FieldNotFound {
        return get(new quickfix.fields.totalNormalTradedQttyOd());
    }

    public boolean isSet(quickfix.fields.totalNormalTradedQttyOd field) {
        return isSetField(field);
    }

    public boolean isSettotalNormalTradedQttyOd() {
        return isSetField(210);
    }

    public void set(quickfix.fields.totalNormalTradedValueOd value) {
        setField(value);
    }

    public quickfix.fields.totalNormalTradedValueOd get(quickfix.fields.totalNormalTradedValueOd value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalNormalTradedValueOd gettotalNormalTradedValueOd() throws FieldNotFound {
        return get(new quickfix.fields.totalNormalTradedValueOd());
    }

    public boolean isSet(quickfix.fields.totalNormalTradedValueOd field) {
        return isSetField(field);
    }

    public boolean isSettotalNormalTradedValueOd() {
        return isSetField(211);
    }

    public void set(quickfix.fields.totalPTTradedQtty value) {
        setField(value);
    }

    public quickfix.fields.totalPTTradedQtty get(quickfix.fields.totalPTTradedQtty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalPTTradedQtty gettotalPTTradedQtty() throws FieldNotFound {
        return get(new quickfix.fields.totalPTTradedQtty());
    }

    public boolean isSet(quickfix.fields.totalPTTradedQtty field) {
        return isSetField(field);
    }

    public boolean isSettotalPTTradedQtty() {
        return isSetField(240);
    }

    public void set(quickfix.fields.totalPTTradedValue value) {
        setField(value);
    }

    public quickfix.fields.totalPTTradedValue get(quickfix.fields.totalPTTradedValue value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.totalPTTradedValue gettotalPTTradedValue() throws FieldNotFound {
        return get(new quickfix.fields.totalPTTradedValue());
    }

    public boolean isSet(quickfix.fields.totalPTTradedValue field) {
        return isSetField(field);
    }

    public boolean isSettotalPTTradedValue() {
        return isSetField(241);
    }

    public void set(quickfix.fields.MarketCode value) {
        setField(value);
    }

    public quickfix.fields.MarketCode get(quickfix.fields.MarketCode value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.MarketCode getMarketCode() throws FieldNotFound {
        return get(new quickfix.fields.MarketCode());
    }

    public boolean isSet(quickfix.fields.MarketCode field) {
        return isSetField(field);
    }

    public boolean isSetMarketCode() {
        return isSetField(341);
    }

}
