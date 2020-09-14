
package quickfix.messages;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
	}
	
	public Logon(quickfix.fields.Status status) {
		this();
		setField(status);
	}
	
	public void set(quickfix.fields.Username value) {
		setField(value);
	}

	public quickfix.fields.Username get(quickfix.fields.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Username getUsername() throws FieldNotFound {
		return get(new quickfix.fields.Username());
	}

	public boolean isSet(quickfix.fields.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(quickfix.fields.Password value) {
		setField(value);
	}

	public quickfix.fields.Password get(quickfix.fields.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Password getPassword() throws FieldNotFound {
		return get(new quickfix.fields.Password());
	}

	public boolean isSet(quickfix.fields.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(quickfix.fields.Status value) {
		setField(value);
	}

	public quickfix.fields.Status get(quickfix.fields.Status value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Status getStatus() throws FieldNotFound {
		return get(new quickfix.fields.Status());
	}

	public boolean isSet(quickfix.fields.Status field) {
		return isSetField(field);
	}

	public boolean isSetStatus() {
		return isSetField(58);
	}

}
