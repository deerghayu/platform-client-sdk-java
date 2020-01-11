package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing;
import com.mypurecloud.sdk.v2.model.WfmBulkShiftTradeStateUpdateNotificationTopicLocalDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification
 */

public class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification  implements Serializable {
  

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    CANCELED("Canceled"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String operationId = null;
  private WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing result = null;
  private WfmBulkShiftTradeStateUpdateNotificationTopicLocalDate weekDate = null;

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification operationId(String operationId) {
    this.operationId = operationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operationId")
  public String getOperationId() {
    return operationId;
  }
  public void setOperationId(String operationId) {
    this.operationId = operationId;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification result(WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing getResult() {
    return result;
  }
  public void setResult(WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateResultListing result) {
    this.result = result;
  }

  
  /**
   **/
  public WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification weekDate(WfmBulkShiftTradeStateUpdateNotificationTopicLocalDate weekDate) {
    this.weekDate = weekDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("weekDate")
  public WfmBulkShiftTradeStateUpdateNotificationTopicLocalDate getWeekDate() {
    return weekDate;
  }
  public void setWeekDate(WfmBulkShiftTradeStateUpdateNotificationTopicLocalDate weekDate) {
    this.weekDate = weekDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification = (WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification) o;
    return Objects.equals(this.status, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification.status) &&
        Objects.equals(this.operationId, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification.operationId) &&
        Objects.equals(this.result, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification.result) &&
        Objects.equals(this.weekDate, wfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification.weekDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, operationId, result, weekDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBulkShiftTradeStateUpdateNotificationTopicBulkShiftTradeStateUpdateNotification {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    weekDate: ").append(toIndentedString(weekDate)).append("\n");
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

