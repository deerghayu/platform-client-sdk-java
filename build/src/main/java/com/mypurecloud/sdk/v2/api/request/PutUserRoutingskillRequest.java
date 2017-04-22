package com.mypurecloud.sdk.v2.api.request;

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
import com.mypurecloud.sdk.v2.model.FieldConfig;
import com.mypurecloud.sdk.v2.model.User;
import com.mypurecloud.sdk.v2.model.Adjacents;
import com.mypurecloud.sdk.v2.model.CallForwarding;
import com.mypurecloud.sdk.v2.model.UserEntityListing;
import com.mypurecloud.sdk.v2.model.Geolocation;
import com.mypurecloud.sdk.v2.model.OutOfOffice;
import com.mypurecloud.sdk.v2.model.UserQueueEntityListing;
import com.mypurecloud.sdk.v2.model.UserAuthorization;
import com.mypurecloud.sdk.v2.model.UserSkillEntityListing;
import com.mypurecloud.sdk.v2.model.RoutingStatus;
import com.mypurecloud.sdk.v2.model.UserStations;
import com.mypurecloud.sdk.v2.model.UserMe;
import com.mypurecloud.sdk.v2.model.UsersSearchResponse;
import com.mypurecloud.sdk.v2.model.UpdateUser;
import com.mypurecloud.sdk.v2.model.UserQueue;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.PresenceQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsUserDetailsQueryResponse;
import com.mypurecloud.sdk.v2.model.UserDetailsQuery;
import com.mypurecloud.sdk.v2.model.ObservationQueryResponse;
import com.mypurecloud.sdk.v2.model.ObservationQuery;
import com.mypurecloud.sdk.v2.model.UserRoutingSkillPost;
import com.mypurecloud.sdk.v2.model.UserRoutingSkill;
import com.mypurecloud.sdk.v2.model.CreateUser;
import com.mypurecloud.sdk.v2.model.UserSearchRequest;

public class PutUserRoutingskillRequest {
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PutUserRoutingskillRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	}

	private String skillId;
	public String getSkillId() {
		return this.skillId;
	}

	public void setSkillId(String skillId) {
		this.skillId = skillId;
	}

	public PutUserRoutingskillRequest withSkillId(String skillId) {
	    this.setSkillId(skillId);
	    return this;
	}

	private UserRoutingSkill body;
	public UserRoutingSkill getBody() {
		return this.body;
	}

	public void setBody(UserRoutingSkill body) {
		this.body = body;
	}

	public PutUserRoutingskillRequest withBody(UserRoutingSkill body) {
	    this.setBody(body);
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

    public PutUserRoutingskillRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UserRoutingSkill> withHttpInfo() {
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutUserRoutingskillRequest.");
        }
        
        // verify the required parameter 'skillId' is set
        if (this.skillId == null) {
            throw new IllegalStateException("Missing the required parameter 'skillId' when building request for PutUserRoutingskillRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutUserRoutingskillRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/users/{userId}/routingskills/{skillId}")
                .withPathParameter("userId", userId)
        
                .withPathParameter("skillId", skillId)
        
                .withBody(body)
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String userId, String skillId, UserRoutingSkill body) {
	    return new Builder()
	            .withRequiredParams(userId, skillId, body);
	}

	public static class Builder {
		private final PutUserRoutingskillRequest request;

		private Builder() {
			request = new PutUserRoutingskillRequest();
		}

		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		public Builder withSkillId(String skillId) {
			request.setSkillId(skillId);
			return this;
		}
		public Builder withBody(UserRoutingSkill body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String userId, String skillId, UserRoutingSkill body) {
			request.setUserId(userId);
			request.setSkillId(skillId);
			request.setBody(body);
			return this;
		}


		public PutUserRoutingskillRequest build() {
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PutUserRoutingskillRequest.");
            }
            
            // verify the required parameter 'skillId' is set
            if (request.skillId == null) {
                throw new IllegalStateException("Missing the required parameter 'skillId' when building request for PutUserRoutingskillRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutUserRoutingskillRequest.");
            }
            
			return request;
		}
	}
}
