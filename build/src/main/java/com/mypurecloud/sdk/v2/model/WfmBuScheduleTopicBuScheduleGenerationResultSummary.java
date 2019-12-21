package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleTopicBuScheduleGenerationResultSummary
 */

public class WfmBuScheduleTopicBuScheduleGenerationResultSummary  implements Serializable {
  
  private Boolean failed = null;
  private String runId = null;
  private Integer messageCount = null;

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleGenerationResultSummary failed(Boolean failed) {
    this.failed = failed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failed")
  public Boolean getFailed() {
    return failed;
  }
  public void setFailed(Boolean failed) {
    this.failed = failed;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleGenerationResultSummary runId(String runId) {
    this.runId = runId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("runId")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  
  /**
   **/
  public WfmBuScheduleTopicBuScheduleGenerationResultSummary messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageCount")
  public Integer getMessageCount() {
    return messageCount;
  }
  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleTopicBuScheduleGenerationResultSummary wfmBuScheduleTopicBuScheduleGenerationResultSummary = (WfmBuScheduleTopicBuScheduleGenerationResultSummary) o;
    return Objects.equals(this.failed, wfmBuScheduleTopicBuScheduleGenerationResultSummary.failed) &&
        Objects.equals(this.runId, wfmBuScheduleTopicBuScheduleGenerationResultSummary.runId) &&
        Objects.equals(this.messageCount, wfmBuScheduleTopicBuScheduleGenerationResultSummary.messageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failed, runId, messageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleTopicBuScheduleGenerationResultSummary {\n");
    
    sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
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

