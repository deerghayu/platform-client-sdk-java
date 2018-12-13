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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;

public class DeleteResponsemanagementResponseRequest {
    
	private String responseId;
	public String getResponseId() {
		return this.responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public DeleteResponsemanagementResponseRequest withResponseId(String responseId) {
	    this.setResponseId(responseId);
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

    public DeleteResponsemanagementResponseRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'responseId' is set
        if (this.responseId == null) {
            throw new IllegalStateException("Missing the required parameter 'responseId' when building request for DeleteResponsemanagementResponseRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/responsemanagement/responses/{responseId}")
                .withPathParameter("responseId", responseId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String responseId) {
	    return new Builder()
	            .withRequiredParams(responseId);
	}
	

	public static class Builder {
		private final DeleteResponsemanagementResponseRequest request;

		private Builder() {
			request = new DeleteResponsemanagementResponseRequest();
		}

		
		public Builder withResponseId(String responseId) {
			request.setResponseId(responseId);
			return this;
		}
		

		
		public Builder withRequiredParams(String responseId) {
			request.setResponseId(responseId);
			
			return this;
		}
		

		public DeleteResponsemanagementResponseRequest build() {
            
            // verify the required parameter 'responseId' is set
            if (request.responseId == null) {
                throw new IllegalStateException("Missing the required parameter 'responseId' when building request for DeleteResponsemanagementResponseRequest.");
            }
            
			return request;
		}
	}
}
