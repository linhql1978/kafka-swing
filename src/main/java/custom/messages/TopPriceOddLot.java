
package custom.messages;

import quickfix.FieldNotFound;


public class TopPriceOddLot extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "PO";
	

	public TopPriceOddLot() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public void set(custom.fields.Symbol value) {
		setField(value);
	}

	public custom.fields.Symbol get(custom.fields.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Symbol getSymbol() throws FieldNotFound {
		return get(new custom.fields.Symbol());
	}

	public boolean isSet(custom.fields.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
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

	public void set(custom.fields.BestBidPrice value) {
		setField(value);
	}

	public custom.fields.BestBidPrice get(custom.fields.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new custom.fields.BestBidPrice());
	}

	public boolean isSet(custom.fields.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(custom.fields.BestBidQtty value) {
		setField(value);
	}

	public custom.fields.BestBidQtty get(custom.fields.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new custom.fields.BestBidQtty());
	}

	public boolean isSet(custom.fields.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(custom.fields.BestOfferPrice value) {
		setField(value);
	}

	public custom.fields.BestOfferPrice get(custom.fields.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new custom.fields.BestOfferPrice());
	}

	public boolean isSet(custom.fields.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(custom.fields.BestOfferQtty value) {
		setField(value);
	}

	public custom.fields.BestOfferQtty get(custom.fields.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new custom.fields.BestOfferQtty());
	}

	public boolean isSet(custom.fields.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(custom.fields.TotalBidQtty_OD value) {
		setField(value);
	}

	public custom.fields.TotalBidQtty_OD get(custom.fields.TotalBidQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalBidQtty_OD getTotalBidQtty_OD() throws FieldNotFound {
		return get(new custom.fields.TotalBidQtty_OD());
	}

	public boolean isSet(custom.fields.TotalBidQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty_OD() {
		return isSetField(1341);
	}

	public void set(custom.fields.TotalOfferQtty value) {
		setField(value);
	}

	public custom.fields.TotalOfferQtty get(custom.fields.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new custom.fields.TotalOfferQtty());
	}

	public boolean isSet(custom.fields.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(custom.fields.TotalOfferQtty_OD value) {
		setField(value);
	}

	public custom.fields.TotalOfferQtty_OD get(custom.fields.TotalOfferQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalOfferQtty_OD getTotalOfferQtty_OD() throws FieldNotFound {
		return get(new custom.fields.TotalOfferQtty_OD());
	}

	public boolean isSet(custom.fields.TotalOfferQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty_OD() {
		return isSetField(1351);
	}

	public void set(custom.fields.OfferPrice_2 value) {
		setField(value);
	}

	public custom.fields.OfferPrice_2 get(custom.fields.OfferPrice_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OfferPrice_2 getOfferPrice_2() throws FieldNotFound {
		return get(new custom.fields.OfferPrice_2());
	}

	public boolean isSet(custom.fields.OfferPrice_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferPrice_2() {
		return isSetField(136);
	}

	public void set(custom.fields.OfferQtty_2 value) {
		setField(value);
	}

	public custom.fields.OfferQtty_2 get(custom.fields.OfferQtty_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OfferQtty_2 getOfferQtty_2() throws FieldNotFound {
		return get(new custom.fields.OfferQtty_2());
	}

	public boolean isSet(custom.fields.OfferQtty_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_2() {
		return isSetField(1361);
	}

	public void set(custom.fields.OpenPrice value) {
		setField(value);
	}

	public custom.fields.OpenPrice get(custom.fields.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new custom.fields.OpenPrice());
	}

	public boolean isSet(custom.fields.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(custom.fields.OfferQtty_3 value) {
		setField(value);
	}

	public custom.fields.OfferQtty_3 get(custom.fields.OfferQtty_3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OfferQtty_3 getOfferQtty_3() throws FieldNotFound {
		return get(new custom.fields.OfferQtty_3());
	}

	public boolean isSet(custom.fields.OfferQtty_3 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_3() {
		return isSetField(1371);
	}

}
