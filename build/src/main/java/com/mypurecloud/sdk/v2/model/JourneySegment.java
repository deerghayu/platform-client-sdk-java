package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Context;
import com.mypurecloud.sdk.v2.model.Journey;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneySegment
 */

public class JourneySegment  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean isActive = null;
  private String displayName = null;
  private Integer version = null;
  private String description = null;
  private String color = null;
  private Boolean shouldDisplayToAgent = null;
  private Context context = null;
  private Journey journey = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date modifiedDate = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public JourneySegment name(String name) {
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
   * Whether or not the segment is active.
   **/
  public JourneySegment isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the segment is active.")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  
  /**
   * The display name of the segment.
   **/
  public JourneySegment displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the segment.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * The version of the segment.
   **/
  public JourneySegment version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the segment.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * A description of the segment.
   **/
  public JourneySegment description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the segment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The hexadecimal color value of the segment.
   **/
  public JourneySegment color(String color) {
    this.color = color;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The hexadecimal color value of the segment.")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  
  /**
   * Whether or not the segment should be displayed to agent/supervisor users.
   **/
  public JourneySegment shouldDisplayToAgent(Boolean shouldDisplayToAgent) {
    this.shouldDisplayToAgent = shouldDisplayToAgent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not the segment should be displayed to agent/supervisor users.")
  @JsonProperty("shouldDisplayToAgent")
  public Boolean getShouldDisplayToAgent() {
    return shouldDisplayToAgent;
  }
  public void setShouldDisplayToAgent(Boolean shouldDisplayToAgent) {
    this.shouldDisplayToAgent = shouldDisplayToAgent;
  }

  
  /**
   * The context of the segment.
   **/
  public JourneySegment context(Context context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context of the segment.")
  @JsonProperty("context")
  public Context getContext() {
    return context;
  }
  public void setContext(Context context) {
    this.context = context;
  }

  
  /**
   * The pattern of rules defining the segment.
   **/
  public JourneySegment journey(Journey journey) {
    this.journey = journey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The pattern of rules defining the segment.")
  @JsonProperty("journey")
  public Journey getJourney() {
    return journey;
  }
  public void setJourney(Journey journey) {
    this.journey = journey;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * Timestamp indicating when the segment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public JourneySegment createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the segment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  
  /**
   * Timestamp indicating when the the segment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public JourneySegment modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the the segment was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySegment journeySegment = (JourneySegment) o;
    return Objects.equals(this.id, journeySegment.id) &&
        Objects.equals(this.name, journeySegment.name) &&
        Objects.equals(this.isActive, journeySegment.isActive) &&
        Objects.equals(this.displayName, journeySegment.displayName) &&
        Objects.equals(this.version, journeySegment.version) &&
        Objects.equals(this.description, journeySegment.description) &&
        Objects.equals(this.color, journeySegment.color) &&
        Objects.equals(this.shouldDisplayToAgent, journeySegment.shouldDisplayToAgent) &&
        Objects.equals(this.context, journeySegment.context) &&
        Objects.equals(this.journey, journeySegment.journey) &&
        Objects.equals(this.selfUri, journeySegment.selfUri) &&
        Objects.equals(this.createdDate, journeySegment.createdDate) &&
        Objects.equals(this.modifiedDate, journeySegment.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isActive, displayName, version, description, color, shouldDisplayToAgent, context, journey, selfUri, createdDate, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    shouldDisplayToAgent: ").append(toIndentedString(shouldDisplayToAgent)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    journey: ").append(toIndentedString(journey)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

