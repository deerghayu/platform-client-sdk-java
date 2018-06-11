package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.CredentialSpecification;
import com.mypurecloud.sdk.v2.model.UserImage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Descriptor for a type of Integration.
 */
@ApiModel(description = "Descriptor for a type of Integration.")

public class IntegrationType  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String provider = null;
  private String category = null;
  private List<UserImage> images = new ArrayList<UserImage>();
  private String configPropertiesSchemaUri = null;
  private String configAdvancedSchemaUri = null;
  private String helpUri = null;
  private Map<String, CredentialSpecification> credentials = null;
  private Boolean nonInstallable = null;
  private Integer maxInstances = null;
  private List<String> userPermissions = new ArrayList<String>();
  private String selfUri = null;

  
  /**
   * The ID of the integration type.
   **/
  public IntegrationType id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the integration type.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public IntegrationType name(String name) {
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

  
  @ApiModelProperty(example = "null", value = "Description of the integration type.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "PureCloud provider of the integration type.")
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  
  @ApiModelProperty(example = "null", value = "Category describing the integration type.")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  
  /**
   * Collection of logos.
   **/
  public IntegrationType images(List<UserImage> images) {
    this.images = images;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of logos.")
  @JsonProperty("images")
  public List<UserImage> getImages() {
    return images;
  }
  public void setImages(List<UserImage> images) {
    this.images = images;
  }

  
  @ApiModelProperty(example = "null", value = "URI of the schema describing the key-value properties needed to configure an integration of this type.")
  @JsonProperty("configPropertiesSchemaUri")
  public String getConfigPropertiesSchemaUri() {
    return configPropertiesSchemaUri;
  }

  
  @ApiModelProperty(example = "null", value = "URI of the schema describing the advanced JSON document needed to configure an integration of this type.")
  @JsonProperty("configAdvancedSchemaUri")
  public String getConfigAdvancedSchemaUri() {
    return configAdvancedSchemaUri;
  }

  
  @ApiModelProperty(example = "null", value = "URI of a page with more information about the integration type")
  @JsonProperty("helpUri")
  public String getHelpUri() {
    return helpUri;
  }

  
  /**
   * Map of credentials for integrations of this type. The key is the name of a credential that can be provided in the credentials property of the integration configuration.
   **/
  public IntegrationType credentials(Map<String, CredentialSpecification> credentials) {
    this.credentials = credentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of credentials for integrations of this type. The key is the name of a credential that can be provided in the credentials property of the integration configuration.")
  @JsonProperty("credentials")
  public Map<String, CredentialSpecification> getCredentials() {
    return credentials;
  }
  public void setCredentials(Map<String, CredentialSpecification> credentials) {
    this.credentials = credentials;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates if the integration type is installable or not.")
  @JsonProperty("nonInstallable")
  public Boolean getNonInstallable() {
    return nonInstallable;
  }

  
  @ApiModelProperty(example = "null", value = "The maximum number of integration instances allowable for this integration type")
  @JsonProperty("maxInstances")
  public Integer getMaxInstances() {
    return maxInstances;
  }

  
  /**
   * List of permissions required to permit user access to the integration type.
   **/
  public IntegrationType userPermissions(List<String> userPermissions) {
    this.userPermissions = userPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of permissions required to permit user access to the integration type.")
  @JsonProperty("userPermissions")
  public List<String> getUserPermissions() {
    return userPermissions;
  }
  public void setUserPermissions(List<String> userPermissions) {
    this.userPermissions = userPermissions;
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
    IntegrationType integrationType = (IntegrationType) o;
    return Objects.equals(this.id, integrationType.id) &&
        Objects.equals(this.name, integrationType.name) &&
        Objects.equals(this.description, integrationType.description) &&
        Objects.equals(this.provider, integrationType.provider) &&
        Objects.equals(this.category, integrationType.category) &&
        Objects.equals(this.images, integrationType.images) &&
        Objects.equals(this.configPropertiesSchemaUri, integrationType.configPropertiesSchemaUri) &&
        Objects.equals(this.configAdvancedSchemaUri, integrationType.configAdvancedSchemaUri) &&
        Objects.equals(this.helpUri, integrationType.helpUri) &&
        Objects.equals(this.credentials, integrationType.credentials) &&
        Objects.equals(this.nonInstallable, integrationType.nonInstallable) &&
        Objects.equals(this.maxInstances, integrationType.maxInstances) &&
        Objects.equals(this.userPermissions, integrationType.userPermissions) &&
        Objects.equals(this.selfUri, integrationType.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, provider, category, images, configPropertiesSchemaUri, configAdvancedSchemaUri, helpUri, credentials, nonInstallable, maxInstances, userPermissions, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    configPropertiesSchemaUri: ").append(toIndentedString(configPropertiesSchemaUri)).append("\n");
    sb.append("    configAdvancedSchemaUri: ").append(toIndentedString(configAdvancedSchemaUri)).append("\n");
    sb.append("    helpUri: ").append(toIndentedString(helpUri)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    nonInstallable: ").append(toIndentedString(nonInstallable)).append("\n");
    sb.append("    maxInstances: ").append(toIndentedString(maxInstances)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
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
