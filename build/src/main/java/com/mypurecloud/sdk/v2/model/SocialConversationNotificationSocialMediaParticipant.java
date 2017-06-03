package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationNotificationWrapup;
import com.mypurecloud.sdk.v2.model.DocumentDataV2NotificationCreatedBy;
import com.mypurecloud.sdk.v2.model.SocialConversationNotificationErrorInfo;
import com.mypurecloud.sdk.v2.model.SocialConversationNotificationUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * SocialConversationNotificationSocialMediaParticipant
 */

public class SocialConversationNotificationSocialMediaParticipant  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String address = null;
  private Date startTime = null;
  private Date connectedTime = null;
  private Date endTime = null;
  private Date startHoldTime = null;
  private String purpose = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALERTING("alerting"),
    DIALING("dialing"),
    CONTACTING("contacting"),
    OFFERING("offering"),
    CONNECTED("connected"),
    DISCONNECTED("disconnected"),
    TERMINATED("terminated"),
    CONVERTING("converting"),
    UPLOADING("uploading"),
    TRANSMITTING("transmitting"),
    SCHEDULED("scheduled"),
    NONE("none");

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

  /**
   * Gets or Sets direction
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

  /**
   * Gets or Sets disconnectType
   */
  public enum DisconnectTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENDPOINT("endpoint"),
    CLIENT("client"),
    SYSTEM("system"),
    TRANSFER("transfer"),
    TIMEOUT("timeout"),
    TRANSFER_CONFERENCE("transfer.conference"),
    TRANSFER_CONSULT("transfer.consult"),
    TRANSFER_FORWARD("transfer.forward"),
    TRANSFER_NOANSWER("transfer.noanswer"),
    TRANSFER_NOTAVAILABLE("transfer.notavailable"),
    TRANSPORT_FAILURE("transport.failure"),
    ERROR("error"),
    PEER("peer"),
    OTHER("other"),
    SPAM("spam"),
    UNCALLABLE("uncallable");

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
  private Boolean held = null;
  private Boolean wrapupRequired = null;
  private String wrapupPrompt = null;
  private DocumentDataV2NotificationCreatedBy user = null;
  private SocialConversationNotificationUriReference queue = null;
  private Map<String, String> attributes = new HashMap<String, String>();
  private SocialConversationNotificationErrorInfo errorInfo = null;
  private SocialConversationNotificationUriReference script = null;
  private Integer wrapupTimeoutMs = null;
  private Boolean wrapupSkipped = null;
  private String provider = null;
  private SocialConversationNotificationUriReference externalContact = null;
  private SocialConversationNotificationUriReference externalOrganization = null;
  private ConversationNotificationWrapup wrapup = null;
  private String peer = null;
  private String socialMediaId = null;
  private String socialMediaHub = null;
  private String socialUserName = null;
  private String previewText = null;

  
  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant id(String id) {
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
  public SocialConversationNotificationSocialMediaParticipant name(String name) {
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
  public SocialConversationNotificationSocialMediaParticipant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant connectedTime(Date connectedTime) {
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
  public SocialConversationNotificationSocialMediaParticipant endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant startHoldTime(Date startHoldTime) {
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
  public SocialConversationNotificationSocialMediaParticipant purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant state(StateEnum state) {
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
  public SocialConversationNotificationSocialMediaParticipant direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant disconnectType(DisconnectTypeEnum disconnectType) {
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
  public SocialConversationNotificationSocialMediaParticipant held(Boolean held) {
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
  public SocialConversationNotificationSocialMediaParticipant wrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupRequired")
  public Boolean getWrapupRequired() {
    return wrapupRequired;
  }
  public void setWrapupRequired(Boolean wrapupRequired) {
    this.wrapupRequired = wrapupRequired;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant wrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupPrompt")
  public String getWrapupPrompt() {
    return wrapupPrompt;
  }
  public void setWrapupPrompt(String wrapupPrompt) {
    this.wrapupPrompt = wrapupPrompt;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant user(DocumentDataV2NotificationCreatedBy user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public DocumentDataV2NotificationCreatedBy getUser() {
    return user;
  }
  public void setUser(DocumentDataV2NotificationCreatedBy user) {
    this.user = user;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant queue(SocialConversationNotificationUriReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queue")
  public SocialConversationNotificationUriReference getQueue() {
    return queue;
  }
  public void setQueue(SocialConversationNotificationUriReference queue) {
    this.queue = queue;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
  }
  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant errorInfo(SocialConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorInfo")
  public SocialConversationNotificationErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(SocialConversationNotificationErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant script(SocialConversationNotificationUriReference script) {
    this.script = script;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("script")
  public SocialConversationNotificationUriReference getScript() {
    return script;
  }
  public void setScript(SocialConversationNotificationUriReference script) {
    this.script = script;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant wrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupTimeoutMs")
  public Integer getWrapupTimeoutMs() {
    return wrapupTimeoutMs;
  }
  public void setWrapupTimeoutMs(Integer wrapupTimeoutMs) {
    this.wrapupTimeoutMs = wrapupTimeoutMs;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant wrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapupSkipped")
  public Boolean getWrapupSkipped() {
    return wrapupSkipped;
  }
  public void setWrapupSkipped(Boolean wrapupSkipped) {
    this.wrapupSkipped = wrapupSkipped;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant provider(String provider) {
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
  public SocialConversationNotificationSocialMediaParticipant externalContact(SocialConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalContact")
  public SocialConversationNotificationUriReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(SocialConversationNotificationUriReference externalContact) {
    this.externalContact = externalContact;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant externalOrganization(SocialConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalOrganization")
  public SocialConversationNotificationUriReference getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(SocialConversationNotificationUriReference externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant wrapup(ConversationNotificationWrapup wrapup) {
    this.wrapup = wrapup;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("wrapup")
  public ConversationNotificationWrapup getWrapup() {
    return wrapup;
  }
  public void setWrapup(ConversationNotificationWrapup wrapup) {
    this.wrapup = wrapup;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant peer(String peer) {
    this.peer = peer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("peer")
  public String getPeer() {
    return peer;
  }
  public void setPeer(String peer) {
    this.peer = peer;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant socialMediaId(String socialMediaId) {
    this.socialMediaId = socialMediaId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialMediaId")
  public String getSocialMediaId() {
    return socialMediaId;
  }
  public void setSocialMediaId(String socialMediaId) {
    this.socialMediaId = socialMediaId;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant socialMediaHub(String socialMediaHub) {
    this.socialMediaHub = socialMediaHub;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialMediaHub")
  public String getSocialMediaHub() {
    return socialMediaHub;
  }
  public void setSocialMediaHub(String socialMediaHub) {
    this.socialMediaHub = socialMediaHub;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant socialUserName(String socialUserName) {
    this.socialUserName = socialUserName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("socialUserName")
  public String getSocialUserName() {
    return socialUserName;
  }
  public void setSocialUserName(String socialUserName) {
    this.socialUserName = socialUserName;
  }


  /**
   **/
  public SocialConversationNotificationSocialMediaParticipant previewText(String previewText) {
    this.previewText = previewText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewText")
  public String getPreviewText() {
    return previewText;
  }
  public void setPreviewText(String previewText) {
    this.previewText = previewText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SocialConversationNotificationSocialMediaParticipant socialConversationNotificationSocialMediaParticipant = (SocialConversationNotificationSocialMediaParticipant) o;
    return Objects.equals(this.id, socialConversationNotificationSocialMediaParticipant.id) &&
        Objects.equals(this.name, socialConversationNotificationSocialMediaParticipant.name) &&
        Objects.equals(this.address, socialConversationNotificationSocialMediaParticipant.address) &&
        Objects.equals(this.startTime, socialConversationNotificationSocialMediaParticipant.startTime) &&
        Objects.equals(this.connectedTime, socialConversationNotificationSocialMediaParticipant.connectedTime) &&
        Objects.equals(this.endTime, socialConversationNotificationSocialMediaParticipant.endTime) &&
        Objects.equals(this.startHoldTime, socialConversationNotificationSocialMediaParticipant.startHoldTime) &&
        Objects.equals(this.purpose, socialConversationNotificationSocialMediaParticipant.purpose) &&
        Objects.equals(this.state, socialConversationNotificationSocialMediaParticipant.state) &&
        Objects.equals(this.direction, socialConversationNotificationSocialMediaParticipant.direction) &&
        Objects.equals(this.disconnectType, socialConversationNotificationSocialMediaParticipant.disconnectType) &&
        Objects.equals(this.held, socialConversationNotificationSocialMediaParticipant.held) &&
        Objects.equals(this.wrapupRequired, socialConversationNotificationSocialMediaParticipant.wrapupRequired) &&
        Objects.equals(this.wrapupPrompt, socialConversationNotificationSocialMediaParticipant.wrapupPrompt) &&
        Objects.equals(this.user, socialConversationNotificationSocialMediaParticipant.user) &&
        Objects.equals(this.queue, socialConversationNotificationSocialMediaParticipant.queue) &&
        Objects.equals(this.attributes, socialConversationNotificationSocialMediaParticipant.attributes) &&
        Objects.equals(this.errorInfo, socialConversationNotificationSocialMediaParticipant.errorInfo) &&
        Objects.equals(this.script, socialConversationNotificationSocialMediaParticipant.script) &&
        Objects.equals(this.wrapupTimeoutMs, socialConversationNotificationSocialMediaParticipant.wrapupTimeoutMs) &&
        Objects.equals(this.wrapupSkipped, socialConversationNotificationSocialMediaParticipant.wrapupSkipped) &&
        Objects.equals(this.provider, socialConversationNotificationSocialMediaParticipant.provider) &&
        Objects.equals(this.externalContact, socialConversationNotificationSocialMediaParticipant.externalContact) &&
        Objects.equals(this.externalOrganization, socialConversationNotificationSocialMediaParticipant.externalOrganization) &&
        Objects.equals(this.wrapup, socialConversationNotificationSocialMediaParticipant.wrapup) &&
        Objects.equals(this.peer, socialConversationNotificationSocialMediaParticipant.peer) &&
        Objects.equals(this.socialMediaId, socialConversationNotificationSocialMediaParticipant.socialMediaId) &&
        Objects.equals(this.socialMediaHub, socialConversationNotificationSocialMediaParticipant.socialMediaHub) &&
        Objects.equals(this.socialUserName, socialConversationNotificationSocialMediaParticipant.socialUserName) &&
        Objects.equals(this.previewText, socialConversationNotificationSocialMediaParticipant.previewText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, startTime, connectedTime, endTime, startHoldTime, purpose, state, direction, disconnectType, held, wrapupRequired, wrapupPrompt, user, queue, attributes, errorInfo, script, wrapupTimeoutMs, wrapupSkipped, provider, externalContact, externalOrganization, wrapup, peer, socialMediaId, socialMediaHub, socialUserName, previewText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SocialConversationNotificationSocialMediaParticipant {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    connectedTime: ").append(toIndentedString(connectedTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startHoldTime: ").append(toIndentedString(startHoldTime)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
    sb.append("    held: ").append(toIndentedString(held)).append("\n");
    sb.append("    wrapupRequired: ").append(toIndentedString(wrapupRequired)).append("\n");
    sb.append("    wrapupPrompt: ").append(toIndentedString(wrapupPrompt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
    sb.append("    wrapupTimeoutMs: ").append(toIndentedString(wrapupTimeoutMs)).append("\n");
    sb.append("    wrapupSkipped: ").append(toIndentedString(wrapupSkipped)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    wrapup: ").append(toIndentedString(wrapup)).append("\n");
    sb.append("    peer: ").append(toIndentedString(peer)).append("\n");
    sb.append("    socialMediaId: ").append(toIndentedString(socialMediaId)).append("\n");
    sb.append("    socialMediaHub: ").append(toIndentedString(socialMediaHub)).append("\n");
    sb.append("    socialUserName: ").append(toIndentedString(socialUserName)).append("\n");
    sb.append("    previewText: ").append(toIndentedString(previewText)).append("\n");
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

