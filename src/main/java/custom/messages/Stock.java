
package custom.messages;

import quickfix.FieldNotFound;


public class Stock extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "S";
	

	public Stock() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
	}
	
	public void set(custom.fields.IDIndex value) {
		setField(value);
	}

	public custom.fields.IDIndex get(custom.fields.IDIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.IDIndex getIDIndex() throws FieldNotFound {
		return get(new custom.fields.IDIndex());
	}

	public boolean isSet(custom.fields.IDIndex field) {
		return isSetField(field);
	}

	public boolean isSetIDIndex() {
		return isSetField(1);
	}

	public void set(custom.fields.IndexCode value) {
		setField(value);
	}

	public custom.fields.IndexCode get(custom.fields.IndexCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.IndexCode getIndexCode() throws FieldNotFound {
		return get(new custom.fields.IndexCode());
	}

	public boolean isSet(custom.fields.IndexCode field) {
		return isSetField(field);
	}

	public boolean isSetIndexCode() {
		return isSetField(2);
	}

	public void set(custom.fields.IDSymbol value) {
		setField(value);
	}

	public custom.fields.IDSymbol get(custom.fields.IDSymbol value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.IDSymbol getIDSymbol() throws FieldNotFound {
		return get(new custom.fields.IDSymbol());
	}

	public boolean isSet(custom.fields.IDSymbol field) {
		return isSetField(field);
	}

	public boolean isSetIDSymbol() {
		return isSetField(15);
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

	public void set(custom.fields.TotalQtty value) {
		setField(value);
	}

	public custom.fields.TotalQtty get(custom.fields.TotalQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalQtty getTotalQtty() throws FieldNotFound {
		return get(new custom.fields.TotalQtty());
	}

	public boolean isSet(custom.fields.TotalQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalQtty() {
		return isSetField(11);
	}

	public void set(custom.fields.Weighted value) {
		setField(value);
	}

	public custom.fields.Weighted get(custom.fields.Weighted value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Weighted getWeighted() throws FieldNotFound {
		return get(new custom.fields.Weighted());
	}

	public boolean isSet(custom.fields.Weighted field) {
		return isSetField(field);
	}

	public boolean isSetWeighted() {
		return isSetField(12);
	}

	public void set(custom.fields.AddDate value) {
		setField(value);
	}

	public custom.fields.AddDate get(custom.fields.AddDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.AddDate getAddDate() throws FieldNotFound {
		return get(new custom.fields.AddDate());
	}

	public boolean isSet(custom.fields.AddDate field) {
		return isSetField(field);
	}

	public boolean isSetAddDate() {
		return isSetField(28);
	}

}
