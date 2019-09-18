package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ObservationMetricData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * QueueObservationDataContainer
 */

public class QueueObservationDataContainer  implements Serializable {
  
  private Map<String, String> group = null;
  private List<ObservationMetricData> data = new ArrayList<ObservationMetricData>();

  
  /**
   * A mapping from dimension to value
   **/
  public QueueObservationDataContainer group(Map<String, String> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A mapping from dimension to value")
  @JsonProperty("group")
  public Map<String, String> getGroup() {
    return group;
  }
  public void setGroup(Map<String, String> group) {
    this.group = group;
  }

  
  /**
   **/
  public QueueObservationDataContainer data(List<ObservationMetricData> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<ObservationMetricData> getData() {
    return data;
  }
  public void setData(List<ObservationMetricData> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueObservationDataContainer queueObservationDataContainer = (QueueObservationDataContainer) o;
    return Objects.equals(this.group, queueObservationDataContainer.group) &&
        Objects.equals(this.data, queueObservationDataContainer.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueObservationDataContainer {\n");
    
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

