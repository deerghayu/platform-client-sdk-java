package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification
 */

public class WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification  implements Serializable {
  
  private String operationId = null;
  private String businessUnitId = null;
  private String downloadUrl = null;

  
  /**
   **/
  public WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification operationId(String operationId) {
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
  public WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification businessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessUnitId")
  public String getBusinessUnitId() {
    return businessUnitId;
  }
  public void setBusinessUnitId(String businessUnitId) {
    this.businessUnitId = businessUnitId;
  }

  
  /**
   **/
  public WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification wfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification = (WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification) o;
    return Objects.equals(this.operationId, wfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification.operationId) &&
        Objects.equals(this.businessUnitId, wfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification.businessUnitId) &&
        Objects.equals(this.downloadUrl, wfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification.downloadUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationId, businessUnitId, downloadUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleQueryResultTopicBuScheduleSearchResultNotification {\n");
    
    sb.append("    operationId: ").append(toIndentedString(operationId)).append("\n");
    sb.append("    businessUnitId: ").append(toIndentedString(businessUnitId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

