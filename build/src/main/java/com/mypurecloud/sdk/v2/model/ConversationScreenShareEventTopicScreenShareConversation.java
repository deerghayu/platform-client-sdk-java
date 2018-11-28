package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicScreenShareMediaParticipant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicScreenShareConversation
 */

public class ConversationScreenShareEventTopicScreenShareConversation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<ConversationScreenShareEventTopicScreenShareMediaParticipant> participants = new ArrayList<ConversationScreenShareEventTopicScreenShareMediaParticipant>();
  private List<String> otherMediaUris = new ArrayList<String>();

  
  /**
   **/
  public ConversationScreenShareEventTopicScreenShareConversation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicScreenShareConversation name(String name) {
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
   **/
  public ConversationScreenShareEventTopicScreenShareConversation participants(List<ConversationScreenShareEventTopicScreenShareMediaParticipant> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("participants")
  public List<ConversationScreenShareEventTopicScreenShareMediaParticipant> getParticipants() {
    return participants;
  }
  public void setParticipants(List<ConversationScreenShareEventTopicScreenShareMediaParticipant> participants) {
    this.participants = participants;
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicScreenShareConversation otherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("otherMediaUris")
  public List<String> getOtherMediaUris() {
    return otherMediaUris;
  }
  public void setOtherMediaUris(List<String> otherMediaUris) {
    this.otherMediaUris = otherMediaUris;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationScreenShareEventTopicScreenShareConversation conversationScreenShareEventTopicScreenShareConversation = (ConversationScreenShareEventTopicScreenShareConversation) o;
    return Objects.equals(this.id, conversationScreenShareEventTopicScreenShareConversation.id) &&
        Objects.equals(this.name, conversationScreenShareEventTopicScreenShareConversation.name) &&
        Objects.equals(this.participants, conversationScreenShareEventTopicScreenShareConversation.participants) &&
        Objects.equals(this.otherMediaUris, conversationScreenShareEventTopicScreenShareConversation.otherMediaUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, participants, otherMediaUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicScreenShareConversation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    otherMediaUris: ").append(toIndentedString(otherMediaUris)).append("\n");
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

