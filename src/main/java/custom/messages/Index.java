
package custom.messages;

import quickfix.FieldNotFound;


public class Index extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "I";
	

	public Index() {
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

	public void set(custom.fields.Value value) {
		setField(value);
	}

	public custom.fields.Value get(custom.fields.Value value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Value getValue() throws FieldNotFound {
		return get(new custom.fields.Value());
	}

	public boolean isSet(custom.fields.Value field) {
		return isSetField(field);
	}

	public boolean isSetValue() {
		return isSetField(3);
	}

	public void set(custom.fields.CalTime value) {
		setField(value);
	}

	public custom.fields.CalTime get(custom.fields.CalTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CalTime getCalTime() throws FieldNotFound {
		return get(new custom.fields.CalTime());
	}

	public boolean isSet(custom.fields.CalTime field) {
		return isSetField(field);
	}

	public boolean isSetCalTime() {
		return isSetField(4);
	}

	public void set(custom.fields.Change value) {
		setField(value);
	}

	public custom.fields.Change get(custom.fields.Change value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Change getChange() throws FieldNotFound {
		return get(new custom.fields.Change());
	}

	public boolean isSet(custom.fields.Change field) {
		return isSetField(field);
	}

	public boolean isSetChange() {
		return isSetField(5);
	}

	public void set(custom.fields.RatioChange value) {
		setField(value);
	}

	public custom.fields.RatioChange get(custom.fields.RatioChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.RatioChange getRatioChange() throws FieldNotFound {
		return get(new custom.fields.RatioChange());
	}

	public boolean isSet(custom.fields.RatioChange field) {
		return isSetField(field);
	}

	public boolean isSetRatioChange() {
		return isSetField(6);
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

	public void set(custom.fields.TotalValue value) {
		setField(value);
	}

	public custom.fields.TotalValue get(custom.fields.TotalValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalValue getTotalValue() throws FieldNotFound {
		return get(new custom.fields.TotalValue());
	}

	public boolean isSet(custom.fields.TotalValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalValue() {
		return isSetField(14);
	}

	public void set(custom.fields.TradingDate value) {
		setField(value);
	}

	public custom.fields.TradingDate get(custom.fields.TradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradingDate getTradingDate() throws FieldNotFound {
		return get(new custom.fields.TradingDate());
	}

	public boolean isSet(custom.fields.TradingDate field) {
		return isSetField(field);
	}

	public boolean isSetTradingDate() {
		return isSetField(388);
	}

	public void set(custom.fields.CurrentStatus value) {
		setField(value);
	}

	public custom.fields.CurrentStatus get(custom.fields.CurrentStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CurrentStatus getCurrentStatus() throws FieldNotFound {
		return get(new custom.fields.CurrentStatus());
	}

	public boolean isSet(custom.fields.CurrentStatus field) {
		return isSetField(field);
	}

	public boolean isSetCurrentStatus() {
		return isSetField(21);
	}

	public void set(custom.fields.TotalStock value) {
		setField(value);
	}

	public custom.fields.TotalStock get(custom.fields.TotalStock value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalStock getTotalStock() throws FieldNotFound {
		return get(new custom.fields.TotalStock());
	}

	public boolean isSet(custom.fields.TotalStock field) {
		return isSetField(field);
	}

	public boolean isSetTotalStock() {
		return isSetField(22);
	}

	public void set(custom.fields.PriorIndexVal value) {
		setField(value);
	}

	public custom.fields.PriorIndexVal get(custom.fields.PriorIndexVal value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PriorIndexVal getPriorIndexVal() throws FieldNotFound {
		return get(new custom.fields.PriorIndexVal());
	}

	public boolean isSet(custom.fields.PriorIndexVal field) {
		return isSetField(field);
	}

	public boolean isSetPriorIndexVal() {
		return isSetField(23);
	}

	public void set(custom.fields.HighestIndex value) {
		setField(value);
	}

	public custom.fields.HighestIndex get(custom.fields.HighestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.HighestIndex getHighestIndex() throws FieldNotFound {
		return get(new custom.fields.HighestIndex());
	}

	public boolean isSet(custom.fields.HighestIndex field) {
		return isSetField(field);
	}

	public boolean isSetHighestIndex() {
		return isSetField(24);
	}

	public void set(custom.fields.LowestIndex value) {
		setField(value);
	}

	public custom.fields.LowestIndex get(custom.fields.LowestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.LowestIndex getLowestIndex() throws FieldNotFound {
		return get(new custom.fields.LowestIndex());
	}

	public boolean isSet(custom.fields.LowestIndex field) {
		return isSetField(field);
	}

	public boolean isSetLowestIndex() {
		return isSetField(25);
	}

	public void set(custom.fields.CloseIndex value) {
		setField(value);
	}

	public custom.fields.CloseIndex get(custom.fields.CloseIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CloseIndex getCloseIndex() throws FieldNotFound {
		return get(new custom.fields.CloseIndex());
	}

	public boolean isSet(custom.fields.CloseIndex field) {
		return isSetField(field);
	}

	public boolean isSetCloseIndex() {
		return isSetField(26);
	}

	public void set(custom.fields.TypeIndex value) {
		setField(value);
	}

	public custom.fields.TypeIndex get(custom.fields.TypeIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TypeIndex getTypeIndex() throws FieldNotFound {
		return get(new custom.fields.TypeIndex());
	}

	public boolean isSet(custom.fields.TypeIndex field) {
		return isSetField(field);
	}

	public boolean isSetTypeIndex() {
		return isSetField(27);
	}

	public void set(custom.fields.IndexName value) {
		setField(value);
	}

	public custom.fields.IndexName get(custom.fields.IndexName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.IndexName getIndexName() throws FieldNotFound {
		return get(new custom.fields.IndexName());
	}

	public boolean isSet(custom.fields.IndexName field) {
		return isSetField(field);
	}

	public boolean isSetIndexName() {
		return isSetField(18);
	}

}
