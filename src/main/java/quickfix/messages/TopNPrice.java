
package quickfix.messages;

import quickfix.FieldNotFound;
import quickfix.Group;

public class TopNPrice extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "TP";
	

	public TopNPrice() {
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

	public void set(quickfix.fields.NoTopPrice value) {
		setField(value);
	}

	public quickfix.fields.NoTopPrice get(quickfix.fields.NoTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NoTopPrice getNoTopPrice() throws FieldNotFound {
		return get(new quickfix.fields.NoTopPrice());
	}

	public boolean isSet(quickfix.fields.NoTopPrice field) {
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
		
	public void set(quickfix.fields.NumTopPrice value) {
		setField(value);
	}

	public quickfix.fields.NumTopPrice get(quickfix.fields.NumTopPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NumTopPrice getNumTopPrice() throws FieldNotFound {
		return get(new quickfix.fields.NumTopPrice());
	}

	public boolean isSet(quickfix.fields.NumTopPrice field) {
		return isSetField(field);
	}

	public boolean isSetNumTopPrice() {
		return isSetField(556);
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

	}

}
