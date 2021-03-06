package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.OutboundMessagingMessagingCampaignProgressEventUriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignProgressEventCampaignProgress
 */

public class OutboundMessagingMessagingCampaignProgressEventCampaignProgress  implements Serializable {
  
  private OutboundMessagingMessagingCampaignProgressEventUriReference campaign = null;
  private BigDecimal numberOfContactsCalled = null;
  private BigDecimal totalNumberOfContacts = null;
  private Integer percentage = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress campaign(OutboundMessagingMessagingCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("campaign")
  public OutboundMessagingMessagingCampaignProgressEventUriReference getCampaign() {
    return campaign;
  }
  public void setCampaign(OutboundMessagingMessagingCampaignProgressEventUriReference campaign) {
    this.campaign = campaign;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress numberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfContactsCalled")
  public BigDecimal getNumberOfContactsCalled() {
    return numberOfContactsCalled;
  }
  public void setNumberOfContactsCalled(BigDecimal numberOfContactsCalled) {
    this.numberOfContactsCalled = numberOfContactsCalled;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress totalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalNumberOfContacts")
  public BigDecimal getTotalNumberOfContacts() {
    return totalNumberOfContacts;
  }
  public void setTotalNumberOfContacts(BigDecimal totalNumberOfContacts) {
    this.totalNumberOfContacts = totalNumberOfContacts;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress percentage(Integer percentage) {
    this.percentage = percentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignProgressEventCampaignProgress additionalProperties(Object additionalProperties) {
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
    OutboundMessagingMessagingCampaignProgressEventCampaignProgress outboundMessagingMessagingCampaignProgressEventCampaignProgress = (OutboundMessagingMessagingCampaignProgressEventCampaignProgress) o;
    return Objects.equals(this.campaign, outboundMessagingMessagingCampaignProgressEventCampaignProgress.campaign) &&
        Objects.equals(this.numberOfContactsCalled, outboundMessagingMessagingCampaignProgressEventCampaignProgress.numberOfContactsCalled) &&
        Objects.equals(this.totalNumberOfContacts, outboundMessagingMessagingCampaignProgressEventCampaignProgress.totalNumberOfContacts) &&
        Objects.equals(this.percentage, outboundMessagingMessagingCampaignProgressEventCampaignProgress.percentage) &&
        Objects.equals(this.additionalProperties, outboundMessagingMessagingCampaignProgressEventCampaignProgress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, numberOfContactsCalled, totalNumberOfContacts, percentage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignProgressEventCampaignProgress {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    numberOfContactsCalled: ").append(toIndentedString(numberOfContactsCalled)).append("\n");
    sb.append("    totalNumberOfContacts: ").append(toIndentedString(totalNumberOfContacts)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

