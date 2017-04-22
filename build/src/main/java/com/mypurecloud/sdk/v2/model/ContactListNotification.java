package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ContactListNotificationImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListNotificationPhoneColumns;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListNotification
 */

public class ContactListNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<String> columnNames = new ArrayList<String>();
  private List<ContactListNotificationPhoneColumns> phoneColumns = new ArrayList<ContactListNotificationPhoneColumns>();
  private ContactListNotificationImportStatus importStatus = null;
  private String previewModeColumnName = null;
  private List<String> previewModeAcceptedValues = new ArrayList<String>();
  private Integer size = null;
  private DependencyTrackingBuildNotificationNotificationUser attemptLimits = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ContactListNotification id(String id) {
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
  public ContactListNotification name(String name) {
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
  public ContactListNotification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public ContactListNotification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   **/
  public ContactListNotification version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   **/
  public ContactListNotification columnNames(List<String> columnNames) {
    this.columnNames = columnNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("columnNames")
  public List<String> getColumnNames() {
    return columnNames;
  }
  public void setColumnNames(List<String> columnNames) {
    this.columnNames = columnNames;
  }


  /**
   **/
  public ContactListNotification phoneColumns(List<ContactListNotificationPhoneColumns> phoneColumns) {
    this.phoneColumns = phoneColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("phoneColumns")
  public List<ContactListNotificationPhoneColumns> getPhoneColumns() {
    return phoneColumns;
  }
  public void setPhoneColumns(List<ContactListNotificationPhoneColumns> phoneColumns) {
    this.phoneColumns = phoneColumns;
  }


  /**
   **/
  public ContactListNotification importStatus(ContactListNotificationImportStatus importStatus) {
    this.importStatus = importStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("importStatus")
  public ContactListNotificationImportStatus getImportStatus() {
    return importStatus;
  }
  public void setImportStatus(ContactListNotificationImportStatus importStatus) {
    this.importStatus = importStatus;
  }


  /**
   **/
  public ContactListNotification previewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewModeColumnName")
  public String getPreviewModeColumnName() {
    return previewModeColumnName;
  }
  public void setPreviewModeColumnName(String previewModeColumnName) {
    this.previewModeColumnName = previewModeColumnName;
  }


  /**
   **/
  public ContactListNotification previewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previewModeAcceptedValues")
  public List<String> getPreviewModeAcceptedValues() {
    return previewModeAcceptedValues;
  }
  public void setPreviewModeAcceptedValues(List<String> previewModeAcceptedValues) {
    this.previewModeAcceptedValues = previewModeAcceptedValues;
  }


  /**
   **/
  public ContactListNotification size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }


  /**
   **/
  public ContactListNotification attemptLimits(DependencyTrackingBuildNotificationNotificationUser attemptLimits) {
    this.attemptLimits = attemptLimits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("attemptLimits")
  public DependencyTrackingBuildNotificationNotificationUser getAttemptLimits() {
    return attemptLimits;
  }
  public void setAttemptLimits(DependencyTrackingBuildNotificationNotificationUser attemptLimits) {
    this.attemptLimits = attemptLimits;
  }


  /**
   **/
  public ContactListNotification additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListNotification contactListNotification = (ContactListNotification) o;
    return Objects.equals(this.id, contactListNotification.id) &&
        Objects.equals(this.name, contactListNotification.name) &&
        Objects.equals(this.dateCreated, contactListNotification.dateCreated) &&
        Objects.equals(this.dateModified, contactListNotification.dateModified) &&
        Objects.equals(this.version, contactListNotification.version) &&
        Objects.equals(this.columnNames, contactListNotification.columnNames) &&
        Objects.equals(this.phoneColumns, contactListNotification.phoneColumns) &&
        Objects.equals(this.importStatus, contactListNotification.importStatus) &&
        Objects.equals(this.previewModeColumnName, contactListNotification.previewModeColumnName) &&
        Objects.equals(this.previewModeAcceptedValues, contactListNotification.previewModeAcceptedValues) &&
        Objects.equals(this.size, contactListNotification.size) &&
        Objects.equals(this.attemptLimits, contactListNotification.attemptLimits) &&
        Objects.equals(this.additionalProperties, contactListNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, columnNames, phoneColumns, importStatus, previewModeColumnName, previewModeAcceptedValues, size, attemptLimits, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
    sb.append("    phoneColumns: ").append(toIndentedString(phoneColumns)).append("\n");
    sb.append("    importStatus: ").append(toIndentedString(importStatus)).append("\n");
    sb.append("    previewModeColumnName: ").append(toIndentedString(previewModeColumnName)).append("\n");
    sb.append("    previewModeAcceptedValues: ").append(toIndentedString(previewModeAcceptedValues)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    attemptLimits: ").append(toIndentedString(attemptLimits)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

