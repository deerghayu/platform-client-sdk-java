package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SearchShiftTradeResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchShiftTradesResponse
 */

public class SearchShiftTradesResponse  implements Serializable {
  
  private List<SearchShiftTradeResponse> trades = new ArrayList<SearchShiftTradeResponse>();

  
  /**
   * The shift trades that match the search criteria
   **/
  public SearchShiftTradesResponse trades(List<SearchShiftTradeResponse> trades) {
    this.trades = trades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The shift trades that match the search criteria")
  @JsonProperty("trades")
  public List<SearchShiftTradeResponse> getTrades() {
    return trades;
  }
  public void setTrades(List<SearchShiftTradeResponse> trades) {
    this.trades = trades;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShiftTradesResponse searchShiftTradesResponse = (SearchShiftTradesResponse) o;
    return Objects.equals(this.trades, searchShiftTradesResponse.trades);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trades);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchShiftTradesResponse {\n");
    
    sb.append("    trades: ").append(toIndentedString(trades)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

