package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimConfigResourceTypeSchemaExtension;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Common attributes to all SCIM resources
 */
@ApiModel(description = "Common attributes to all SCIM resources")

public class ScimConfigResourceType  implements Serializable {
  
  private String id = null;
  private List<String> schemas = new ArrayList<String>();
  private String name = null;
  private String description = null;
  private String schema = null;
  private List<ScimConfigResourceTypeSchemaExtension> schemaExtensions = new ArrayList<ScimConfigResourceTypeSchemaExtension>();
  private String endpoint = null;
  private ScimMetadata meta = null;

  
  @ApiModelProperty(example = "null", value = "The ID of the SCIM resource. Set by the service provider. caseExact is set to true. Mutability is set to readOnly. Returned is set to always.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * schemas supported
   **/
  public ScimConfigResourceType schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "schemas supported")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  
  @ApiModelProperty(example = "null", value = "Resource name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "Resource description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "The resource type's primary/base schema URI.")
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  
  /**
   * Resource extension schemas
   **/
  public ScimConfigResourceType schemaExtensions(List<ScimConfigResourceTypeSchemaExtension> schemaExtensions) {
    this.schemaExtensions = schemaExtensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resource extension schemas")
  @JsonProperty("schemaExtensions")
  public List<ScimConfigResourceTypeSchemaExtension> getSchemaExtensions() {
    return schemaExtensions;
  }
  public void setSchemaExtensions(List<ScimConfigResourceTypeSchemaExtension> schemaExtensions) {
    this.schemaExtensions = schemaExtensions;
  }

  
  @ApiModelProperty(example = "null", value = "Resource HTTP endpoint.")
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  
  /**
   * Resource SCIM meta
   **/
  public ScimConfigResourceType meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resource SCIM meta")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimConfigResourceType scimConfigResourceType = (ScimConfigResourceType) o;
    return Objects.equals(this.id, scimConfigResourceType.id) &&
        Objects.equals(this.schemas, scimConfigResourceType.schemas) &&
        Objects.equals(this.name, scimConfigResourceType.name) &&
        Objects.equals(this.description, scimConfigResourceType.description) &&
        Objects.equals(this.schema, scimConfigResourceType.schema) &&
        Objects.equals(this.schemaExtensions, scimConfigResourceType.schemaExtensions) &&
        Objects.equals(this.endpoint, scimConfigResourceType.endpoint) &&
        Objects.equals(this.meta, scimConfigResourceType.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemas, name, description, schema, schemaExtensions, endpoint, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimConfigResourceType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    schemaExtensions: ").append(toIndentedString(schemaExtensions)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

