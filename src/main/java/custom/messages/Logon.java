
package custom.messages;

import quickfix.FieldNotFound;


public class Logon extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "A";
	

	public Logon() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public Logon(custom.fields.Status status) {
		this();
		setField(status);
	}
	
	public void set(custom.fields.Username value) {
		setField(value);
	}

	public custom.fields.Username get(custom.fields.Username value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Username getUsername() throws FieldNotFound {
		return get(new custom.fields.Username());
	}

	public boolean isSet(custom.fields.Username field) {
		return isSetField(field);
	}

	public boolean isSetUsername() {
		return isSetField(553);
	}

	public void set(custom.fields.Password value) {
		setField(value);
	}

	public custom.fields.Password get(custom.fields.Password value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Password getPassword() throws FieldNotFound {
		return get(new custom.fields.Password());
	}

	public boolean isSet(custom.fields.Password field) {
		return isSetField(field);
	}

	public boolean isSetPassword() {
		return isSetField(554);
	}

	public void set(custom.fields.Status value) {
		setField(value);
	}

	public custom.fields.Status get(custom.fields.Status value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Status getStatus() throws FieldNotFound {
		return get(new custom.fields.Status());
	}

	public boolean isSet(custom.fields.Status field) {
		return isSetField(field);
	}

	public boolean isSetStatus() {
		return isSetField(58);
	}

}
