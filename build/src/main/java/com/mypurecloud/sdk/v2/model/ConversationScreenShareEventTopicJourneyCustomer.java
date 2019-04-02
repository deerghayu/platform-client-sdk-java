package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicJourneyCustomer
 */

public class ConversationScreenShareEventTopicJourneyCustomer  implements Serializable {
  
  private String id = null;
  private String idType = null;

  
  /**
   **/
  public ConversationScreenShareEventTopicJourneyCustomer id(String id) {
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
  public ConversationScreenShareEventTopicJourneyCustomer idType(String idType) {
    this.idType = idType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("idType")
  public String getIdType() {
    return idType;
  }
  public void setIdType(String idType) {
    this.idType = idType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationScreenShareEventTopicJourneyCustomer conversationScreenShareEventTopicJourneyCustomer = (ConversationScreenShareEventTopicJourneyCustomer) o;
    return Objects.equals(this.id, conversationScreenShareEventTopicJourneyCustomer.id) &&
        Objects.equals(this.idType, conversationScreenShareEventTopicJourneyCustomer.idType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicJourneyCustomer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
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

