package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.CallHistoryParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CallHistoryConversation
 */

public class CallHistoryConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<CallHistoryParticipant> participants = new ArrayList<CallHistoryParticipant>();

  /**
   * The direction of the call relating to the current user
   */
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INBOUND("inbound"),
    OUTBOUND("outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private Boolean wentToVoicemail = null;
  private Boolean missedCall = null;
  private Date startTime = null;
  private Boolean wasConference = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public CallHistoryConversation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The list of participants involved in the conversation.
   **/
  public CallHistoryConversation participants(List<CallHistoryParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of participants involved in the conversation.")
  @JsonProperty("participants")
  public List<CallHistoryParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<CallHistoryParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   * The direction of the call relating to the current user
   **/
  public CallHistoryConversation direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The direction of the call relating to the current user")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   * Did the call end in the current user's voicemail
   **/
  public CallHistoryConversation wentToVoicemail(Boolean wentToVoicemail) {
    this.wentToVoicemail = wentToVoicemail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Did the call end in the current user's voicemail")
  @JsonProperty("wentToVoicemail")
  public Boolean getWentToVoicemail() {
    return wentToVoicemail;
  }
  public void setWentToVoicemail(Boolean wentToVoicemail) {
    this.wentToVoicemail = wentToVoicemail;
  }

  
  /**
   * Did the user not answer this conversation
   **/
  public CallHistoryConversation missedCall(Boolean missedCall) {
    this.missedCall = missedCall;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Did the user not answer this conversation")
  @JsonProperty("missedCall")
  public Boolean getMissedCall() {
    return missedCall;
  }
  public void setMissedCall(Boolean missedCall) {
    this.missedCall = missedCall;
  }

  
  /**
   * The time the user joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public CallHistoryConversation startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time the user joined the conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * Was this conversation a conference
   **/
  public CallHistoryConversation wasConference(Boolean wasConference) {
    this.wasConference = wasConference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Was this conversation a conference")
  @JsonProperty("wasConference")
  public Boolean getWasConference() {
    return wasConference;
  }
  public void setWasConference(Boolean wasConference) {
    this.wasConference = wasConference;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallHistoryConversation callHistoryConversation = (CallHistoryConversation) o;
    return Objects.equals(this.id, callHistoryConversation.id) &&
        Objects.equals(this.name, callHistoryConversation.name) &&
        Objects.equals(this.participants, callHistoryConversation.participants) &&
        Objects.equals(this.direction, callHistoryConversation.direction) &&
        Objects.equals(this.wentToVoicemail, callHistoryConversation.wentToVoicemail) &&
        Objects.equals(this.missedCall, callHistoryConversation.missedCall) &&
        Objects.equals(this.startTime, callHistoryConversation.startTime) &&
        Objects.equals(this.wasConference, callHistoryConversation.wasConference) &&
        Objects.equals(this.selfUri, callHistoryConversation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, direction, wentToVoicemail, missedCall, startTime, wasConference, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallHistoryConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    wentToVoicemail: ").append(toIndentedString(wentToVoicemail)).append("\n");
    sb.append("    missedCall: ").append(toIndentedString(missedCall)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    wasConference: ").append(toIndentedString(wasConference)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

