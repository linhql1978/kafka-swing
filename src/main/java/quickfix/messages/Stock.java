
package quickfix.messages;

import quickfix.FieldNotFound;


public class Stock extends Message {

    static final long serialVersionUID = 20050617;
    public static final String MSGTYPE = "S";


    public Stock() {
        super();
        getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
    }

    public void set(quickfix.fields.IDIndex value) {
        setField(value);
    }

    public quickfix.fields.IDIndex get(quickfix.fields.IDIndex value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.IDIndex getIDIndex() throws FieldNotFound {
        return get(new quickfix.fields.IDIndex());
    }

    public boolean isSet(quickfix.fields.IDIndex field) {
        return isSetField(field);
    }

    public boolean isSetIDIndex() {
        return isSetField(1);
    }

    public void set(quickfix.fields.IndexCode value) {
        setField(value);
    }

    public quickfix.fields.IndexCode get(quickfix.fields.IndexCode value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.IndexCode getIndexCode() throws FieldNotFound {
        return get(new quickfix.fields.IndexCode());
    }

    public boolean isSet(quickfix.fields.IndexCode field) {
        return isSetField(field);
    }

    public boolean isSetIndexCode() {
        return isSetField(2);
    }

    public void set(quickfix.fields.IDSymbol value) {
        setField(value);
    }

    public quickfix.fields.IDSymbol get(quickfix.fields.IDSymbol value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.IDSymbol getIDSymbol() throws FieldNotFound {
        return get(new quickfix.fields.IDSymbol());
    }

    public boolean isSet(quickfix.fields.IDSymbol field) {
        return isSetField(field);
    }

    public boolean isSetIDSymbol() {
        return isSetField(15);
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

    public void set(quickfix.fields.TotalQtty value) {
        setField(value);
    }

    public quickfix.fields.TotalQtty get(quickfix.fields.TotalQtty value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.TotalQtty getTotalQtty() throws FieldNotFound {
        return get(new quickfix.fields.TotalQtty());
    }

    public boolean isSet(quickfix.fields.TotalQtty field) {
        return isSetField(field);
    }

    public boolean isSetTotalQtty() {
        return isSetField(11);
    }

    public void set(quickfix.fields.Weighted value) {
        setField(value);
    }

    public quickfix.fields.Weighted get(quickfix.fields.Weighted value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.Weighted getWeighted() throws FieldNotFound {
        return get(new quickfix.fields.Weighted());
    }

    public boolean isSet(quickfix.fields.Weighted field) {
        return isSetField(field);
    }

    public boolean isSetWeighted() {
        return isSetField(12);
    }

    public void set(quickfix.fields.AddDate value) {
        setField(value);
    }

    public quickfix.fields.AddDate get(quickfix.fields.AddDate value) throws FieldNotFound {
        getField(value);
        return value;
    }

    public quickfix.fields.AddDate getAddDate() throws FieldNotFound {
        return get(new quickfix.fields.AddDate());
    }

    public boolean isSet(quickfix.fields.AddDate field) {
        return isSetField(field);
    }

    public boolean isSetAddDate() {
        return isSetField(28);
    }

}
