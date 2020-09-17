package model;

public class SubTopNPriceModel {
  private String NumTopPrice;
  private String BestBidPrice;
  private String BestBidQtty;
  private String BestOfferPrice;
  private String BestOfferQtty;

  @Override
  public String toString() {
    return "SubTopNPriceModel{" +
            "NumTopPrice='" + NumTopPrice + '\'' +
            ", BestBidPrice='" + BestBidPrice + '\'' +
            ", BestBidQtty='" + BestBidQtty + '\'' +
            ", BestOfferPrice='" + BestOfferPrice + '\'' +
            ", BestOfferQtty='" + BestOfferQtty + '\'' +
            '}';
  }

  public String getNumTopPrice() {
    return NumTopPrice;
  }

  public void setNumTopPrice(String numTopPrice) {
    NumTopPrice = numTopPrice;
  }

  public String getBestBidPrice() {
    return BestBidPrice;
  }

  public void setBestBidPrice(String bestBidPrice) {
    BestBidPrice = bestBidPrice;
  }

  public String getBestBidQtty() {
    return BestBidQtty;
  }

  public void setBestBidQtty(String bestBidQtty) {
    BestBidQtty = bestBidQtty;
  }

  public String getBestOfferPrice() {
    return BestOfferPrice;
  }

  public void setBestOfferPrice(String bestOfferPrice) {
    BestOfferPrice = bestOfferPrice;
  }

  public String getBestOfferQtty() {
    return BestOfferQtty;
  }

  public void setBestOfferQtty(String bestOfferQtty) {
    BestOfferQtty = bestOfferQtty;
  }
}
