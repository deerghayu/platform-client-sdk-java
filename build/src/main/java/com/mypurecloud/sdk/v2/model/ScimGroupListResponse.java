package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SCIM Group List Response
 */
@ApiModel(description = "SCIM Group List Response")

public class ScimGroupListResponse  implements Serializable {
  
  private Long totalResults = null;
  private Long startIndex = null;
  private Long itemsPerPage = null;
  private List<ScimV2Group> resources = new ArrayList<ScimV2Group>();
  private List<String> schemas = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "The total number of results.")
  @JsonProperty("totalResults")
  public Long getTotalResults() {
    return totalResults;
  }

  
  @ApiModelProperty(example = "null", value = "The 1-based index of the first result returned by this request. Add this to itemsPerPage when requesting the next page of results.")
  @JsonProperty("startIndex")
  public Long getStartIndex() {
    return startIndex;
  }

  
  @ApiModelProperty(example = "null", value = "The number of resources returned per page.")
  @JsonProperty("itemsPerPage")
  public Long getItemsPerPage() {
    return itemsPerPage;
  }

  
  /**
   * Resources
   **/
  public ScimGroupListResponse resources(List<ScimV2Group> resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Resources")
  @JsonProperty("Resources")
  public List<ScimV2Group> getResources() {
    return resources;
  }
  public void setResources(List<ScimV2Group> resources) {
    this.resources = resources;
  }

  
  /**
   * The list of supported schemas.
   **/
  public ScimGroupListResponse schemas(List<String> schemas) {
    this.schemas = schemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of supported schemas.")
  @JsonProperty("schemas")
  public List<String> getSchemas() {
    return schemas;
  }
  public void setSchemas(List<String> schemas) {
    this.schemas = schemas;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroupListResponse scimGroupListResponse = (ScimGroupListResponse) o;
    return Objects.equals(this.totalResults, scimGroupListResponse.totalResults) &&
        Objects.equals(this.startIndex, scimGroupListResponse.startIndex) &&
        Objects.equals(this.itemsPerPage, scimGroupListResponse.itemsPerPage) &&
        Objects.equals(this.resources, scimGroupListResponse.resources) &&
        Objects.equals(this.schemas, scimGroupListResponse.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, startIndex, itemsPerPage, resources, schemas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroupListResponse {\n");
    
    sb.append("    totalResults: ").append(toIndentedString(totalResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    itemsPerPage: ").append(toIndentedString(itemsPerPage)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
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

