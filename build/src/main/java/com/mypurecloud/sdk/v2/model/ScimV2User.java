package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.Photo;
import com.mypurecloud.sdk.v2.model.ScimEmail;
import com.mypurecloud.sdk.v2.model.ScimMetadata;
import com.mypurecloud.sdk.v2.model.ScimPhoneNumber;
import com.mypurecloud.sdk.v2.model.ScimV2EnterpriseUser;
import com.mypurecloud.sdk.v2.model.ScimV2GroupReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Represents a SCIM V2 User
 */
@ApiModel(description = "Represents a SCIM V2 User")

public class ScimV2User  implements Serializable {
  
  private String id = null;
  private String displayName = null;
  private List<String> schemas = new ArrayList<String>();
  private Boolean active = null;
  private String userName = null;
  private String password = null;
  private String title = null;
  private List<ScimPhoneNumber> phoneNumbers = new ArrayList<ScimPhoneNumber>();
  private List<ScimEmail> emails = new ArrayList<ScimEmail>();
  private List<Photo> photos = new ArrayList<Photo>();
  private String externalId = null;
  private List<ScimV2GroupReference> groups = new ArrayList<ScimV2GroupReference>();
  private ScimMetadata meta = null;
  private ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User = null;

  
  @ApiModelProperty(example = "null", value = "SCIM Resource identifier")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Display Name
   **/
  public ScimV2User displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Display Name")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   * schemas supported
   **/
  public ScimV2User schemas(List<String> schemas) {
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

  
  /**
   * Active flag
   **/
  public ScimV2User active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Active flag")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   * User Name (Must be Unique) maps to PureCloud e-mail address
   **/
  public ScimV2User userName(String userName) {
    this.userName = userName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Name (Must be Unique) maps to PureCloud e-mail address")
  @JsonProperty("userName")
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }

  
  /**
   * Password (updateOnly)
   **/
  public ScimV2User password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Password (updateOnly)")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  
  /**
   * Title
   **/
  public ScimV2User title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Phone numbers
   **/
  public ScimV2User phoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Phone numbers")
  @JsonProperty("phoneNumbers")
  public List<ScimPhoneNumber> getPhoneNumbers() {
    return phoneNumbers;
  }
  public void setPhoneNumbers(List<ScimPhoneNumber> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  
  /**
   * Emails
   **/
  public ScimV2User emails(List<ScimEmail> emails) {
    this.emails = emails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Emails")
  @JsonProperty("emails")
  public List<ScimEmail> getEmails() {
    return emails;
  }
  public void setEmails(List<ScimEmail> emails) {
    this.emails = emails;
  }

  
  /**
   * Photos
   **/
  public ScimV2User photos(List<Photo> photos) {
    this.photos = photos;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Photos")
  @JsonProperty("photos")
  public List<Photo> getPhotos() {
    return photos;
  }
  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }

  
  /**
   * External ID
   **/
  public ScimV2User externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "External ID")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  
  /**
   * Group References
   **/
  public ScimV2User groups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Group References")
  @JsonProperty("groups")
  public List<ScimV2GroupReference> getGroups() {
    return groups;
  }
  public void setGroups(List<ScimV2GroupReference> groups) {
    this.groups = groups;
  }

  
  /**
   **/
  public ScimV2User meta(ScimMetadata meta) {
    this.meta = meta;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("meta")
  public ScimMetadata getMeta() {
    return meta;
  }
  public void setMeta(ScimMetadata meta) {
    this.meta = meta;
  }

  
  /**
   **/
  public ScimV2User urnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
  public ScimV2EnterpriseUser getUrnietfparamsscimschemasextensionenterprise20User() {
    return urnietfparamsscimschemasextensionenterprise20User;
  }
  public void setUrnietfparamsscimschemasextensionenterprise20User(ScimV2EnterpriseUser urnietfparamsscimschemasextensionenterprise20User) {
    this.urnietfparamsscimschemasextensionenterprise20User = urnietfparamsscimschemasextensionenterprise20User;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimV2User scimV2User = (ScimV2User) o;
    return Objects.equals(this.id, scimV2User.id) &&
        Objects.equals(this.displayName, scimV2User.displayName) &&
        Objects.equals(this.schemas, scimV2User.schemas) &&
        Objects.equals(this.active, scimV2User.active) &&
        Objects.equals(this.userName, scimV2User.userName) &&
        Objects.equals(this.password, scimV2User.password) &&
        Objects.equals(this.title, scimV2User.title) &&
        Objects.equals(this.phoneNumbers, scimV2User.phoneNumbers) &&
        Objects.equals(this.emails, scimV2User.emails) &&
        Objects.equals(this.photos, scimV2User.photos) &&
        Objects.equals(this.externalId, scimV2User.externalId) &&
        Objects.equals(this.groups, scimV2User.groups) &&
        Objects.equals(this.meta, scimV2User.meta) &&
        Objects.equals(this.urnietfparamsscimschemasextensionenterprise20User, scimV2User.urnietfparamsscimschemasextensionenterprise20User);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, schemas, active, userName, password, title, phoneNumbers, emails, photos, externalId, groups, meta, urnietfparamsscimschemasextensionenterprise20User);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimV2User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    urnietfparamsscimschemasextensionenterprise20User: ").append(toIndentedString(urnietfparamsscimschemasextensionenterprise20User)).append("\n");
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
