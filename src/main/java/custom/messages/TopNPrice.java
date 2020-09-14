
package custom.messages;

import quickfix.FieldNotFound;

import quickfix.Group;

public class TopNPrice extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "TP";
	

	public TopNPrice() {
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

	public void set(custom.fields.NoTopPrice value) {
		setField(value);
	}

	public custom.fields.NoTopPrice get(custom.fields.NoTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NoTopPrice getNoTopPrice() throws FieldNotFound {
		return get(new custom.fields.NoTopPrice());
	}

	public boolean isSet(custom.fields.NoTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNoTopPrice() {
		return isSetField(555);
	}

	public static class NoTopPrice extends Group {

		static final long serialVersionUID = 20050617;
		private static final int[] ORDER = {556, 132, 1321, 133, 1331, 0};

		public NoTopPrice() {
			super(555, 556, ORDER);
		}
		
	public void set(custom.fields.NumTopPrice value) {
		setField(value);
	}

	public custom.fields.NumTopPrice get(custom.fields.NumTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NumTopPrice getNumTopPrice() throws FieldNotFound {
		return get(new custom.fields.NumTopPrice());
	}

	public boolean isSet(custom.fields.NumTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNumTopPrice() {
		return isSetField(556);
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

	}

}
