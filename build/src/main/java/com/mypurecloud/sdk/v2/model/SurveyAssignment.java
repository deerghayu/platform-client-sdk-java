package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SurveyFormUriReference;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SurveyAssignment
 */

public class SurveyAssignment  implements Serializable {
  
  private SurveyFormUriReference surveyForm = null;
  private UriReference flow = null;
  private String inviteTimeInterval = null;

  
  /**
   * The survey form used for this survey.
   **/
  public SurveyAssignment surveyForm(SurveyFormUriReference surveyForm) {
    this.surveyForm = surveyForm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The survey form used for this survey.")
  @JsonProperty("surveyForm")
  public SurveyFormUriReference getSurveyForm() {
    return surveyForm;
  }
  public void setSurveyForm(SurveyFormUriReference surveyForm) {
    this.surveyForm = surveyForm;
  }

  
  /**
   * The URI reference to the flow associated with this survey.
   **/
  public SurveyAssignment flow(UriReference flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI reference to the flow associated with this survey.")
  @JsonProperty("flow")
  public UriReference getFlow() {
    return flow;
  }
  public void setFlow(UriReference flow) {
    this.flow = flow;
  }

  
  /**
   * An ISO 8601 repeated interval consisting of the number of repetitions, the start datetime, and the interval (e.g. R2/2018-03-01T13:00:00Z/P1M10DT2H30M). Total duration must not exceed 90 days.
   **/
  public SurveyAssignment inviteTimeInterval(String inviteTimeInterval) {
    this.inviteTimeInterval = inviteTimeInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ISO 8601 repeated interval consisting of the number of repetitions, the start datetime, and the interval (e.g. R2/2018-03-01T13:00:00Z/P1M10DT2H30M). Total duration must not exceed 90 days.")
  @JsonProperty("inviteTimeInterval")
  public String getInviteTimeInterval() {
    return inviteTimeInterval;
  }
  public void setInviteTimeInterval(String inviteTimeInterval) {
    this.inviteTimeInterval = inviteTimeInterval;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyAssignment surveyAssignment = (SurveyAssignment) o;
    return Objects.equals(this.surveyForm, surveyAssignment.surveyForm) &&
        Objects.equals(this.flow, surveyAssignment.flow) &&
        Objects.equals(this.inviteTimeInterval, surveyAssignment.inviteTimeInterval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyForm, flow, inviteTimeInterval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyAssignment {\n");
    
    sb.append("    surveyForm: ").append(toIndentedString(surveyForm)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    inviteTimeInterval: ").append(toIndentedString(inviteTimeInterval)).append("\n");
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

