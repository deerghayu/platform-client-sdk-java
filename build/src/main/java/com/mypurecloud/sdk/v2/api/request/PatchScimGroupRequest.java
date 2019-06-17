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

import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.ScimV2Group;
import com.mypurecloud.sdk.v2.model.ScimListResponse;
import com.mypurecloud.sdk.v2.model.ScimV2User;
import com.mypurecloud.sdk.v2.model.ScimServiceProviderConfig;
import com.mypurecloud.sdk.v2.model.PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2PatchRequest;
import com.mypurecloud.sdk.v2.model.ScimV2CreateUser;

public class PatchScimGroupRequest {
    
	private String groupId;
	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public PatchScimGroupRequest withGroupId(String groupId) {
	    this.setGroupId(groupId);
	    return this;
	} 
	
	private PatchRequest body;
	public PatchRequest getBody() {
		return this.body;
	}

	public void setBody(PatchRequest body) {
		this.body = body;
	}

	public PatchScimGroupRequest withBody(PatchRequest body) {
	    this.setBody(body);
	    return this;
	} 
	
	private String ifMatch;
	public String getIfMatch() {
		return this.ifMatch;
	}

	public void setIfMatch(String ifMatch) {
		this.ifMatch = ifMatch;
	}

	public PatchScimGroupRequest withIfMatch(String ifMatch) {
	    this.setIfMatch(ifMatch);
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

    public PatchScimGroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<PatchRequest> withHttpInfo() {
        
        // verify the required parameter 'groupId' is set
        if (this.groupId == null) {
            throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchScimGroupRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchScimGroupRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/scim/groups/{groupId}")
                .withPathParameter("groupId", groupId)
        
                .withHeaderParameter("If-Match", ifMatch)
        
                .withBody(body)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json", "application/scim+json")
                .withAccepts("application/json", "application/scim+json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String groupId, PatchRequest body) {
	    return new Builder()
	            .withRequiredParams(groupId, body);
	}
	

	public static class Builder {
		private final PatchScimGroupRequest request;

		private Builder() {
			request = new PatchScimGroupRequest();
		}

		
		public Builder withGroupId(String groupId) {
			request.setGroupId(groupId);
			return this;
		}
		
		public Builder withBody(PatchRequest body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withIfMatch(String ifMatch) {
			request.setIfMatch(ifMatch);
			return this;
		}
		

		
		public Builder withRequiredParams(String groupId, PatchRequest body) {
			request.setGroupId(groupId);
						request.setBody(body);
			
			return this;
		}
		

		public PatchScimGroupRequest build() {
            
            // verify the required parameter 'groupId' is set
            if (request.groupId == null) {
                throw new IllegalStateException("Missing the required parameter 'groupId' when building request for PatchScimGroupRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PatchScimGroupRequest.");
            }
            
			return request;
		}
	}
}
