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
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.AuthzDivision;
import com.mypurecloud.sdk.v2.model.AuthzSubject;
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.UserProfileEntityListing;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.UserExternalIdentifier;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserProfile;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserLanguageEntityListing;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.TrustorEntityListing;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UpdateUser;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguage;
import com.mypurecloud.sdk.v2.model.UserRoutingLanguagePost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.PatchUser;
import com.mypurecloud.sdk.v2.model.UserAggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.UserAggregationQuery;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.UserObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.UserObservationQuery;
import com.mypurecloud.sdk.v2.model.RoleDivisionGrants;
import com.mypurecloud.sdk.v2.model.ChangePasswordRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.ChangeMyPasswordRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;

public class DeleteUserExternalidAuthorityNameExternalKeyRequest {
    
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public DeleteUserExternalidAuthorityNameExternalKeyRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private String authorityName;
	public String getAuthorityName() {
		return this.authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	public DeleteUserExternalidAuthorityNameExternalKeyRequest withAuthorityName(String authorityName) {
	    this.setAuthorityName(authorityName);
	    return this;
	} 
	
	private String externalKey;
	public String getExternalKey() {
		return this.externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public DeleteUserExternalidAuthorityNameExternalKeyRequest withExternalKey(String externalKey) {
	    this.setExternalKey(externalKey);
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

    public DeleteUserExternalidAuthorityNameExternalKeyRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
        }
        
        // verify the required parameter 'authorityName' is set
        if (this.authorityName == null) {
            throw new IllegalStateException("Missing the required parameter 'authorityName' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
        }
        
        // verify the required parameter 'externalKey' is set
        if (this.externalKey == null) {
            throw new IllegalStateException("Missing the required parameter 'externalKey' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/users/{userId}/externalid/{authorityName}/{externalKey}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("authorityName", authorityName)
        
                .withPathParameter("externalKey", externalKey)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String userId, String authorityName, String externalKey) {
	    return new Builder()
	            .withRequiredParams(userId, authorityName, externalKey);
	}
	

	public static class Builder {
		private final DeleteUserExternalidAuthorityNameExternalKeyRequest request;

		private Builder() {
			request = new DeleteUserExternalidAuthorityNameExternalKeyRequest();
		}

		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withAuthorityName(String authorityName) {
			request.setAuthorityName(authorityName);
			return this;
		}
		
		public Builder withExternalKey(String externalKey) {
			request.setExternalKey(externalKey);
			return this;
		}
		

		
		public Builder withRequiredParams(String userId, String authorityName, String externalKey) {
			request.setUserId(userId);
						request.setAuthorityName(authorityName);
						request.setExternalKey(externalKey);
			
			return this;
		}
		

		public DeleteUserExternalidAuthorityNameExternalKeyRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
            }
            
            // verify the required parameter 'authorityName' is set
            if (request.authorityName == null) {
                throw new IllegalStateException("Missing the required parameter 'authorityName' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
            }
            
            // verify the required parameter 'externalKey' is set
            if (request.externalKey == null) {
                throw new IllegalStateException("Missing the required parameter 'externalKey' when building request for DeleteUserExternalidAuthorityNameExternalKeyRequest.");
            }
            
			return request;
		}
	}
}
