package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WfmBuScheduleRunTopicLocalDate
 */

public class WfmBuScheduleRunTopicLocalDate  implements Serializable {
  
  private Integer year = null;
  private Integer month = null;
  private Integer day = null;
  private Boolean leapYear = null;

  
  /**
   **/
  public WfmBuScheduleRunTopicLocalDate year(Integer year) {
    this.year = year;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }
  public void setYear(Integer year) {
    this.year = year;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicLocalDate month(Integer month) {
    this.month = month;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }
  public void setMonth(Integer month) {
    this.month = month;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicLocalDate day(Integer day) {
    this.day = day;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("day")
  public Integer getDay() {
    return day;
  }
  public void setDay(Integer day) {
    this.day = day;
  }

  
  /**
   **/
  public WfmBuScheduleRunTopicLocalDate leapYear(Boolean leapYear) {
    this.leapYear = leapYear;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("leapYear")
  public Boolean getLeapYear() {
    return leapYear;
  }
  public void setLeapYear(Boolean leapYear) {
    this.leapYear = leapYear;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmBuScheduleRunTopicLocalDate wfmBuScheduleRunTopicLocalDate = (WfmBuScheduleRunTopicLocalDate) o;
    return Objects.equals(this.year, wfmBuScheduleRunTopicLocalDate.year) &&
        Objects.equals(this.month, wfmBuScheduleRunTopicLocalDate.month) &&
        Objects.equals(this.day, wfmBuScheduleRunTopicLocalDate.day) &&
        Objects.equals(this.leapYear, wfmBuScheduleRunTopicLocalDate.leapYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, month, day, leapYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmBuScheduleRunTopicLocalDate {\n");
    
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    leapYear: ").append(toIndentedString(leapYear)).append("\n");
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

