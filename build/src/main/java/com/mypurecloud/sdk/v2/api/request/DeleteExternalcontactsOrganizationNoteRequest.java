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
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.RelationshipListing;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationListing;
import com.mypurecloud.sdk.v2.model.Relationship;
import com.mypurecloud.sdk.v2.model.ReverseWhitepagesLookupResult;
import com.mypurecloud.sdk.v2.model.ConversationAssociation;

public class DeleteExternalcontactsOrganizationNoteRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String externalOrganizationId;
	public String getExternalOrganizationId() {
		return this.externalOrganizationId;
	}

	public void setExternalOrganizationId(String externalOrganizationId) {
		this.externalOrganizationId = externalOrganizationId;
	}

	public DeleteExternalcontactsOrganizationNoteRequest withExternalOrganizationId(String externalOrganizationId) {
	    this.setExternalOrganizationId(externalOrganizationId);
	    return this;
	}

	private String noteId;
	public String getNoteId() {
		return this.noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	public DeleteExternalcontactsOrganizationNoteRequest withNoteId(String noteId) {
	    this.setNoteId(noteId);
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

    public DeleteExternalcontactsOrganizationNoteRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'externalOrganizationId' is set
        if (this.externalOrganizationId == null) {
            throw new ApiException(400, "Missing the required parameter 'externalOrganizationId' when building request for DeleteExternalcontactsOrganizationNoteRequest.");
        }
        
        // verify the required parameter 'noteId' is set
        if (this.noteId == null) {
            throw new ApiException(400, "Missing the required parameter 'noteId' when building request for DeleteExternalcontactsOrganizationNoteRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/externalcontacts/organizations/{externalOrganizationId}/notes/{noteId}")
                .withPathParameter("externalOrganizationId", externalOrganizationId)
        
                .withPathParameter("noteId", noteId)
                        .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	public static Builder builder(String externalOrganizationId, String noteId) {
	    return new Builder()
	            .withRequiredParams(externalOrganizationId, noteId);
	}

	public static class Builder {
		private final DeleteExternalcontactsOrganizationNoteRequest request;

		private Builder() {
			request = new DeleteExternalcontactsOrganizationNoteRequest();
		}

		public Builder withExternalOrganizationId(String externalOrganizationId) {
			request.setExternalOrganizationId(externalOrganizationId);
			return this;
		}
		public Builder withNoteId(String noteId) {
			request.setNoteId(noteId);
			return this;
		}

		public Builder withRequiredParams(String externalOrganizationId, String noteId) {
			request.setExternalOrganizationId(externalOrganizationId);
			request.setNoteId(noteId);
			return this;
		}


		public DeleteExternalcontactsOrganizationNoteRequest build() {
			return request;
		}
	}
}