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
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.ChangePasswordRequest;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.ChangeMyPasswordRequest;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;

public class GetAuthorizationDivisionspermittedSubjectIdRequest {
    
	private String subjectId;
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public GetAuthorizationDivisionspermittedSubjectIdRequest withSubjectId(String subjectId) {
	    this.setSubjectId(subjectId);
	    return this;
	} 
	
	private String permission;
	public String getPermission() {
		return this.permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public GetAuthorizationDivisionspermittedSubjectIdRequest withPermission(String permission) {
	    this.setPermission(permission);
	    return this;
	} 
	
	private String name;
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public GetAuthorizationDivisionspermittedSubjectIdRequest withName(String name) {
	    this.setName(name);
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

    public GetAuthorizationDivisionspermittedSubjectIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'subjectId' is set
        if (this.subjectId == null) {
            throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for GetAuthorizationDivisionspermittedSubjectIdRequest.");
        }
        
        // verify the required parameter 'permission' is set
        if (this.permission == null) {
            throw new IllegalStateException("Missing the required parameter 'permission' when building request for GetAuthorizationDivisionspermittedSubjectIdRequest.");
        }
        

        return ApiRequestBuilder.create("GET", "/api/v2/authorization/divisionspermitted/{subjectId}")
                .withPathParameter("subjectId", subjectId)
        
                .withQueryParameters("name", "", name)
        
                .withQueryParameters("permission", "", permission)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String subjectId, String permission) {
	    return new Builder()
	            .withRequiredParams(subjectId, permission);
	}
	

	public static class Builder {
		private final GetAuthorizationDivisionspermittedSubjectIdRequest request;

		private Builder() {
			request = new GetAuthorizationDivisionspermittedSubjectIdRequest();
		}

		
		public Builder withSubjectId(String subjectId) {
			request.setSubjectId(subjectId);
			return this;
		}
		
		public Builder withPermission(String permission) {
			request.setPermission(permission);
			return this;
		}
		
		public Builder withName(String name) {
			request.setName(name);
			return this;
		}
		

		
		public Builder withRequiredParams(String subjectId, String permission) {
			request.setSubjectId(subjectId);
						request.setPermission(permission);
			
			return this;
		}
		

		public GetAuthorizationDivisionspermittedSubjectIdRequest build() {
            
            // verify the required parameter 'subjectId' is set
            if (request.subjectId == null) {
                throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for GetAuthorizationDivisionspermittedSubjectIdRequest.");
            }
            
            // verify the required parameter 'permission' is set
            if (request.permission == null) {
                throw new IllegalStateException("Missing the required parameter 'permission' when building request for GetAuthorizationDivisionspermittedSubjectIdRequest.");
            }
            
			return request;
		}
	}
}