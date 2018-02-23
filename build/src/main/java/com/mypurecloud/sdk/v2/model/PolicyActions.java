package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CalibrationAssignment;
import com.mypurecloud.sdk.v2.model.EvaluationAssignment;
import com.mypurecloud.sdk.v2.model.InitiateScreenRecording;
import com.mypurecloud.sdk.v2.model.MediaTranscription;
import com.mypurecloud.sdk.v2.model.MeteredEvaluationAssignment;
import com.mypurecloud.sdk.v2.model.RetentionDuration;
import com.mypurecloud.sdk.v2.model.SurveyAssignment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PolicyActions
 */

public class PolicyActions  implements Serializable {
  
  private Boolean retainRecording = null;
  private Boolean deleteRecording = null;
  private Boolean alwaysDelete = null;
  private List<EvaluationAssignment> assignEvaluations = new ArrayList<EvaluationAssignment>();
  private List<MeteredEvaluationAssignment> assignMeteredEvaluations = new ArrayList<MeteredEvaluationAssignment>();
  private List<CalibrationAssignment> assignCalibrations = new ArrayList<CalibrationAssignment>();
  private List<SurveyAssignment> assignSurveys = new ArrayList<SurveyAssignment>();
  private RetentionDuration retentionDuration = null;
  private InitiateScreenRecording initiateScreenRecording = null;
  private List<MediaTranscription> mediaTranscriptions = new ArrayList<MediaTranscription>();

  
  /**
   * true to retain the recording associated with the conversation. Default = true
   **/
  public PolicyActions retainRecording(Boolean retainRecording) {
    this.retainRecording = retainRecording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to retain the recording associated with the conversation. Default = true")
  @JsonProperty("retainRecording")
  public Boolean getRetainRecording() {
    return retainRecording;
  }
  public void setRetainRecording(Boolean retainRecording) {
    this.retainRecording = retainRecording;
  }

  
  /**
   * true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false
   **/
  public PolicyActions deleteRecording(Boolean deleteRecording) {
    this.deleteRecording = deleteRecording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false")
  @JsonProperty("deleteRecording")
  public Boolean getDeleteRecording() {
    return deleteRecording;
  }
  public void setDeleteRecording(Boolean deleteRecording) {
    this.deleteRecording = deleteRecording;
  }

  
  /**
   * true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false
   **/
  public PolicyActions alwaysDelete(Boolean alwaysDelete) {
    this.alwaysDelete = alwaysDelete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false")
  @JsonProperty("alwaysDelete")
  public Boolean getAlwaysDelete() {
    return alwaysDelete;
  }
  public void setAlwaysDelete(Boolean alwaysDelete) {
    this.alwaysDelete = alwaysDelete;
  }

  
  /**
   **/
  public PolicyActions assignEvaluations(List<EvaluationAssignment> assignEvaluations) {
    this.assignEvaluations = assignEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignEvaluations")
  public List<EvaluationAssignment> getAssignEvaluations() {
    return assignEvaluations;
  }
  public void setAssignEvaluations(List<EvaluationAssignment> assignEvaluations) {
    this.assignEvaluations = assignEvaluations;
  }

  
  /**
   **/
  public PolicyActions assignMeteredEvaluations(List<MeteredEvaluationAssignment> assignMeteredEvaluations) {
    this.assignMeteredEvaluations = assignMeteredEvaluations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignMeteredEvaluations")
  public List<MeteredEvaluationAssignment> getAssignMeteredEvaluations() {
    return assignMeteredEvaluations;
  }
  public void setAssignMeteredEvaluations(List<MeteredEvaluationAssignment> assignMeteredEvaluations) {
    this.assignMeteredEvaluations = assignMeteredEvaluations;
  }

  
  /**
   **/
  public PolicyActions assignCalibrations(List<CalibrationAssignment> assignCalibrations) {
    this.assignCalibrations = assignCalibrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignCalibrations")
  public List<CalibrationAssignment> getAssignCalibrations() {
    return assignCalibrations;
  }
  public void setAssignCalibrations(List<CalibrationAssignment> assignCalibrations) {
    this.assignCalibrations = assignCalibrations;
  }

  
  /**
   **/
  public PolicyActions assignSurveys(List<SurveyAssignment> assignSurveys) {
    this.assignSurveys = assignSurveys;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignSurveys")
  public List<SurveyAssignment> getAssignSurveys() {
    return assignSurveys;
  }
  public void setAssignSurveys(List<SurveyAssignment> assignSurveys) {
    this.assignSurveys = assignSurveys;
  }

  
  /**
   **/
  public PolicyActions retentionDuration(RetentionDuration retentionDuration) {
    this.retentionDuration = retentionDuration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("retentionDuration")
  public RetentionDuration getRetentionDuration() {
    return retentionDuration;
  }
  public void setRetentionDuration(RetentionDuration retentionDuration) {
    this.retentionDuration = retentionDuration;
  }

  
  /**
   **/
  public PolicyActions initiateScreenRecording(InitiateScreenRecording initiateScreenRecording) {
    this.initiateScreenRecording = initiateScreenRecording;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiateScreenRecording")
  public InitiateScreenRecording getInitiateScreenRecording() {
    return initiateScreenRecording;
  }
  public void setInitiateScreenRecording(InitiateScreenRecording initiateScreenRecording) {
    this.initiateScreenRecording = initiateScreenRecording;
  }

  
  /**
   **/
  public PolicyActions mediaTranscriptions(List<MediaTranscription> mediaTranscriptions) {
    this.mediaTranscriptions = mediaTranscriptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaTranscriptions")
  public List<MediaTranscription> getMediaTranscriptions() {
    return mediaTranscriptions;
  }
  public void setMediaTranscriptions(List<MediaTranscription> mediaTranscriptions) {
    this.mediaTranscriptions = mediaTranscriptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyActions policyActions = (PolicyActions) o;
    return Objects.equals(this.retainRecording, policyActions.retainRecording) &&
        Objects.equals(this.deleteRecording, policyActions.deleteRecording) &&
        Objects.equals(this.alwaysDelete, policyActions.alwaysDelete) &&
        Objects.equals(this.assignEvaluations, policyActions.assignEvaluations) &&
        Objects.equals(this.assignMeteredEvaluations, policyActions.assignMeteredEvaluations) &&
        Objects.equals(this.assignCalibrations, policyActions.assignCalibrations) &&
        Objects.equals(this.assignSurveys, policyActions.assignSurveys) &&
        Objects.equals(this.retentionDuration, policyActions.retentionDuration) &&
        Objects.equals(this.initiateScreenRecording, policyActions.initiateScreenRecording) &&
        Objects.equals(this.mediaTranscriptions, policyActions.mediaTranscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retainRecording, deleteRecording, alwaysDelete, assignEvaluations, assignMeteredEvaluations, assignCalibrations, assignSurveys, retentionDuration, initiateScreenRecording, mediaTranscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyActions {\n");
    
    sb.append("    retainRecording: ").append(toIndentedString(retainRecording)).append("\n");
    sb.append("    deleteRecording: ").append(toIndentedString(deleteRecording)).append("\n");
    sb.append("    alwaysDelete: ").append(toIndentedString(alwaysDelete)).append("\n");
    sb.append("    assignEvaluations: ").append(toIndentedString(assignEvaluations)).append("\n");
    sb.append("    assignMeteredEvaluations: ").append(toIndentedString(assignMeteredEvaluations)).append("\n");
    sb.append("    assignCalibrations: ").append(toIndentedString(assignCalibrations)).append("\n");
    sb.append("    assignSurveys: ").append(toIndentedString(assignSurveys)).append("\n");
    sb.append("    retentionDuration: ").append(toIndentedString(retentionDuration)).append("\n");
    sb.append("    initiateScreenRecording: ").append(toIndentedString(initiateScreenRecording)).append("\n");
    sb.append("    mediaTranscriptions: ").append(toIndentedString(mediaTranscriptions)).append("\n");
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

