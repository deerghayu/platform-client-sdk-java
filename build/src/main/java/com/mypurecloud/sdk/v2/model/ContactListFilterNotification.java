package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactListFilterNotificationClauses;
import com.mypurecloud.sdk.v2.model.DependencyTrackingBuildNotificationNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilterNotification
 */

public class ContactListFilterNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private DependencyTrackingBuildNotificationNotificationUser contactList = null;
  private List<String> contactListColumns = new ArrayList<String>();
  private List<ContactListFilterNotificationClauses> clauses = new ArrayList<ContactListFilterNotificationClauses>();

  /**
   * Gets or Sets filterType
   */
  public enum FilterTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    OR("OR");

    private String value;

    FilterTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FilterTypeEnum fromString(String key) {
      if (key == null) return null;

      for (FilterTypeEnum value : FilterTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FilterTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FilterTypeEnum filterType = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public ContactListFilterNotification id(String id) {
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
  public ContactListFilterNotification name(String name) {
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
  public ContactListFilterNotification dateCreated(Date dateCreated) {
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
  public ContactListFilterNotification dateModified(Date dateModified) {
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
  public ContactListFilterNotification version(Integer version) {
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
  public ContactListFilterNotification contactList(DependencyTrackingBuildNotificationNotificationUser contactList) {
    this.contactList = contactList;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactList")
  public DependencyTrackingBuildNotificationNotificationUser getContactList() {
    return contactList;
  }
  public void setContactList(DependencyTrackingBuildNotificationNotificationUser contactList) {
    this.contactList = contactList;
  }


  /**
   **/
  public ContactListFilterNotification contactListColumns(List<String> contactListColumns) {
    this.contactListColumns = contactListColumns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contactListColumns")
  public List<String> getContactListColumns() {
    return contactListColumns;
  }
  public void setContactListColumns(List<String> contactListColumns) {
    this.contactListColumns = contactListColumns;
  }


  /**
   **/
  public ContactListFilterNotification clauses(List<ContactListFilterNotificationClauses> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("clauses")
  public List<ContactListFilterNotificationClauses> getClauses() {
    return clauses;
  }
  public void setClauses(List<ContactListFilterNotificationClauses> clauses) {
    this.clauses = clauses;
  }


  /**
   **/
  public ContactListFilterNotification filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filterType")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }


  /**
   **/
  public ContactListFilterNotification additionalProperties(Object additionalProperties) {
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
    ContactListFilterNotification contactListFilterNotification = (ContactListFilterNotification) o;
    return Objects.equals(this.id, contactListFilterNotification.id) &&
        Objects.equals(this.name, contactListFilterNotification.name) &&
        Objects.equals(this.dateCreated, contactListFilterNotification.dateCreated) &&
        Objects.equals(this.dateModified, contactListFilterNotification.dateModified) &&
        Objects.equals(this.version, contactListFilterNotification.version) &&
        Objects.equals(this.contactList, contactListFilterNotification.contactList) &&
        Objects.equals(this.contactListColumns, contactListFilterNotification.contactListColumns) &&
        Objects.equals(this.clauses, contactListFilterNotification.clauses) &&
        Objects.equals(this.filterType, contactListFilterNotification.filterType) &&
        Objects.equals(this.additionalProperties, contactListFilterNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, contactList, contactListColumns, clauses, filterType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    contactList: ").append(toIndentedString(contactList)).append("\n");
    sb.append("    contactListColumns: ").append(toIndentedString(contactListColumns)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
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

