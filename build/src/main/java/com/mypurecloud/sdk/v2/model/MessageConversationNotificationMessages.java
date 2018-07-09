package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationNotificationMedia;
import com.mypurecloud.sdk.v2.model.ConversationNotificationStickers;
import com.mypurecloud.sdk.v2.model.MessageConversationNotificationUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * MessageConversationNotificationMessages
 */

public class MessageConversationNotificationMessages  implements Serializable {
  
  private MessageConversationNotificationUriReference message = null;
  private Date messageTime = null;
  private Integer messageSegmentCount = null;

  /**
   * Gets or Sets messageStatus
   */
  public enum MessageStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("QUEUED"),
    SENT("SENT"),
    FAILED("FAILED"),
    RECEIVED("RECEIVED");

    private String value;

    MessageStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessageStatusEnum fromString(String key) {
      if (key == null) return null;

      for (MessageStatusEnum value : MessageStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessageStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessageStatusEnum messageStatus = null;
  private List<ConversationNotificationMedia> media = new ArrayList<ConversationNotificationMedia>();
  private List<ConversationNotificationStickers> stickers = new ArrayList<ConversationNotificationStickers>();

  
  /**
   **/
  public MessageConversationNotificationMessages message(MessageConversationNotificationUriReference message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public MessageConversationNotificationUriReference getMessage() {
    return message;
  }
  public void setMessage(MessageConversationNotificationUriReference message) {
    this.message = message;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages messageTime(Date messageTime) {
    this.messageTime = messageTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageTime")
  public Date getMessageTime() {
    return messageTime;
  }
  public void setMessageTime(Date messageTime) {
    this.messageTime = messageTime;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages messageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageSegmentCount")
  public Integer getMessageSegmentCount() {
    return messageSegmentCount;
  }
  public void setMessageSegmentCount(Integer messageSegmentCount) {
    this.messageSegmentCount = messageSegmentCount;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages messageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("messageStatus")
  public MessageStatusEnum getMessageStatus() {
    return messageStatus;
  }
  public void setMessageStatus(MessageStatusEnum messageStatus) {
    this.messageStatus = messageStatus;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages media(List<ConversationNotificationMedia> media) {
    this.media = media;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("media")
  public List<ConversationNotificationMedia> getMedia() {
    return media;
  }
  public void setMedia(List<ConversationNotificationMedia> media) {
    this.media = media;
  }

  
  /**
   **/
  public MessageConversationNotificationMessages stickers(List<ConversationNotificationStickers> stickers) {
    this.stickers = stickers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stickers")
  public List<ConversationNotificationStickers> getStickers() {
    return stickers;
  }
  public void setStickers(List<ConversationNotificationStickers> stickers) {
    this.stickers = stickers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageConversationNotificationMessages messageConversationNotificationMessages = (MessageConversationNotificationMessages) o;
    return Objects.equals(this.message, messageConversationNotificationMessages.message) &&
        Objects.equals(this.messageTime, messageConversationNotificationMessages.messageTime) &&
        Objects.equals(this.messageSegmentCount, messageConversationNotificationMessages.messageSegmentCount) &&
        Objects.equals(this.messageStatus, messageConversationNotificationMessages.messageStatus) &&
        Objects.equals(this.media, messageConversationNotificationMessages.media) &&
        Objects.equals(this.stickers, messageConversationNotificationMessages.stickers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, messageTime, messageSegmentCount, messageStatus, media, stickers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageConversationNotificationMessages {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageTime: ").append(toIndentedString(messageTime)).append("\n");
    sb.append("    messageSegmentCount: ").append(toIndentedString(messageSegmentCount)).append("\n");
    sb.append("    messageStatus: ").append(toIndentedString(messageStatus)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    stickers: ").append(toIndentedString(stickers)).append("\n");
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

