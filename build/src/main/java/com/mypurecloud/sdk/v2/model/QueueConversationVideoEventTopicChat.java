package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.QueueConversationVideoEventTopicJourneyContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * QueueConversationVideoEventTopicChat
 */

public class QueueConversationVideoEventTopicChat  implements Serializable {
  

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("ALERTING"),
    DIALING("DIALING"),
    CONTACTING("CONTACTING"),
    OFFERING("OFFERING"),
    CONNECTED("CONNECTED"),
    DISCONNECTED("DISCONNECTED"),
    TERMINATED("TERMINATED"),
    NONE("NONE");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private String id = null;
  private String provider = null;
  private String scriptId = null;
  private String peerId = null;
  private String roomId = null;
  private Boolean held = null;

  /**
   * Gets or Sets disconnectType
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("ENDPOINT"),
    CLIENT("CLIENT"),
    SYSTEM("SYSTEM"),
    TIMEOUT("TIMEOUT"),
    TRANSFER("TRANSFER"),
    TRANSFER_CONFERENCE("TRANSFER_CONFERENCE"),
    TRANSFER_CONSULT("TRANSFER_CONSULT"),
    TRANSFER_NOANSWER("TRANSFER_NOANSWER"),
    TRANSFER_NOTAVAILABLE("TRANSFER_NOTAVAILABLE"),
    TRANSFER_FORWARD("TRANSFER_FORWARD"),
    TRANSPORT_FAILURE("TRANSPORT_FAILURE"),
    ERROR("ERROR"),
    PEER("PEER"),
    OTHER("OTHER"),
    SPAM("SPAM"),
    UNCALLABLE("UNCALLABLE");

    private String value;

    DisconnectTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DisconnectTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DisconnectTypeEnum value : DisconnectTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DisconnectTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DisconnectTypeEnum disconnectType = null;
  private Date startHoldTime = null;
  private Date connectedTime = null;
  private Date disconnectedTime = null;
  private QueueConversationVideoEventTopicJourneyContext journeyContext = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationVideoEventTopicChat state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat id(String id) {
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
  public QueueConversationVideoEventTopicChat provider(String provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }
  public void setProvider(String provider) {
    this.provider = provider;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat scriptId(String scriptId) {
    this.scriptId = scriptId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scriptId")
  public String getScriptId() {
    return scriptId;
  }
  public void setScriptId(String scriptId) {
    this.scriptId = scriptId;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat peerId(String peerId) {
    this.peerId = peerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peerId")
  public String getPeerId() {
    return peerId;
  }
  public void setPeerId(String peerId) {
    this.peerId = peerId;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat roomId(String roomId) {
    this.roomId = roomId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roomId")
  public String getRoomId() {
    return roomId;
  }
  public void setRoomId(String roomId) {
    this.roomId = roomId;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat held(Boolean held) {
    this.held = held;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("held")
  public Boolean getHeld() {
    return held;
  }
  public void setHeld(Boolean held) {
    this.held = held;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat disconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectType")
  public DisconnectTypeEnum getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(DisconnectTypeEnum disconnectType) {
    this.disconnectType = disconnectType;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat startHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startHoldTime")
  public Date getStartHoldTime() {
    return startHoldTime;
  }
  public void setStartHoldTime(Date startHoldTime) {
    this.startHoldTime = startHoldTime;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat connectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connectedTime")
  public Date getConnectedTime() {
    return connectedTime;
  }
  public void setConnectedTime(Date connectedTime) {
    this.connectedTime = connectedTime;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat disconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disconnectedTime")
  public Date getDisconnectedTime() {
    return disconnectedTime;
  }
  public void setDisconnectedTime(Date disconnectedTime) {
    this.disconnectedTime = disconnectedTime;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat journeyContext(QueueConversationVideoEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyContext")
  public QueueConversationVideoEventTopicJourneyContext getJourneyContext() {
    return journeyContext;
  }
  public void setJourneyContext(QueueConversationVideoEventTopicJourneyContext journeyContext) {
    this.journeyContext = journeyContext;
  }

  
  /**
   **/
  public QueueConversationVideoEventTopicChat additionalProperties(Object additionalProperties) {
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
    QueueConversationVideoEventTopicChat queueConversationVideoEventTopicChat = (QueueConversationVideoEventTopicChat) o;
    return Objects.equals(this.state, queueConversationVideoEventTopicChat.state) &&
        Objects.equals(this.id, queueConversationVideoEventTopicChat.id) &&
        Objects.equals(this.provider, queueConversationVideoEventTopicChat.provider) &&
        Objects.equals(this.scriptId, queueConversationVideoEventTopicChat.scriptId) &&
        Objects.equals(this.peerId, queueConversationVideoEventTopicChat.peerId) &&
        Objects.equals(this.roomId, queueConversationVideoEventTopicChat.roomId) &&
        Objects.equals(this.held, queueConversationVideoEventTopicChat.held) &&
        Objects.equals(this.disconnectType, queueConversationVideoEventTopicChat.disconnectType) &&
        Objects.equals(this.startHoldTime, queueConversationVideoEventTopicChat.startHoldTime) &&
        Objects.equals(this.connectedTime, queueConversationVideoEventTopicChat.connectedTime) &&
        Objects.equals(this.disconnectedTime, queueConversationVideoEventTopicChat.disconnectedTime) &&
        Objects.equals(this.journeyContext, queueConversationVideoEventTopicChat.journeyContext) &&
        Objects.equals(this.additionalProperties, queueConversationVideoEventTopicChat.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, id, provider, scriptId, peerId, roomId, held, disconnectType, startHoldTime, connectedTime, disconnectedTime, journeyContext, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationVideoEventTopicChat {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
    sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    disconnectedTime: ").append(toIndentedString(disconnectedTime)).append("\n");
    sb.append("    journeyContext: ").append(toIndentedString(journeyContext)).append("\n");
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

