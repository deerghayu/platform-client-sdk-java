package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUserHomeOrg;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * FlowOutcomeNotificationNotificationUser
 */

public class FlowOutcomeNotificationNotificationUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DependencyTrackingBuildNotificationNotificationUserHomeOrg homeOrg = null;

  
  /**
   **/
  public FlowOutcomeNotificationNotificationUser id(String id) {
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
  public FlowOutcomeNotificationNotificationUser name(String name) {
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
  public FlowOutcomeNotificationNotificationUser homeOrg(DependencyTrackingBuildNotificationNotificationUserHomeOrg homeOrg) {
    this.homeOrg = homeOrg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homeOrg")
  public DependencyTrackingBuildNotificationNotificationUserHomeOrg getHomeOrg() {
    return homeOrg;
  }
  public void setHomeOrg(DependencyTrackingBuildNotificationNotificationUserHomeOrg homeOrg) {
    this.homeOrg = homeOrg;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowOutcomeNotificationNotificationUser flowOutcomeNotificationNotificationUser = (FlowOutcomeNotificationNotificationUser) o;
    return Objects.equals(this.id, flowOutcomeNotificationNotificationUser.id) &&
        Objects.equals(this.name, flowOutcomeNotificationNotificationUser.name) &&
        Objects.equals(this.homeOrg, flowOutcomeNotificationNotificationUser.homeOrg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, homeOrg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowOutcomeNotificationNotificationUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    homeOrg: ").append(toIndentedString(homeOrg)).append("\n");
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
