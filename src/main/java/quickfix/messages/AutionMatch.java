
package quickfix.messages;

import quickfix.FieldNotFound;


public class AutionMatch extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "EP";
	

	public AutionMatch() {
		super();
		getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.fields.ActionType value) {
		setField(value);
	}

	public quickfix.fields.ActionType get(quickfix.fields.ActionType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.ActionType getActionType() throws FieldNotFound {
		return get(new quickfix.fields.ActionType());
	}

	public boolean isSet(quickfix.fields.ActionType field) {
		return isSetField(field);
	}

	public boolean isSetActionType() {
		return isSetField(33);
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

	public void set(quickfix.fields.MatchPrice value) {
		setField(value);
	}

	public quickfix.fields.MatchPrice get(quickfix.fields.MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.MatchPrice getMatchPrice() throws FieldNotFound {
		return get(new quickfix.fields.MatchPrice());
	}

	public boolean isSet(quickfix.fields.MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetMatchPrice() {
		return isSetField(31);
	}

	public void set(quickfix.fields.MatchQtty value) {
		setField(value);
	}

	public quickfix.fields.MatchQtty get(quickfix.fields.MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.MatchQtty getMatchQtty() throws FieldNotFound {
		return get(new quickfix.fields.MatchQtty());
	}

	public boolean isSet(quickfix.fields.MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetMatchQtty() {
		return isSetField(32);
	}

}
