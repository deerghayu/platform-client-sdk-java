package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueueConversationSocialExpressionEventTopicJourneyActionMap;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationSocialExpressionEventTopicJourneyAction
 */

public class QueueConversationSocialExpressionEventTopicJourneyAction  implements Serializable {
  
  private String id = null;
  private QueueConversationSocialExpressionEventTopicJourneyActionMap actionMap = null;

  
  /**
   **/
  public QueueConversationSocialExpressionEventTopicJourneyAction id(String id) {
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
  public QueueConversationSocialExpressionEventTopicJourneyAction actionMap(QueueConversationSocialExpressionEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actionMap")
  public QueueConversationSocialExpressionEventTopicJourneyActionMap getActionMap() {
    return actionMap;
  }
  public void setActionMap(QueueConversationSocialExpressionEventTopicJourneyActionMap actionMap) {
    this.actionMap = actionMap;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationSocialExpressionEventTopicJourneyAction queueConversationSocialExpressionEventTopicJourneyAction = (QueueConversationSocialExpressionEventTopicJourneyAction) o;
    return Objects.equals(this.id, queueConversationSocialExpressionEventTopicJourneyAction.id) &&
        Objects.equals(this.actionMap, queueConversationSocialExpressionEventTopicJourneyAction.actionMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actionMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationSocialExpressionEventTopicJourneyAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actionMap: ").append(toIndentedString(actionMap)).append("\n");
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

