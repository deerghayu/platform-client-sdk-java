package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DurationCondition;
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.Queue;
import com.mypurecloud.sdk.v2.model.TimeAllowed;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChatMediaPolicyConditions
 */

public class ChatMediaPolicyConditions  implements Serializable {
  
  private List<User> forUsers = new ArrayList<User>();
  private List<String> dateRanges = new ArrayList<String>();
  private List<Queue> forQueues = new ArrayList<Queue>();
  private List<WrapupCode> wrapupCodes = new ArrayList<WrapupCode>();
  private List<Language> languages = new ArrayList<Language>();
  private TimeAllowed timeAllowed = null;
  private DurationCondition duration = null;

  
  /**
   **/
  public ChatMediaPolicyConditions forUsers(List<User> forUsers) {
    this.forUsers = forUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forUsers")
  public List<User> getForUsers() {
    return forUsers;
  }
  public void setForUsers(List<User> forUsers) {
    this.forUsers = forUsers;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions dateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateRanges")
  public List<String> getDateRanges() {
    return dateRanges;
  }
  public void setDateRanges(List<String> dateRanges) {
    this.dateRanges = dateRanges;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions forQueues(List<Queue> forQueues) {
    this.forQueues = forQueues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forQueues")
  public List<Queue> getForQueues() {
    return forQueues;
  }
  public void setForQueues(List<Queue> forQueues) {
    this.forQueues = forQueues;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions wrapupCodes(List<WrapupCode> wrapupCodes) {
    this.wrapupCodes = wrapupCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupCodes")
  public List<WrapupCode> getWrapupCodes() {
    return wrapupCodes;
  }
  public void setWrapupCodes(List<WrapupCode> wrapupCodes) {
    this.wrapupCodes = wrapupCodes;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions languages(List<Language> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("languages")
  public List<Language> getLanguages() {
    return languages;
  }
  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions timeAllowed(TimeAllowed timeAllowed) {
    this.timeAllowed = timeAllowed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeAllowed")
  public TimeAllowed getTimeAllowed() {
    return timeAllowed;
  }
  public void setTimeAllowed(TimeAllowed timeAllowed) {
    this.timeAllowed = timeAllowed;
  }

  
  /**
   **/
  public ChatMediaPolicyConditions duration(DurationCondition duration) {
    this.duration = duration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("duration")
  public DurationCondition getDuration() {
    return duration;
  }
  public void setDuration(DurationCondition duration) {
    this.duration = duration;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatMediaPolicyConditions chatMediaPolicyConditions = (ChatMediaPolicyConditions) o;
    return Objects.equals(this.forUsers, chatMediaPolicyConditions.forUsers) &&
        Objects.equals(this.dateRanges, chatMediaPolicyConditions.dateRanges) &&
        Objects.equals(this.forQueues, chatMediaPolicyConditions.forQueues) &&
        Objects.equals(this.wrapupCodes, chatMediaPolicyConditions.wrapupCodes) &&
        Objects.equals(this.languages, chatMediaPolicyConditions.languages) &&
        Objects.equals(this.timeAllowed, chatMediaPolicyConditions.timeAllowed) &&
        Objects.equals(this.duration, chatMediaPolicyConditions.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forUsers, dateRanges, forQueues, wrapupCodes, languages, timeAllowed, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatMediaPolicyConditions {\n");
    
    sb.append("    forUsers: ").append(toIndentedString(forUsers)).append("\n");
    sb.append("    dateRanges: ").append(toIndentedString(dateRanges)).append("\n");
    sb.append("    forQueues: ").append(toIndentedString(forQueues)).append("\n");
    sb.append("    wrapupCodes: ").append(toIndentedString(wrapupCodes)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    timeAllowed: ").append(toIndentedString(timeAllowed)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

