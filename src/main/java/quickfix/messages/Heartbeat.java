
package quickfix.messages;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
	}
	
	public void set(quickfix.fields.TestReqID value) {
		setField(value);
	}

	public quickfix.fields.TestReqID get(quickfix.fields.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TestReqID getTestReqID() throws FieldNotFound {
		return get(new quickfix.fields.TestReqID());
	}

	public boolean isSet(quickfix.fields.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
