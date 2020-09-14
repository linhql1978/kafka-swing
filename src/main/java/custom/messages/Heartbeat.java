
package custom.messages;

import quickfix.FieldNotFound;


public class Heartbeat extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "0";
	

	public Heartbeat() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public void set(custom.fields.TestReqID value) {
		setField(value);
	}

	public custom.fields.TestReqID get(custom.fields.TestReqID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TestReqID getTestReqID() throws FieldNotFound {
		return get(new custom.fields.TestReqID());
	}

	public boolean isSet(custom.fields.TestReqID field) {
		return isSetField(field);
	}

	public boolean isSetTestReqID() {
		return isSetField(112);
	}

}
