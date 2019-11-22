package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.PagedResource;
import com.mypurecloud.sdk.v2.model.DialogflowAgentSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialogflowAgentSummaryEntityListing
 */

public class DialogflowAgentSummaryEntityListing  implements Serializable, PagedResource<DialogflowAgentSummary> {
  
  private List<DialogflowAgentSummary> entities = new ArrayList<DialogflowAgentSummary>();
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long total = null;
  private String selfUri = null;
  private String firstUri = null;
  private String nextUri = null;
  private String lastUri = null;
  private String previousUri = null;
  private Integer pageCount = null;

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing entities(List<DialogflowAgentSummary> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<DialogflowAgentSummary> getEntities() {
    return entities;
  }
  public void setEntities(List<DialogflowAgentSummary> entities) {
    this.entities = entities;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing firstUri(String firstUri) {
    this.firstUri = firstUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstUri")
  public String getFirstUri() {
    return firstUri;
  }
  public void setFirstUri(String firstUri) {
    this.firstUri = firstUri;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing lastUri(String lastUri) {
    this.lastUri = lastUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastUri")
  public String getLastUri() {
    return lastUri;
  }
  public void setLastUri(String lastUri) {
    this.lastUri = lastUri;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }

  
  /**
   **/
  public DialogflowAgentSummaryEntityListing pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pageCount")
  public Integer getPageCount() {
    return pageCount;
  }
  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogflowAgentSummaryEntityListing dialogflowAgentSummaryEntityListing = (DialogflowAgentSummaryEntityListing) o;
    return Objects.equals(this.entities, dialogflowAgentSummaryEntityListing.entities) &&
        Objects.equals(this.pageSize, dialogflowAgentSummaryEntityListing.pageSize) &&
        Objects.equals(this.pageNumber, dialogflowAgentSummaryEntityListing.pageNumber) &&
        Objects.equals(this.total, dialogflowAgentSummaryEntityListing.total) &&
        Objects.equals(this.selfUri, dialogflowAgentSummaryEntityListing.selfUri) &&
        Objects.equals(this.firstUri, dialogflowAgentSummaryEntityListing.firstUri) &&
        Objects.equals(this.nextUri, dialogflowAgentSummaryEntityListing.nextUri) &&
        Objects.equals(this.lastUri, dialogflowAgentSummaryEntityListing.lastUri) &&
        Objects.equals(this.previousUri, dialogflowAgentSummaryEntityListing.previousUri) &&
        Objects.equals(this.pageCount, dialogflowAgentSummaryEntityListing.pageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, pageSize, pageNumber, total, selfUri, firstUri, nextUri, lastUri, previousUri, pageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogflowAgentSummaryEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    firstUri: ").append(toIndentedString(firstUri)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    lastUri: ").append(toIndentedString(lastUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
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

