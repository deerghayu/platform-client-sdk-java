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

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.OAuthClient;
import com.mypurecloud.sdk.v2.model.OAuthClientEntityListing;

public class PostOauthClientSecretRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String clientId;
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public PostOauthClientSecretRequest withClientId(String clientId) {
	    this.setClientId(clientId);
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

    public PostOauthClientSecretRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'clientId' is set
        if (this.clientId == null) {
            throw new ApiException(400, "Missing the required parameter 'clientId' when building request for PostOauthClientSecretRequest.");
        }
        

        return ApiRequestBuilder.create("POST", "/api/v2/oauth/clients/{clientId}/secret")
                .withPathParameter("clientId", clientId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String clientId) {
	    return new Builder()
	            .withRequiredParams(clientId);
	}

	public static class Builder {
		private final PostOauthClientSecretRequest request;

		private Builder() {
			request = new PostOauthClientSecretRequest();
		}

		public Builder withClientId(String clientId) {
			request.setClientId(clientId);
			return this;
		}

		public Builder withRequiredParams(String clientId) {
			request.setClientId(clientId);
			return this;
		}


		public PostOauthClientSecretRequest build() {
			return request;
		}
	}
}