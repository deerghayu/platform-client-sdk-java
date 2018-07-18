package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UserSchedule;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UpdateWeekScheduleRequest
 */

public class UpdateWeekScheduleRequest  implements Serializable {
  
  private String description = null;
  private Boolean published = null;
  private Map<String, UserSchedule> userSchedules = null;
  private List<String> partialUploadIds = new ArrayList<String>();
  private WfmVersionedEntityMetadata metadata = null;
  private Integer agentSchedulesVersion = null;

  
  /**
   * Description of the week schedule
   **/
  public UpdateWeekScheduleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description of the week schedule")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Whether the week schedule is published
   **/
  public UpdateWeekScheduleRequest published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the week schedule is published")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }

  
  /**
   * User schedules in the week
   **/
  public UpdateWeekScheduleRequest userSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User schedules in the week")
  @JsonProperty("userSchedules")
  public Map<String, UserSchedule> getUserSchedules() {
    return userSchedules;
  }
  public void setUserSchedules(Map<String, UserSchedule> userSchedules) {
    this.userSchedules = userSchedules;
  }

  
  /**
   * IDs of partial uploads to include in this imported schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500
   **/
  public UpdateWeekScheduleRequest partialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of partial uploads to include in this imported schedule. It is applicable only for large schedules where activity count in schedule is greater than 17500")
  @JsonProperty("partialUploadIds")
  public List<String> getPartialUploadIds() {
    return partialUploadIds;
  }
  public void setPartialUploadIds(List<String> partialUploadIds) {
    this.partialUploadIds = partialUploadIds;
  }

  
  /**
   * Version metadata for this work plan
   **/
  public UpdateWeekScheduleRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this work plan")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  
  /**
   * Version of agent schedules in the week schedule
   **/
  public UpdateWeekScheduleRequest agentSchedulesVersion(Integer agentSchedulesVersion) {
    this.agentSchedulesVersion = agentSchedulesVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version of agent schedules in the week schedule")
  @JsonProperty("agentSchedulesVersion")
  public Integer getAgentSchedulesVersion() {
    return agentSchedulesVersion;
  }
  public void setAgentSchedulesVersion(Integer agentSchedulesVersion) {
    this.agentSchedulesVersion = agentSchedulesVersion;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateWeekScheduleRequest updateWeekScheduleRequest = (UpdateWeekScheduleRequest) o;
    return Objects.equals(this.description, updateWeekScheduleRequest.description) &&
        Objects.equals(this.published, updateWeekScheduleRequest.published) &&
        Objects.equals(this.userSchedules, updateWeekScheduleRequest.userSchedules) &&
        Objects.equals(this.partialUploadIds, updateWeekScheduleRequest.partialUploadIds) &&
        Objects.equals(this.metadata, updateWeekScheduleRequest.metadata) &&
        Objects.equals(this.agentSchedulesVersion, updateWeekScheduleRequest.agentSchedulesVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, published, userSchedules, partialUploadIds, metadata, agentSchedulesVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateWeekScheduleRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    userSchedules: ").append(toIndentedString(userSchedules)).append("\n");
    sb.append("    partialUploadIds: ").append(toIndentedString(partialUploadIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    agentSchedulesVersion: ").append(toIndentedString(agentSchedulesVersion)).append("\n");
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

