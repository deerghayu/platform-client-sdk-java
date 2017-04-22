package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;


import com.mypurecloud.sdk.v2.api.request.DeleteQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityKeywordsetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityAgentsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluationsQueryRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityEvaluatorsActivityRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormVersionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityKeywordsetRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformRequest;
import com.mypurecloud.sdk.v2.api.request.GetQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAnalyticsEvaluationsAggregatesQueryRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityCalibrationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityConversationEvaluationsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityEvaluationsScoringRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityFormsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityKeywordsetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualityPublishedformsRequest;
import com.mypurecloud.sdk.v2.api.request.PostQualitySpotabilityRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityCalibrationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityConversationEvaluationRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityFormRequest;
import com.mypurecloud.sdk.v2.api.request.PutQualityKeywordsetRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class QualityApi {
  private final ApiClient pcapiClient;

  public QualityApi() {
    this(Configuration.getDefaultApiClient());
  }

  public QualityApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration deleteQualityCalibration(String calibrationId, String calibratorId) throws IOException, ApiException {
    return  deleteQualityCalibration(createDeleteQualityCalibrationRequest(calibrationId, calibratorId));
  }

  /**
   * Delete a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> deleteQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId) throws IOException {
    return deleteQualityCalibration(createDeleteQualityCalibrationRequest(calibrationId, calibratorId).withHttpInfo());
  }

  private DeleteQualityCalibrationRequest createDeleteQualityCalibrationRequest(String calibrationId, String calibratorId) {
    return DeleteQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)

            .withCalibratorId(calibratorId)
            .build();
  }

  /**
   * Delete a calibration by id.
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration deleteQualityCalibration(DeleteQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a calibration by id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> deleteQualityCalibration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation deleteQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws IOException, ApiException {
    return  deleteQualityConversationEvaluation(createDeleteQualityConversationEvaluationRequest(conversationId, evaluationId, expand));
  }

  /**
   * Delete an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws IOException {
    return deleteQualityConversationEvaluation(createDeleteQualityConversationEvaluationRequest(conversationId, evaluationId, expand).withHttpInfo());
  }

  private DeleteQualityConversationEvaluationRequest createDeleteQualityConversationEvaluationRequest(String conversationId, String evaluationId, String expand) {
    return DeleteQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)

            .withEvaluationId(evaluationId)

            .withExpand(expand)
            .build();
  }

  /**
   * Delete an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation deleteQualityConversationEvaluation(DeleteQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> deleteQualityConversationEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityForm(String formId) throws IOException, ApiException {
     deleteQualityForm(createDeleteQualityFormRequest(formId));
  }

  /**
   * Delete an evaluation form.
   * 
   * @param formId Form ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityFormWithHttpInfo(String formId) throws IOException {
    return deleteQualityForm(createDeleteQualityFormRequest(formId).withHttpInfo());
  }

  private DeleteQualityFormRequest createDeleteQualityFormRequest(String formId) {
    return DeleteQualityFormRequest.builder()
            .withFormId(formId)
            .build();
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityForm(DeleteQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityForm(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityKeywordset(String keywordSetId) throws IOException, ApiException {
     deleteQualityKeywordset(createDeleteQualityKeywordsetRequest(keywordSetId));
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityKeywordsetWithHttpInfo(String keywordSetId) throws IOException {
    return deleteQualityKeywordset(createDeleteQualityKeywordsetRequest(keywordSetId).withHttpInfo());
  }

  private DeleteQualityKeywordsetRequest createDeleteQualityKeywordsetRequest(String keywordSetId) {
    return DeleteQualityKeywordsetRequest.builder()
            .withKeywordSetId(keywordSetId)
            .build();
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityKeywordset(DeleteQualityKeywordsetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a keywordSet by id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityKeywordset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param ids A comma-delimited list of valid KeywordSet ids (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityKeywordsets(String ids) throws IOException, ApiException {
     deleteQualityKeywordsets(createDeleteQualityKeywordsetsRequest(ids));
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param ids A comma-delimited list of valid KeywordSet ids (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityKeywordsetsWithHttpInfo(String ids) throws IOException {
    return deleteQualityKeywordsets(createDeleteQualityKeywordsetsRequest(ids).withHttpInfo());
  }

  private DeleteQualityKeywordsetsRequest createDeleteQualityKeywordsetsRequest(String ids) {
    return DeleteQualityKeywordsetsRequest.builder()
            .withIds(ids)
            .build();
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteQualityKeywordsets(DeleteQualityKeywordsetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete keyword sets
   * Bulk delete of keyword sets; this will only delete the keyword sets that match the ids specified in the query param.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteQualityKeywordsets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentActivityEntityListing getQualityAgentsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<Object> agentUserId, String evaluatorUserId, String name, String group) throws IOException, ApiException {
    return  getQualityAgentsActivity(createGetQualityAgentsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group));
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime Start time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime End time of agent activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param agentUserId user id of agent requested (optional)
   * @param evaluatorUserId user id of the evaluator (optional)
   * @param name name (optional)
   * @param group group id (optional)
   * @return AgentActivityEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<Object> agentUserId, String evaluatorUserId, String name, String group) throws IOException {
    return getQualityAgentsActivity(createGetQualityAgentsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, agentUserId, evaluatorUserId, name, group).withHttpInfo());
  }

  private GetQualityAgentsActivityRequest createGetQualityAgentsActivityRequest(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, List<Object> agentUserId, String evaluatorUserId, String name, String group) {
    return GetQualityAgentsActivityRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withStartTime(startTime)

            .withEndTime(endTime)

            .withAgentUserId(agentUserId)

            .withEvaluatorUserId(evaluatorUserId)

            .withName(name)

            .withGroup(group)
            .build();
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param request The request object
   * @return AgentActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AgentActivityEntityListing getQualityAgentsActivity(GetQualityAgentsActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AgentActivityEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AgentActivityEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets a list of Agent Activities
   * Including the number of evaluations and average evaluation score
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AgentActivityEntityListing> getQualityAgentsActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AgentActivityEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AgentActivityEntityListing> response = (ApiResponse<AgentActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration getQualityCalibration(String calibrationId, String calibratorId) throws IOException, ApiException {
    return  getQualityCalibration(createGetQualityCalibrationRequest(calibrationId, calibratorId));
  }

  /**
   * Get a calibration by id.
   * 
   * @param calibrationId Calibration ID (required)
   * @param calibratorId calibratorId (required)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> getQualityCalibrationWithHttpInfo(String calibrationId, String calibratorId) throws IOException {
    return getQualityCalibration(createGetQualityCalibrationRequest(calibrationId, calibratorId).withHttpInfo());
  }

  private GetQualityCalibrationRequest createGetQualityCalibrationRequest(String calibrationId, String calibratorId) {
    return GetQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)

            .withCalibratorId(calibratorId)
            .build();
  }

  /**
   * Get a calibration by id.
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration getQualityCalibration(GetQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a calibration by id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> getQualityCalibration(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of calibrations
   * 
   * @param calibratorId user id of calibrator (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversation id (optional)
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @return CalibrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalibrationEntityListing getQualityCalibrations(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws IOException, ApiException {
    return  getQualityCalibrations(createGetQualityCalibrationsRequest(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime));
  }

  /**
   * Get the list of calibrations
   * 
   * @param calibratorId user id of calibrator (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversation id (optional)
   * @param startTime Beginning of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime end of the calibration query. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @return CalibrationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrationsWithHttpInfo(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) throws IOException {
    return getQualityCalibrations(createGetQualityCalibrationsRequest(calibratorId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, startTime, endTime).withHttpInfo());
  }

  private GetQualityCalibrationsRequest createGetQualityCalibrationsRequest(String calibratorId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, Date startTime, Date endTime) {
    return GetQualityCalibrationsRequest.builder()
            .withCalibratorId(calibratorId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withConversationId(conversationId)

            .withStartTime(startTime)

            .withEndTime(endTime)
            .build();
  }

  /**
   * Get the list of calibrations
   * 
   * @param request The request object
   * @return CalibrationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CalibrationEntityListing getQualityCalibrations(GetQualityCalibrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CalibrationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CalibrationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of calibrations
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CalibrationEntityListing> getQualityCalibrations(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CalibrationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<CalibrationEntityListing> response = (ApiResponse<CalibrationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param conversationId Conversation ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param recordingId id of the recording (optional)
   * @param entityType entity type options: Recording, Calibration, Evaluation, Annotation, Screen_Recording (optional, default to RECORDING)
   * @return QualityAuditPage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditPage getQualityConversationAudits(String conversationId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String recordingId, String entityType) throws IOException, ApiException {
    return  getQualityConversationAudits(createGetQualityConversationAuditsRequest(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType));
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param conversationId Conversation ID (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param recordingId id of the recording (optional)
   * @param entityType entity type options: Recording, Calibration, Evaluation, Annotation, Screen_Recording (optional, default to RECORDING)
   * @return QualityAuditPage
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditPage> getQualityConversationAuditsWithHttpInfo(String conversationId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String recordingId, String entityType) throws IOException {
    return getQualityConversationAudits(createGetQualityConversationAuditsRequest(conversationId, pageSize, pageNumber, sortBy, expand, nextPage, previousPage, recordingId, entityType).withHttpInfo());
  }

  private GetQualityConversationAuditsRequest createGetQualityConversationAuditsRequest(String conversationId, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String recordingId, String entityType) {
    return GetQualityConversationAuditsRequest.builder()
            .withConversationId(conversationId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withRecordingId(recordingId)

            .withEntityType(entityType)
            .build();
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param request The request object
   * @return QualityAuditPage
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public QualityAuditPage getQualityConversationAudits(GetQualityConversationAuditsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<QualityAuditPage> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<QualityAuditPage>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get audits for conversation or recording
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<QualityAuditPage> getQualityConversationAudits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<QualityAuditPage>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<QualityAuditPage> response = (ApiResponse<QualityAuditPage>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<QualityAuditPage> response = (ApiResponse<QualityAuditPage>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation getQualityConversationEvaluation(String conversationId, String evaluationId, String expand) throws IOException, ApiException {
    return  getQualityConversationEvaluation(createGetQualityConversationEvaluationRequest(conversationId, evaluationId, expand));
  }

  /**
   * Get an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param expand agent, evaluator, evaluationForm (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, String expand) throws IOException {
    return getQualityConversationEvaluation(createGetQualityConversationEvaluationRequest(conversationId, evaluationId, expand).withHttpInfo());
  }

  private GetQualityConversationEvaluationRequest createGetQualityConversationEvaluationRequest(String conversationId, String evaluationId, String expand) {
    return GetQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)

            .withEvaluationId(evaluationId)

            .withExpand(expand)
            .build();
  }

  /**
   * Get an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation getQualityConversationEvaluation(GetQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> getQualityConversationEvaluation(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversationId specified (optional)
   * @param agentUserId user id of the agent (optional)
   * @param evaluatorUserId evaluator user id (optional)
   * @param queueId queue id (optional)
   * @param startTime start time of the evaluation query (optional)
   * @param endTime end time of the evaluation query (optional)
   * @param evaluationState evaluation state options: Pending, InProgress, Finished (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @return EvaluationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<Object> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum) throws IOException, ApiException {
    return  getQualityEvaluationsQuery(createGetQualityEvaluationsQueryRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum));
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param conversationId conversationId specified (optional)
   * @param agentUserId user id of the agent (optional)
   * @param evaluatorUserId evaluator user id (optional)
   * @param queueId queue id (optional)
   * @param startTime start time of the evaluation query (optional)
   * @param endTime end time of the evaluation query (optional)
   * @param evaluationState evaluation state options: Pending, InProgress, Finished (optional)
   * @param isReleased the evaluation has been released (optional)
   * @param agentHasRead agent has the evaluation (optional)
   * @param expandAnswerTotalScores get the total scores for evaluations (optional)
   * @param maximum maximum (optional)
   * @return EvaluationEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQueryWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<Object> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum) throws IOException {
    return getQualityEvaluationsQuery(createGetQualityEvaluationsQueryRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, conversationId, agentUserId, evaluatorUserId, queueId, startTime, endTime, evaluationState, isReleased, agentHasRead, expandAnswerTotalScores, maximum).withHttpInfo());
  }

  private GetQualityEvaluationsQueryRequest createGetQualityEvaluationsQueryRequest(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String conversationId, String agentUserId, String evaluatorUserId, String queueId, String startTime, String endTime, List<Object> evaluationState, Boolean isReleased, Boolean agentHasRead, Boolean expandAnswerTotalScores, Integer maximum) {
    return GetQualityEvaluationsQueryRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withConversationId(conversationId)

            .withAgentUserId(agentUserId)

            .withEvaluatorUserId(evaluatorUserId)

            .withQueueId(queueId)

            .withStartTime(startTime)

            .withEndTime(endTime)

            .withEvaluationState(evaluationState)

            .withIsReleased(isReleased)

            .withAgentHasRead(agentHasRead)

            .withExpandAnswerTotalScores(expandAnswerTotalScores)

            .withMaximum(maximum)
            .build();
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @param request The request object
   * @return EvaluationEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationEntityListing getQualityEvaluationsQuery(GetQualityEvaluationsQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Queries Evaluations and returns a paged list
   * Query params must include one of conversationId, evaluatorUserId, or agentUserId
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationEntityListing> getQualityEvaluationsQuery(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationEntityListing> response = (ApiResponse<EvaluationEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an evaluator activity
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<Object> permission, String group) throws IOException, ApiException {
    return  getQualityEvaluatorsActivity(createGetQualityEvaluatorsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group));
  }

  /**
   * Get an evaluator activity
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param startTime The start time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param endTime The end time specified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ (optional)
   * @param name Evaluator name (optional)
   * @param permission permission strings (optional)
   * @param group group id (optional)
   * @return EvaluatorActivityEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivityWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<Object> permission, String group) throws IOException {
    return getQualityEvaluatorsActivity(createGetQualityEvaluatorsActivityRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, startTime, endTime, name, permission, group).withHttpInfo());
  }

  private GetQualityEvaluatorsActivityRequest createGetQualityEvaluatorsActivityRequest(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, Date startTime, Date endTime, String name, List<Object> permission, String group) {
    return GetQualityEvaluatorsActivityRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withStartTime(startTime)

            .withEndTime(endTime)

            .withName(name)

            .withPermission(permission)

            .withGroup(group)
            .build();
  }

  /**
   * Get an evaluator activity
   * 
   * @param request The request object
   * @return EvaluatorActivityEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluatorActivityEntityListing getQualityEvaluatorsActivity(GetQualityEvaluatorsActivityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluatorActivityEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluatorActivityEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluator activity
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluatorActivityEntityListing> getQualityEvaluatorsActivity(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluatorActivityEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluatorActivityEntityListing> response = (ApiResponse<EvaluatorActivityEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityForm(String formId) throws IOException, ApiException {
    return  getQualityForm(createGetQualityFormRequest(formId));
  }

  /**
   * Get an evaluation form
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityFormWithHttpInfo(String formId) throws IOException {
    return getQualityForm(createGetQualityFormRequest(formId).withHttpInfo());
  }

  private GetQualityFormRequest createGetQualityFormRequest(String formId) {
    return GetQualityFormRequest.builder()
            .withFormId(formId)
            .build();
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityForm(GetQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get an evaluation form
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityForm(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormVersions(String formId, Integer pageSize, Integer pageNumber) throws IOException, ApiException {
    return  getQualityFormVersions(createGetQualityFormVersionsRequest(formId, pageSize, pageNumber));
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param formId Form ID (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersionsWithHttpInfo(String formId, Integer pageSize, Integer pageNumber) throws IOException {
    return getQualityFormVersions(createGetQualityFormVersionsRequest(formId, pageSize, pageNumber).withHttpInfo());
  }

  private GetQualityFormVersionsRequest createGetQualityFormVersionsRequest(String formId, Integer pageSize, Integer pageNumber) {
    return GetQualityFormVersionsRequest.builder()
            .withFormId(formId)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)
            .build();
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityFormVersions(GetQualityFormVersionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Gets all the revisions for a specific evaluation.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormVersions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityForms(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name) throws IOException, ApiException {
    return  getQualityForms(createGetQualityFormsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name));
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param expand Expand (optional)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityFormsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name) throws IOException {
    return getQualityForms(createGetQualityFormsRequest(pageSize, pageNumber, sortBy, nextPage, previousPage, expand, name).withHttpInfo());
  }

  private GetQualityFormsRequest createGetQualityFormsRequest(Integer pageSize, Integer pageNumber, String sortBy, String nextPage, String previousPage, String expand, String name) {
    return GetQualityFormsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withExpand(expand)

            .withName(name)
            .build();
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityForms(GetQualityFormsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of evaluation forms
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityForms(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet getQualityKeywordset(String keywordSetId) throws IOException, ApiException {
    return  getQualityKeywordset(createGetQualityKeywordsetRequest(keywordSetId));
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @return KeywordSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> getQualityKeywordsetWithHttpInfo(String keywordSetId) throws IOException {
    return getQualityKeywordset(createGetQualityKeywordsetRequest(keywordSetId).withHttpInfo());
  }

  private GetQualityKeywordsetRequest createGetQualityKeywordsetRequest(String keywordSetId) {
    return GetQualityKeywordsetRequest.builder()
            .withKeywordSetId(keywordSetId)
            .build();
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param request The request object
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet getQualityKeywordset(GetQualityKeywordsetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeywordSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a keywordSet by id.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> getQualityKeywordset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeywordSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the list of keyword sets
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the keyword set name - used for filtering results in searches. (optional)
   * @param queueId the queue id - used for filtering results in searches. (optional)
   * @param agentId the agent id - used for filtering results in searches. (optional)
   * @param operator If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters. (optional)
   * @return KeywordSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSetEntityListing getQualityKeywordsets(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, String queueId, String agentId, String operator) throws IOException, ApiException {
    return  getQualityKeywordsets(createGetQualityKeywordsetsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, queueId, agentId, operator));
  }

  /**
   * Get the list of keyword sets
   * 
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @param name the keyword set name - used for filtering results in searches. (optional)
   * @param queueId the queue id - used for filtering results in searches. (optional)
   * @param agentId the agent id - used for filtering results in searches. (optional)
   * @param operator If agentID and queueId are both present, this determines whether the query is an AND or OR between those parameters. (optional)
   * @return KeywordSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSetEntityListing> getQualityKeywordsetsWithHttpInfo(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, String queueId, String agentId, String operator) throws IOException {
    return getQualityKeywordsets(createGetQualityKeywordsetsRequest(pageSize, pageNumber, sortBy, expand, nextPage, previousPage, name, queueId, agentId, operator).withHttpInfo());
  }

  private GetQualityKeywordsetsRequest createGetQualityKeywordsetsRequest(Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage, String name, String queueId, String agentId, String operator) {
    return GetQualityKeywordsetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withExpand(expand)

            .withNextPage(nextPage)

            .withPreviousPage(previousPage)

            .withName(name)

            .withQueueId(queueId)

            .withAgentId(agentId)

            .withOperator(operator)
            .build();
  }

  /**
   * Get the list of keyword sets
   * 
   * @param request The request object
   * @return KeywordSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSetEntityListing getQualityKeywordsets(GetQualityKeywordsetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeywordSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeywordSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the list of keyword sets
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSetEntityListing> getQualityKeywordsets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeywordSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSetEntityListing> response = (ApiResponse<KeywordSetEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSetEntityListing> response = (ApiResponse<KeywordSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedform(String formId) throws IOException, ApiException {
    return  getQualityPublishedform(createGetQualityPublishedformRequest(formId));
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param formId Form ID (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedformWithHttpInfo(String formId) throws IOException {
    return getQualityPublishedform(createGetQualityPublishedformRequest(formId).withHttpInfo());
  }

  private GetQualityPublishedformRequest createGetQualityPublishedformRequest(String formId) {
    return GetQualityPublishedformRequest.builder()
            .withFormId(formId)
            .build();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm getQualityPublishedform(GetQualityPublishedformRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> getQualityPublishedform(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedforms(Integer pageSize, Integer pageNumber, String name) throws IOException, ApiException {
    return  getQualityPublishedforms(createGetQualityPublishedformsRequest(pageSize, pageNumber, name));
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param name Name (optional)
   * @return EvaluationFormEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedformsWithHttpInfo(Integer pageSize, Integer pageNumber, String name) throws IOException {
    return getQualityPublishedforms(createGetQualityPublishedformsRequest(pageSize, pageNumber, name).withHttpInfo());
  }

  private GetQualityPublishedformsRequest createGetQualityPublishedformsRequest(Integer pageSize, Integer pageNumber, String name) {
    return GetQualityPublishedformsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withName(name)
            .build();
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return EvaluationFormEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationFormEntityListing getQualityPublishedforms(GetQualityPublishedformsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationFormEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationFormEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the published evaluation forms.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationFormEntityListing> getQualityPublishedforms(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationFormEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationFormEntityListing> response = (ApiResponse<EvaluationFormEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(AggregationQuery body) throws IOException, ApiException {
    return  postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body));
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param body query (required)
   * @return AggregateQueryResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQueryWithHttpInfo(AggregationQuery body) throws IOException {
    return postAnalyticsEvaluationsAggregatesQuery(createPostAnalyticsEvaluationsAggregatesQueryRequest(body).withHttpInfo());
  }

  private PostAnalyticsEvaluationsAggregatesQueryRequest createPostAnalyticsEvaluationsAggregatesQueryRequest(AggregationQuery body) {
    return PostAnalyticsEvaluationsAggregatesQueryRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return AggregateQueryResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AggregateQueryResponse postAnalyticsEvaluationsAggregatesQuery(PostAnalyticsEvaluationsAggregatesQueryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AggregateQueryResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AggregateQueryResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for evaluation aggregates
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AggregateQueryResponse> postAnalyticsEvaluationsAggregatesQuery(ApiRequest<AggregationQuery> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AggregateQueryResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<AggregateQueryResponse> response = (ApiResponse<AggregateQueryResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration postQualityCalibrations(CalibrationCreate body, String expand) throws IOException, ApiException {
    return  postQualityCalibrations(createPostQualityCalibrationsRequest(body, expand));
  }

  /**
   * Create a calibration
   * 
   * @param body calibration (required)
   * @param expand calibratorId (optional)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> postQualityCalibrationsWithHttpInfo(CalibrationCreate body, String expand) throws IOException {
    return postQualityCalibrations(createPostQualityCalibrationsRequest(body, expand).withHttpInfo());
  }

  private PostQualityCalibrationsRequest createPostQualityCalibrationsRequest(CalibrationCreate body, String expand) {
    return PostQualityCalibrationsRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create a calibration
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration postQualityCalibrations(PostQualityCalibrationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a calibration
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> postQualityCalibrations(ApiRequest<CalibrationCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation postQualityConversationEvaluations(String conversationId, Evaluation body, String expand) throws IOException, ApiException {
    return  postQualityConversationEvaluations(createPostQualityConversationEvaluationsRequest(conversationId, body, expand));
  }

  /**
   * Create an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluationsWithHttpInfo(String conversationId, Evaluation body, String expand) throws IOException {
    return postQualityConversationEvaluations(createPostQualityConversationEvaluationsRequest(conversationId, body, expand).withHttpInfo());
  }

  private PostQualityConversationEvaluationsRequest createPostQualityConversationEvaluationsRequest(String conversationId, Evaluation body, String expand) {
    return PostQualityConversationEvaluationsRequest.builder()
            .withConversationId(conversationId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation postQualityConversationEvaluations(PostQualityConversationEvaluationsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> postQualityConversationEvaluations(ApiRequest<Evaluation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(EvaluationFormAndScoringSet body) throws IOException, ApiException {
    return  postQualityEvaluationsScoring(createPostQualityEvaluationsScoringRequest(body));
  }

  /**
   * Score evaluation
   * 
   * @param body evaluationAndScoringSet (required)
   * @return EvaluationScoringSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoringWithHttpInfo(EvaluationFormAndScoringSet body) throws IOException {
    return postQualityEvaluationsScoring(createPostQualityEvaluationsScoringRequest(body).withHttpInfo());
  }

  private PostQualityEvaluationsScoringRequest createPostQualityEvaluationsScoringRequest(EvaluationFormAndScoringSet body) {
    return PostQualityEvaluationsScoringRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Score evaluation
   * 
   * @param request The request object
   * @return EvaluationScoringSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationScoringSet postQualityEvaluationsScoring(PostQualityEvaluationsScoringRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationScoringSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationScoringSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Score evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationScoringSet> postQualityEvaluationsScoring(ApiRequest<EvaluationFormAndScoringSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationScoringSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationScoringSet> response = (ApiResponse<EvaluationScoringSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityForms(EvaluationForm body) throws IOException, ApiException {
    return  postQualityForms(createPostQualityFormsRequest(body));
  }

  /**
   * Create an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityFormsWithHttpInfo(EvaluationForm body) throws IOException {
    return postQualityForms(createPostQualityFormsRequest(body).withHttpInfo());
  }

  private PostQualityFormsRequest createPostQualityFormsRequest(EvaluationForm body) {
    return PostQualityFormsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityForms(PostQualityFormsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityForms(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Keyword Set
   * 
   * @param body keywordSet (required)
   * @param expand queueId (optional)
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet postQualityKeywordsets(KeywordSet body, String expand) throws IOException, ApiException {
    return  postQualityKeywordsets(createPostQualityKeywordsetsRequest(body, expand));
  }

  /**
   * Create a Keyword Set
   * 
   * @param body keywordSet (required)
   * @param expand queueId (optional)
   * @return KeywordSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> postQualityKeywordsetsWithHttpInfo(KeywordSet body, String expand) throws IOException {
    return postQualityKeywordsets(createPostQualityKeywordsetsRequest(body, expand).withHttpInfo());
  }

  private PostQualityKeywordsetsRequest createPostQualityKeywordsetsRequest(KeywordSet body, String expand) {
    return PostQualityKeywordsetsRequest.builder()
            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Create a Keyword Set
   * 
   * @param request The request object
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet postQualityKeywordsets(PostQualityKeywordsetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeywordSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Keyword Set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> postQualityKeywordsets(ApiRequest<KeywordSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeywordSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedforms(EvaluationForm body) throws IOException, ApiException {
    return  postQualityPublishedforms(createPostQualityPublishedformsRequest(body));
  }

  /**
   * Publish an evaluation form.
   * 
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedformsWithHttpInfo(EvaluationForm body) throws IOException {
    return postQualityPublishedforms(createPostQualityPublishedformsRequest(body).withHttpInfo());
  }

  private PostQualityPublishedformsRequest createPostQualityPublishedformsRequest(EvaluationForm body) {
    return PostQualityPublishedformsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm postQualityPublishedforms(PostQualityPublishedformsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Publish an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> postQualityPublishedforms(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param body Keyword Set (optional)
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet postQualitySpotability(KeywordSet body) throws IOException, ApiException {
    return  postQualitySpotability(createPostQualitySpotabilityRequest(body));
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param body Keyword Set (optional)
   * @return KeywordSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> postQualitySpotabilityWithHttpInfo(KeywordSet body) throws IOException {
    return postQualitySpotability(createPostQualitySpotabilityRequest(body).withHttpInfo());
  }

  private PostQualitySpotabilityRequest createPostQualitySpotabilityRequest(KeywordSet body) {
    return PostQualitySpotabilityRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param request The request object
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet postQualitySpotability(PostQualitySpotabilityRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeywordSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieve the spotability statistic
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> postQualitySpotability(ApiRequest<KeywordSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeywordSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration putQualityCalibration(String calibrationId, Calibration body) throws IOException, ApiException {
    return  putQualityCalibration(createPutQualityCalibrationRequest(calibrationId, body));
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param calibrationId Calibration ID (required)
   * @param body Calibration (required)
   * @return Calibration
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> putQualityCalibrationWithHttpInfo(String calibrationId, Calibration body) throws IOException {
    return putQualityCalibration(createPutQualityCalibrationRequest(calibrationId, body).withHttpInfo());
  }

  private PutQualityCalibrationRequest createPutQualityCalibrationRequest(String calibrationId, Calibration body) {
    return PutQualityCalibrationRequest.builder()
            .withCalibrationId(calibrationId)

            .withBody(body)
            .build();
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request The request object
   * @return Calibration
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Calibration putQualityCalibration(PutQualityCalibrationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Calibration> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Calibration>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a calibration to the specified calibration via PUT.  Editable fields include: evaluators, expertEvaluator, and scoringIndex
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Calibration> putQualityCalibration(ApiRequest<Calibration> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Calibration>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Calibration> response = (ApiResponse<Calibration>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation putQualityConversationEvaluation(String conversationId, String evaluationId, Evaluation body, String expand) throws IOException, ApiException {
    return  putQualityConversationEvaluation(createPutQualityConversationEvaluationRequest(conversationId, evaluationId, body, expand));
  }

  /**
   * Update an evaluation
   * 
   * @param conversationId conversationId (required)
   * @param evaluationId evaluationId (required)
   * @param body evaluation (required)
   * @param expand evaluatorId (optional)
   * @return Evaluation
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluationWithHttpInfo(String conversationId, String evaluationId, Evaluation body, String expand) throws IOException {
    return putQualityConversationEvaluation(createPutQualityConversationEvaluationRequest(conversationId, evaluationId, body, expand).withHttpInfo());
  }

  private PutQualityConversationEvaluationRequest createPutQualityConversationEvaluationRequest(String conversationId, String evaluationId, Evaluation body, String expand) {
    return PutQualityConversationEvaluationRequest.builder()
            .withConversationId(conversationId)

            .withEvaluationId(evaluationId)

            .withBody(body)

            .withExpand(expand)
            .build();
  }

  /**
   * Update an evaluation
   * 
   * @param request The request object
   * @return Evaluation
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Evaluation putQualityConversationEvaluation(PutQualityConversationEvaluationRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Evaluation> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Evaluation>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an evaluation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Evaluation> putQualityConversationEvaluation(ApiRequest<Evaluation> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Evaluation>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<Evaluation> response = (ApiResponse<Evaluation>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityForm(String formId, EvaluationForm body) throws IOException, ApiException {
    return  putQualityForm(createPutQualityFormRequest(formId, body));
  }

  /**
   * Update an evaluation form.
   * 
   * @param formId Form ID (required)
   * @param body Evaluation form (required)
   * @return EvaluationForm
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityFormWithHttpInfo(String formId, EvaluationForm body) throws IOException {
    return putQualityForm(createPutQualityFormRequest(formId, body).withHttpInfo());
  }

  private PutQualityFormRequest createPutQualityFormRequest(String formId, EvaluationForm body) {
    return PutQualityFormRequest.builder()
            .withFormId(formId)

            .withBody(body)
            .build();
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return EvaluationForm
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public EvaluationForm putQualityForm(PutQualityFormRequest request) throws IOException, ApiException {
    try {
      ApiResponse<EvaluationForm> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<EvaluationForm>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update an evaluation form.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<EvaluationForm> putQualityForm(ApiRequest<EvaluationForm> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<EvaluationForm>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<EvaluationForm> response = (ApiResponse<EvaluationForm>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @param body keywordSet (required)
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet putQualityKeywordset(String keywordSetId, KeywordSet body) throws IOException, ApiException {
    return  putQualityKeywordset(createPutQualityKeywordsetRequest(keywordSetId, body));
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param keywordSetId KeywordSet ID (required)
   * @param body keywordSet (required)
   * @return KeywordSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> putQualityKeywordsetWithHttpInfo(String keywordSetId, KeywordSet body) throws IOException {
    return putQualityKeywordset(createPutQualityKeywordsetRequest(keywordSetId, body).withHttpInfo());
  }

  private PutQualityKeywordsetRequest createPutQualityKeywordsetRequest(String keywordSetId, KeywordSet body) {
    return PutQualityKeywordsetRequest.builder()
            .withKeywordSetId(keywordSetId)

            .withBody(body)
            .build();
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param request The request object
   * @return KeywordSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KeywordSet putQualityKeywordset(PutQualityKeywordsetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KeywordSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KeywordSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a keywordSet to the specified keywordSet via PUT.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KeywordSet> putQualityKeywordset(ApiRequest<KeywordSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KeywordSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<KeywordSet> response = (ApiResponse<KeywordSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
