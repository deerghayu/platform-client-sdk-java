package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * GeolocationSettings
 */

public class GeolocationSettings  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean enabled = null;
  private String mapboxKey = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public GeolocationSettings name(String name) {
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
  public GeolocationSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   **/
  public GeolocationSettings mapboxKey(String mapboxKey) {
    this.mapboxKey = mapboxKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mapboxKey")
  public String getMapboxKey() {
    return mapboxKey;
  }
  public void setMapboxKey(String mapboxKey) {
    this.mapboxKey = mapboxKey;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeolocationSettings geolocationSettings = (GeolocationSettings) o;
    return Objects.equals(this.id, geolocationSettings.id) &&
        Objects.equals(this.name, geolocationSettings.name) &&
        Objects.equals(this.enabled, geolocationSettings.enabled) &&
        Objects.equals(this.mapboxKey, geolocationSettings.mapboxKey) &&
        Objects.equals(this.selfUri, geolocationSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, mapboxKey, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeolocationSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    mapboxKey: ").append(toIndentedString(mapboxKey)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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
