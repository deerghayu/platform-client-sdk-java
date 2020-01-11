package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing
 */

public class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing  implements Serializable {
  
  private List<WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult> entities = new ArrayList<WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult>();

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing entities(List<WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult> getEntities() {
    return entities;
  }
  public void setEntities(List<WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResult> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing = (WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing) o;
    return Objects.equals(this.entities, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

