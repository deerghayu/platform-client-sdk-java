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

public class PatchUserQueueRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String queueId;
	public String getQueueId() {
		return this.queueId;
	}

	public void setQueueId(String queueId) {
		this.queueId = queueId;
	}

	public PatchUserQueueRequest withQueueId(String queueId) {
	    this.setQueueId(queueId);
	    return this;
	}

	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PatchUserQueueRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	}

	private UserQueue body;
	public UserQueue getBody() {
		return this.body;
	}

	public void setBody(UserQueue body) {
		this.body = body;
	}

	public PatchUserQueueRequest withBody(UserQueue body) {
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

    public PatchUserQueueRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<UserQueue> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'queueId' is set
        if (this.queueId == null) {
            throw new ApiException(400, "Missing the required parameter 'queueId' when building request for PatchUserQueueRequest.");
        }
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new ApiException(400, "Missing the required parameter 'userId' when building request for PatchUserQueueRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PatchUserQueueRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/users/{userId}/queues/{queueId}")
                .withPathParameter("queueId", queueId)
        
                .withPathParameter("userId", userId)
        
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

	public static Builder builder(String queueId, String userId, UserQueue body) {
	    return new Builder()
	            .withRequiredParams(queueId, userId, body);
	}

	public static class Builder {
		private final PatchUserQueueRequest request;

		private Builder() {
			request = new PatchUserQueueRequest();
		}

		public Builder withQueueId(String queueId) {
			request.setQueueId(queueId);
			return this;
		}
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		public Builder withBody(UserQueue body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String queueId, String userId, UserQueue body) {
			request.setQueueId(queueId);
			request.setUserId(userId);
			request.setBody(body);
			return this;
		}


		public PatchUserQueueRequest build() {
			return request;
		}
	}
}