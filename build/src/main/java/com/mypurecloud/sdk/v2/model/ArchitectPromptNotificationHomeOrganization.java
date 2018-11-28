package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectPromptNotificationHomeOrganization
 */

public class ArchitectPromptNotificationHomeOrganization  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String thirdPartyOrgName = null;

  
  /**
   **/
  public ArchitectPromptNotificationHomeOrganization id(String id) {
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
  public ArchitectPromptNotificationHomeOrganization name(String name) {
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
  public ArchitectPromptNotificationHomeOrganization thirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyOrgName")
  public String getThirdPartyOrgName() {
    return thirdPartyOrgName;
  }
  public void setThirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectPromptNotificationHomeOrganization architectPromptNotificationHomeOrganization = (ArchitectPromptNotificationHomeOrganization) o;
    return Objects.equals(this.id, architectPromptNotificationHomeOrganization.id) &&
        Objects.equals(this.name, architectPromptNotificationHomeOrganization.name) &&
        Objects.equals(this.thirdPartyOrgName, architectPromptNotificationHomeOrganization.thirdPartyOrgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, thirdPartyOrgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectPromptNotificationHomeOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thirdPartyOrgName: ").append(toIndentedString(thirdPartyOrgName)).append("\n");
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

