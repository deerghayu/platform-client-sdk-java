package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactPhoneNumberColumn
 */

public class ContactPhoneNumberColumn  implements Serializable {
  
  private String columnName = null;
  private String type = null;
  private String callableTimeColumn = null;

  
  /**
   * name of the phone column
   **/
  public ContactPhoneNumberColumn columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "name of the phone column")
  @JsonProperty("columnName")
  public String getColumnName() {
    return columnName;
  }
  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }


  /**
   * type of the phone column, for example, 'cell' or 'home'
   **/
  public ContactPhoneNumberColumn type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "type of the phone column, for example, 'cell' or 'home'")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * name of the column indicating the timezone to be considered for determining callable times
   **/
  public ContactPhoneNumberColumn callableTimeColumn(String callableTimeColumn) {
    this.callableTimeColumn = callableTimeColumn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "name of the column indicating the timezone to be considered for determining callable times")
  @JsonProperty("callableTimeColumn")
  public String getCallableTimeColumn() {
    return callableTimeColumn;
  }
  public void setCallableTimeColumn(String callableTimeColumn) {
    this.callableTimeColumn = callableTimeColumn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactPhoneNumberColumn contactPhoneNumberColumn = (ContactPhoneNumberColumn) o;
    return Objects.equals(this.columnName, contactPhoneNumberColumn.columnName) &&
        Objects.equals(this.type, contactPhoneNumberColumn.type) &&
        Objects.equals(this.callableTimeColumn, contactPhoneNumberColumn.callableTimeColumn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, type, callableTimeColumn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactPhoneNumberColumn {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    callableTimeColumn: ").append(toIndentedString(callableTimeColumn)).append("\n");
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
