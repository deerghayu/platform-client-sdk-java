package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DncListNotificationImportStatus
 */

public class DncListNotificationImportStatus  implements Serializable {
  

  /**
   * Gets or Sets importState
   */
  public enum ImportStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    IN_PROGRESS("IN_PROGRESS"),
    FAILED("FAILED");

    private String value;

    ImportStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ImportStateEnum fromString(String key) {
      if (key == null) return null;

      for (ImportStateEnum value : ImportStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ImportStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ImportStateEnum importState = null;
  private Integer totalRecords = null;
  private Integer completedRecords = null;
  private Integer percentageComplete = null;
  private String failureReason = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public DncListNotificationImportStatus importState(ImportStateEnum importState) {
    this.importState = importState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importState")
  public ImportStateEnum getImportState() {
    return importState;
  }
  public void setImportState(ImportStateEnum importState) {
    this.importState = importState;
  }

  
  /**
   **/
  public DncListNotificationImportStatus totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalRecords")
  public Integer getTotalRecords() {
    return totalRecords;
  }
  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  
  /**
   **/
  public DncListNotificationImportStatus completedRecords(Integer completedRecords) {
    this.completedRecords = completedRecords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completedRecords")
  public Integer getCompletedRecords() {
    return completedRecords;
  }
  public void setCompletedRecords(Integer completedRecords) {
    this.completedRecords = completedRecords;
  }

  
  /**
   **/
  public DncListNotificationImportStatus percentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentageComplete")
  public Integer getPercentageComplete() {
    return percentageComplete;
  }
  public void setPercentageComplete(Integer percentageComplete) {
    this.percentageComplete = percentageComplete;
  }

  
  /**
   **/
  public DncListNotificationImportStatus failureReason(String failureReason) {
    this.failureReason = failureReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("failureReason")
  public String getFailureReason() {
    return failureReason;
  }
  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }

  
  /**
   **/
  public DncListNotificationImportStatus additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DncListNotificationImportStatus dncListNotificationImportStatus = (DncListNotificationImportStatus) o;
    return Objects.equals(this.importState, dncListNotificationImportStatus.importState) &&
        Objects.equals(this.totalRecords, dncListNotificationImportStatus.totalRecords) &&
        Objects.equals(this.completedRecords, dncListNotificationImportStatus.completedRecords) &&
        Objects.equals(this.percentageComplete, dncListNotificationImportStatus.percentageComplete) &&
        Objects.equals(this.failureReason, dncListNotificationImportStatus.failureReason) &&
        Objects.equals(this.additionalProperties, dncListNotificationImportStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(importState, totalRecords, completedRecords, percentageComplete, failureReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DncListNotificationImportStatus {\n");
    
    sb.append("    importState: ").append(toIndentedString(importState)).append("\n");
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    completedRecords: ").append(toIndentedString(completedRecords)).append("\n");
    sb.append("    percentageComplete: ").append(toIndentedString(percentageComplete)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

