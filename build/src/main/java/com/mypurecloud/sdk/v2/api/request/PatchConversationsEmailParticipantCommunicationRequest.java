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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.Wrapup;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessageListing;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;

public class PatchConversationsEmailParticipantCommunicationRequest {
    private static final Pattern JSON_MIME_PATTERN = Pattern.compile("(?i)application\\/json(;.*)?");
    private static final String[] AUTH_NAMES = new String[] { };

	private String emailId;
	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public PatchConversationsEmailParticipantCommunicationRequest withEmailId(String emailId) {
	    this.setEmailId(emailId);
	    return this;
	}

	private String participantId;
	public String getParticipantId() {
		return this.participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public PatchConversationsEmailParticipantCommunicationRequest withParticipantId(String participantId) {
	    this.setParticipantId(participantId);
	    return this;
	}

	private String communicationId;
	public String getCommunicationId() {
		return this.communicationId;
	}

	public void setCommunicationId(String communicationId) {
		this.communicationId = communicationId;
	}

	public PatchConversationsEmailParticipantCommunicationRequest withCommunicationId(String communicationId) {
	    this.setCommunicationId(communicationId);
	    return this;
	}

	private MediaParticipantRequest body;
	public MediaParticipantRequest getBody() {
		return this.body;
	}

	public void setBody(MediaParticipantRequest body) {
		this.body = body;
	}

	public PatchConversationsEmailParticipantCommunicationRequest withBody(MediaParticipantRequest body) {
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

    public PatchConversationsEmailParticipantCommunicationRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<MediaParticipantRequest> withHttpInfo() throws ApiException {
        
        // verify the required parameter 'emailId' is set
        if (this.emailId == null) {
            throw new ApiException(400, "Missing the required parameter 'emailId' when building request for PatchConversationsEmailParticipantCommunicationRequest.");
        }
        
        // verify the required parameter 'participantId' is set
        if (this.participantId == null) {
            throw new ApiException(400, "Missing the required parameter 'participantId' when building request for PatchConversationsEmailParticipantCommunicationRequest.");
        }
        
        // verify the required parameter 'communicationId' is set
        if (this.communicationId == null) {
            throw new ApiException(400, "Missing the required parameter 'communicationId' when building request for PatchConversationsEmailParticipantCommunicationRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when building request for PatchConversationsEmailParticipantCommunicationRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/conversations/emails/{emailId}/participants/{participantId}/communications/{communicationId}")
                .withPathParameter("emailId", emailId)
        
                .withPathParameter("participantId", participantId)
        
                .withPathParameter("communicationId", communicationId)
        
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

	public static Builder builder(String emailId, String participantId, String communicationId, MediaParticipantRequest body) {
	    return new Builder()
	            .withRequiredParams(emailId, participantId, communicationId, body);
	}

	public static class Builder {
		private final PatchConversationsEmailParticipantCommunicationRequest request;

		private Builder() {
			request = new PatchConversationsEmailParticipantCommunicationRequest();
		}

		public Builder withEmailId(String emailId) {
			request.setEmailId(emailId);
			return this;
		}
		public Builder withParticipantId(String participantId) {
			request.setParticipantId(participantId);
			return this;
		}
		public Builder withCommunicationId(String communicationId) {
			request.setCommunicationId(communicationId);
			return this;
		}
		public Builder withBody(MediaParticipantRequest body) {
			request.setBody(body);
			return this;
		}

		public Builder withRequiredParams(String emailId, String participantId, String communicationId, MediaParticipantRequest body) {
			request.setEmailId(emailId);
			request.setParticipantId(participantId);
			request.setCommunicationId(communicationId);
			request.setBody(body);
			return this;
		}


		public PatchConversationsEmailParticipantCommunicationRequest build() {
			return request;
		}
	}
}