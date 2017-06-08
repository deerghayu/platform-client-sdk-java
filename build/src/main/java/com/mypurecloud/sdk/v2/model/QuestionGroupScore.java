package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QuestionScore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * QuestionGroupScore
 */

public class QuestionGroupScore  implements Serializable {
  
  private String questionGroupId = null;
  private Float totalScore = null;
  private Float maxTotalScore = null;
  private Float totalCriticalScore = null;
  private Float maxTotalCriticalScore = null;
  private Float totalScoreUnweighted = null;
  private Float maxTotalScoreUnweighted = null;
  private Float totalCriticalScoreUnweighted = null;
  private Float maxTotalCriticalScoreUnweighted = null;
  private Boolean markedNA = null;
  private List<QuestionScore> questionScores = new ArrayList<QuestionScore>();

  
  /**
   **/
  public QuestionGroupScore questionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionGroupId")
  public String getQuestionGroupId() {
    return questionGroupId;
  }
  public void setQuestionGroupId(String questionGroupId) {
    this.questionGroupId = questionGroupId;
  }

  
  /**
   **/
  public QuestionGroupScore totalScore(Float totalScore) {
    this.totalScore = totalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalScore")
  public Float getTotalScore() {
    return totalScore;
  }
  public void setTotalScore(Float totalScore) {
    this.totalScore = totalScore;
  }

  
  /**
   **/
  public QuestionGroupScore maxTotalScore(Float maxTotalScore) {
    this.maxTotalScore = maxTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxTotalScore")
  public Float getMaxTotalScore() {
    return maxTotalScore;
  }
  public void setMaxTotalScore(Float maxTotalScore) {
    this.maxTotalScore = maxTotalScore;
  }

  
  /**
   **/
  public QuestionGroupScore totalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCriticalScore")
  public Float getTotalCriticalScore() {
    return totalCriticalScore;
  }
  public void setTotalCriticalScore(Float totalCriticalScore) {
    this.totalCriticalScore = totalCriticalScore;
  }

  
  /**
   **/
  public QuestionGroupScore maxTotalCriticalScore(Float maxTotalCriticalScore) {
    this.maxTotalCriticalScore = maxTotalCriticalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxTotalCriticalScore")
  public Float getMaxTotalCriticalScore() {
    return maxTotalCriticalScore;
  }
  public void setMaxTotalCriticalScore(Float maxTotalCriticalScore) {
    this.maxTotalCriticalScore = maxTotalCriticalScore;
  }

  
  /**
   **/
  public QuestionGroupScore totalScoreUnweighted(Float totalScoreUnweighted) {
    this.totalScoreUnweighted = totalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalScoreUnweighted")
  public Float getTotalScoreUnweighted() {
    return totalScoreUnweighted;
  }
  public void setTotalScoreUnweighted(Float totalScoreUnweighted) {
    this.totalScoreUnweighted = totalScoreUnweighted;
  }

  
  /**
   **/
  public QuestionGroupScore maxTotalScoreUnweighted(Float maxTotalScoreUnweighted) {
    this.maxTotalScoreUnweighted = maxTotalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxTotalScoreUnweighted")
  public Float getMaxTotalScoreUnweighted() {
    return maxTotalScoreUnweighted;
  }
  public void setMaxTotalScoreUnweighted(Float maxTotalScoreUnweighted) {
    this.maxTotalScoreUnweighted = maxTotalScoreUnweighted;
  }

  
  /**
   **/
  public QuestionGroupScore totalCriticalScoreUnweighted(Float totalCriticalScoreUnweighted) {
    this.totalCriticalScoreUnweighted = totalCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalCriticalScoreUnweighted")
  public Float getTotalCriticalScoreUnweighted() {
    return totalCriticalScoreUnweighted;
  }
  public void setTotalCriticalScoreUnweighted(Float totalCriticalScoreUnweighted) {
    this.totalCriticalScoreUnweighted = totalCriticalScoreUnweighted;
  }

  
  /**
   **/
  public QuestionGroupScore maxTotalCriticalScoreUnweighted(Float maxTotalCriticalScoreUnweighted) {
    this.maxTotalCriticalScoreUnweighted = maxTotalCriticalScoreUnweighted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxTotalCriticalScoreUnweighted")
  public Float getMaxTotalCriticalScoreUnweighted() {
    return maxTotalCriticalScoreUnweighted;
  }
  public void setMaxTotalCriticalScoreUnweighted(Float maxTotalCriticalScoreUnweighted) {
    this.maxTotalCriticalScoreUnweighted = maxTotalCriticalScoreUnweighted;
  }

  
  /**
   **/
  public QuestionGroupScore markedNA(Boolean markedNA) {
    this.markedNA = markedNA;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("markedNA")
  public Boolean getMarkedNA() {
    return markedNA;
  }
  public void setMarkedNA(Boolean markedNA) {
    this.markedNA = markedNA;
  }

  
  /**
   **/
  public QuestionGroupScore questionScores(List<QuestionScore> questionScores) {
    this.questionScores = questionScores;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("questionScores")
  public List<QuestionScore> getQuestionScores() {
    return questionScores;
  }
  public void setQuestionScores(List<QuestionScore> questionScores) {
    this.questionScores = questionScores;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionGroupScore questionGroupScore = (QuestionGroupScore) o;
    return Objects.equals(this.questionGroupId, questionGroupScore.questionGroupId) &&
        Objects.equals(this.totalScore, questionGroupScore.totalScore) &&
        Objects.equals(this.maxTotalScore, questionGroupScore.maxTotalScore) &&
        Objects.equals(this.totalCriticalScore, questionGroupScore.totalCriticalScore) &&
        Objects.equals(this.maxTotalCriticalScore, questionGroupScore.maxTotalCriticalScore) &&
        Objects.equals(this.totalScoreUnweighted, questionGroupScore.totalScoreUnweighted) &&
        Objects.equals(this.maxTotalScoreUnweighted, questionGroupScore.maxTotalScoreUnweighted) &&
        Objects.equals(this.totalCriticalScoreUnweighted, questionGroupScore.totalCriticalScoreUnweighted) &&
        Objects.equals(this.maxTotalCriticalScoreUnweighted, questionGroupScore.maxTotalCriticalScoreUnweighted) &&
        Objects.equals(this.markedNA, questionGroupScore.markedNA) &&
        Objects.equals(this.questionScores, questionGroupScore.questionScores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionGroupId, totalScore, maxTotalScore, totalCriticalScore, maxTotalCriticalScore, totalScoreUnweighted, maxTotalScoreUnweighted, totalCriticalScoreUnweighted, maxTotalCriticalScoreUnweighted, markedNA, questionScores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionGroupScore {\n");
    
    sb.append("    questionGroupId: ").append(toIndentedString(questionGroupId)).append("\n");
    sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
    sb.append("    maxTotalScore: ").append(toIndentedString(maxTotalScore)).append("\n");
    sb.append("    totalCriticalScore: ").append(toIndentedString(totalCriticalScore)).append("\n");
    sb.append("    maxTotalCriticalScore: ").append(toIndentedString(maxTotalCriticalScore)).append("\n");
    sb.append("    totalScoreUnweighted: ").append(toIndentedString(totalScoreUnweighted)).append("\n");
    sb.append("    maxTotalScoreUnweighted: ").append(toIndentedString(maxTotalScoreUnweighted)).append("\n");
    sb.append("    totalCriticalScoreUnweighted: ").append(toIndentedString(totalCriticalScoreUnweighted)).append("\n");
    sb.append("    maxTotalCriticalScoreUnweighted: ").append(toIndentedString(maxTotalCriticalScoreUnweighted)).append("\n");
    sb.append("    markedNA: ").append(toIndentedString(markedNA)).append("\n");
    sb.append("    questionScores: ").append(toIndentedString(questionScores)).append("\n");
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

