
package quickfix.messages;

import quickfix.FieldNotFound;


public class Index extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "I";
	

	public Index() {
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

	public void set(quickfix.fields.Value value) {
		setField(value);
	}

	public quickfix.fields.Value get(quickfix.fields.Value value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Value getValue() throws FieldNotFound {
		return get(new quickfix.fields.Value());
	}

	public boolean isSet(quickfix.fields.Value field) {
		return isSetField(field);
	}

	public boolean isSetValue() {
		return isSetField(3);
	}

	public void set(quickfix.fields.CalTime value) {
		setField(value);
	}

	public quickfix.fields.CalTime get(quickfix.fields.CalTime value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CalTime getCalTime() throws FieldNotFound {
		return get(new quickfix.fields.CalTime());
	}

	public boolean isSet(quickfix.fields.CalTime field) {
		return isSetField(field);
	}

	public boolean isSetCalTime() {
		return isSetField(4);
	}

	public void set(quickfix.fields.Change value) {
		setField(value);
	}

	public quickfix.fields.Change get(quickfix.fields.Change value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Change getChange() throws FieldNotFound {
		return get(new quickfix.fields.Change());
	}

	public boolean isSet(quickfix.fields.Change field) {
		return isSetField(field);
	}

	public boolean isSetChange() {
		return isSetField(5);
	}

	public void set(quickfix.fields.RatioChange value) {
		setField(value);
	}

	public quickfix.fields.RatioChange get(quickfix.fields.RatioChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.RatioChange getRatioChange() throws FieldNotFound {
		return get(new quickfix.fields.RatioChange());
	}

	public boolean isSet(quickfix.fields.RatioChange field) {
		return isSetField(field);
	}

	public boolean isSetRatioChange() {
		return isSetField(6);
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

	public void set(quickfix.fields.TotalValue value) {
		setField(value);
	}

	public quickfix.fields.TotalValue get(quickfix.fields.TotalValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalValue getTotalValue() throws FieldNotFound {
		return get(new quickfix.fields.TotalValue());
	}

	public boolean isSet(quickfix.fields.TotalValue field) {
		return isSetField(field);
	}

	public boolean isSetTotalValue() {
		return isSetField(14);
	}

	public void set(quickfix.fields.TradingDate value) {
		setField(value);
	}

	public quickfix.fields.TradingDate get(quickfix.fields.TradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TradingDate getTradingDate() throws FieldNotFound {
		return get(new quickfix.fields.TradingDate());
	}

	public boolean isSet(quickfix.fields.TradingDate field) {
		return isSetField(field);
	}

	public boolean isSetTradingDate() {
		return isSetField(388);
	}

	public void set(quickfix.fields.CurrentStatus value) {
		setField(value);
	}

	public quickfix.fields.CurrentStatus get(quickfix.fields.CurrentStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CurrentStatus getCurrentStatus() throws FieldNotFound {
		return get(new quickfix.fields.CurrentStatus());
	}

	public boolean isSet(quickfix.fields.CurrentStatus field) {
		return isSetField(field);
	}

	public boolean isSetCurrentStatus() {
		return isSetField(21);
	}

	public void set(quickfix.fields.TotalStock value) {
		setField(value);
	}

	public quickfix.fields.TotalStock get(quickfix.fields.TotalStock value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalStock getTotalStock() throws FieldNotFound {
		return get(new quickfix.fields.TotalStock());
	}

	public boolean isSet(quickfix.fields.TotalStock field) {
		return isSetField(field);
	}

	public boolean isSetTotalStock() {
		return isSetField(22);
	}

	public void set(quickfix.fields.PriorIndexVal value) {
		setField(value);
	}

	public quickfix.fields.PriorIndexVal get(quickfix.fields.PriorIndexVal value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PriorIndexVal getPriorIndexVal() throws FieldNotFound {
		return get(new quickfix.fields.PriorIndexVal());
	}

	public boolean isSet(quickfix.fields.PriorIndexVal field) {
		return isSetField(field);
	}

	public boolean isSetPriorIndexVal() {
		return isSetField(23);
	}

	public void set(quickfix.fields.HighestIndex value) {
		setField(value);
	}

	public quickfix.fields.HighestIndex get(quickfix.fields.HighestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.HighestIndex getHighestIndex() throws FieldNotFound {
		return get(new quickfix.fields.HighestIndex());
	}

	public boolean isSet(quickfix.fields.HighestIndex field) {
		return isSetField(field);
	}

	public boolean isSetHighestIndex() {
		return isSetField(24);
	}

	public void set(quickfix.fields.LowestIndex value) {
		setField(value);
	}

	public quickfix.fields.LowestIndex get(quickfix.fields.LowestIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.LowestIndex getLowestIndex() throws FieldNotFound {
		return get(new quickfix.fields.LowestIndex());
	}

	public boolean isSet(quickfix.fields.LowestIndex field) {
		return isSetField(field);
	}

	public boolean isSetLowestIndex() {
		return isSetField(25);
	}

	public void set(quickfix.fields.CloseIndex value) {
		setField(value);
	}

	public quickfix.fields.CloseIndex get(quickfix.fields.CloseIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CloseIndex getCloseIndex() throws FieldNotFound {
		return get(new quickfix.fields.CloseIndex());
	}

	public boolean isSet(quickfix.fields.CloseIndex field) {
		return isSetField(field);
	}

	public boolean isSetCloseIndex() {
		return isSetField(26);
	}

	public void set(quickfix.fields.TypeIndex value) {
		setField(value);
	}

	public quickfix.fields.TypeIndex get(quickfix.fields.TypeIndex value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TypeIndex getTypeIndex() throws FieldNotFound {
		return get(new quickfix.fields.TypeIndex());
	}

	public boolean isSet(quickfix.fields.TypeIndex field) {
		return isSetField(field);
	}

	public boolean isSetTypeIndex() {
		return isSetField(27);
	}

	public void set(quickfix.fields.IndexName value) {
		setField(value);
	}

	public quickfix.fields.IndexName get(quickfix.fields.IndexName value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.IndexName getIndexName() throws FieldNotFound {
		return get(new quickfix.fields.IndexName());
	}

	public boolean isSet(quickfix.fields.IndexName field) {
		return isSetField(field);
	}

	public boolean isSetIndexName() {
		return isSetField(18);
	}

}
