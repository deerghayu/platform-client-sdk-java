package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WfmMoveAgentsCompleteTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmMoveAgentsCompleteTopicWfmMoveAgentData
 */

public class WfmMoveAgentsCompleteTopicWfmMoveAgentData  implements Serializable {
  
  private WfmMoveAgentsCompleteTopicUserReference user = null;

  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MOVESUCCESSFUL("MoveSuccessful"),
    NOTHINGTODO("NothingToDo"),
    ALREADYMOVED("AlreadyMoved"),
    DESTINATIONMANAGEMENTUNITDOESNOTEXIST("DestinationManagementUnitDoesNotExist"),
    DESTINATIONMANAGEMENTUNITAGENTLIMITEXCEEDED("DestinationManagementUnitAgentLimitExceeded"),
    MOVINGTODIFFERENTMANAGEMENTUNIT("MovingToDifferentManagementUnit");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResultEnum fromString(String key) {
      if (key == null) return null;

      for (ResultEnum value : ResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResultEnum result = null;

  
  /**
   **/
  public WfmMoveAgentsCompleteTopicWfmMoveAgentData user(WfmMoveAgentsCompleteTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WfmMoveAgentsCompleteTopicUserReference getUser() {
    return user;
  }
  public void setUser(WfmMoveAgentsCompleteTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public WfmMoveAgentsCompleteTopicWfmMoveAgentData result(ResultEnum result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmMoveAgentsCompleteTopicWfmMoveAgentData wfmMoveAgentsCompleteTopicWfmMoveAgentData = (WfmMoveAgentsCompleteTopicWfmMoveAgentData) o;
    return Objects.equals(this.user, wfmMoveAgentsCompleteTopicWfmMoveAgentData.user) &&
        Objects.equals(this.result, wfmMoveAgentsCompleteTopicWfmMoveAgentData.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmMoveAgentsCompleteTopicWfmMoveAgentData {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

