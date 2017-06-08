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
 * ConversationNotificationDisconnectReason
 */

public class ConversationNotificationDisconnectReason  implements Serializable {
  

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    Q_850("Q_850"),
    SIP("SIP");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Integer code = null;
  private String phrase = null;

  
  /**
   **/
  public ConversationNotificationDisconnectReason type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public ConversationNotificationDisconnectReason code(Integer code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  
  /**
   **/
  public ConversationNotificationDisconnectReason phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phrase")
  public String getPhrase() {
    return phrase;
  }
  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationNotificationDisconnectReason conversationNotificationDisconnectReason = (ConversationNotificationDisconnectReason) o;
    return Objects.equals(this.type, conversationNotificationDisconnectReason.type) &&
        Objects.equals(this.code, conversationNotificationDisconnectReason.code) &&
        Objects.equals(this.phrase, conversationNotificationDisconnectReason.phrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, phrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationNotificationDisconnectReason {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
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

