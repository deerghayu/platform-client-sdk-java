package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.SettableFuture;

import com.mypurecloud.sdk.v2.AsyncApiCallback;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionStatusResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryExecutionResultsResponse;
import com.mypurecloud.sdk.v2.model.AuditQueryRequest;


import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdRequest;
import com.mypurecloud.sdk.v2.api.request.GetAuditsQueryTransactionIdResultsRequest;
import com.mypurecloud.sdk.v2.api.request.PostAuditsQueryRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;


public class AuditApiAsync {
  private final ApiClient pcapiClient;

  public AuditApiAsync() {
    this(Configuration.getDefaultApiClient());
  }

  public AuditApiAsync(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Get status of audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuditQueryExecutionStatusResponse> getAuditsQueryTransactionIdAsync(GetAuditsQueryTransactionIdRequest request, final AsyncApiCallback<AuditQueryExecutionStatusResponse> callback) {
    try {
      final SettableFuture<AuditQueryExecutionStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get status of audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuditQueryExecutionStatusResponse>> getAuditsQueryTransactionIdAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AuditQueryExecutionStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Get results of audit query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuditQueryExecutionResultsResponse> getAuditsQueryTransactionIdResultsAsync(GetAuditsQueryTransactionIdResultsRequest request, final AsyncApiCallback<AuditQueryExecutionResultsResponse> callback) {
    try {
      final SettableFuture<AuditQueryExecutionResultsResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuditQueryExecutionResultsResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionResultsResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Get results of audit query
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuditQueryExecutionResultsResponse>> getAuditsQueryTransactionIdResultsAsync(ApiRequest<Void> request, final AsyncApiCallback<ApiResponse<AuditQueryExecutionResultsResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AuditQueryExecutionResultsResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuditQueryExecutionResultsResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionResultsResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionResultsResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionResultsResponse> response = (ApiResponse<AuditQueryExecutionResultsResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionResultsResponse> response = (ApiResponse<AuditQueryExecutionResultsResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  
  /**
   * Create audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<AuditQueryExecutionStatusResponse> postAuditsQueryAsync(PostAuditsQueryRequest request, final AsyncApiCallback<AuditQueryExecutionStatusResponse> callback) {
    try {
      final SettableFuture<AuditQueryExecutionStatusResponse> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request.withHttpInfo(), new TypeReference<AuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response.getBody());
        }

        @Override
        public void onFailed(Throwable exception) {
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            notifySuccess(future, callback, null);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  /**
   * Create audit query execution
   * 
   * @param request the request object
   * @param callback the action to perform when the request is completed
   * @return the future indication when the request has completed
   */
  public Future<ApiResponse<AuditQueryExecutionStatusResponse>> postAuditsQueryAsync(ApiRequest<AuditQueryRequest> request, final AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>> callback) {
    try {
      final SettableFuture<ApiResponse<AuditQueryExecutionStatusResponse>> future = SettableFuture.create();
      final boolean shouldThrowErrors = pcapiClient.getShouldThrowErrors();
      pcapiClient.invokeAsync(request, new TypeReference<AuditQueryExecutionStatusResponse>() {}, new AsyncApiCallback<ApiResponse<AuditQueryExecutionStatusResponse>>() {
        @Override
        public void onCompleted(ApiResponse<AuditQueryExecutionStatusResponse> response) {
          notifySuccess(future, callback, response);
        }

        @Override
        public void onFailed(Throwable exception) {
          if (exception instanceof ApiException) {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)exception;
            notifySuccess(future, callback, response);
          }
          if (shouldThrowErrors) {
            notifyFailure(future, callback, exception);
          }
          else {
            @SuppressWarnings("unchecked")
            ApiResponse<AuditQueryExecutionStatusResponse> response = (ApiResponse<AuditQueryExecutionStatusResponse>)(ApiResponse<?>)(new ApiException(exception));
            notifySuccess(future, callback, response);
          }
        }
      });
      return future;
    }
    catch (Throwable exception) {
      return Futures.immediateFailedFuture(exception);
    }
  }

  

  private <T> void notifySuccess(SettableFuture<T> future, AsyncApiCallback<T> callback, T result) {
    if (callback != null) {
      try {
        callback.onCompleted(result);
        future.set(result);
      }
      catch (Throwable exception) {
        future.setException(exception);
      }
    }
    else {
      future.set(result);
    }
  }

  private <T> void notifyFailure(SettableFuture<T> future, AsyncApiCallback<T> callback, Throwable exception) {
    if (callback != null) {
      try {
        callback.onFailed(exception);
        future.setException(exception);
      }
      catch (Throwable callbackException) {
        future.setException(callbackException);
      }
    }
    else {
      future.setException(exception);
    }
  }
}
