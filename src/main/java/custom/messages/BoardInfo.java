
package custom.messages;

import quickfix.FieldNotFound;


public class BoardInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "BI";
	

	public BoardInfo() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public void set(custom.fields.BoardCode value) {
		setField(value);
	}

	public custom.fields.BoardCode get(custom.fields.BoardCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BoardCode getBoardCode() throws FieldNotFound {
		return get(new custom.fields.BoardCode());
	}

	public boolean isSet(custom.fields.BoardCode field) {
		return isSetField(field);
	}

	public boolean isSetBoardCode() {
		return isSetField(425);
	}

	public void set(custom.fields.BoardStatus value) {
		setField(value);
	}

	public custom.fields.BoardStatus get(custom.fields.BoardStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BoardStatus getBoardStatus() throws FieldNotFound {
		return get(new custom.fields.BoardStatus());
	}

	public boolean isSet(custom.fields.BoardStatus field) {
		return isSetField(field);
	}

	public boolean isSetBoardStatus() {
		return isSetField(426);
	}

	public void set(custom.fields.TradingSessionID value) {
		setField(value);
	}

	public custom.fields.TradingSessionID get(custom.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new custom.fields.TradingSessionID());
	}

	public boolean isSet(custom.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(custom.fields.TradSecStatus value) {
		setField(value);
	}

	public custom.fields.TradSecStatus get(custom.fields.TradSecStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradSecStatus getTradSecStatus() throws FieldNotFound {
		return get(new custom.fields.TradSecStatus());
	}

	public boolean isSet(custom.fields.TradSecStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradSecStatus() {
		return isSetField(340);
	}

	public void set(custom.fields.Name value) {
		setField(value);
	}

	public custom.fields.Name get(custom.fields.Name value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Name getName() throws FieldNotFound {
		return get(new custom.fields.Name());
	}

	public boolean isSet(custom.fields.Name field) {
		return isSetField(field);
	}

	public boolean isSetName() {
		return isSetField(421);
	}

	public void set(custom.fields.Shortname value) {
		setField(value);
	}

	public custom.fields.Shortname get(custom.fields.Shortname value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Shortname getShortname() throws FieldNotFound {
		return get(new custom.fields.Shortname());
	}

	public boolean isSet(custom.fields.Shortname field) {
		return isSetField(field);
	}

	public boolean isSetShortname() {
		return isSetField(422);
	}

	public void set(custom.fields.TradingDate value) {
		setField(value);
	}

	public custom.fields.TradingDate get(custom.fields.TradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradingDate getTradingDate() throws FieldNotFound {
		return get(new custom.fields.TradingDate());
	}

	public boolean isSet(custom.fields.TradingDate field) {
		return isSetField(field);
	}

	public boolean isSetTradingDate() {
		return isSetField(388);
	}

	public void set(custom.fields.Time value) {
		setField(value);
	}

	public custom.fields.Time get(custom.fields.Time value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Time getTime() throws FieldNotFound {
		return get(new custom.fields.Time());
	}

	public boolean isSet(custom.fields.Time field) {
		return isSetField(field);
	}

	public boolean isSetTime() {
		return isSetField(399);
	}

	public void set(custom.fields.TotalTrade value) {
		setField(value);
	}

	public custom.fields.TotalTrade get(custom.fields.TotalTrade value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalTrade getTotalTrade() throws FieldNotFound {
		return get(new custom.fields.TotalTrade());
	}

	public boolean isSet(custom.fields.TotalTrade field) {
		return isSetField(field);
	}

	public boolean isSetTotalTrade() {
		return isSetField(270);
	}

	public void set(custom.fields.TotalStock value) {
		setField(value);
	}

	public custom.fields.TotalStock get(custom.fields.TotalStock value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalStock getTotalStock() throws FieldNotFound {
		return get(new custom.fields.TotalStock());
	}

	public boolean isSet(custom.fields.TotalStock field) {
		return isSetField(field);
	}

	public boolean isSetTotalStock() {
		return isSetField(22);
	}

	public void set(custom.fields.numSymbolAdvances value) {
		setField(value);
	}

	public custom.fields.numSymbolAdvances get(custom.fields.numSymbolAdvances value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.numSymbolAdvances getnumSymbolAdvances() throws FieldNotFound {
		return get(new custom.fields.numSymbolAdvances());
	}

	public boolean isSet(custom.fields.numSymbolAdvances field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolAdvances() {
		return isSetField(251);
	}

	public void set(custom.fields.numSymbolNochange value) {
		setField(value);
	}

	public custom.fields.numSymbolNochange get(custom.fields.numSymbolNochange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.numSymbolNochange getnumSymbolNochange() throws FieldNotFound {
		return get(new custom.fields.numSymbolNochange());
	}

	public boolean isSet(custom.fields.numSymbolNochange field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolNochange() {
		return isSetField(252);
	}

	public void set(custom.fields.numSymbolDeclines value) {
		setField(value);
	}

	public custom.fields.numSymbolDeclines get(custom.fields.numSymbolDeclines value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.numSymbolDeclines getnumSymbolDeclines() throws FieldNotFound {
		return get(new custom.fields.numSymbolDeclines());
	}

	public boolean isSet(custom.fields.numSymbolDeclines field) {
		return isSetField(field);
	}

	public boolean isSetnumSymbolDeclines() {
		return isSetField(253);
	}

	public void set(custom.fields.DateNo value) {
		setField(value);
	}

	public custom.fields.DateNo get(custom.fields.DateNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.DateNo getDateNo() throws FieldNotFound {
		return get(new custom.fields.DateNo());
	}

	public boolean isSet(custom.fields.DateNo field) {
		return isSetField(field);
	}

	public boolean isSetDateNo() {
		return isSetField(17);
	}

	public void set(custom.fields.totalNormalTradedQttyRd value) {
		setField(value);
	}

	public custom.fields.totalNormalTradedQttyRd get(custom.fields.totalNormalTradedQttyRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalNormalTradedQttyRd gettotalNormalTradedQttyRd() throws FieldNotFound {
		return get(new custom.fields.totalNormalTradedQttyRd());
	}

	public boolean isSet(custom.fields.totalNormalTradedQttyRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyRd() {
		return isSetField(220);
	}

	public void set(custom.fields.totalNormalTradedValueRd value) {
		setField(value);
	}

	public custom.fields.totalNormalTradedValueRd get(custom.fields.totalNormalTradedValueRd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalNormalTradedValueRd gettotalNormalTradedValueRd() throws FieldNotFound {
		return get(new custom.fields.totalNormalTradedValueRd());
	}

	public boolean isSet(custom.fields.totalNormalTradedValueRd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueRd() {
		return isSetField(221);
	}

	public void set(custom.fields.totalNormalTradedQttyOd value) {
		setField(value);
	}

	public custom.fields.totalNormalTradedQttyOd get(custom.fields.totalNormalTradedQttyOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalNormalTradedQttyOd gettotalNormalTradedQttyOd() throws FieldNotFound {
		return get(new custom.fields.totalNormalTradedQttyOd());
	}

	public boolean isSet(custom.fields.totalNormalTradedQttyOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedQttyOd() {
		return isSetField(210);
	}

	public void set(custom.fields.totalNormalTradedValueOd value) {
		setField(value);
	}

	public custom.fields.totalNormalTradedValueOd get(custom.fields.totalNormalTradedValueOd value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalNormalTradedValueOd gettotalNormalTradedValueOd() throws FieldNotFound {
		return get(new custom.fields.totalNormalTradedValueOd());
	}

	public boolean isSet(custom.fields.totalNormalTradedValueOd field) {
		return isSetField(field);
	}

	public boolean isSettotalNormalTradedValueOd() {
		return isSetField(211);
	}

	public void set(custom.fields.totalPTTradedQtty value) {
		setField(value);
	}

	public custom.fields.totalPTTradedQtty get(custom.fields.totalPTTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalPTTradedQtty gettotalPTTradedQtty() throws FieldNotFound {
		return get(new custom.fields.totalPTTradedQtty());
	}

	public boolean isSet(custom.fields.totalPTTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedQtty() {
		return isSetField(240);
	}

	public void set(custom.fields.totalPTTradedValue value) {
		setField(value);
	}

	public custom.fields.totalPTTradedValue get(custom.fields.totalPTTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.totalPTTradedValue gettotalPTTradedValue() throws FieldNotFound {
		return get(new custom.fields.totalPTTradedValue());
	}

	public boolean isSet(custom.fields.totalPTTradedValue field) {
		return isSetField(field);
	}

	public boolean isSettotalPTTradedValue() {
		return isSetField(241);
	}

	public void set(custom.fields.MarketCode value) {
		setField(value);
	}

	public custom.fields.MarketCode get(custom.fields.MarketCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.MarketCode getMarketCode() throws FieldNotFound {
		return get(new custom.fields.MarketCode());
	}

	public boolean isSet(custom.fields.MarketCode field) {
		return isSetField(field);
	}

	public boolean isSetMarketCode() {
		return isSetField(341);
	}

}
