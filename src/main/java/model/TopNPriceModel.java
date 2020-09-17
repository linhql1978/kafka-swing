package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopNPriceModel {
    private String Symbol;
    private String BoardCode;
    private String NoTopPrice;
    private List<SubTopNPriceModel> group = new ArrayList<>();

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getBoardCode() {
        return BoardCode;
    }

    public void setBoardCode(String boardCode) {
        BoardCode = boardCode;
    }

    public String getNoTopPrice() {
        return NoTopPrice;
    }

    public void setNoTopPrice(String noTopPrice) {
        NoTopPrice = noTopPrice;
    }

    public List<SubTopNPriceModel> getGroup() {
        return group;
    }

    public void setGroup(List<SubTopNPriceModel> group) {
        this.group = group;
    }
}
