
package quickfix.messages;

import quickfix.FieldNotFound;


public class DerivativesInfo extends Message {

	static final long serialVersionUID = 20050617;
	public static final String MSGTYPE = "DI";
	

	public DerivativesInfo() {
		super();
		getHeader().setField(new quickfix.fields.MsgType(MSGTYPE));
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

	public void set(quickfix.fields.SymbolID value) {
		setField(value);
	}

	public quickfix.fields.SymbolID get(quickfix.fields.SymbolID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.SymbolID getSymbolID() throws FieldNotFound {
		return get(new quickfix.fields.SymbolID());
	}

	public boolean isSet(quickfix.fields.SymbolID field) {
		return isSetField(field);
	}

	public boolean isSetSymbolID() {
		return isSetField(15);
	}

	public void set(quickfix.fields.Underlying value) {
		setField(value);
	}

	public quickfix.fields.Underlying get(quickfix.fields.Underlying value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Underlying getUnderlying() throws FieldNotFound {
		return get(new quickfix.fields.Underlying());
	}

	public boolean isSet(quickfix.fields.Underlying field) {
		return isSetField(field);
	}

	public boolean isSetUnderlying() {
		return isSetField(800);
	}

	public void set(quickfix.fields.BoardCode value) {
		setField(value);
	}

	public quickfix.fields.BoardCode get(quickfix.fields.BoardCode value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BoardCode getBoardCode() throws FieldNotFound {
		return get(new quickfix.fields.BoardCode());
	}

	public boolean isSet(quickfix.fields.BoardCode field) {
		return isSetField(field);
	}

	public boolean isSetBoardCode() {
		return isSetField(425);
	}

	public void set(quickfix.fields.TradingSessionID value) {
		setField(value);
	}

	public quickfix.fields.TradingSessionID get(quickfix.fields.TradingSessionID value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TradingSessionID getTradingSessionID() throws FieldNotFound {
		return get(new quickfix.fields.TradingSessionID());
	}

	public boolean isSet(quickfix.fields.TradingSessionID field) {
		return isSetField(field);
	}

	public boolean isSetTradingSessionID() {
		return isSetField(336);
	}

	public void set(quickfix.fields.TradeSesStatus value) {
		setField(value);
	}

	public quickfix.fields.TradeSesStatus get(quickfix.fields.TradeSesStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TradeSesStatus getTradeSesStatus() throws FieldNotFound {
		return get(new quickfix.fields.TradeSesStatus());
	}

	public boolean isSet(quickfix.fields.TradeSesStatus field) {
		return isSetField(field);
	}

	public boolean isSetTradeSesStatus() {
		return isSetField(340);
	}

	public void set(quickfix.fields.SecurityTradingStatus value) {
		setField(value);
	}

	public quickfix.fields.SecurityTradingStatus get(quickfix.fields.SecurityTradingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.SecurityTradingStatus getSecurityTradingStatus() throws FieldNotFound {
		return get(new quickfix.fields.SecurityTradingStatus());
	}

	public boolean isSet(quickfix.fields.SecurityTradingStatus field) {
		return isSetField(field);
	}

	public boolean isSetSecurityTradingStatus() {
		return isSetField(326);
	}

	public void set(quickfix.fields.ListingStatus value) {
		setField(value);
	}

	public quickfix.fields.ListingStatus get(quickfix.fields.ListingStatus value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.ListingStatus getListingStatus() throws FieldNotFound {
		return get(new quickfix.fields.ListingStatus());
	}

	public boolean isSet(quickfix.fields.ListingStatus field) {
		return isSetField(field);
	}

	public boolean isSetListingStatus() {
		return isSetField(327);
	}

	public void set(quickfix.fields.SecurityType value) {
		setField(value);
	}

	public quickfix.fields.SecurityType get(quickfix.fields.SecurityType value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.SecurityType getSecurityType() throws FieldNotFound {
		return get(new quickfix.fields.SecurityType());
	}

	public boolean isSet(quickfix.fields.SecurityType field) {
		return isSetField(field);
	}

	public boolean isSetSecurityType() {
		return isSetField(167);
	}

	public void set(quickfix.fields.OpenInterest value) {
		setField(value);
	}

	public quickfix.fields.OpenInterest get(quickfix.fields.OpenInterest value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OpenInterest getOpenInterest() throws FieldNotFound {
		return get(new quickfix.fields.OpenInterest());
	}

	public boolean isSet(quickfix.fields.OpenInterest field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterest() {
		return isSetField(801);
	}

	public void set(quickfix.fields.OpenInterestChange value) {
		setField(value);
	}

	public quickfix.fields.OpenInterestChange get(quickfix.fields.OpenInterestChange value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OpenInterestChange getOpenInterestChange() throws FieldNotFound {
		return get(new quickfix.fields.OpenInterestChange());
	}

	public boolean isSet(quickfix.fields.OpenInterestChange field) {
		return isSetField(field);
	}

	public boolean isSetOpenInterestChange() {
		return isSetField(8011);
	}

	public void set(quickfix.fields.FirstTradingDate value) {
		setField(value);
	}

	public quickfix.fields.FirstTradingDate get(quickfix.fields.FirstTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.FirstTradingDate getFirstTradingDate() throws FieldNotFound {
		return get(new quickfix.fields.FirstTradingDate());
	}

	public boolean isSet(quickfix.fields.FirstTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetFirstTradingDate() {
		return isSetField(802);
	}

	public void set(quickfix.fields.LastTradingDate value) {
		setField(value);
	}

	public quickfix.fields.LastTradingDate get(quickfix.fields.LastTradingDate value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.LastTradingDate getLastTradingDate() throws FieldNotFound {
		return get(new quickfix.fields.LastTradingDate());
	}

	public boolean isSet(quickfix.fields.LastTradingDate field) {
		return isSetField(field);
	}

	public boolean isSetLastTradingDate() {
		return isSetField(803);
	}

	public void set(quickfix.fields.BestBidPrice value) {
		setField(value);
	}

	public quickfix.fields.BestBidPrice get(quickfix.fields.BestBidPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestBidPrice getBestBidPrice() throws FieldNotFound {
		return get(new quickfix.fields.BestBidPrice());
	}

	public boolean isSet(quickfix.fields.BestBidPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestBidPrice() {
		return isSetField(132);
	}

	public void set(quickfix.fields.BestBidQtty value) {
		setField(value);
	}

	public quickfix.fields.BestBidQtty get(quickfix.fields.BestBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestBidQtty getBestBidQtty() throws FieldNotFound {
		return get(new quickfix.fields.BestBidQtty());
	}

	public boolean isSet(quickfix.fields.BestBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestBidQtty() {
		return isSetField(1321);
	}

	public void set(quickfix.fields.BestOfferPrice value) {
		setField(value);
	}

	public quickfix.fields.BestOfferPrice get(quickfix.fields.BestOfferPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestOfferPrice getBestOfferPrice() throws FieldNotFound {
		return get(new quickfix.fields.BestOfferPrice());
	}

	public boolean isSet(quickfix.fields.BestOfferPrice field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferPrice() {
		return isSetField(133);
	}

	public void set(quickfix.fields.BestOfferQtty value) {
		setField(value);
	}

	public quickfix.fields.BestOfferQtty get(quickfix.fields.BestOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BestOfferQtty getBestOfferQtty() throws FieldNotFound {
		return get(new quickfix.fields.BestOfferQtty());
	}

	public boolean isSet(quickfix.fields.BestOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetBestOfferQtty() {
		return isSetField(1331);
	}

	public void set(quickfix.fields.TotalBidQtty value) {
		setField(value);
	}

	public quickfix.fields.TotalBidQtty get(quickfix.fields.TotalBidQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalBidQtty getTotalBidQtty() throws FieldNotFound {
		return get(new quickfix.fields.TotalBidQtty());
	}

	public boolean isSet(quickfix.fields.TotalBidQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalBidQtty() {
		return isSetField(134);
	}

	public void set(quickfix.fields.TotalOfferQtty value) {
		setField(value);
	}

	public quickfix.fields.TotalOfferQtty get(quickfix.fields.TotalOfferQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalOfferQtty getTotalOfferQtty() throws FieldNotFound {
		return get(new quickfix.fields.TotalOfferQtty());
	}

	public boolean isSet(quickfix.fields.TotalOfferQtty field) {
		return isSetField(field);
	}

	public boolean isSetTotalOfferQtty() {
		return isSetField(135);
	}

	public void set(quickfix.fields.BasicPrice value) {
		setField(value);
	}

	public quickfix.fields.BasicPrice get(quickfix.fields.BasicPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BasicPrice getBasicPrice() throws FieldNotFound {
		return get(new quickfix.fields.BasicPrice());
	}

	public boolean isSet(quickfix.fields.BasicPrice field) {
		return isSetField(field);
	}

	public boolean isSetBasicPrice() {
		return isSetField(260);
	}

	public void set(quickfix.fields.FloorPrice value) {
		setField(value);
	}

	public quickfix.fields.FloorPrice get(quickfix.fields.FloorPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.FloorPrice getFloorPrice() throws FieldNotFound {
		return get(new quickfix.fields.FloorPrice());
	}

	public boolean isSet(quickfix.fields.FloorPrice field) {
		return isSetField(field);
	}

	public boolean isSetFloorPrice() {
		return isSetField(333);
	}

	public void set(quickfix.fields.CeilingPrice value) {
		setField(value);
	}

	public quickfix.fields.CeilingPrice get(quickfix.fields.CeilingPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CeilingPrice getCeilingPrice() throws FieldNotFound {
		return get(new quickfix.fields.CeilingPrice());
	}

	public boolean isSet(quickfix.fields.CeilingPrice field) {
		return isSetField(field);
	}

	public boolean isSetCeilingPrice() {
		return isSetField(332);
	}

	public void set(quickfix.fields.MatchPrice value) {
		setField(value);
	}

	public quickfix.fields.MatchPrice get(quickfix.fields.MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.MatchPrice getMatchPrice() throws FieldNotFound {
		return get(new quickfix.fields.MatchPrice());
	}

	public boolean isSet(quickfix.fields.MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetMatchPrice() {
		return isSetField(31);
	}

	public void set(quickfix.fields.MatchQtty value) {
		setField(value);
	}

	public quickfix.fields.MatchQtty get(quickfix.fields.MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.MatchQtty getMatchQtty() throws FieldNotFound {
		return get(new quickfix.fields.MatchQtty());
	}

	public boolean isSet(quickfix.fields.MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetMatchQtty() {
		return isSetField(32);
	}

	public void set(quickfix.fields.OpenPrice value) {
		setField(value);
	}

	public quickfix.fields.OpenPrice get(quickfix.fields.OpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OpenPrice getOpenPrice() throws FieldNotFound {
		return get(new quickfix.fields.OpenPrice());
	}

	public boolean isSet(quickfix.fields.OpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetOpenPrice() {
		return isSetField(137);
	}

	public void set(quickfix.fields.PriorOpenPrice value) {
		setField(value);
	}

	public quickfix.fields.PriorOpenPrice get(quickfix.fields.PriorOpenPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PriorOpenPrice getPriorOpenPrice() throws FieldNotFound {
		return get(new quickfix.fields.PriorOpenPrice());
	}

	public boolean isSet(quickfix.fields.PriorOpenPrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorOpenPrice() {
		return isSetField(138);
	}

	public void set(quickfix.fields.OpenQtty value) {
		setField(value);
	}

	public quickfix.fields.OpenQtty get(quickfix.fields.OpenQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OpenQtty getOpenQtty() throws FieldNotFound {
		return get(new quickfix.fields.OpenQtty());
	}

	public boolean isSet(quickfix.fields.OpenQtty field) {
		return isSetField(field);
	}

	public boolean isSetOpenQtty() {
		return isSetField(804);
	}

	public void set(quickfix.fields.ClosePrice value) {
		setField(value);
	}

	public quickfix.fields.ClosePrice get(quickfix.fields.ClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.ClosePrice getClosePrice() throws FieldNotFound {
		return get(new quickfix.fields.ClosePrice());
	}

	public boolean isSet(quickfix.fields.ClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetClosePrice() {
		return isSetField(139);
	}

	public void set(quickfix.fields.PriorClosePrice value) {
		setField(value);
	}

	public quickfix.fields.PriorClosePrice get(quickfix.fields.PriorClosePrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PriorClosePrice getPriorClosePrice() throws FieldNotFound {
		return get(new quickfix.fields.PriorClosePrice());
	}

	public boolean isSet(quickfix.fields.PriorClosePrice field) {
		return isSetField(field);
	}

	public boolean isSetPriorClosePrice() {
		return isSetField(140);
	}

	public void set(quickfix.fields.CloseQtty value) {
		setField(value);
	}

	public quickfix.fields.CloseQtty get(quickfix.fields.CloseQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CloseQtty getCloseQtty() throws FieldNotFound {
		return get(new quickfix.fields.CloseQtty());
	}

	public boolean isSet(quickfix.fields.CloseQtty field) {
		return isSetField(field);
	}

	public boolean isSetCloseQtty() {
		return isSetField(805);
	}

	public void set(quickfix.fields.TotalVolumeTraded value) {
		setField(value);
	}

	public quickfix.fields.TotalVolumeTraded get(quickfix.fields.TotalVolumeTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalVolumeTraded getTotalVolumeTraded() throws FieldNotFound {
		return get(new quickfix.fields.TotalVolumeTraded());
	}

	public boolean isSet(quickfix.fields.TotalVolumeTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalVolumeTraded() {
		return isSetField(387);
	}

	public void set(quickfix.fields.TotalValueTraded value) {
		setField(value);
	}

	public quickfix.fields.TotalValueTraded get(quickfix.fields.TotalValueTraded value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TotalValueTraded getTotalValueTraded() throws FieldNotFound {
		return get(new quickfix.fields.TotalValueTraded());
	}

	public boolean isSet(quickfix.fields.TotalValueTraded field) {
		return isSetField(field);
	}

	public boolean isSetTotalValueTraded() {
		return isSetField(3871);
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

	public void set(quickfix.fields.Time value) {
		setField(value);
	}

	public quickfix.fields.Time get(quickfix.fields.Time value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.Time getTime() throws FieldNotFound {
		return get(new quickfix.fields.Time());
	}

	public boolean isSet(quickfix.fields.Time field) {
		return isSetField(field);
	}

	public boolean isSetTime() {
		return isSetField(399);
	}

	public void set(quickfix.fields.TradingUnit value) {
		setField(value);
	}

	public quickfix.fields.TradingUnit get(quickfix.fields.TradingUnit value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.TradingUnit getTradingUnit() throws FieldNotFound {
		return get(new quickfix.fields.TradingUnit());
	}

	public boolean isSet(quickfix.fields.TradingUnit field) {
		return isSetField(field);
	}

	public boolean isSetTradingUnit() {
		return isSetField(400);
	}

	public void set(quickfix.fields.DateNo value) {
		setField(value);
	}

	public quickfix.fields.DateNo get(quickfix.fields.DateNo value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.DateNo getDateNo() throws FieldNotFound {
		return get(new quickfix.fields.DateNo());
	}

	public boolean isSet(quickfix.fields.DateNo field) {
		return isSetField(field);
	}

	public boolean isSetDateNo() {
		return isSetField(17);
	}

	public void set(quickfix.fields.CurrentPrice value) {
		setField(value);
	}

	public quickfix.fields.CurrentPrice get(quickfix.fields.CurrentPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CurrentPrice getCurrentPrice() throws FieldNotFound {
		return get(new quickfix.fields.CurrentPrice());
	}

	public boolean isSet(quickfix.fields.CurrentPrice field) {
		return isSetField(field);
	}

	public boolean isSetCurrentPrice() {
		return isSetField(255);
	}

	public void set(quickfix.fields.CurrentQtty value) {
		setField(value);
	}

	public quickfix.fields.CurrentQtty get(quickfix.fields.CurrentQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.CurrentQtty getCurrentQtty() throws FieldNotFound {
		return get(new quickfix.fields.CurrentQtty());
	}

	public boolean isSet(quickfix.fields.CurrentQtty field) {
		return isSetField(field);
	}

	public boolean isSetCurrentQtty() {
		return isSetField(2551);
	}

	public void set(quickfix.fields.HighestPrice value) {
		setField(value);
	}

	public quickfix.fields.HighestPrice get(quickfix.fields.HighestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.HighestPrice getHighestPrice() throws FieldNotFound {
		return get(new quickfix.fields.HighestPrice());
	}

	public boolean isSet(quickfix.fields.HighestPrice field) {
		return isSetField(field);
	}

	public boolean isSetHighestPrice() {
		return isSetField(266);
	}

	public void set(quickfix.fields.LowestPrice value) {
		setField(value);
	}

	public quickfix.fields.LowestPrice get(quickfix.fields.LowestPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.LowestPrice getLowestPrice() throws FieldNotFound {
		return get(new quickfix.fields.LowestPrice());
	}

	public boolean isSet(quickfix.fields.LowestPrice field) {
		return isSetField(field);
	}

	public boolean isSetLowestPrice() {
		return isSetField(2661);
	}

	public void set(quickfix.fields.MatchValue value) {
		setField(value);
	}

	public quickfix.fields.MatchValue get(quickfix.fields.MatchValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.MatchValue getMatchValue() throws FieldNotFound {
		return get(new quickfix.fields.MatchValue());
	}

	public boolean isSet(quickfix.fields.MatchValue field) {
		return isSetField(field);
	}

	public boolean isSetMatchValue() {
		return isSetField(310);
	}

	public void set(quickfix.fields.OfferCount value) {
		setField(value);
	}

	public quickfix.fields.OfferCount get(quickfix.fields.OfferCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.OfferCount getOfferCount() throws FieldNotFound {
		return get(new quickfix.fields.OfferCount());
	}

	public boolean isSet(quickfix.fields.OfferCount field) {
		return isSetField(field);
	}

	public boolean isSetOfferCount() {
		return isSetField(320);
	}

	public void set(quickfix.fields.BidCount value) {
		setField(value);
	}

	public quickfix.fields.BidCount get(quickfix.fields.BidCount value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BidCount getBidCount() throws FieldNotFound {
		return get(new quickfix.fields.BidCount());
	}

	public boolean isSet(quickfix.fields.BidCount field) {
		return isSetField(field);
	}

	public boolean isSetBidCount() {
		return isSetField(321);
	}

	public void set(quickfix.fields.NM_TotalTradedQtty value) {
		setField(value);
	}

	public quickfix.fields.NM_TotalTradedQtty get(quickfix.fields.NM_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_TotalTradedQtty getNM_TotalTradedQtty() throws FieldNotFound {
		return get(new quickfix.fields.NM_TotalTradedQtty());
	}

	public boolean isSet(quickfix.fields.NM_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedQtty() {
		return isSetField(391);
	}

	public void set(quickfix.fields.NM_TotalTradedValue value) {
		setField(value);
	}

	public quickfix.fields.NM_TotalTradedValue get(quickfix.fields.NM_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_TotalTradedValue getNM_TotalTradedValue() throws FieldNotFound {
		return get(new quickfix.fields.NM_TotalTradedValue());
	}

	public boolean isSet(quickfix.fields.NM_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_TotalTradedValue() {
		return isSetField(392);
	}

	public void set(quickfix.fields.PT_MatchQtty value) {
		setField(value);
	}

	public quickfix.fields.PT_MatchQtty get(quickfix.fields.PT_MatchQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_MatchQtty getPT_MatchQtty() throws FieldNotFound {
		return get(new quickfix.fields.PT_MatchQtty());
	}

	public boolean isSet(quickfix.fields.PT_MatchQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchQtty() {
		return isSetField(393);
	}

	public void set(quickfix.fields.PT_MatchPrice value) {
		setField(value);
	}

	public quickfix.fields.PT_MatchPrice get(quickfix.fields.PT_MatchPrice value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_MatchPrice getPT_MatchPrice() throws FieldNotFound {
		return get(new quickfix.fields.PT_MatchPrice());
	}

	public boolean isSet(quickfix.fields.PT_MatchPrice field) {
		return isSetField(field);
	}

	public boolean isSetPT_MatchPrice() {
		return isSetField(3931);
	}

	public void set(quickfix.fields.PT_TotalTradedQtty value) {
		setField(value);
	}

	public quickfix.fields.PT_TotalTradedQtty get(quickfix.fields.PT_TotalTradedQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_TotalTradedQtty getPT_TotalTradedQtty() throws FieldNotFound {
		return get(new quickfix.fields.PT_TotalTradedQtty());
	}

	public boolean isSet(quickfix.fields.PT_TotalTradedQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedQtty() {
		return isSetField(394);
	}

	public void set(quickfix.fields.PT_TotalTradedValue value) {
		setField(value);
	}

	public quickfix.fields.PT_TotalTradedValue get(quickfix.fields.PT_TotalTradedValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_TotalTradedValue getPT_TotalTradedValue() throws FieldNotFound {
		return get(new quickfix.fields.PT_TotalTradedValue());
	}

	public boolean isSet(quickfix.fields.PT_TotalTradedValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_TotalTradedValue() {
		return isSetField(9141);
	}

	public void set(quickfix.fields.NM_BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.NM_BuyForeignQtty get(quickfix.fields.NM_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_BuyForeignQtty getNM_BuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.NM_BuyForeignQtty());
	}

	public boolean isSet(quickfix.fields.NM_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignQtty() {
		return isSetField(814);
	}

	public void set(quickfix.fields.PT_BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.PT_BuyForeignQtty get(quickfix.fields.PT_BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_BuyForeignQtty getPT_BuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.PT_BuyForeignQtty());
	}

	public boolean isSet(quickfix.fields.PT_BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignQtty() {
		return isSetField(815);
	}

	public void set(quickfix.fields.BuyForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.BuyForeignQtty get(quickfix.fields.BuyForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BuyForeignQtty getBuyForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.BuyForeignQtty());
	}

	public boolean isSet(quickfix.fields.BuyForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignQtty() {
		return isSetField(397);
	}

	public void set(quickfix.fields.NM_BuyForeignValue value) {
		setField(value);
	}

	public quickfix.fields.NM_BuyForeignValue get(quickfix.fields.NM_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_BuyForeignValue getNM_BuyForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.NM_BuyForeignValue());
	}

	public boolean isSet(quickfix.fields.NM_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_BuyForeignValue() {
		return isSetField(8141);
	}

	public void set(quickfix.fields.PT_BuyForeignValue value) {
		setField(value);
	}

	public quickfix.fields.PT_BuyForeignValue get(quickfix.fields.PT_BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_BuyForeignValue getPT_BuyForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.PT_BuyForeignValue());
	}

	public boolean isSet(quickfix.fields.PT_BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_BuyForeignValue() {
		return isSetField(8151);
	}

	public void set(quickfix.fields.BuyForeignValue value) {
		setField(value);
	}

	public quickfix.fields.BuyForeignValue get(quickfix.fields.BuyForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.BuyForeignValue getBuyForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.BuyForeignValue());
	}

	public boolean isSet(quickfix.fields.BuyForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetBuyForeignValue() {
		return isSetField(3971);
	}

	public void set(quickfix.fields.NM_SellForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.NM_SellForeignQtty get(quickfix.fields.NM_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_SellForeignQtty getNM_SellForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.NM_SellForeignQtty());
	}

	public boolean isSet(quickfix.fields.NM_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignQtty() {
		return isSetField(816);
	}

	public void set(quickfix.fields.PT_SellForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.PT_SellForeignQtty get(quickfix.fields.PT_SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_SellForeignQtty getPT_SellForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.PT_SellForeignQtty());
	}

	public boolean isSet(quickfix.fields.PT_SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignQtty() {
		return isSetField(817);
	}

	public void set(quickfix.fields.SellForeignQtty value) {
		setField(value);
	}

	public quickfix.fields.SellForeignQtty get(quickfix.fields.SellForeignQtty value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.SellForeignQtty getSellForeignQtty() throws FieldNotFound {
		return get(new quickfix.fields.SellForeignQtty());
	}

	public boolean isSet(quickfix.fields.SellForeignQtty field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignQtty() {
		return isSetField(398);
	}

	public void set(quickfix.fields.NM_SellForeignValue value) {
		setField(value);
	}

	public quickfix.fields.NM_SellForeignValue get(quickfix.fields.NM_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.NM_SellForeignValue getNM_SellForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.NM_SellForeignValue());
	}

	public boolean isSet(quickfix.fields.NM_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetNM_SellForeignValue() {
		return isSetField(8161);
	}

	public void set(quickfix.fields.PT_SellForeignValue value) {
		setField(value);
	}

	public quickfix.fields.PT_SellForeignValue get(quickfix.fields.PT_SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.PT_SellForeignValue getPT_SellForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.PT_SellForeignValue());
	}

	public boolean isSet(quickfix.fields.PT_SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetPT_SellForeignValue() {
		return isSetField(8171);
	}

	public void set(quickfix.fields.SellForeignValue value) {
		setField(value);
	}

	public quickfix.fields.SellForeignValue get(quickfix.fields.SellForeignValue value) throws FieldNotFound {
		getField(value);
		return value;
	}

	public quickfix.fields.SellForeignValue getSellForeignValue() throws FieldNotFound {
		return get(new quickfix.fields.SellForeignValue());
	}

	public boolean isSet(quickfix.fields.SellForeignValue field) {
		return isSetField(field);
	}

	public boolean isSetSellForeignValue() {
		return isSetField(3981);
	}

}
