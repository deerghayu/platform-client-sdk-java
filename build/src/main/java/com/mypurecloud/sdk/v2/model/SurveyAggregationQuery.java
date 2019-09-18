package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.SurveyAggregateQueryFilter;
import com.mypurecloud.sdk.v2.model.SurveyAggregationView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyAggregationQuery
 */

public class SurveyAggregationQuery  implements Serializable {
  
  private String interval = null;
  private String granularity = null;
  private String timeZone = null;

  /**
   * Gets or Sets groupBy
   */
  public enum GroupByEnum {
    CONVERSATIONID("conversationId"),
    DIVISIONID("divisionId"),
    EXTERNALCONTACTID("externalContactId"),
    MEDIATYPE("mediaType"),
    QUEUEID("queueId"),
    REQUESTEDLANGUAGEID("requestedLanguageId"),
    REQUESTEDROUTINGSKILLID("requestedRoutingSkillId"),
    SURVEYANSWERID("surveyAnswerId"),
    SURVEYCREATEDDATE("surveyCreatedDate"),
    SURVEYERRORREASON("surveyErrorReason"),
    SURVEYFORMCONTEXTID("surveyFormContextId"),
    SURVEYFORMID("surveyFormId"),
    SURVEYFORMNAME("surveyFormName"),
    SURVEYID("surveyId"),
    SURVEYPREVIOUSSTATUS("surveyPreviousStatus"),
    SURVEYPROMOTERSCORE("surveyPromoterScore"),
    SURVEYQUESTIONGROUPID("surveyQuestionGroupId"),
    SURVEYQUESTIONID("surveyQuestionId"),
    SURVEYSTATUS("surveyStatus"),
    USERID("userId"),
    WRAPUPCODE("wrapUpCode");

    private String value;

    GroupByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupByEnum fromString(String key) {
      if (key == null) return null;

      for (GroupByEnum value : GroupByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<GroupByEnum> groupBy = new ArrayList<GroupByEnum>();
  private SurveyAggregateQueryFilter filter = null;

  /**
   * Gets or Sets metrics
   */
  public enum MetricsEnum {
    NSURVEYERRORS("nSurveyErrors"),
    NSURVEYNPSDETRACTORS("nSurveyNpsDetractors"),
    NSURVEYNPSPROMOTERS("nSurveyNpsPromoters"),
    NSURVEYNPSRESPONSES("nSurveyNpsResponses"),
    NSURVEYQUESTIONGROUPRESPONSES("nSurveyQuestionGroupResponses"),
    NSURVEYQUESTIONRESPONSES("nSurveyQuestionResponses"),
    NSURVEYRESPONSES("nSurveyResponses"),
    NSURVEYSABANDONED("nSurveysAbandoned"),
    NSURVEYSDELETED("nSurveysDeleted"),
    NSURVEYSEXPIRED("nSurveysExpired"),
    NSURVEYSSENT("nSurveysSent"),
    NSURVEYSSTARTED("nSurveysStarted"),
    OSURVEYQUESTIONGROUPSCORE("oSurveyQuestionGroupScore"),
    OSURVEYQUESTIONSCORE("oSurveyQuestionScore"),
    OSURVEYTOTALSCORE("oSurveyTotalScore");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();
  private Boolean flattenMultivaluedDimensions = null;
  private List<SurveyAggregationView> views = new ArrayList<SurveyAggregationView>();

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public SurveyAggregationQuery interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H
   **/
  public SurveyAggregationQuery granularity(String granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Granularity aggregates metrics into subpartitions within the time interval specified. The default granularity is the same duration as the interval. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H")
  @JsonProperty("granularity")
  public String getGranularity() {
    return granularity;
  }
  public void setGranularity(String granularity) {
    this.granularity = granularity;
  }

  
  /**
   * Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public SurveyAggregationQuery timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets the time zone for the query interval, defaults to UTC. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("timeZone")
  public String getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  
  /**
   * Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.
   **/
  public SurveyAggregationQuery groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL GROUPBY. Allows for multiple levels of grouping as a list of dimensions. Partitions resulting aggregate computations into distinct named subgroups rather than across the entire result set as if it were one group.")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }

  
  /**
   * Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters
   **/
  public SurveyAggregationQuery filter(SurveyAggregateQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE clause. This is ANDed with the interval parameter. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public SurveyAggregateQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(SurveyAggregateQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).
   **/
  public SurveyAggregationQuery metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  
  /**
   * Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')
   **/
  public SurveyAggregationQuery flattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flattens any multivalued dimensions used in response groups (e.g. ['a','b','c']->'a,b,c')")
  @JsonProperty("flattenMultivaluedDimensions")
  public Boolean getFlattenMultivaluedDimensions() {
    return flattenMultivaluedDimensions;
  }
  public void setFlattenMultivaluedDimensions(Boolean flattenMultivaluedDimensions) {
    this.flattenMultivaluedDimensions = flattenMultivaluedDimensions;
  }

  
  /**
   * Custom derived metric views
   **/
  public SurveyAggregationQuery views(List<SurveyAggregationView> views) {
    this.views = views;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom derived metric views")
  @JsonProperty("views")
  public List<SurveyAggregationView> getViews() {
    return views;
  }
  public void setViews(List<SurveyAggregationView> views) {
    this.views = views;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyAggregationQuery surveyAggregationQuery = (SurveyAggregationQuery) o;
    return Objects.equals(this.interval, surveyAggregationQuery.interval) &&
        Objects.equals(this.granularity, surveyAggregationQuery.granularity) &&
        Objects.equals(this.timeZone, surveyAggregationQuery.timeZone) &&
        Objects.equals(this.groupBy, surveyAggregationQuery.groupBy) &&
        Objects.equals(this.filter, surveyAggregationQuery.filter) &&
        Objects.equals(this.metrics, surveyAggregationQuery.metrics) &&
        Objects.equals(this.flattenMultivaluedDimensions, surveyAggregationQuery.flattenMultivaluedDimensions) &&
        Objects.equals(this.views, surveyAggregationQuery.views);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, timeZone, groupBy, filter, metrics, flattenMultivaluedDimensions, views);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyAggregationQuery {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    flattenMultivaluedDimensions: ").append(toIndentedString(flattenMultivaluedDimensions)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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

