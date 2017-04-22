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
import com.mypurecloud.sdk.v2.model.Campaign;
import com.mypurecloud.sdk.v2.model.AttemptLimits;
import com.mypurecloud.sdk.v2.model.AttemptLimitsEntityListing;
import com.mypurecloud.sdk.v2.model.CallableTimeSet;
import com.mypurecloud.sdk.v2.model.CallableTimeSetEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseSet;
import com.mypurecloud.sdk.v2.model.ResponseSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignDiagnostics;
import com.mypurecloud.sdk.v2.model.CampaignInteractions;
import com.mypurecloud.sdk.v2.model.CampaignProgress;
import com.mypurecloud.sdk.v2.model.CampaignStats;
import com.mypurecloud.sdk.v2.model.CampaignRule;
import com.mypurecloud.sdk.v2.model.CampaignRuleEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignEntityListing;
import com.mypurecloud.sdk.v2.model.ContactList;
import com.mypurecloud.sdk.v2.model.DialerContact;
import com.mypurecloud.sdk.v2.model.ExportUri;
import com.mypurecloud.sdk.v2.model.ImportStatus;
import com.mypurecloud.sdk.v2.model.ContactListEntityListing;
import com.mypurecloud.sdk.v2.model.DncList;
import com.mypurecloud.sdk.v2.model.DncListEntityListing;
import com.mypurecloud.sdk.v2.model.RuleSet;
import com.mypurecloud.sdk.v2.model.RuleSetEntityListing;
import com.mypurecloud.sdk.v2.model.CampaignSchedule;
import com.mypurecloud.sdk.v2.model.SequenceSchedule;
import com.mypurecloud.sdk.v2.model.CampaignSequence;
import com.mypurecloud.sdk.v2.model.CampaignSequenceEntityListing;
import com.mypurecloud.sdk.v2.model.WrapUpCodeMapping;
import com.mypurecloud.sdk.v2.model.AuditSearchResult;
import com.mypurecloud.sdk.v2.model.DialerAuditRequest;
import com.mypurecloud.sdk.v2.model.ContactCallbackRequest;
import com.mypurecloud.sdk.v2.model.UriReference;
import com.mypurecloud.sdk.v2.model.DncListCreate;
import com.mypurecloud.sdk.v2.model.Agent;


import com.mypurecloud.sdk.v2.api.request.DeleteOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignDiagnosticsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignInteractionsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignProgressRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignStatsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistImportstatusRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSchedulesSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.GetOutboundWrapupcodemappingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundAttemptlimitsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundAuditsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallabletimesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCallanalysisresponsesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignCallbackScheduleRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignrulesRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundCampaignsProgressRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistContactsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundContactlistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundConversationDncRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistExportRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistPhonenumbersRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundDnclistsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundRulesetsRequest;
import com.mypurecloud.sdk.v2.api.request.PostOutboundSequencesRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundAttemptlimitRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallabletimesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCallanalysisresponsesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignAgentRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundCampaignruleRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundContactlistContactRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundDnclistRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundRulesetRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesCampaignRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSchedulesSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundSequenceRequest;
import com.mypurecloud.sdk.v2.api.request.PutOutboundWrapupcodemappingsRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class OutboundApi {
  private final ApiClient pcapiClient;

  public OutboundApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OutboundApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
     deleteOutboundAttemptlimit(createDeleteOutboundAttemptlimitRequest(attemptLimitsId));
  }

  /**
   * Delete attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException {
    return deleteOutboundAttemptlimit(createDeleteOutboundAttemptlimitRequest(attemptLimitsId).withHttpInfo());
  }

  private DeleteOutboundAttemptlimitRequest createDeleteOutboundAttemptlimitRequest(String attemptLimitsId) {
    return DeleteOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)
            .build();
  }

  /**
   * Delete attempt limits
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundAttemptlimit(DeleteOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundAttemptlimit(ApiRequest<Void> request) throws IOException {
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
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
     deleteOutboundCallabletimeset(createDeleteOutboundCallabletimesetRequest(callableTimeSetId));
  }

  /**
   * Delete callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException {
    return deleteOutboundCallabletimeset(createDeleteOutboundCallabletimesetRequest(callableTimeSetId).withHttpInfo());
  }

  private DeleteOutboundCallabletimesetRequest createDeleteOutboundCallabletimesetRequest(String callableTimeSetId) {
    return DeleteOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)
            .build();
  }

  /**
   * Delete callable time set
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallabletimeset(DeleteOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallabletimeset(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
     deleteOutboundCallanalysisresponseset(createDeleteOutboundCallanalysisresponsesetRequest(callAnalysisSetId));
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException {
    return deleteOutboundCallanalysisresponseset(createDeleteOutboundCallanalysisresponsesetRequest(callAnalysisSetId).withHttpInfo());
  }

  private DeleteOutboundCallanalysisresponsesetRequest createDeleteOutboundCallanalysisresponsesetRequest(String callAnalysisSetId) {
    return DeleteOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)
            .build();
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCallanalysisresponseset(DeleteOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException {
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
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign deleteOutboundCampaign(String campaignId) throws IOException, ApiException {
    return  deleteOutboundCampaign(createDeleteOutboundCampaignRequest(campaignId));
  }

  /**
   * Delete a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> deleteOutboundCampaignWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundCampaign(createDeleteOutboundCampaignRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundCampaignRequest createDeleteOutboundCampaignRequest(String campaignId) {
    return DeleteOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Delete a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign deleteOutboundCampaign(DeleteOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> deleteOutboundCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
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
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
     deleteOutboundCampaignProgress(createDeleteOutboundCampaignProgressRequest(campaignId));
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundCampaignProgress(createDeleteOutboundCampaignProgressRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundCampaignProgressRequest createDeleteOutboundCampaignProgressRequest(String campaignId) {
    return DeleteOutboundCampaignProgressRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignProgress(DeleteOutboundCampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Reset campaign progress and recycle the campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignProgress(ApiRequest<Void> request) throws IOException {
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
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
     deleteOutboundCampaignrule(createDeleteOutboundCampaignruleRequest(campaignRuleId));
  }

  /**
   * Delete Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException {
    return deleteOutboundCampaignrule(createDeleteOutboundCampaignruleRequest(campaignRuleId).withHttpInfo());
  }

  private DeleteOutboundCampaignruleRequest createDeleteOutboundCampaignruleRequest(String campaignRuleId) {
    return DeleteOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)
            .build();
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundCampaignrule(DeleteOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundCampaignrule(ApiRequest<Void> request) throws IOException {
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
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlist(String contactListId) throws IOException, ApiException {
     deleteOutboundContactlist(createDeleteOutboundContactlistRequest(contactListId));
  }

  /**
   * Delete a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistWithHttpInfo(String contactListId) throws IOException {
    return deleteOutboundContactlist(createDeleteOutboundContactlistRequest(contactListId).withHttpInfo());
  }

  private DeleteOutboundContactlistRequest createDeleteOutboundContactlistRequest(String contactListId) {
    return DeleteOutboundContactlistRequest.builder()
            .withContactListId(contactListId)
            .build();
  }

  /**
   * Delete a contact list.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlist(DeleteOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlist(ApiRequest<Void> request) throws IOException {
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
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
     deleteOutboundContactlistContact(createDeleteOutboundContactlistContactRequest(contactListId, contactId));
  }

  /**
   * Delete a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException {
    return deleteOutboundContactlistContact(createDeleteOutboundContactlistContactRequest(contactListId, contactId).withHttpInfo());
  }

  private DeleteOutboundContactlistContactRequest createDeleteOutboundContactlistContactRequest(String contactListId, String contactId) {
    return DeleteOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)
            .build();
  }

  /**
   * Delete a contact.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundContactlistContact(DeleteOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundContactlistContact(ApiRequest<Void> request) throws IOException {
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
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclist(String dncListId) throws IOException, ApiException {
     deleteOutboundDnclist(createDeleteOutboundDnclistRequest(dncListId));
  }

  /**
   * Delete dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclistWithHttpInfo(String dncListId) throws IOException {
    return deleteOutboundDnclist(createDeleteOutboundDnclistRequest(dncListId).withHttpInfo());
  }

  private DeleteOutboundDnclistRequest createDeleteOutboundDnclistRequest(String dncListId) {
    return DeleteOutboundDnclistRequest.builder()
            .withDncListId(dncListId)
            .build();
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundDnclist(DeleteOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundDnclist(ApiRequest<Void> request) throws IOException {
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
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundRuleset(String ruleSetId) throws IOException, ApiException {
     deleteOutboundRuleset(createDeleteOutboundRulesetRequest(ruleSetId));
  }

  /**
   * Delete a Rule set.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException {
    return deleteOutboundRuleset(createDeleteOutboundRulesetRequest(ruleSetId).withHttpInfo());
  }

  private DeleteOutboundRulesetRequest createDeleteOutboundRulesetRequest(String ruleSetId) {
    return DeleteOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)
            .build();
  }

  /**
   * Delete a Rule set.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundRuleset(DeleteOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a Rule set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundRuleset(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
     deleteOutboundSchedulesCampaign(createDeleteOutboundSchedulesCampaignRequest(campaignId));
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException {
    return deleteOutboundSchedulesCampaign(createDeleteOutboundSchedulesCampaignRequest(campaignId).withHttpInfo());
  }

  private DeleteOutboundSchedulesCampaignRequest createDeleteOutboundSchedulesCampaignRequest(String campaignId) {
    return DeleteOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesCampaign(DeleteOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
     deleteOutboundSchedulesSequence(createDeleteOutboundSchedulesSequenceRequest(sequenceId));
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException {
    return deleteOutboundSchedulesSequence(createDeleteOutboundSchedulesSequenceRequest(sequenceId).withHttpInfo());
  }

  private DeleteOutboundSchedulesSequenceRequest createDeleteOutboundSchedulesSequenceRequest(String sequenceId) {
    return DeleteOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)
            .build();
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSchedulesSequence(DeleteOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException {
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
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSequence(String sequenceId) throws IOException, ApiException {
     deleteOutboundSequence(createDeleteOutboundSequenceRequest(sequenceId));
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSequenceWithHttpInfo(String sequenceId) throws IOException {
    return deleteOutboundSequence(createDeleteOutboundSequenceRequest(sequenceId).withHttpInfo());
  }

  private DeleteOutboundSequenceRequest createDeleteOutboundSequenceRequest(String sequenceId) {
    return DeleteOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)
            .build();
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteOutboundSequence(DeleteOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete a dialer campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteOutboundSequence(ApiRequest<Void> request) throws IOException {
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
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits getOutboundAttemptlimit(String attemptLimitsId) throws IOException, ApiException {
    return  getOutboundAttemptlimit(createGetOutboundAttemptlimitRequest(attemptLimitsId));
  }

  /**
   * Get attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimitWithHttpInfo(String attemptLimitsId) throws IOException {
    return getOutboundAttemptlimit(createGetOutboundAttemptlimitRequest(attemptLimitsId).withHttpInfo());
  }

  private GetOutboundAttemptlimitRequest createGetOutboundAttemptlimitRequest(String attemptLimitsId) {
    return GetOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)
            .build();
  }

  /**
   * Get attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits getOutboundAttemptlimit(GetOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> getOutboundAttemptlimit(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundAttemptlimits(createGetOutboundAttemptlimitsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query attempt limits list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return AttemptLimitsEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimitsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundAttemptlimits(createGetOutboundAttemptlimitsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundAttemptlimitsRequest createGetOutboundAttemptlimitsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundAttemptlimitsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query attempt limits list
   * 
   * @param request The request object
   * @return AttemptLimitsEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimitsEntityListing getOutboundAttemptlimits(GetOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimitsEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimitsEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query attempt limits list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimitsEntityListing> getOutboundAttemptlimits(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimitsEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<AttemptLimitsEntityListing> response = (ApiResponse<AttemptLimitsEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet getOutboundCallabletimeset(String callableTimeSetId) throws IOException, ApiException {
    return  getOutboundCallabletimeset(createGetOutboundCallabletimesetRequest(callableTimeSetId));
  }

  /**
   * Get callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimesetWithHttpInfo(String callableTimeSetId) throws IOException {
    return getOutboundCallabletimeset(createGetOutboundCallabletimesetRequest(callableTimeSetId).withHttpInfo());
  }

  private GetOutboundCallabletimesetRequest createGetOutboundCallabletimesetRequest(String callableTimeSetId) {
    return GetOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)
            .build();
  }

  /**
   * Get callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet getOutboundCallabletimeset(GetOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> getOutboundCallabletimeset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
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
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCallabletimesets(createGetOutboundCallabletimesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query callable time set list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CallableTimeSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCallabletimesets(createGetOutboundCallabletimesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCallabletimesetsRequest createGetOutboundCallabletimesetsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCallabletimesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query callable time set list
   * 
   * @param request The request object
   * @return CallableTimeSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSetEntityListing getOutboundCallabletimesets(GetOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query callable time set list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSetEntityListing> getOutboundCallabletimesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CallableTimeSetEntityListing> response = (ApiResponse<CallableTimeSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet getOutboundCallanalysisresponseset(String callAnalysisSetId) throws IOException, ApiException {
    return  getOutboundCallanalysisresponseset(createGetOutboundCallanalysisresponsesetRequest(callAnalysisSetId));
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId) throws IOException {
    return getOutboundCallanalysisresponseset(createGetOutboundCallanalysisresponsesetRequest(callAnalysisSetId).withHttpInfo());
  }

  private GetOutboundCallanalysisresponsesetRequest createGetOutboundCallanalysisresponsesetRequest(String callAnalysisSetId) {
    return GetOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)
            .build();
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet getOutboundCallanalysisresponseset(GetOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> getOutboundCallanalysisresponseset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCallanalysisresponsesets(createGetOutboundCallanalysisresponsesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ResponseSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCallanalysisresponsesets(createGetOutboundCallanalysisresponsesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCallanalysisresponsesetsRequest createGetOutboundCallanalysisresponsesetsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCallanalysisresponsesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request The request object
   * @return ResponseSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSetEntityListing getOutboundCallanalysisresponsesets(GetOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer call analysis response sets.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSetEntityListing> getOutboundCallanalysisresponsesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseSetEntityListing> response = (ApiResponse<ResponseSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign getOutboundCampaign(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaign(createGetOutboundCampaignRequest(campaignId));
  }

  /**
   * Get dialer campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> getOutboundCampaignWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaign(createGetOutboundCampaignRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignRequest createGetOutboundCampaignRequest(String campaignId) {
    return GetOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get dialer campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign getOutboundCampaign(GetOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> getOutboundCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
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
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignDiagnostics(createGetOutboundCampaignDiagnosticsRequest(campaignId));
  }

  /**
   * Get campaign diagnostics
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignDiagnostics
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnosticsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignDiagnostics(createGetOutboundCampaignDiagnosticsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignDiagnosticsRequest createGetOutboundCampaignDiagnosticsRequest(String campaignId) {
    return GetOutboundCampaignDiagnosticsRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request The request object
   * @return CampaignDiagnostics
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignDiagnostics getOutboundCampaignDiagnostics(GetOutboundCampaignDiagnosticsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignDiagnostics> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignDiagnostics>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get campaign diagnostics
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignDiagnostics> getOutboundCampaignDiagnostics(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignDiagnostics>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignDiagnostics> response = (ApiResponse<CampaignDiagnostics>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignInteractions getOutboundCampaignInteractions(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignInteractions(createGetOutboundCampaignInteractionsRequest(campaignId));
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignInteractions
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractionsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignInteractions(createGetOutboundCampaignInteractionsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignInteractionsRequest createGetOutboundCampaignInteractionsRequest(String campaignId) {
    return GetOutboundCampaignInteractionsRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request The request object
   * @return CampaignInteractions
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignInteractions getOutboundCampaignInteractions(GetOutboundCampaignInteractionsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignInteractions> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignInteractions>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer campaign interactions.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignInteractions> getOutboundCampaignInteractions(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignInteractions>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignInteractions> response = (ApiResponse<CampaignInteractions>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundCampaignProgress(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignProgress(createGetOutboundCampaignProgressRequest(campaignId));
  }

  /**
   * Get campaign progress
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignProgress
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgressWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignProgress(createGetOutboundCampaignProgressRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignProgressRequest createGetOutboundCampaignProgressRequest(String campaignId) {
    return GetOutboundCampaignProgressRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get campaign progress
   * 
   * @param request The request object
   * @return CampaignProgress
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignProgress getOutboundCampaignProgress(GetOutboundCampaignProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignProgress> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignProgress>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get campaign progress
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignProgress> getOutboundCampaignProgress(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignProgress>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignProgress> response = (ApiResponse<CampaignProgress>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignStats getOutboundCampaignStats(String campaignId) throws IOException, ApiException {
    return  getOutboundCampaignStats(createGetOutboundCampaignStatsRequest(campaignId));
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignStats
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStatsWithHttpInfo(String campaignId) throws IOException {
    return getOutboundCampaignStats(createGetOutboundCampaignStatsRequest(campaignId).withHttpInfo());
  }

  private GetOutboundCampaignStatsRequest createGetOutboundCampaignStatsRequest(String campaignId) {
    return GetOutboundCampaignStatsRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request The request object
   * @return CampaignStats
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignStats getOutboundCampaignStats(GetOutboundCampaignStatsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignStats> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignStats>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get statistics about a Dialer Campaign
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignStats> getOutboundCampaignStats(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignStats>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignStats> response = (ApiResponse<CampaignStats>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule getOutboundCampaignrule(String campaignRuleId) throws IOException, ApiException {
    return  getOutboundCampaignrule(createGetOutboundCampaignruleRequest(campaignRuleId));
  }

  /**
   * Get Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> getOutboundCampaignruleWithHttpInfo(String campaignRuleId) throws IOException {
    return getOutboundCampaignrule(createGetOutboundCampaignruleRequest(campaignRuleId).withHttpInfo());
  }

  private GetOutboundCampaignruleRequest createGetOutboundCampaignruleRequest(String campaignRuleId) {
    return GetOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)
            .build();
  }

  /**
   * Get Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule getOutboundCampaignrule(GetOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> getOutboundCampaignrule(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaignrules(createGetOutboundCampaignrulesRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query Campaign Rule list
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignRuleEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrulesWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundCampaignrules(createGetOutboundCampaignrulesRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignrulesRequest createGetOutboundCampaignrulesRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundCampaignrulesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request The request object
   * @return CampaignRuleEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRuleEntityListing getOutboundCampaignrules(GetOutboundCampaignrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRuleEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRuleEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query Campaign Rule list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRuleEntityListing> getOutboundCampaignrules(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRuleEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignRuleEntityListing> response = (ApiResponse<CampaignRuleEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListId DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignEntityListing getOutboundCampaigns(Integer pageSize, Integer pageNumber, String filterType, String name, String contactListId, String dncListId, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundCampaigns(createGetOutboundCampaignsRequest(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param contactListId Contact List ID (optional)
   * @param dncListId DNC list ID (optional)
   * @param distributionQueueId Distribution queue ID (optional)
   * @param edgeGroupId Edge group ID (optional)
   * @param callAnalysisResponseSetId Call analysis response set ID (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaignsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String contactListId, String dncListId, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, String sortBy, String sortOrder) throws IOException {
    return getOutboundCampaigns(createGetOutboundCampaignsRequest(pageSize, pageNumber, filterType, name, contactListId, dncListId, distributionQueueId, edgeGroupId, callAnalysisResponseSetId, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundCampaignsRequest createGetOutboundCampaignsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String contactListId, String dncListId, String distributionQueueId, String edgeGroupId, String callAnalysisResponseSetId, String sortBy, String sortOrder) {
    return GetOutboundCampaignsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withContactListId(contactListId)

            .withDncListId(dncListId)

            .withDistributionQueueId(distributionQueueId)

            .withEdgeGroupId(edgeGroupId)

            .withCallAnalysisResponseSetId(callAnalysisResponseSetId)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request The request object
   * @return CampaignEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignEntityListing getOutboundCampaigns(GetOutboundCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer campaigns.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignEntityListing> getOutboundCampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignEntityListing> response = (ApiResponse<CampaignEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList getOutboundContactlist(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundContactlist(createGetOutboundContactlistRequest(contactListId, includeImportStatus, includeSize));
  }

  /**
   * Get a dialer contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> getOutboundContactlistWithHttpInfo(String contactListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundContactlist(createGetOutboundContactlistRequest(contactListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundContactlistRequest createGetOutboundContactlistRequest(String contactListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundContactlistRequest.builder()
            .withContactListId(contactListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)
            .build();
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList getOutboundContactlist(GetOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> getOutboundContactlist(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact getOutboundContactlistContact(String contactListId, String contactId) throws IOException, ApiException {
    return  getOutboundContactlistContact(createGetOutboundContactlistContactRequest(contactListId, contactId));
  }

  /**
   * Get a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @return DialerContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> getOutboundContactlistContactWithHttpInfo(String contactListId, String contactId) throws IOException {
    return getOutboundContactlistContact(createGetOutboundContactlistContactRequest(contactListId, contactId).withHttpInfo());
  }

  private GetOutboundContactlistContactRequest createGetOutboundContactlistContactRequest(String contactListId, String contactId) {
    return GetOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)
            .build();
  }

  /**
   * Get a contact.
   * 
   * @param request The request object
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact getOutboundContactlistContact(GetOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DialerContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DialerContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> getOutboundContactlistContact(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DialerContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
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
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundContactlistExport(String contactListId, String download) throws IOException, ApiException {
    return  getOutboundContactlistExport(createGetOutboundContactlistExportRequest(contactListId, download));
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param contactListId ContactList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundContactlistExportWithHttpInfo(String contactListId, String download) throws IOException {
    return getOutboundContactlistExport(createGetOutboundContactlistExportRequest(contactListId, download).withHttpInfo());
  }

  private GetOutboundContactlistExportRequest createGetOutboundContactlistExportRequest(String contactListId, String download) {
    return GetOutboundContactlistExportRequest.builder()
            .withContactListId(contactListId)

            .withDownload(download)
            .build();
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request The request object
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundContactlistExport(GetOutboundContactlistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportUri> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportUri>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the URI of a contact list export.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundContactlistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportUri>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
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
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundContactlistImportstatus(String contactListId) throws IOException, ApiException {
    return  getOutboundContactlistImportstatus(createGetOutboundContactlistImportstatusRequest(contactListId));
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param contactListId ContactList ID (required)
   * @return ImportStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatusWithHttpInfo(String contactListId) throws IOException {
    return getOutboundContactlistImportstatus(createGetOutboundContactlistImportstatusRequest(contactListId).withHttpInfo());
  }

  private GetOutboundContactlistImportstatusRequest createGetOutboundContactlistImportstatusRequest(String contactListId) {
    return GetOutboundContactlistImportstatusRequest.builder()
            .withContactListId(contactListId)
            .build();
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request The request object
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundContactlistImportstatus(GetOutboundContactlistImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer contactList import status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundContactlistImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListEntityListing getOutboundContactlists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundContactlists(createGetOutboundContactlistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of contact lists.
   * 
   * @param includeImportStatus Include import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return ContactListEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundContactlists(createGetOutboundContactlistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundContactlistsRequest createGetOutboundContactlistsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundContactlistsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request The request object
   * @return ContactListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactListEntityListing getOutboundContactlists(GetOutboundContactlistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactListEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactListEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of contact lists.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactListEntityListing> getOutboundContactlists(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactListEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactListEntityListing> response = (ApiResponse<ContactListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList getOutboundDnclist(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException, ApiException {
    return  getOutboundDnclist(createGetOutboundDnclistRequest(dncListId, includeImportStatus, includeSize));
  }

  /**
   * Get dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> getOutboundDnclistWithHttpInfo(String dncListId, Boolean includeImportStatus, Boolean includeSize) throws IOException {
    return getOutboundDnclist(createGetOutboundDnclistRequest(dncListId, includeImportStatus, includeSize).withHttpInfo());
  }

  private GetOutboundDnclistRequest createGetOutboundDnclistRequest(String dncListId, Boolean includeImportStatus, Boolean includeSize) {
    return GetOutboundDnclistRequest.builder()
            .withDncListId(dncListId)

            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)
            .build();
  }

  /**
   * Get dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList getOutboundDnclist(GetOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> getOutboundDnclist(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
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
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundDnclistExport(String dncListId, String download) throws IOException, ApiException {
    return  getOutboundDnclistExport(createGetOutboundDnclistExportRequest(dncListId, download));
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param dncListId DncList ID (required)
   * @param download Redirect to download uri (optional, default to false)
   * @return ExportUri
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundDnclistExportWithHttpInfo(String dncListId, String download) throws IOException {
    return getOutboundDnclistExport(createGetOutboundDnclistExportRequest(dncListId, download).withHttpInfo());
  }

  private GetOutboundDnclistExportRequest createGetOutboundDnclistExportRequest(String dncListId, String download) {
    return GetOutboundDnclistExportRequest.builder()
            .withDncListId(dncListId)

            .withDownload(download)
            .build();
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request The request object
   * @return ExportUri
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ExportUri getOutboundDnclistExport(GetOutboundDnclistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ExportUri> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ExportUri>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the URI of a DNC list export.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ExportUri> getOutboundDnclistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ExportUri>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)exception;
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
      ApiResponse<ExportUri> response = (ApiResponse<ExportUri>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundDnclistImportstatus(String dncListId) throws IOException, ApiException {
    return  getOutboundDnclistImportstatus(createGetOutboundDnclistImportstatusRequest(dncListId));
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param dncListId DncList ID (required)
   * @return ImportStatus
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatusWithHttpInfo(String dncListId) throws IOException {
    return getOutboundDnclistImportstatus(createGetOutboundDnclistImportstatusRequest(dncListId).withHttpInfo());
  }

  private GetOutboundDnclistImportstatusRequest createGetOutboundDnclistImportstatusRequest(String dncListId) {
    return GetOutboundDnclistImportstatusRequest.builder()
            .withDncListId(dncListId)
            .build();
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request The request object
   * @return ImportStatus
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ImportStatus getOutboundDnclistImportstatus(GetOutboundDnclistImportstatusRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ImportStatus> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ImportStatus>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get dialer dncList import status.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ImportStatus> getOutboundDnclistImportstatus(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ImportStatus>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)exception;
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
      ApiResponse<ImportStatus> response = (ApiResponse<ImportStatus>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListEntityListing getOutboundDnclists(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundDnclists(createGetOutboundDnclistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query dialer DNC lists
   * 
   * @param includeImportStatus Import status (optional, default to false)
   * @param includeSize Include size (optional, default to false)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional)
   * @return DncListEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclistsWithHttpInfo(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundDnclists(createGetOutboundDnclistsRequest(includeImportStatus, includeSize, pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundDnclistsRequest createGetOutboundDnclistsRequest(Boolean includeImportStatus, Boolean includeSize, Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundDnclistsRequest.builder()
            .withIncludeImportStatus(includeImportStatus)

            .withIncludeSize(includeSize)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request The request object
   * @return DncListEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncListEntityListing getOutboundDnclists(GetOutboundDnclistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncListEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncListEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query dialer DNC lists
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncListEntityListing> getOutboundDnclists(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncListEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DncListEntityListing> response = (ApiResponse<DncListEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet getOutboundRuleset(String ruleSetId) throws IOException, ApiException {
    return  getOutboundRuleset(createGetOutboundRulesetRequest(ruleSetId));
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> getOutboundRulesetWithHttpInfo(String ruleSetId) throws IOException {
    return getOutboundRuleset(createGetOutboundRulesetRequest(ruleSetId).withHttpInfo());
  }

  private GetOutboundRulesetRequest createGetOutboundRulesetRequest(String ruleSetId) {
    return GetOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)
            .build();
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet getOutboundRuleset(GetOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a Rule Set by ID.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> getOutboundRuleset(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
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
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSetEntityListing getOutboundRulesets(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundRulesets(createGetOutboundRulesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return RuleSetEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesetsWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundRulesets(createGetOutboundRulesetsRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundRulesetsRequest createGetOutboundRulesetsRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundRulesetsRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request The request object
   * @return RuleSetEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSetEntityListing getOutboundRulesets(GetOutboundRulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSetEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSetEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of Rule Sets.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSetEntityListing> getOutboundRulesets(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSetEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<RuleSetEntityListing> response = (ApiResponse<RuleSetEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule getOutboundSchedulesCampaign(String campaignId) throws IOException, ApiException {
    return  getOutboundSchedulesCampaign(createGetOutboundSchedulesCampaignRequest(campaignId));
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @return CampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaignWithHttpInfo(String campaignId) throws IOException {
    return getOutboundSchedulesCampaign(createGetOutboundSchedulesCampaignRequest(campaignId).withHttpInfo());
  }

  private GetOutboundSchedulesCampaignRequest createGetOutboundSchedulesCampaignRequest(String campaignId) {
    return GetOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)
            .build();
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request The request object
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule getOutboundSchedulesCampaign(GetOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> getOutboundSchedulesCampaign(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns() throws IOException, ApiException {
    return  getOutboundSchedulesCampaigns(createGetOutboundSchedulesCampaignsRequest());
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @return List<CampaignSchedule>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaignsWithHttpInfo() throws IOException {
    return getOutboundSchedulesCampaigns(createGetOutboundSchedulesCampaignsRequest().withHttpInfo());
  }

  private GetOutboundSchedulesCampaignsRequest createGetOutboundSchedulesCampaignsRequest() {
    return GetOutboundSchedulesCampaignsRequest.builder()            .build();
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request The request object
   * @return List<CampaignSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignSchedule> getOutboundSchedulesCampaigns(GetOutboundSchedulesCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<CampaignSchedule>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<CampaignSchedule>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of dialer campaign schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignSchedule>> getOutboundSchedulesCampaigns(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<CampaignSchedule>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<CampaignSchedule>> response = (ApiResponse<List<CampaignSchedule>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule getOutboundSchedulesSequence(String sequenceId) throws IOException, ApiException {
    return  getOutboundSchedulesSequence(createGetOutboundSchedulesSequenceRequest(sequenceId));
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @return SequenceSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequenceWithHttpInfo(String sequenceId) throws IOException {
    return getOutboundSchedulesSequence(createGetOutboundSchedulesSequenceRequest(sequenceId).withHttpInfo());
  }

  private GetOutboundSchedulesSequenceRequest createGetOutboundSchedulesSequenceRequest(String sequenceId) {
    return GetOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)
            .build();
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request The request object
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule getOutboundSchedulesSequence(GetOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SequenceSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> getOutboundSchedulesSequence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SequenceSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
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
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences() throws IOException, ApiException {
    return  getOutboundSchedulesSequences(createGetOutboundSchedulesSequencesRequest());
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @return List<SequenceSchedule>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequencesWithHttpInfo() throws IOException {
    return getOutboundSchedulesSequences(createGetOutboundSchedulesSequencesRequest().withHttpInfo());
  }

  private GetOutboundSchedulesSequencesRequest createGetOutboundSchedulesSequencesRequest() {
    return GetOutboundSchedulesSequencesRequest.builder()            .build();
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request The request object
   * @return List<SequenceSchedule>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<SequenceSchedule> getOutboundSchedulesSequences(GetOutboundSchedulesSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<SequenceSchedule>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<SequenceSchedule>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query for a list of dialer sequence schedules.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<SequenceSchedule>> getOutboundSchedulesSequences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<SequenceSchedule>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<SequenceSchedule>> response = (ApiResponse<List<SequenceSchedule>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence getOutboundSequence(String sequenceId) throws IOException, ApiException {
    return  getOutboundSequence(createGetOutboundSequenceRequest(sequenceId));
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> getOutboundSequenceWithHttpInfo(String sequenceId) throws IOException {
    return getOutboundSequence(createGetOutboundSequenceRequest(sequenceId).withHttpInfo());
  }

  private GetOutboundSequenceRequest createGetOutboundSequenceRequest(String sequenceId) {
    return GetOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)
            .build();
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence getOutboundSequence(GetOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get a dialer campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> getOutboundSequence(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequenceEntityListing getOutboundSequences(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getOutboundSequences(createGetOutboundSequencesRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder));
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param filterType Filter type (optional, default to Prefix)
   * @param name Name (optional)
   * @param sortBy Sort by (optional)
   * @param sortOrder Sort order (optional, default to a)
   * @return CampaignSequenceEntityListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequencesWithHttpInfo(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) throws IOException {
    return getOutboundSequences(createGetOutboundSequencesRequest(pageSize, pageNumber, filterType, name, sortBy, sortOrder).withHttpInfo());
  }

  private GetOutboundSequencesRequest createGetOutboundSequencesRequest(Integer pageSize, Integer pageNumber, String filterType, String name, String sortBy, String sortOrder) {
    return GetOutboundSequencesRequest.builder()
            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withFilterType(filterType)

            .withName(name)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)
            .build();
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request The request object
   * @return CampaignSequenceEntityListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequenceEntityListing getOutboundSequences(GetOutboundSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequenceEntityListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequenceEntityListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Query a list of dialer campaign sequences.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequenceEntityListing> getOutboundSequences(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequenceEntityListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSequenceEntityListing> response = (ApiResponse<CampaignSequenceEntityListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings() throws IOException, ApiException {
    return  getOutboundWrapupcodemappings(createGetOutboundWrapupcodemappingsRequest());
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @return WrapUpCodeMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappingsWithHttpInfo() throws IOException {
    return getOutboundWrapupcodemappings(createGetOutboundWrapupcodemappingsRequest().withHttpInfo());
  }

  private GetOutboundWrapupcodemappingsRequest createGetOutboundWrapupcodemappingsRequest() {
    return GetOutboundWrapupcodemappingsRequest.builder()            .build();
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping getOutboundWrapupcodemappings(GetOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapUpCodeMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> getOutboundWrapupcodemappings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapUpCodeMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits postOutboundAttemptlimits(AttemptLimits body) throws IOException, ApiException {
    return  postOutboundAttemptlimits(createPostOutboundAttemptlimitsRequest(body));
  }

  /**
   * Create attempt limits
   * 
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimitsWithHttpInfo(AttemptLimits body) throws IOException {
    return postOutboundAttemptlimits(createPostOutboundAttemptlimitsRequest(body).withHttpInfo());
  }

  private PostOutboundAttemptlimitsRequest createPostOutboundAttemptlimitsRequest(AttemptLimits body) {
    return PostOutboundAttemptlimitsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits postOutboundAttemptlimits(PostOutboundAttemptlimitsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> postOutboundAttemptlimits(ApiRequest<AttemptLimits> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return AuditSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditSearchResult postOutboundAudits(DialerAuditRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, Boolean facetsOnly) throws IOException, ApiException {
    return  postOutboundAudits(createPostOutboundAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly));
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param body AuditSearch (required)
   * @param pageSize Page size (optional, default to 25)
   * @param pageNumber Page number (optional, default to 1)
   * @param sortBy Sort by (optional, default to entity.name)
   * @param sortOrder Sort order (optional, default to ascending)
   * @param facetsOnly Facets only (optional, default to false)
   * @return AuditSearchResult
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditSearchResult> postOutboundAuditsWithHttpInfo(DialerAuditRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, Boolean facetsOnly) throws IOException {
    return postOutboundAudits(createPostOutboundAuditsRequest(body, pageSize, pageNumber, sortBy, sortOrder, facetsOnly).withHttpInfo());
  }

  private PostOutboundAuditsRequest createPostOutboundAuditsRequest(DialerAuditRequest body, Integer pageSize, Integer pageNumber, String sortBy, String sortOrder, Boolean facetsOnly) {
    return PostOutboundAuditsRequest.builder()
            .withBody(body)

            .withPageSize(pageSize)

            .withPageNumber(pageNumber)

            .withSortBy(sortBy)

            .withSortOrder(sortOrder)

            .withFacetsOnly(facetsOnly)
            .build();
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param request The request object
   * @return AuditSearchResult
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AuditSearchResult postOutboundAudits(PostOutboundAuditsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AuditSearchResult> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AuditSearchResult>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Retrieves audits for dialer.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AuditSearchResult> postOutboundAudits(ApiRequest<DialerAuditRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AuditSearchResult>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AuditSearchResult> response = (ApiResponse<AuditSearchResult>)(ApiResponse<?>)exception;
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
      ApiResponse<AuditSearchResult> response = (ApiResponse<AuditSearchResult>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet postOutboundCallabletimesets(CallableTimeSet body) throws IOException, ApiException {
    return  postOutboundCallabletimesets(createPostOutboundCallabletimesetsRequest(body));
  }

  /**
   * Create callable time set
   * 
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesetsWithHttpInfo(CallableTimeSet body) throws IOException {
    return postOutboundCallabletimesets(createPostOutboundCallabletimesetsRequest(body).withHttpInfo());
  }

  private PostOutboundCallabletimesetsRequest createPostOutboundCallabletimesetsRequest(CallableTimeSet body) {
    return PostOutboundCallabletimesetsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet postOutboundCallabletimesets(PostOutboundCallabletimesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> postOutboundCallabletimesets(ApiRequest<CallableTimeSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
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
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet postOutboundCallanalysisresponsesets(ResponseSet body) throws IOException, ApiException {
    return  postOutboundCallanalysisresponsesets(createPostOutboundCallanalysisresponsesetsRequest(body));
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesetsWithHttpInfo(ResponseSet body) throws IOException {
    return postOutboundCallanalysisresponsesets(createPostOutboundCallanalysisresponsesetsRequest(body).withHttpInfo());
  }

  private PostOutboundCallanalysisresponsesetsRequest createPostOutboundCallanalysisresponsesetsRequest(ResponseSet body) {
    return PostOutboundCallanalysisresponsesetsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet postOutboundCallanalysisresponsesets(PostOutboundCallanalysisresponsesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> postOutboundCallanalysisresponsesets(ApiRequest<ResponseSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(String campaignId, ContactCallbackRequest body) throws IOException, ApiException {
    return  postOutboundCampaignCallbackSchedule(createPostOutboundCampaignCallbackScheduleRequest(campaignId, body));
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param campaignId Campaign ID (required)
   * @param body ContactCallbackRequest (required)
   * @return ContactCallbackRequest
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackScheduleWithHttpInfo(String campaignId, ContactCallbackRequest body) throws IOException {
    return postOutboundCampaignCallbackSchedule(createPostOutboundCampaignCallbackScheduleRequest(campaignId, body).withHttpInfo());
  }

  private PostOutboundCampaignCallbackScheduleRequest createPostOutboundCampaignCallbackScheduleRequest(String campaignId, ContactCallbackRequest body) {
    return PostOutboundCampaignCallbackScheduleRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)
            .build();
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param request The request object
   * @return ContactCallbackRequest
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactCallbackRequest postOutboundCampaignCallbackSchedule(PostOutboundCampaignCallbackScheduleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactCallbackRequest> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactCallbackRequest>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Schedule a Callback for a Dialer Campaign (Deprecated)
   * This endpoint is deprecated and may have unexpected results. Please use \&quot;/conversations/{conversationId}/participants/{participantId}/callbacks instead.\&quot;
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactCallbackRequest> postOutboundCampaignCallbackSchedule(ApiRequest<ContactCallbackRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactCallbackRequest>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactCallbackRequest> response = (ApiResponse<ContactCallbackRequest>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule postOutboundCampaignrules(CampaignRule body) throws IOException, ApiException {
    return  postOutboundCampaignrules(createPostOutboundCampaignrulesRequest(body));
  }

  /**
   * Create Campaign Rule
   * 
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrulesWithHttpInfo(CampaignRule body) throws IOException {
    return postOutboundCampaignrules(createPostOutboundCampaignrulesRequest(body).withHttpInfo());
  }

  private PostOutboundCampaignrulesRequest createPostOutboundCampaignrulesRequest(CampaignRule body) {
    return PostOutboundCampaignrulesRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule postOutboundCampaignrules(PostOutboundCampaignrulesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> postOutboundCampaignrules(ApiRequest<CampaignRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign postOutboundCampaigns(Campaign body) throws IOException, ApiException {
    return  postOutboundCampaigns(createPostOutboundCampaignsRequest(body));
  }

  /**
   * Create a campaign.
   * 
   * @param body Campaign (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> postOutboundCampaignsWithHttpInfo(Campaign body) throws IOException {
    return postOutboundCampaigns(createPostOutboundCampaignsRequest(body).withHttpInfo());
  }

  private PostOutboundCampaignsRequest createPostOutboundCampaignsRequest(Campaign body) {
    return PostOutboundCampaignsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign postOutboundCampaigns(PostOutboundCampaignsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> postOutboundCampaigns(ApiRequest<Campaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
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
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(List<String> body) throws IOException, ApiException {
    return  postOutboundCampaignsProgress(createPostOutboundCampaignsProgressRequest(body));
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param body Campaign IDs (required)
   * @return List<CampaignProgress>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgressWithHttpInfo(List<String> body) throws IOException {
    return postOutboundCampaignsProgress(createPostOutboundCampaignsProgressRequest(body).withHttpInfo());
  }

  private PostOutboundCampaignsProgressRequest createPostOutboundCampaignsProgressRequest(List<String> body) {
    return PostOutboundCampaignsProgressRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request The request object
   * @return List<CampaignProgress>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<CampaignProgress> postOutboundCampaignsProgress(PostOutboundCampaignsProgressRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<CampaignProgress>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<CampaignProgress>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get progress for a list of campaigns
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<CampaignProgress>> postOutboundCampaignsProgress(ApiRequest<List<String>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<CampaignProgress>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<CampaignProgress>> response = (ApiResponse<List<CampaignProgress>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @param clearSystemData Clear system data.  True means the system data stored on the contact will be cleared if the contact already exists (attempts, callable status, etc), false means it won&#39;t. (optional)
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContacts(String contactListId, List<DialerContact> body, Boolean priority, Boolean clearSystemData) throws IOException, ApiException {
    return  postOutboundContactlistContacts(createPostOutboundContactlistContactsRequest(contactListId, body, priority, clearSystemData));
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param contactListId Contact List ID (required)
   * @param body Contact (required)
   * @param priority Contact priority.  True means the contact(s) will go to the beginning of the list, false means at the end. (optional)
   * @param clearSystemData Clear system data.  True means the system data stored on the contact will be cleared if the contact already exists (attempts, callable status, etc), false means it won&#39;t. (optional)
   * @return List<DialerContact>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContactsWithHttpInfo(String contactListId, List<DialerContact> body, Boolean priority, Boolean clearSystemData) throws IOException {
    return postOutboundContactlistContacts(createPostOutboundContactlistContactsRequest(contactListId, body, priority, clearSystemData).withHttpInfo());
  }

  private PostOutboundContactlistContactsRequest createPostOutboundContactlistContactsRequest(String contactListId, List<DialerContact> body, Boolean priority, Boolean clearSystemData) {
    return PostOutboundContactlistContactsRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)

            .withPriority(priority)

            .withClearSystemData(clearSystemData)
            .build();
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request The request object
   * @return List<DialerContact>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<DialerContact> postOutboundContactlistContacts(PostOutboundContactlistContactsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<DialerContact>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<DialerContact>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Add contacts to a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<DialerContact>> postOutboundContactlistContacts(ApiRequest<List<DialerContact>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<DialerContact>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)exception;
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
      ApiResponse<List<DialerContact>> response = (ApiResponse<List<DialerContact>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return UriReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UriReference postOutboundContactlistExport(String contactListId) throws IOException, ApiException {
    return  postOutboundContactlistExport(createPostOutboundContactlistExportRequest(contactListId));
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param contactListId ContactList ID (required)
   * @return UriReference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UriReference> postOutboundContactlistExportWithHttpInfo(String contactListId) throws IOException {
    return postOutboundContactlistExport(createPostOutboundContactlistExportRequest(contactListId).withHttpInfo());
  }

  private PostOutboundContactlistExportRequest createPostOutboundContactlistExportRequest(String contactListId) {
    return PostOutboundContactlistExportRequest.builder()
            .withContactListId(contactListId)
            .build();
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return UriReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UriReference postOutboundContactlistExport(PostOutboundContactlistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UriReference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UriReference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate the export of a contact list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UriReference> postOutboundContactlistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UriReference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UriReference> response = (ApiResponse<UriReference>)(ApiResponse<?>)exception;
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
      ApiResponse<UriReference> response = (ApiResponse<UriReference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList postOutboundContactlists(ContactList body) throws IOException, ApiException {
    return  postOutboundContactlists(createPostOutboundContactlistsRequest(body));
  }

  /**
   * Create a contact List.
   * 
   * @param body ContactList (required)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> postOutboundContactlistsWithHttpInfo(ContactList body) throws IOException {
    return postOutboundContactlists(createPostOutboundContactlistsRequest(body).withHttpInfo());
  }

  private PostOutboundContactlistsRequest createPostOutboundContactlistsRequest(ContactList body) {
    return PostOutboundContactlistsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a contact List.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList postOutboundContactlists(PostOutboundContactlistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a contact List.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> postOutboundContactlists(ApiRequest<ContactList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundConversationDnc(String conversationId) throws IOException, ApiException {
     postOutboundConversationDnc(createPostOutboundConversationDncRequest(conversationId));
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param conversationId Conversation ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundConversationDncWithHttpInfo(String conversationId) throws IOException {
    return postOutboundConversationDnc(createPostOutboundConversationDncRequest(conversationId).withHttpInfo());
  }

  private PostOutboundConversationDncRequest createPostOutboundConversationDncRequest(String conversationId) {
    return PostOutboundConversationDncRequest.builder()
            .withConversationId(conversationId)
            .build();
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundConversationDnc(PostOutboundConversationDncRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundConversationDnc(ApiRequest<Void> request) throws IOException {
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
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return UriReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UriReference postOutboundDnclistExport(String dncListId) throws IOException, ApiException {
    return  postOutboundDnclistExport(createPostOutboundDnclistExportRequest(dncListId));
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param dncListId DncList ID (required)
   * @return UriReference
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UriReference> postOutboundDnclistExportWithHttpInfo(String dncListId) throws IOException {
    return postOutboundDnclistExport(createPostOutboundDnclistExportRequest(dncListId).withHttpInfo());
  }

  private PostOutboundDnclistExportRequest createPostOutboundDnclistExportRequest(String dncListId) {
    return PostOutboundDnclistExportRequest.builder()
            .withDncListId(dncListId)
            .build();
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return UriReference
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UriReference postOutboundDnclistExport(PostOutboundDnclistExportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UriReference> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UriReference>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Initiate the export of a dnc list.
   * Returns 200 if received OK.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UriReference> postOutboundDnclistExport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UriReference>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UriReference> response = (ApiResponse<UriReference>)(ApiResponse<?>)exception;
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
      ApiResponse<UriReference> response = (ApiResponse<UriReference>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistPhonenumbers(String dncListId, List<String> body) throws IOException, ApiException {
     postOutboundDnclistPhonenumbers(createPostOutboundDnclistPhonenumbersRequest(dncListId, body));
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param dncListId DncList ID (required)
   * @param body DNC Phone Numbers (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbersWithHttpInfo(String dncListId, List<String> body) throws IOException {
    return postOutboundDnclistPhonenumbers(createPostOutboundDnclistPhonenumbersRequest(dncListId, body).withHttpInfo());
  }

  private PostOutboundDnclistPhonenumbersRequest createPostOutboundDnclistPhonenumbersRequest(String dncListId, List<String> body) {
    return PostOutboundDnclistPhonenumbersRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)
            .build();
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void postOutboundDnclistPhonenumbers(PostOutboundDnclistPhonenumbersRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Add phone numbers to a Dialer DNC list.
   * Only Internal DNC lists may be appended to
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> postOutboundDnclistPhonenumbers(ApiRequest<List<String>> request) throws IOException {
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
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList postOutboundDnclists(DncListCreate body) throws IOException, ApiException {
    return  postOutboundDnclists(createPostOutboundDnclistsRequest(body));
  }

  /**
   * Create dialer DNC list
   * 
   * @param body DncList (required)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> postOutboundDnclistsWithHttpInfo(DncListCreate body) throws IOException {
    return postOutboundDnclists(createPostOutboundDnclistsRequest(body).withHttpInfo());
  }

  private PostOutboundDnclistsRequest createPostOutboundDnclistsRequest(DncListCreate body) {
    return PostOutboundDnclistsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList postOutboundDnclists(PostOutboundDnclistsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> postOutboundDnclists(ApiRequest<DncListCreate> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
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
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet postOutboundRulesets(RuleSet body) throws IOException, ApiException {
    return  postOutboundRulesets(createPostOutboundRulesetsRequest(body));
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> postOutboundRulesetsWithHttpInfo(RuleSet body) throws IOException {
    return postOutboundRulesets(createPostOutboundRulesetsRequest(body).withHttpInfo());
  }

  private PostOutboundRulesetsRequest createPostOutboundRulesetsRequest(RuleSet body) {
    return PostOutboundRulesetsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet postOutboundRulesets(PostOutboundRulesetsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a Dialer Call Analysis Response Set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> postOutboundRulesets(ApiRequest<RuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
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
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence postOutboundSequences(CampaignSequence body) throws IOException, ApiException {
    return  postOutboundSequences(createPostOutboundSequencesRequest(body));
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> postOutboundSequencesWithHttpInfo(CampaignSequence body) throws IOException {
    return postOutboundSequences(createPostOutboundSequencesRequest(body).withHttpInfo());
  }

  private PostOutboundSequencesRequest createPostOutboundSequencesRequest(CampaignSequence body) {
    return PostOutboundSequencesRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence postOutboundSequences(PostOutboundSequencesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create a new campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> postOutboundSequences(ApiRequest<CampaignSequence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits putOutboundAttemptlimit(String attemptLimitsId, AttemptLimits body) throws IOException, ApiException {
    return  putOutboundAttemptlimit(createPutOutboundAttemptlimitRequest(attemptLimitsId, body));
  }

  /**
   * Update attempt limits
   * 
   * @param attemptLimitsId Attempt limits ID (required)
   * @param body AttemptLimits (required)
   * @return AttemptLimits
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimitWithHttpInfo(String attemptLimitsId, AttemptLimits body) throws IOException {
    return putOutboundAttemptlimit(createPutOutboundAttemptlimitRequest(attemptLimitsId, body).withHttpInfo());
  }

  private PutOutboundAttemptlimitRequest createPutOutboundAttemptlimitRequest(String attemptLimitsId, AttemptLimits body) {
    return PutOutboundAttemptlimitRequest.builder()
            .withAttemptLimitsId(attemptLimitsId)

            .withBody(body)
            .build();
  }

  /**
   * Update attempt limits
   * 
   * @param request The request object
   * @return AttemptLimits
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public AttemptLimits putOutboundAttemptlimit(PutOutboundAttemptlimitRequest request) throws IOException, ApiException {
    try {
      ApiResponse<AttemptLimits> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<AttemptLimits>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update attempt limits
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<AttemptLimits> putOutboundAttemptlimit(ApiRequest<AttemptLimits> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<AttemptLimits>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)exception;
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
      ApiResponse<AttemptLimits> response = (ApiResponse<AttemptLimits>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet putOutboundCallabletimeset(String callableTimeSetId, CallableTimeSet body) throws IOException, ApiException {
    return  putOutboundCallabletimeset(createPutOutboundCallabletimesetRequest(callableTimeSetId, body));
  }

  /**
   * Update callable time set
   * 
   * @param callableTimeSetId Callable Time Set ID (required)
   * @param body DialerCallableTimeSet (required)
   * @return CallableTimeSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimesetWithHttpInfo(String callableTimeSetId, CallableTimeSet body) throws IOException {
    return putOutboundCallabletimeset(createPutOutboundCallabletimesetRequest(callableTimeSetId, body).withHttpInfo());
  }

  private PutOutboundCallabletimesetRequest createPutOutboundCallabletimesetRequest(String callableTimeSetId, CallableTimeSet body) {
    return PutOutboundCallabletimesetRequest.builder()
            .withCallableTimeSetId(callableTimeSetId)

            .withBody(body)
            .build();
  }

  /**
   * Update callable time set
   * 
   * @param request The request object
   * @return CallableTimeSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CallableTimeSet putOutboundCallabletimeset(PutOutboundCallabletimesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CallableTimeSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CallableTimeSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update callable time set
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CallableTimeSet> putOutboundCallabletimeset(ApiRequest<CallableTimeSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CallableTimeSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)exception;
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
      ApiResponse<CallableTimeSet> response = (ApiResponse<CallableTimeSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet putOutboundCallanalysisresponseset(String callAnalysisSetId, ResponseSet body) throws IOException, ApiException {
    return  putOutboundCallanalysisresponseset(createPutOutboundCallanalysisresponsesetRequest(callAnalysisSetId, body));
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param callAnalysisSetId Call Analysis Response Set ID (required)
   * @param body ResponseSet (required)
   * @return ResponseSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponsesetWithHttpInfo(String callAnalysisSetId, ResponseSet body) throws IOException {
    return putOutboundCallanalysisresponseset(createPutOutboundCallanalysisresponsesetRequest(callAnalysisSetId, body).withHttpInfo());
  }

  private PutOutboundCallanalysisresponsesetRequest createPutOutboundCallanalysisresponsesetRequest(String callAnalysisSetId, ResponseSet body) {
    return PutOutboundCallanalysisresponsesetRequest.builder()
            .withCallAnalysisSetId(callAnalysisSetId)

            .withBody(body)
            .build();
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request The request object
   * @return ResponseSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ResponseSet putOutboundCallanalysisresponseset(PutOutboundCallanalysisresponsesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ResponseSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ResponseSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a dialer call analysis response set.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ResponseSet> putOutboundCallanalysisresponseset(ApiRequest<ResponseSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ResponseSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)exception;
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
      ApiResponse<ResponseSet> response = (ApiResponse<ResponseSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign putOutboundCampaign(String campaignId, Campaign body) throws IOException, ApiException {
    return  putOutboundCampaign(createPutOutboundCampaignRequest(campaignId, body));
  }

  /**
   * Update a campaign.
   * 
   * @param campaignId Campaign ID (required)
   * @param body Campaign (required)
   * @return Campaign
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> putOutboundCampaignWithHttpInfo(String campaignId, Campaign body) throws IOException {
    return putOutboundCampaign(createPutOutboundCampaignRequest(campaignId, body).withHttpInfo());
  }

  private PutOutboundCampaignRequest createPutOutboundCampaignRequest(String campaignId, Campaign body) {
    return PutOutboundCampaignRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)
            .build();
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @return Campaign
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public Campaign putOutboundCampaign(PutOutboundCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Campaign> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<Campaign>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a campaign.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Campaign> putOutboundCampaign(ApiRequest<Campaign> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<Campaign>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)exception;
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
      ApiResponse<Campaign> response = (ApiResponse<Campaign>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (required)
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putOutboundCampaignAgent(String campaignId, String userId, Agent body) throws IOException, ApiException {
    return  putOutboundCampaignAgent(createPutOutboundCampaignAgentRequest(campaignId, userId, body));
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param campaignId Campaign ID (required)
   * @param userId Agent&#39;s user ID (required)
   * @param body agent (required)
   * @return String
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putOutboundCampaignAgentWithHttpInfo(String campaignId, String userId, Agent body) throws IOException {
    return putOutboundCampaignAgent(createPutOutboundCampaignAgentRequest(campaignId, userId, body).withHttpInfo());
  }

  private PutOutboundCampaignAgentRequest createPutOutboundCampaignAgentRequest(String campaignId, String userId, Agent body) {
    return PutOutboundCampaignAgentRequest.builder()
            .withCampaignId(campaignId)

            .withUserId(userId)

            .withBody(body)
            .build();
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param request The request object
   * @return String
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public String putOutboundCampaignAgent(PutOutboundCampaignAgentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<String> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<String>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Send notification that an agent&#39;s state changed 
   * New agent state.
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<String> putOutboundCampaignAgent(ApiRequest<Agent> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<String>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)exception;
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
      ApiResponse<String> response = (ApiResponse<String>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule putOutboundCampaignrule(String campaignRuleId, CampaignRule body) throws IOException, ApiException {
    return  putOutboundCampaignrule(createPutOutboundCampaignruleRequest(campaignRuleId, body));
  }

  /**
   * Update Campaign Rule
   * 
   * @param campaignRuleId Campaign Rule ID (required)
   * @param body CampaignRule (required)
   * @return CampaignRule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> putOutboundCampaignruleWithHttpInfo(String campaignRuleId, CampaignRule body) throws IOException {
    return putOutboundCampaignrule(createPutOutboundCampaignruleRequest(campaignRuleId, body).withHttpInfo());
  }

  private PutOutboundCampaignruleRequest createPutOutboundCampaignruleRequest(String campaignRuleId, CampaignRule body) {
    return PutOutboundCampaignruleRequest.builder()
            .withCampaignRuleId(campaignRuleId)

            .withBody(body)
            .build();
  }

  /**
   * Update Campaign Rule
   * 
   * @param request The request object
   * @return CampaignRule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignRule putOutboundCampaignrule(PutOutboundCampaignruleRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignRule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignRule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update Campaign Rule
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignRule> putOutboundCampaignrule(ApiRequest<CampaignRule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignRule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignRule> response = (ApiResponse<CampaignRule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList putOutboundContactlist(String contactListId, ContactList body) throws IOException, ApiException {
    return  putOutboundContactlist(createPutOutboundContactlistRequest(contactListId, body));
  }

  /**
   * Update a contact list.
   * 
   * @param contactListId ContactList ID (required)
   * @param body ContactList (required)
   * @return ContactList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> putOutboundContactlistWithHttpInfo(String contactListId, ContactList body) throws IOException {
    return putOutboundContactlist(createPutOutboundContactlistRequest(contactListId, body).withHttpInfo());
  }

  private PutOutboundContactlistRequest createPutOutboundContactlistRequest(String contactListId, ContactList body) {
    return PutOutboundContactlistRequest.builder()
            .withContactListId(contactListId)

            .withBody(body)
            .build();
  }

  /**
   * Update a contact list.
   * 
   * @param request The request object
   * @return ContactList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public ContactList putOutboundContactlist(PutOutboundContactlistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<ContactList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<ContactList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a contact list.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<ContactList> putOutboundContactlist(ApiRequest<ContactList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<ContactList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)exception;
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
      ApiResponse<ContactList> response = (ApiResponse<ContactList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact putOutboundContactlistContact(String contactListId, String contactId, DialerContact body) throws IOException, ApiException {
    return  putOutboundContactlistContact(createPutOutboundContactlistContactRequest(contactListId, contactId, body));
  }

  /**
   * Update a contact.
   * 
   * @param contactListId Contact List ID (required)
   * @param contactId Contact ID (required)
   * @param body Contact (required)
   * @return DialerContact
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> putOutboundContactlistContactWithHttpInfo(String contactListId, String contactId, DialerContact body) throws IOException {
    return putOutboundContactlistContact(createPutOutboundContactlistContactRequest(contactListId, contactId, body).withHttpInfo());
  }

  private PutOutboundContactlistContactRequest createPutOutboundContactlistContactRequest(String contactListId, String contactId, DialerContact body) {
    return PutOutboundContactlistContactRequest.builder()
            .withContactListId(contactListId)

            .withContactId(contactId)

            .withBody(body)
            .build();
  }

  /**
   * Update a contact.
   * 
   * @param request The request object
   * @return DialerContact
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DialerContact putOutboundContactlistContact(PutOutboundContactlistContactRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DialerContact> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DialerContact>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a contact.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DialerContact> putOutboundContactlistContact(ApiRequest<DialerContact> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DialerContact>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)exception;
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
      ApiResponse<DialerContact> response = (ApiResponse<DialerContact>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList putOutboundDnclist(String dncListId, DncList body) throws IOException, ApiException {
    return  putOutboundDnclist(createPutOutboundDnclistRequest(dncListId, body));
  }

  /**
   * Update dialer DNC list
   * 
   * @param dncListId DncList ID (required)
   * @param body DncList (required)
   * @return DncList
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> putOutboundDnclistWithHttpInfo(String dncListId, DncList body) throws IOException {
    return putOutboundDnclist(createPutOutboundDnclistRequest(dncListId, body).withHttpInfo());
  }

  private PutOutboundDnclistRequest createPutOutboundDnclistRequest(String dncListId, DncList body) {
    return PutOutboundDnclistRequest.builder()
            .withDncListId(dncListId)

            .withBody(body)
            .build();
  }

  /**
   * Update dialer DNC list
   * 
   * @param request The request object
   * @return DncList
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DncList putOutboundDnclist(PutOutboundDnclistRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DncList> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DncList>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update dialer DNC list
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DncList> putOutboundDnclist(ApiRequest<DncList> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DncList>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)exception;
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
      ApiResponse<DncList> response = (ApiResponse<DncList>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet putOutboundRuleset(String ruleSetId, RuleSet body) throws IOException, ApiException {
    return  putOutboundRuleset(createPutOutboundRulesetRequest(ruleSetId, body));
  }

  /**
   * Update a RuleSet.
   * 
   * @param ruleSetId Rule Set ID (required)
   * @param body RuleSet (required)
   * @return RuleSet
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> putOutboundRulesetWithHttpInfo(String ruleSetId, RuleSet body) throws IOException {
    return putOutboundRuleset(createPutOutboundRulesetRequest(ruleSetId, body).withHttpInfo());
  }

  private PutOutboundRulesetRequest createPutOutboundRulesetRequest(String ruleSetId, RuleSet body) {
    return PutOutboundRulesetRequest.builder()
            .withRuleSetId(ruleSetId)

            .withBody(body)
            .build();
  }

  /**
   * Update a RuleSet.
   * 
   * @param request The request object
   * @return RuleSet
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public RuleSet putOutboundRuleset(PutOutboundRulesetRequest request) throws IOException, ApiException {
    try {
      ApiResponse<RuleSet> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<RuleSet>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a RuleSet.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<RuleSet> putOutboundRuleset(ApiRequest<RuleSet> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<RuleSet>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)exception;
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
      ApiResponse<RuleSet> response = (ApiResponse<RuleSet>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule putOutboundSchedulesCampaign(String campaignId, CampaignSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesCampaign(createPutOutboundSchedulesCampaignRequest(campaignId, body));
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param campaignId Campaign ID (required)
   * @param body CampaignSchedule (required)
   * @return CampaignSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaignWithHttpInfo(String campaignId, CampaignSchedule body) throws IOException {
    return putOutboundSchedulesCampaign(createPutOutboundSchedulesCampaignRequest(campaignId, body).withHttpInfo());
  }

  private PutOutboundSchedulesCampaignRequest createPutOutboundSchedulesCampaignRequest(String campaignId, CampaignSchedule body) {
    return PutOutboundSchedulesCampaignRequest.builder()
            .withCampaignId(campaignId)

            .withBody(body)
            .build();
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request The request object
   * @return CampaignSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSchedule putOutboundSchedulesCampaign(PutOutboundSchedulesCampaignRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new campaign schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSchedule> putOutboundSchedulesCampaign(ApiRequest<CampaignSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSchedule> response = (ApiResponse<CampaignSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule putOutboundSchedulesSequence(String sequenceId, SequenceSchedule body) throws IOException, ApiException {
    return  putOutboundSchedulesSequence(createPutOutboundSchedulesSequenceRequest(sequenceId, body));
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param sequenceId Sequence ID (required)
   * @param body SequenceSchedule (required)
   * @return SequenceSchedule
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequenceWithHttpInfo(String sequenceId, SequenceSchedule body) throws IOException {
    return putOutboundSchedulesSequence(createPutOutboundSchedulesSequenceRequest(sequenceId, body).withHttpInfo());
  }

  private PutOutboundSchedulesSequenceRequest createPutOutboundSchedulesSequenceRequest(String sequenceId, SequenceSchedule body) {
    return PutOutboundSchedulesSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .withBody(body)
            .build();
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request The request object
   * @return SequenceSchedule
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public SequenceSchedule putOutboundSchedulesSequence(PutOutboundSchedulesSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<SequenceSchedule> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<SequenceSchedule>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new sequence schedule.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<SequenceSchedule> putOutboundSchedulesSequence(ApiRequest<SequenceSchedule> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<SequenceSchedule>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)exception;
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
      ApiResponse<SequenceSchedule> response = (ApiResponse<SequenceSchedule>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence putOutboundSequence(String sequenceId, CampaignSequence body) throws IOException, ApiException {
    return  putOutboundSequence(createPutOutboundSequenceRequest(sequenceId, body));
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param sequenceId Campaign Sequence ID (required)
   * @param body Organization (required)
   * @return CampaignSequence
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> putOutboundSequenceWithHttpInfo(String sequenceId, CampaignSequence body) throws IOException {
    return putOutboundSequence(createPutOutboundSequenceRequest(sequenceId, body).withHttpInfo());
  }

  private PutOutboundSequenceRequest createPutOutboundSequenceRequest(String sequenceId, CampaignSequence body) {
    return PutOutboundSequenceRequest.builder()
            .withSequenceId(sequenceId)

            .withBody(body)
            .build();
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request The request object
   * @return CampaignSequence
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CampaignSequence putOutboundSequence(PutOutboundSequenceRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CampaignSequence> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CampaignSequence>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update a new campaign sequence.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CampaignSequence> putOutboundSequence(ApiRequest<CampaignSequence> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CampaignSequence>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)exception;
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
      ApiResponse<CampaignSequence> response = (ApiResponse<CampaignSequence>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(WrapUpCodeMapping body) throws IOException, ApiException {
    return  putOutboundWrapupcodemappings(createPutOutboundWrapupcodemappingsRequest(body));
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param body wrapUpCodeMapping (required)
   * @return WrapUpCodeMapping
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappingsWithHttpInfo(WrapUpCodeMapping body) throws IOException {
    return putOutboundWrapupcodemappings(createPutOutboundWrapupcodemappingsRequest(body).withHttpInfo());
  }

  private PutOutboundWrapupcodemappingsRequest createPutOutboundWrapupcodemappingsRequest(WrapUpCodeMapping body) {
    return PutOutboundWrapupcodemappingsRequest.builder()
            .withBody(body)
            .build();
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return WrapUpCodeMapping
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public WrapUpCodeMapping putOutboundWrapupcodemappings(PutOutboundWrapupcodemappingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<WrapUpCodeMapping> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<WrapUpCodeMapping>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update the Dialer wrap up code mapping.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<WrapUpCodeMapping> putOutboundWrapupcodemappings(ApiRequest<WrapUpCodeMapping> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<WrapUpCodeMapping>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)exception;
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
      ApiResponse<WrapUpCodeMapping> response = (ApiResponse<WrapUpCodeMapping>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

}
