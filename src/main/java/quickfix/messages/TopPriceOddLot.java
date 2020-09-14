
package quickfix.messages;

import quickfix.FieldNotFound;


public class TopPriceOddLot extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "PO";
	

	public TopPriceOddLot() {
		super();
		getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.fields.Symbol value) {
		setField(value);
	}

	public quickfix.fields.Symbol get(quickfix.fields.Symbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Symbol getSymbol() throws FieldNotFound {
		return get(new quickfix.fields.Symbol());
	}

	public boolean isSet(quickfix.fields.Symbol field) {
		return isSetField(field);
	}

	public boolean isSetSymbol() {
		return isSetField(55);
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

	public void set(quickfix.fields.BestBidPrice value) {
		setField(value);
	}

	public quickfix.fields.BestBidPrice get(quickfix.fields.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new quickfix.fields.BestBidPrice());
	}

	public boolean isSet(quickfix.fields.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(quickfix.fields.BestBidQtty value) {
		setField(value);
	}

	public quickfix.fields.BestBidQtty get(quickfix.fields.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new quickfix.fields.BestBidQtty());
	}

	public boolean isSet(quickfix.fields.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(quickfix.fields.BestOfferPrice value) {
		setField(value);
	}

	public quickfix.fields.BestOfferPrice get(quickfix.fields.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new quickfix.fields.BestOfferPrice());
	}

	public boolean isSet(quickfix.fields.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(quickfix.fields.BestOfferQtty value) {
		setField(value);
	}

	public quickfix.fields.BestOfferQtty get(quickfix.fields.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new quickfix.fields.BestOfferQtty());
	}

	public boolean isSet(quickfix.fields.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(quickfix.fields.TotalBidQtty_OD value) {
		setField(value);
	}

	public quickfix.fields.TotalBidQtty_OD get(quickfix.fields.TotalBidQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalBidQtty_OD getTotalBidQtty_OD() throws FieldNotFound {
		return get(new quickfix.fields.TotalBidQtty_OD());
	}

	public boolean isSet(quickfix.fields.TotalBidQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty_OD() {
		return isSetField(1341);
	}

	public void set(quickfix.fields.TotalOfferQtty value) {
		setField(value);
	}

	public quickfix.fields.TotalOfferQtty get(quickfix.fields.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new quickfix.fields.TotalOfferQtty());
	}

	public boolean isSet(quickfix.fields.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(quickfix.fields.TotalOfferQtty_OD value) {
		setField(value);
	}

	public quickfix.fields.TotalOfferQtty_OD get(quickfix.fields.TotalOfferQtty_OD value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalOfferQtty_OD getTotalOfferQtty_OD() throws FieldNotFound {
		return get(new quickfix.fields.TotalOfferQtty_OD());
	}

	public boolean isSet(quickfix.fields.TotalOfferQtty_OD field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty_OD() {
		return isSetField(1351);
	}

	public void set(quickfix.fields.OfferPrice_2 value) {
		setField(value);
	}

	public quickfix.fields.OfferPrice_2 get(quickfix.fields.OfferPrice_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OfferPrice_2 getOfferPrice_2() throws FieldNotFound {
		return get(new quickfix.fields.OfferPrice_2());
	}

	public boolean isSet(quickfix.fields.OfferPrice_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferPrice_2() {
		return isSetField(136);
	}

	public void set(quickfix.fields.OfferQtty_2 value) {
		setField(value);
	}

	public quickfix.fields.OfferQtty_2 get(quickfix.fields.OfferQtty_2 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OfferQtty_2 getOfferQtty_2() throws FieldNotFound {
		return get(new quickfix.fields.OfferQtty_2());
	}

	public boolean isSet(quickfix.fields.OfferQtty_2 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_2() {
		return isSetField(1361);
	}

	public void set(quickfix.fields.OpenPrice value) {
		setField(value);
	}

	public quickfix.fields.OpenPrice get(quickfix.fields.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new quickfix.fields.OpenPrice());
	}

	public boolean isSet(quickfix.fields.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(quickfix.fields.OfferQtty_3 value) {
		setField(value);
	}

	public quickfix.fields.OfferQtty_3 get(quickfix.fields.OfferQtty_3 value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OfferQtty_3 getOfferQtty_3() throws FieldNotFound {
		return get(new quickfix.fields.OfferQtty_3());
	}

	public boolean isSet(quickfix.fields.OfferQtty_3 field) {
		return isSetField(field);
	}

	public boolean isSetOfferQtty_3() {
		return isSetField(1371);
	}

}
