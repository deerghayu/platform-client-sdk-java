package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.RoutingStatusDetailQueryClause;
import com.mypurecloud.sdk.v2.model.RoutingStatusDetailQueryPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingStatusDetailQueryFilter
 */

public class RoutingStatusDetailQueryFilter  implements Serializable {
  

  /**
   * Boolean operation to apply to the provided predicates and clauses
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("and"),
    OR("or");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private List<RoutingStatusDetailQueryClause> clauses = new ArrayList<RoutingStatusDetailQueryClause>();
  private List<RoutingStatusDetailQueryPredicate> predicates = new ArrayList<RoutingStatusDetailQueryPredicate>();

  
  /**
   * Boolean operation to apply to the provided predicates and clauses
   **/
  public RoutingStatusDetailQueryFilter type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Boolean operation to apply to the provided predicates and clauses")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Boolean 'and/or' logic with up to two-levels of nesting
   **/
  public RoutingStatusDetailQueryFilter clauses(List<RoutingStatusDetailQueryClause> clauses) {
    this.clauses = clauses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean 'and/or' logic with up to two-levels of nesting")
  @JsonProperty("clauses")
  public List<RoutingStatusDetailQueryClause> getClauses() {
    return clauses;
  }
  public void setClauses(List<RoutingStatusDetailQueryClause> clauses) {
    this.clauses = clauses;
  }

  
  /**
   * Like a three-word sentence: (attribute-name) (operator) (target-value).
   **/
  public RoutingStatusDetailQueryFilter predicates(List<RoutingStatusDetailQueryPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Like a three-word sentence: (attribute-name) (operator) (target-value).")
  @JsonProperty("predicates")
  public List<RoutingStatusDetailQueryPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<RoutingStatusDetailQueryPredicate> predicates) {
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
    RoutingStatusDetailQueryFilter routingStatusDetailQueryFilter = (RoutingStatusDetailQueryFilter) o;
    return Objects.equals(this.type, routingStatusDetailQueryFilter.type) &&
        Objects.equals(this.clauses, routingStatusDetailQueryFilter.clauses) &&
        Objects.equals(this.predicates, routingStatusDetailQueryFilter.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, clauses, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingStatusDetailQueryFilter {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
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

