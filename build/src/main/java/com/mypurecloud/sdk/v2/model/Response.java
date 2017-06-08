package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.ResponseSubstitution;
import com.mypurecloud.sdk.v2.model.ResponseText;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Contains information about a response.
 */
@ApiModel(description = "Contains information about a response.")

public class Response  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;
  private List<UriReference> libraries = new ArrayList<UriReference>();
  private List<ResponseText> texts = new ArrayList<ResponseText>();
  private User createdBy = null;
  private Date dateCreated = null;

  /**
   * The interaction type for this response.
   */
  public enum InteractionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CHAT("chat"),
    EMAIL("email"),
    TWITTER("twitter");

    private String value;

    InteractionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InteractionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InteractionTypeEnum value : InteractionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InteractionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InteractionTypeEnum interactionType = null;
  private List<ResponseSubstitution> substitutions = new ArrayList<ResponseSubstitution>();
  private JsonSchemaDocument substitutionsSchema = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Response name(String name) {
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
   * Version number required for updates.
   **/
  public Response version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * One or more libraries response is associated with.
   **/
  public Response libraries(List<UriReference> libraries) {
    this.libraries = libraries;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One or more libraries response is associated with.")
  @JsonProperty("libraries")
  public List<UriReference> getLibraries() {
    return libraries;
  }
  public void setLibraries(List<UriReference> libraries) {
    this.libraries = libraries;
  }

  
  /**
   * One or more texts associated with the response.
   **/
  public Response texts(List<ResponseText> texts) {
    this.texts = texts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "One or more texts associated with the response.")
  @JsonProperty("texts")
  public List<ResponseText> getTexts() {
    return texts;
  }
  public void setTexts(List<ResponseText> texts) {
    this.texts = texts;
  }

  
  /**
   * User that created the response
   **/
  public Response createdBy(User createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that created the response")
  @JsonProperty("createdBy")
  public User getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(User createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public Response dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The interaction type for this response.
   **/
  public Response interactionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The interaction type for this response.")
  @JsonProperty("interactionType")
  public InteractionTypeEnum getInteractionType() {
    return interactionType;
  }
  public void setInteractionType(InteractionTypeEnum interactionType) {
    this.interactionType = interactionType;
  }

  
  /**
   * Details about any text substitutions used in the texts for this response.
   **/
  public Response substitutions(List<ResponseSubstitution> substitutions) {
    this.substitutions = substitutions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about any text substitutions used in the texts for this response.")
  @JsonProperty("substitutions")
  public List<ResponseSubstitution> getSubstitutions() {
    return substitutions;
  }
  public void setSubstitutions(List<ResponseSubstitution> substitutions) {
    this.substitutions = substitutions;
  }

  
  /**
   * Metadata about the text substitutions in json schema format.
   **/
  public Response substitutionsSchema(JsonSchemaDocument substitutionsSchema) {
    this.substitutionsSchema = substitutionsSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata about the text substitutions in json schema format.")
  @JsonProperty("substitutionsSchema")
  public JsonSchemaDocument getSubstitutionsSchema() {
    return substitutionsSchema;
  }
  public void setSubstitutionsSchema(JsonSchemaDocument substitutionsSchema) {
    this.substitutionsSchema = substitutionsSchema;
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
    Response response = (Response) o;
    return Objects.equals(this.id, response.id) &&
        Objects.equals(this.name, response.name) &&
        Objects.equals(this.version, response.version) &&
        Objects.equals(this.libraries, response.libraries) &&
        Objects.equals(this.texts, response.texts) &&
        Objects.equals(this.createdBy, response.createdBy) &&
        Objects.equals(this.dateCreated, response.dateCreated) &&
        Objects.equals(this.interactionType, response.interactionType) &&
        Objects.equals(this.substitutions, response.substitutions) &&
        Objects.equals(this.substitutionsSchema, response.substitutionsSchema) &&
        Objects.equals(this.selfUri, response.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, libraries, texts, createdBy, dateCreated, interactionType, substitutions, substitutionsSchema, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    interactionType: ").append(toIndentedString(interactionType)).append("\n");
    sb.append("    substitutions: ").append(toIndentedString(substitutions)).append("\n");
    sb.append("    substitutionsSchema: ").append(toIndentedString(substitutionsSchema)).append("\n");
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

