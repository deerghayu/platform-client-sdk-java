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

public class PostAuthorizationSubjectDivisionRoleRequest {
    
	private String subjectId;
	public String getSubjectId() {
		return this.subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public PostAuthorizationSubjectDivisionRoleRequest withSubjectId(String subjectId) {
	    this.setSubjectId(subjectId);
	    return this;
	} 
	
	private String divisionId;
	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public PostAuthorizationSubjectDivisionRoleRequest withDivisionId(String divisionId) {
	    this.setDivisionId(divisionId);
	    return this;
	} 
	
	private String roleId;
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public PostAuthorizationSubjectDivisionRoleRequest withRoleId(String roleId) {
	    this.setRoleId(roleId);
	    return this;
	} 
	
	private String subjectType;
	public String getSubjectType() {
		return this.subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public PostAuthorizationSubjectDivisionRoleRequest withSubjectType(String subjectType) {
	    this.setSubjectType(subjectType);
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

    public PostAuthorizationSubjectDivisionRoleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'subjectId' is set
        if (this.subjectId == null) {
            throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
        }
        
        // verify the required parameter 'divisionId' is set
        if (this.divisionId == null) {
            throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
        }
        
        // verify the required parameter 'roleId' is set
        if (this.roleId == null) {
            throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/authorization/subjects/{subjectId}/divisions/{divisionId}/roles/{roleId}")
                .withPathParameter("subjectId", subjectId)
        
                .withPathParameter("divisionId", divisionId)
        
                .withPathParameter("roleId", roleId)
        
                .withQueryParameters("subjectType", "", subjectType)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String subjectId, String divisionId, String roleId) {
	    return new Builder()
	            .withRequiredParams(subjectId, divisionId, roleId);
	}
	

	public static class Builder {
		private final PostAuthorizationSubjectDivisionRoleRequest request;

		private Builder() {
			request = new PostAuthorizationSubjectDivisionRoleRequest();
		}

		
		public Builder withSubjectId(String subjectId) {
			request.setSubjectId(subjectId);
			return this;
		}
		
		public Builder withDivisionId(String divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}
		
		public Builder withRoleId(String roleId) {
			request.setRoleId(roleId);
			return this;
		}
		
		public Builder withSubjectType(String subjectType) {
			request.setSubjectType(subjectType);
			return this;
		}
		

		
		public Builder withRequiredParams(String subjectId, String divisionId, String roleId) {
			request.setSubjectId(subjectId);
						request.setDivisionId(divisionId);
						request.setRoleId(roleId);
			
			return this;
		}
		

		public PostAuthorizationSubjectDivisionRoleRequest build() {
            
            // verify the required parameter 'subjectId' is set
            if (request.subjectId == null) {
                throw new IllegalStateException("Missing the required parameter 'subjectId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
            }
            
            // verify the required parameter 'divisionId' is set
            if (request.divisionId == null) {
                throw new IllegalStateException("Missing the required parameter 'divisionId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
            }
            
            // verify the required parameter 'roleId' is set
            if (request.roleId == null) {
                throw new IllegalStateException("Missing the required parameter 'roleId' when building request for PostAuthorizationSubjectDivisionRoleRequest.");
            }
            
			return request;
		}
	}
}
