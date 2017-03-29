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
import com.mypurecloud.sdk.v2.model.LibraryEntityListing;
import com.mypurecloud.sdk.v2.model.Library;
import com.mypurecloud.sdk.v2.model.Response;
import com.mypurecloud.sdk.v2.model.ResponseEntityListing;
import com.mypurecloud.sdk.v2.model.ResponseQueryResults;
import com.mypurecloud.sdk.v2.model.ResponseQueryRequest;

public class PutResponsemanagementResponseRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String responseId;
	public String getResponseId() {
		return this.responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public PutResponsemanagementResponseRequest withResponseId(String responseId) {
	    this.setResponseId(responseId);
	    return this;
	}

	private Response body;
	public Response getBody() {
		return this.body;
	}

	public void setBody(Response body) {
		this.body = body;
	}

	public PutResponsemanagementResponseRequest withBody(Response body) {
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

    public PutResponsemanagementResponseRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Response> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'responseId' is set
        if (this.responseId == null) {
            throw new ApiException(400, "Missing the required parameter 'responseId' when building request for PutResponsemanagementResponseRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PutResponsemanagementResponseRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/responsemanagement/responses/{responseId}")
                .withPathParameter("responseId", responseId)
        
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

	public static Builder builder(String responseId, Response body) {
	    return new Builder()
	            .withRequiredParams(responseId, body);
	}

	public static class Builder {
		private final PutResponsemanagementResponseRequest request;

		private Builder() {
			request = new PutResponsemanagementResponseRequest();
		}

		public Builder withResponseId(String responseId) {
			request.setResponseId(responseId);
			return this;
		}
		public Builder withBody(Response body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String responseId, Response body) {
			request.setResponseId(responseId);
			request.setBody(body);
			return this;
		}


		public PutResponsemanagementResponseRequest build() {
			return request;
		}
	}
}