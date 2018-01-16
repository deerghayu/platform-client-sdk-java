package com.mypurecloud.sdk.v2.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiRequestBuilder;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OrphanRecording;
import com.mypurecloud.sdk.v2.model.Recording;
import com.mypurecloud.sdk.v2.model.Annotation;
import com.mypurecloud.sdk.v2.model.OrphanRecordingListing;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobStatusResult;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfigurationListing;
import com.mypurecloud.sdk.v2.model.PolicyEntityListing;
import com.mypurecloud.sdk.v2.model.Policy;
import com.mypurecloud.sdk.v2.model.EncryptionKeyEntityListing;
import com.mypurecloud.sdk.v2.model.KeyRotationSchedule;
import com.mypurecloud.sdk.v2.model.RecordingSettings;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionListing;
import com.mypurecloud.sdk.v2.model.ScreenRecordingSessionRequest;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmission;
import com.mypurecloud.sdk.v2.model.BatchDownloadJobSubmissionResult;
import com.mypurecloud.sdk.v2.model.LocalEncryptionKeyRequest;
import com.mypurecloud.sdk.v2.model.EncryptionKey;
import com.mypurecloud.sdk.v2.model.PolicyCreate;
import com.mypurecloud.sdk.v2.model.OrphanUpdateRequest;

public class DeleteConversationRecordingAnnotationRequest {
    
	private String conversationId;
	public String getConversationId() {
		return this.conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public DeleteConversationRecordingAnnotationRequest withConversationId(String conversationId) {
	    this.setConversationId(conversationId);
	    return this;
	} 
	
	private String recordingId;
	public String getRecordingId() {
		return this.recordingId;
	}

	public void setRecordingId(String recordingId) {
		this.recordingId = recordingId;
	}

	public DeleteConversationRecordingAnnotationRequest withRecordingId(String recordingId) {
	    this.setRecordingId(recordingId);
	    return this;
	} 
	
	private String annotationId;
	public String getAnnotationId() {
		return this.annotationId;
	}

	public void setAnnotationId(String annotationId) {
		this.annotationId = annotationId;
	}

	public DeleteConversationRecordingAnnotationRequest withAnnotationId(String annotationId) {
	    this.setAnnotationId(annotationId);
	    return this;
	} 
	
	private final Map<String, String> customHeaders = new HashMap<>();
    public Map<String, String> getCustomHeaders() {
        return this.customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders.clear();
        this.customHeaders.putAll(customHeaders);
    }

    public void addCustomHeader(String name, String value) {
        this.customHeaders.put(name, value);
    }

    public DeleteConversationRecordingAnnotationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'conversationId' is set
        if (this.conversationId == null) {
            throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for DeleteConversationRecordingAnnotationRequest.");
        }
        
        // verify the required parameter 'recordingId' is set
        if (this.recordingId == null) {
            throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for DeleteConversationRecordingAnnotationRequest.");
        }
        
        // verify the required parameter 'annotationId' is set
        if (this.annotationId == null) {
            throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for DeleteConversationRecordingAnnotationRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/conversations/{conversationId}/recordings/{recordingId}/annotations/{annotationId}")
                .withPathParameter("conversationId", conversationId)
        
                .withPathParameter("recordingId", recordingId)
        
                .withPathParameter("annotationId", annotationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String conversationId, String recordingId, String annotationId) {
	    return new Builder()
	            .withRequiredParams(conversationId, recordingId, annotationId);
	}
	

	public static class Builder {
		private final DeleteConversationRecordingAnnotationRequest request;

		private Builder() {
			request = new DeleteConversationRecordingAnnotationRequest();
		}

		
		public Builder withConversationId(String conversationId) {
			request.setConversationId(conversationId);
			return this;
		}
		
		public Builder withRecordingId(String recordingId) {
			request.setRecordingId(recordingId);
			return this;
		}
		
		public Builder withAnnotationId(String annotationId) {
			request.setAnnotationId(annotationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String conversationId, String recordingId, String annotationId) {
			request.setConversationId(conversationId);
						request.setRecordingId(recordingId);
						request.setAnnotationId(annotationId);
			
			return this;
		}
		

		public DeleteConversationRecordingAnnotationRequest build() {
            
            // verify the required parameter 'conversationId' is set
            if (request.conversationId == null) {
                throw new IllegalStateException("Missing the required parameter 'conversationId' when building request for DeleteConversationRecordingAnnotationRequest.");
            }
            
            // verify the required parameter 'recordingId' is set
            if (request.recordingId == null) {
                throw new IllegalStateException("Missing the required parameter 'recordingId' when building request for DeleteConversationRecordingAnnotationRequest.");
            }
            
            // verify the required parameter 'annotationId' is set
            if (request.annotationId == null) {
                throw new IllegalStateException("Missing the required parameter 'annotationId' when building request for DeleteConversationRecordingAnnotationRequest.");
            }
            
			return request;
		}
	}
}
