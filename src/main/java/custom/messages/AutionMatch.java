
package custom.messages;

import quickfix.FieldNotFound;


public class AutionMatch extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "EP";
	

	public AutionMatch() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public void set(custom.fields.ActionType value) {
		setField(value);
	}

	public custom.fields.ActionType get(custom.fields.ActionType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.ActionType getActionType() throws FieldNotFound {
		return get(new custom.fields.ActionType());
	}

	public boolean isSet(custom.fields.ActionType field) {
		return isSetField(field);
	}

	public boolean isSetActionType() {
		return isSetField(33);
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

	public void set(custom.fields.MatchPrice value) {
		setField(value);
	}

	public custom.fields.MatchPrice get(custom.fields.MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.MatchPrice getMatchPrice() throws FieldNotFound {
		return get(new custom.fields.MatchPrice());
	}

	public boolean isSet(custom.fields.MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetMatchPrice() {
		return isSetField(31);
	}

	public void set(custom.fields.MatchQtty value) {
		setField(value);
	}

	public custom.fields.MatchQtty get(custom.fields.MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.MatchQtty getMatchQtty() throws FieldNotFound {
		return get(new custom.fields.MatchQtty());
	}

	public boolean isSet(custom.fields.MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetMatchQtty() {
		return isSetField(32);
	}

}
