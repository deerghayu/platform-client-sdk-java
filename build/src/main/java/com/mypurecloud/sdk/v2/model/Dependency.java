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
 * Dependency
 */

public class Dependency  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String version = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACDLANGUAGE("ACDLANGUAGE"),
    ACDSKILL("ACDSKILL"),
    ACDWRAPUPCODE("ACDWRAPUPCODE"),
    BRIDGEACTION("BRIDGEACTION"),
    COMPOSERSCRIPT("COMPOSERSCRIPT"),
    CONTACTLIST("CONTACTLIST"),
    DATAACTION("DATAACTION"),
    GROUP("GROUP"),
    INBOUNDCALLFLOW("INBOUNDCALLFLOW"),
    INBOUNDEMAILFLOW("INBOUNDEMAILFLOW"),
    INQUEUECALLFLOW("INQUEUECALLFLOW"),
    IVRCONFIGURATION("IVRCONFIGURATION"),
    LANGUAGE("LANGUAGE"),
    OUTBOUNDCALLFLOW("OUTBOUNDCALLFLOW"),
    QUEUE("QUEUE"),
    RESPONSE("RESPONSE"),
    SECUREACTION("SECUREACTION"),
    SECURECALLFLOW("SECURECALLFLOW"),
    SYSTEMPROMPT("SYSTEMPROMPT"),
    USER("USER"),
    USERPROMPT("USERPROMPT"),
    VOICEXML("VOICEXML"),
    WORKFLOW("WORKFLOW");

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
  private Boolean deleted = null;
  private Boolean updated = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Dependency name(String name) {
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
  public Dependency version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   **/
  public Dependency type(TypeEnum type) {
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
  public Dependency deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deleted")
  public Boolean getDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  /**
   **/
  public Dependency updated(Boolean updated) {
    this.updated = updated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updated")
  public Boolean getUpdated() {
    return updated;
  }
  public void setUpdated(Boolean updated) {
    this.updated = updated;
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
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.id, dependency.id) &&
        Objects.equals(this.name, dependency.name) &&
        Objects.equals(this.version, dependency.version) &&
        Objects.equals(this.type, dependency.type) &&
        Objects.equals(this.deleted, dependency.deleted) &&
        Objects.equals(this.updated, dependency.updated) &&
        Objects.equals(this.selfUri, dependency.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, type, deleted, updated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

