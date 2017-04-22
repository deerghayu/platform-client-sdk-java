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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.Note;
import com.mypurecloud.sdk.v2.model.NoteListing;
import com.mypurecloud.sdk.v2.model.ContactListing;
import com.mypurecloud.sdk.v2.model.DataSchema;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class DeleteExternalcontactsRelationshipRequest {
	private String relationshipId;
	public String getRelationshipId() {
		return this.relationshipId;
	}

	public void setRelationshipId(String relationshipId) {
		this.relationshipId = relationshipId;
	}

	public DeleteExternalcontactsRelationshipRequest withRelationshipId(String relationshipId) {
	    this.setRelationshipId(relationshipId);
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

    public DeleteExternalcontactsRelationshipRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'relationshipId' is set
        if (this.relationshipId == null) {
            throw new IllegalStateException("Missing the required parameter 'relationshipId' when building request for DeleteExternalcontactsRelationshipRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/externalcontacts/relationships/{relationshipId}")
                .withPathParameter("relationshipId", relationshipId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String relationshipId) {
	    return new Builder()
	            .withRequiredParams(relationshipId);
	}

	public static class Builder {
		private final DeleteExternalcontactsRelationshipRequest request;

		private Builder() {
			request = new DeleteExternalcontactsRelationshipRequest();
		}

		public Builder withRelationshipId(String relationshipId) {
			request.setRelationshipId(relationshipId);
			return this;
		}

		public Builder withRequiredParams(String relationshipId) {
			request.setRelationshipId(relationshipId);
			return this;
		}


		public DeleteExternalcontactsRelationshipRequest build() {
            
            // verify the required parameter 'relationshipId' is set
            if (request.relationshipId == null) {
                throw new IllegalStateException("Missing the required parameter 'relationshipId' when building request for DeleteExternalcontactsRelationshipRequest.");
            }
            
			return request;
		}
	}
}
