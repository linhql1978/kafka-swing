
package custom.messages;

import quickfix.FieldNotFound;


public class DerivativesInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "DI";
	

	public DerivativesInfo() {
		super();
		getHeader().setField(new custom.fields.MsgType(MSGTYPE));
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

	public void set(custom.fields.SymbolID value) {
		setField(value);
	}

	public custom.fields.SymbolID get(custom.fields.SymbolID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SymbolID getSymbolID() throws FieldNotFound {
		return get(new custom.fields.SymbolID());
	}

	public boolean isSet(custom.fields.SymbolID field) {
		return isSetField(field);
	}

	public boolean isSetSymbolID() {
		return isSetField(15);
	}

	public void set(custom.fields.Underlying value) {
		setField(value);
	}

	public custom.fields.Underlying get(custom.fields.Underlying value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Underlying getUnderlying() throws FieldNotFound {
		return get(new custom.fields.Underlying());
	}

	public boolean isSet(custom.fields.Underlying field) {
		return isSetField(field);
	}

	public boolean isSetUnderlying() {
		return isSetField(800);
	}

	public void set(custom.fields.BoardCode value) {
		setField(value);
	}

	public custom.fields.BoardCode get(custom.fields.BoardCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BoardCode getBoardCode() throws FieldNotFound {
		return get(new custom.fields.BoardCode());
	}

	public boolean isSet(custom.fields.BoardCode field) {
		return isSetField(field);
	}

	public boolean isSetBoardCode() {
		return isSetField(425);
	}

	public void set(custom.fields.TradingSessionID value) {
		setField(value);
	}

	public custom.fields.TradingSessionID get(custom.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new custom.fields.TradingSessionID());
	}

	public boolean isSet(custom.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(custom.fields.TradeSesStatus value) {
		setField(value);
	}

	public custom.fields.TradeSesStatus get(custom.fields.TradeSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradeSesStatus getTradeSesStatus() throws FieldNotFound {
		return get(new custom.fields.TradeSesStatus());
	}

	public boolean isSet(custom.fields.TradeSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradeSesStatus() {
		return isSetField(340);
	}

	public void set(custom.fields.SecurityTradingStatus value) {
		setField(value);
	}

	public custom.fields.SecurityTradingStatus get(custom.fields.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new custom.fields.SecurityTradingStatus());
	}

	public boolean isSet(custom.fields.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(custom.fields.ListingStatus value) {
		setField(value);
	}

	public custom.fields.ListingStatus get(custom.fields.ListingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.ListingStatus getListingStatus() throws FieldNotFound {
		return get(new custom.fields.ListingStatus());
	}

	public boolean isSet(custom.fields.ListingStatus field) {
		return isSetField(field);
	}

	public boolean isSetListingStatus() {
		return isSetField(327);
	}

	public void set(custom.fields.SecurityType value) {
		setField(value);
	}

	public custom.fields.SecurityType get(custom.fields.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SecurityType getSecurityType() throws FieldNotFound {
		return get(new custom.fields.SecurityType());
	}

	public boolean isSet(custom.fields.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(custom.fields.OpenInterest value) {
		setField(value);
	}

	public custom.fields.OpenInterest get(custom.fields.OpenInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OpenInterest getOpenInterest() throws FieldNotFound {
		return get(new custom.fields.OpenInterest());
	}

	public boolean isSet(custom.fields.OpenInterest field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterest() {
		return isSetField(801);
	}

	public void set(custom.fields.OpenInterestChange value) {
		setField(value);
	}

	public custom.fields.OpenInterestChange get(custom.fields.OpenInterestChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OpenInterestChange getOpenInterestChange() throws FieldNotFound {
		return get(new custom.fields.OpenInterestChange());
	}

	public boolean isSet(custom.fields.OpenInterestChange field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterestChange() {
		return isSetField(8011);
	}

	public void set(custom.fields.FirstTradingDate value) {
		setField(value);
	}

	public custom.fields.FirstTradingDate get(custom.fields.FirstTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.FirstTradingDate getFirstTradingDate() throws FieldNotFound {
		return get(new custom.fields.FirstTradingDate());
	}

	public boolean isSet(custom.fields.FirstTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetFirstTradingDate() {
		return isSetField(802);
	}

	public void set(custom.fields.LastTradingDate value) {
		setField(value);
	}

	public custom.fields.LastTradingDate get(custom.fields.LastTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.LastTradingDate getLastTradingDate() throws FieldNotFound {
		return get(new custom.fields.LastTradingDate());
	}

	public boolean isSet(custom.fields.LastTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetLastTradingDate() {
		return isSetField(803);
	}

	public void set(custom.fields.BestBidPrice value) {
		setField(value);
	}

	public custom.fields.BestBidPrice get(custom.fields.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new custom.fields.BestBidPrice());
	}

	public boolean isSet(custom.fields.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(custom.fields.BestBidQtty value) {
		setField(value);
	}

	public custom.fields.BestBidQtty get(custom.fields.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new custom.fields.BestBidQtty());
	}

	public boolean isSet(custom.fields.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(custom.fields.BestOfferPrice value) {
		setField(value);
	}

	public custom.fields.BestOfferPrice get(custom.fields.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new custom.fields.BestOfferPrice());
	}

	public boolean isSet(custom.fields.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(custom.fields.BestOfferQtty value) {
		setField(value);
	}

	public custom.fields.BestOfferQtty get(custom.fields.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new custom.fields.BestOfferQtty());
	}

	public boolean isSet(custom.fields.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(custom.fields.TotalBidQtty value) {
		setField(value);
	}

	public custom.fields.TotalBidQtty get(custom.fields.TotalBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalBidQtty getTotalBidQtty() throws FieldNotFound {
		return get(new custom.fields.TotalBidQtty());
	}

	public boolean isSet(custom.fields.TotalBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty() {
		return isSetField(134);
	}

	public void set(custom.fields.TotalOfferQtty value) {
		setField(value);
	}

	public custom.fields.TotalOfferQtty get(custom.fields.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new custom.fields.TotalOfferQtty());
	}

	public boolean isSet(custom.fields.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(custom.fields.BasicPrice value) {
		setField(value);
	}

	public custom.fields.BasicPrice get(custom.fields.BasicPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BasicPrice getBasicPrice() throws FieldNotFound {
		return get(new custom.fields.BasicPrice());
	}

	public boolean isSet(custom.fields.BasicPrice field) {
		return isSetField(field);
	}

	public boolean isSetBasicPrice() {
		return isSetField(260);
	}

	public void set(custom.fields.FloorPrice value) {
		setField(value);
	}

	public custom.fields.FloorPrice get(custom.fields.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new custom.fields.FloorPrice());
	}

	public boolean isSet(custom.fields.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(333);
	}

	public void set(custom.fields.CeilingPrice value) {
		setField(value);
	}

	public custom.fields.CeilingPrice get(custom.fields.CeilingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CeilingPrice getCeilingPrice() throws FieldNotFound {
		return get(new custom.fields.CeilingPrice());
	}

	public boolean isSet(custom.fields.CeilingPrice field) {
		return isSetField(field);
	}

	public boolean isSetCeilingPrice() {
		return isSetField(332);
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

	public void set(custom.fields.OpenPrice value) {
		setField(value);
	}

	public custom.fields.OpenPrice get(custom.fields.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new custom.fields.OpenPrice());
	}

	public boolean isSet(custom.fields.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(custom.fields.PriorOpenPrice value) {
		setField(value);
	}

	public custom.fields.PriorOpenPrice get(custom.fields.PriorOpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PriorOpenPrice getPriorOpenPrice() throws FieldNotFound {
		return get(new custom.fields.PriorOpenPrice());
	}

	public boolean isSet(custom.fields.PriorOpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorOpenPrice() {
		return isSetField(138);
	}

	public void set(custom.fields.OpenQtty value) {
		setField(value);
	}

	public custom.fields.OpenQtty get(custom.fields.OpenQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OpenQtty getOpenQtty() throws FieldNotFound {
		return get(new custom.fields.OpenQtty());
	}

	public boolean isSet(custom.fields.OpenQtty field) {
		return isSetField(field);
	}

	public boolean isSetOpenQtty() {
		return isSetField(804);
	}

	public void set(custom.fields.ClosePrice value) {
		setField(value);
	}

	public custom.fields.ClosePrice get(custom.fields.ClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.ClosePrice getClosePrice() throws FieldNotFound {
		return get(new custom.fields.ClosePrice());
	}

	public boolean isSet(custom.fields.ClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetClosePrice() {
		return isSetField(139);
	}

	public void set(custom.fields.PriorClosePrice value) {
		setField(value);
	}

	public custom.fields.PriorClosePrice get(custom.fields.PriorClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PriorClosePrice getPriorClosePrice() throws FieldNotFound {
		return get(new custom.fields.PriorClosePrice());
	}

	public boolean isSet(custom.fields.PriorClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorClosePrice() {
		return isSetField(140);
	}

	public void set(custom.fields.CloseQtty value) {
		setField(value);
	}

	public custom.fields.CloseQtty get(custom.fields.CloseQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CloseQtty getCloseQtty() throws FieldNotFound {
		return get(new custom.fields.CloseQtty());
	}

	public boolean isSet(custom.fields.CloseQtty field) {
		return isSetField(field);
	}

	public boolean isSetCloseQtty() {
		return isSetField(805);
	}

	public void set(custom.fields.TotalVolumeTraded value) {
		setField(value);
	}

	public custom.fields.TotalVolumeTraded get(custom.fields.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new custom.fields.TotalVolumeTraded());
	}

	public boolean isSet(custom.fields.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
	}

	public void set(custom.fields.TotalValueTraded value) {
		setField(value);
	}

	public custom.fields.TotalValueTraded get(custom.fields.TotalValueTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TotalValueTraded getTotalValueTraded() throws FieldNotFound {
		return get(new custom.fields.TotalValueTraded());
	}

	public boolean isSet(custom.fields.TotalValueTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalValueTraded() {
		return isSetField(3871);
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

	public void set(custom.fields.Time value) {
		setField(value);
	}

	public custom.fields.Time get(custom.fields.Time value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.Time getTime() throws FieldNotFound {
		return get(new custom.fields.Time());
	}

	public boolean isSet(custom.fields.Time field) {
		return isSetField(field);
	}

	public boolean isSetTime() {
		return isSetField(399);
	}

	public void set(custom.fields.TradingUnit value) {
		setField(value);
	}

	public custom.fields.TradingUnit get(custom.fields.TradingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.TradingUnit getTradingUnit() throws FieldNotFound {
		return get(new custom.fields.TradingUnit());
	}

	public boolean isSet(custom.fields.TradingUnit field) {
		return isSetField(field);
	}

	public boolean isSetTradingUnit() {
		return isSetField(400);
	}

	public void set(custom.fields.DateNo value) {
		setField(value);
	}

	public custom.fields.DateNo get(custom.fields.DateNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.DateNo getDateNo() throws FieldNotFound {
		return get(new custom.fields.DateNo());
	}

	public boolean isSet(custom.fields.DateNo field) {
		return isSetField(field);
	}

	public boolean isSetDateNo() {
		return isSetField(17);
	}

	public void set(custom.fields.CurrentPrice value) {
		setField(value);
	}

	public custom.fields.CurrentPrice get(custom.fields.CurrentPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CurrentPrice getCurrentPrice() throws FieldNotFound {
		return get(new custom.fields.CurrentPrice());
	}

	public boolean isSet(custom.fields.CurrentPrice field) {
		return isSetField(field);
	}

	public boolean isSetCurrentPrice() {
		return isSetField(255);
	}

	public void set(custom.fields.CurrentQtty value) {
		setField(value);
	}

	public custom.fields.CurrentQtty get(custom.fields.CurrentQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.CurrentQtty getCurrentQtty() throws FieldNotFound {
		return get(new custom.fields.CurrentQtty());
	}

	public boolean isSet(custom.fields.CurrentQtty field) {
		return isSetField(field);
	}

	public boolean isSetCurrentQtty() {
		return isSetField(2551);
	}

	public void set(custom.fields.HighestPrice value) {
		setField(value);
	}

	public custom.fields.HighestPrice get(custom.fields.HighestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.HighestPrice getHighestPrice() throws FieldNotFound {
		return get(new custom.fields.HighestPrice());
	}

	public boolean isSet(custom.fields.HighestPrice field) {
		return isSetField(field);
	}

	public boolean isSetHighestPrice() {
		return isSetField(266);
	}

	public void set(custom.fields.LowestPrice value) {
		setField(value);
	}

	public custom.fields.LowestPrice get(custom.fields.LowestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.LowestPrice getLowestPrice() throws FieldNotFound {
		return get(new custom.fields.LowestPrice());
	}

	public boolean isSet(custom.fields.LowestPrice field) {
		return isSetField(field);
	}

	public boolean isSetLowestPrice() {
		return isSetField(2661);
	}

	public void set(custom.fields.MatchValue value) {
		setField(value);
	}

	public custom.fields.MatchValue get(custom.fields.MatchValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.MatchValue getMatchValue() throws FieldNotFound {
		return get(new custom.fields.MatchValue());
	}

	public boolean isSet(custom.fields.MatchValue field) {
		return isSetField(field);
	}

	public boolean isSetMatchValue() {
		return isSetField(310);
	}

	public void set(custom.fields.OfferCount value) {
		setField(value);
	}

	public custom.fields.OfferCount get(custom.fields.OfferCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.OfferCount getOfferCount() throws FieldNotFound {
		return get(new custom.fields.OfferCount());
	}

	public boolean isSet(custom.fields.OfferCount field) {
		return isSetField(field);
	}

	public boolean isSetOfferCount() {
		return isSetField(320);
	}

	public void set(custom.fields.BidCount value) {
		setField(value);
	}

	public custom.fields.BidCount get(custom.fields.BidCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BidCount getBidCount() throws FieldNotFound {
		return get(new custom.fields.BidCount());
	}

	public boolean isSet(custom.fields.BidCount field) {
		return isSetField(field);
	}

	public boolean isSetBidCount() {
		return isSetField(321);
	}

	public void set(custom.fields.NM_TotalTradedQtty value) {
		setField(value);
	}

	public custom.fields.NM_TotalTradedQtty get(custom.fields.NM_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_TotalTradedQtty getNM_TotalTradedQtty() throws FieldNotFound {
		return get(new custom.fields.NM_TotalTradedQtty());
	}

	public boolean isSet(custom.fields.NM_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedQtty() {
		return isSetField(391);
	}

	public void set(custom.fields.NM_TotalTradedValue value) {
		setField(value);
	}

	public custom.fields.NM_TotalTradedValue get(custom.fields.NM_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_TotalTradedValue getNM_TotalTradedValue() throws FieldNotFound {
		return get(new custom.fields.NM_TotalTradedValue());
	}

	public boolean isSet(custom.fields.NM_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedValue() {
		return isSetField(392);
	}

	public void set(custom.fields.PT_MatchQtty value) {
		setField(value);
	}

	public custom.fields.PT_MatchQtty get(custom.fields.PT_MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_MatchQtty getPT_MatchQtty() throws FieldNotFound {
		return get(new custom.fields.PT_MatchQtty());
	}

	public boolean isSet(custom.fields.PT_MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchQtty() {
		return isSetField(393);
	}

	public void set(custom.fields.PT_MatchPrice value) {
		setField(value);
	}

	public custom.fields.PT_MatchPrice get(custom.fields.PT_MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_MatchPrice getPT_MatchPrice() throws FieldNotFound {
		return get(new custom.fields.PT_MatchPrice());
	}

	public boolean isSet(custom.fields.PT_MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchPrice() {
		return isSetField(3931);
	}

	public void set(custom.fields.PT_TotalTradedQtty value) {
		setField(value);
	}

	public custom.fields.PT_TotalTradedQtty get(custom.fields.PT_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_TotalTradedQtty getPT_TotalTradedQtty() throws FieldNotFound {
		return get(new custom.fields.PT_TotalTradedQtty());
	}

	public boolean isSet(custom.fields.PT_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedQtty() {
		return isSetField(394);
	}

	public void set(custom.fields.PT_TotalTradedValue value) {
		setField(value);
	}

	public custom.fields.PT_TotalTradedValue get(custom.fields.PT_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_TotalTradedValue getPT_TotalTradedValue() throws FieldNotFound {
		return get(new custom.fields.PT_TotalTradedValue());
	}

	public boolean isSet(custom.fields.PT_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedValue() {
		return isSetField(9141);
	}

	public void set(custom.fields.NM_BuyForeignQtty value) {
		setField(value);
	}

	public custom.fields.NM_BuyForeignQtty get(custom.fields.NM_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_BuyForeignQtty getNM_BuyForeignQtty() throws FieldNotFound {
		return get(new custom.fields.NM_BuyForeignQtty());
	}

	public boolean isSet(custom.fields.NM_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignQtty() {
		return isSetField(814);
	}

	public void set(custom.fields.PT_BuyForeignQtty value) {
		setField(value);
	}

	public custom.fields.PT_BuyForeignQtty get(custom.fields.PT_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_BuyForeignQtty getPT_BuyForeignQtty() throws FieldNotFound {
		return get(new custom.fields.PT_BuyForeignQtty());
	}

	public boolean isSet(custom.fields.PT_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignQtty() {
		return isSetField(815);
	}

	public void set(custom.fields.BuyForeignQtty value) {
		setField(value);
	}

	public custom.fields.BuyForeignQtty get(custom.fields.BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BuyForeignQtty getBuyForeignQtty() throws FieldNotFound {
		return get(new custom.fields.BuyForeignQtty());
	}

	public boolean isSet(custom.fields.BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignQtty() {
		return isSetField(397);
	}

	public void set(custom.fields.NM_BuyForeignValue value) {
		setField(value);
	}

	public custom.fields.NM_BuyForeignValue get(custom.fields.NM_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_BuyForeignValue getNM_BuyForeignValue() throws FieldNotFound {
		return get(new custom.fields.NM_BuyForeignValue());
	}

	public boolean isSet(custom.fields.NM_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignValue() {
		return isSetField(8141);
	}

	public void set(custom.fields.PT_BuyForeignValue value) {
		setField(value);
	}

	public custom.fields.PT_BuyForeignValue get(custom.fields.PT_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_BuyForeignValue getPT_BuyForeignValue() throws FieldNotFound {
		return get(new custom.fields.PT_BuyForeignValue());
	}

	public boolean isSet(custom.fields.PT_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignValue() {
		return isSetField(8151);
	}

	public void set(custom.fields.BuyForeignValue value) {
		setField(value);
	}

	public custom.fields.BuyForeignValue get(custom.fields.BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.BuyForeignValue getBuyForeignValue() throws FieldNotFound {
		return get(new custom.fields.BuyForeignValue());
	}

	public boolean isSet(custom.fields.BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignValue() {
		return isSetField(3971);
	}

	public void set(custom.fields.NM_SellForeignQtty value) {
		setField(value);
	}

	public custom.fields.NM_SellForeignQtty get(custom.fields.NM_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_SellForeignQtty getNM_SellForeignQtty() throws FieldNotFound {
		return get(new custom.fields.NM_SellForeignQtty());
	}

	public boolean isSet(custom.fields.NM_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignQtty() {
		return isSetField(816);
	}

	public void set(custom.fields.PT_SellForeignQtty value) {
		setField(value);
	}

	public custom.fields.PT_SellForeignQtty get(custom.fields.PT_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_SellForeignQtty getPT_SellForeignQtty() throws FieldNotFound {
		return get(new custom.fields.PT_SellForeignQtty());
	}

	public boolean isSet(custom.fields.PT_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignQtty() {
		return isSetField(817);
	}

	public void set(custom.fields.SellForeignQtty value) {
		setField(value);
	}

	public custom.fields.SellForeignQtty get(custom.fields.SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SellForeignQtty getSellForeignQtty() throws FieldNotFound {
		return get(new custom.fields.SellForeignQtty());
	}

	public boolean isSet(custom.fields.SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignQtty() {
		return isSetField(398);
	}

	public void set(custom.fields.NM_SellForeignValue value) {
		setField(value);
	}

	public custom.fields.NM_SellForeignValue get(custom.fields.NM_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.NM_SellForeignValue getNM_SellForeignValue() throws FieldNotFound {
		return get(new custom.fields.NM_SellForeignValue());
	}

	public boolean isSet(custom.fields.NM_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignValue() {
		return isSetField(8161);
	}

	public void set(custom.fields.PT_SellForeignValue value) {
		setField(value);
	}

	public custom.fields.PT_SellForeignValue get(custom.fields.PT_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.PT_SellForeignValue getPT_SellForeignValue() throws FieldNotFound {
		return get(new custom.fields.PT_SellForeignValue());
	}

	public boolean isSet(custom.fields.PT_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignValue() {
		return isSetField(8171);
	}

	public void set(custom.fields.SellForeignValue value) {
		setField(value);
	}

	public custom.fields.SellForeignValue get(custom.fields.SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public custom.fields.SellForeignValue getSellForeignValue() throws FieldNotFound {
		return get(new custom.fields.SellForeignValue());
	}

	public boolean isSet(custom.fields.SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignValue() {
		return isSetField(3981);
	}

}
