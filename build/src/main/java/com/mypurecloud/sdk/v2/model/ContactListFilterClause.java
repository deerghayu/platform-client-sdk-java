package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ContactListFilterPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilterClause
 */

public class ContactListFilterClause  implements Serializable {
  

  /**
   * The filter type tells the api how to compare between predicates
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
  private List<ContactListFilterPredicate> predicates = new ArrayList<ContactListFilterPredicate>();

  
  /**
   * The filter type tells the api how to compare between predicates
   **/
  public ContactListFilterClause filterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The filter type tells the api how to compare between predicates")
  @JsonProperty("filterType")
  public FilterTypeEnum getFilterType() {
    return filterType;
  }
  public void setFilterType(FilterTypeEnum filterType) {
    this.filterType = filterType;
  }

  
  /**
   **/
  public ContactListFilterClause predicates(List<ContactListFilterPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("predicates")
  public List<ContactListFilterPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<ContactListFilterPredicate> predicates) {
    this.predicates = predicates;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilterClause contactListFilterClause = (ContactListFilterClause) o;
    return Objects.equals(this.filterType, contactListFilterClause.filterType) &&
        Objects.equals(this.predicates, contactListFilterClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterType, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterClause {\n");
    
    sb.append("    filterType: ").append(toIndentedString(filterType)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

