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
import com.mypurecloud.sdk.v2.model.AnalyticsConversation;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationMultiGetResponse;
import com.mypurecloud.sdk.v2.model.AsyncQueryStatus;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationAsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.Conversation;
import com.mypurecloud.sdk.v2.model.SecureSession;
import com.mypurecloud.sdk.v2.model.SecureSessionEntityListing;
import com.mypurecloud.sdk.v2.model.AssignedWrapupCode;
import com.mypurecloud.sdk.v2.model.WrapupCode;
import com.mypurecloud.sdk.v2.model.ConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversation;
import com.mypurecloud.sdk.v2.model.CallbackConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CallHistoryConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MaxParticipants;
import com.mypurecloud.sdk.v2.model.ChatConversation;
import com.mypurecloud.sdk.v2.model.ChatConversationEntityListing;
import com.mypurecloud.sdk.v2.model.CobrowseConversation;
import com.mypurecloud.sdk.v2.model.CobrowseConversationEntityListing;
import com.mypurecloud.sdk.v2.model.EmailConversation;
import com.mypurecloud.sdk.v2.model.EmailMessage;
import com.mypurecloud.sdk.v2.model.EmailMessageListing;
import com.mypurecloud.sdk.v2.model.EmailConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MessageConversation;
import com.mypurecloud.sdk.v2.model.MessageMediaData;
import com.mypurecloud.sdk.v2.model.MessageData;
import com.mypurecloud.sdk.v2.model.MessageConversationEntityListing;
import com.mypurecloud.sdk.v2.model.MessagingIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.FacebookIntegration;
import com.mypurecloud.sdk.v2.model.LineIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.LineIntegration;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.TwitterIntegration;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegration;
import com.mypurecloud.sdk.v2.model.MessagingStickerEntityListing;
import com.mypurecloud.sdk.v2.model.MediaParticipantRequest;
import com.mypurecloud.sdk.v2.model.ParticipantAttributes;
import com.mypurecloud.sdk.v2.model.Empty;
import com.mypurecloud.sdk.v2.model.ConsultTransferUpdate;
import com.mypurecloud.sdk.v2.model.ConsultTransferResponse;
import com.mypurecloud.sdk.v2.model.WhatsAppIntegrationUpdateRequest;
import com.mypurecloud.sdk.v2.model.PropertyIndexRequest;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import com.mypurecloud.sdk.v2.model.AsyncQueryResponse;
import com.mypurecloud.sdk.v2.model.AnalyticsConversationQueryResponse;
import com.mypurecloud.sdk.v2.model.ConversationQuery;
import com.mypurecloud.sdk.v2.model.CreateCallbackOnConversationCommand;
import com.mypurecloud.sdk.v2.model.Digits;
import com.mypurecloud.sdk.v2.model.TransferRequest;
import com.mypurecloud.sdk.v2.model.CreateSecureSession;
import com.mypurecloud.sdk.v2.model.CallCommand;
import com.mypurecloud.sdk.v2.model.ConsultTransfer;
import com.mypurecloud.sdk.v2.model.CreateCallbackResponse;
import com.mypurecloud.sdk.v2.model.CreateCallbackCommand;
import com.mypurecloud.sdk.v2.model.CreateCallRequest;
import com.mypurecloud.sdk.v2.model.CreateCallResponse;
import com.mypurecloud.sdk.v2.model.CreateWebChatRequest;
import com.mypurecloud.sdk.v2.model.InboundMessageRequest;
import com.mypurecloud.sdk.v2.model.CreateEmailRequest;
import com.mypurecloud.sdk.v2.model.FaxSendResponse;
import com.mypurecloud.sdk.v2.model.FaxSendRequest;
import com.mypurecloud.sdk.v2.model.AdditionalMessage;
import com.mypurecloud.sdk.v2.model.TextMessageListing;
import com.mypurecloud.sdk.v2.model.CreateOutboundMessagingConversationRequest;
import com.mypurecloud.sdk.v2.model.FacebookIntegrationRequest;
import com.mypurecloud.sdk.v2.model.LineIntegrationRequest;
import com.mypurecloud.sdk.v2.model.TwitterIntegrationRequest;
import com.mypurecloud.sdk.v2.model.SetUuiDataRequest;

public class DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest {
    
	private String integrationId;
	public String getIntegrationId() {
		return this.integrationId;
	}

	public void setIntegrationId(String integrationId) {
		this.integrationId = integrationId;
	}

	public DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest withIntegrationId(String integrationId) {
	    this.setIntegrationId(integrationId);
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

    public DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        
        // verify the required parameter 'integrationId' is set
        if (this.integrationId == null) {
            throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest.");
        }
        

        return ApiRequestBuilder.create("DELETE", "/api/v2/conversations/messaging/integrations/line/{integrationId}")
                .withPathParameter("integrationId", integrationId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud OAuth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	
	public static Builder builder(String integrationId) {
	    return new Builder()
	            .withRequiredParams(integrationId);
	}
	

	public static class Builder {
		private final DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest request;

		private Builder() {
			request = new DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest();
		}

		
		public Builder withIntegrationId(String integrationId) {
			request.setIntegrationId(integrationId);
			return this;
		}
		

		
		public Builder withRequiredParams(String integrationId) {
			request.setIntegrationId(integrationId);
			
			return this;
		}
		

		public DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest build() {
            
            // verify the required parameter 'integrationId' is set
            if (request.integrationId == null) {
                throw new IllegalStateException("Missing the required parameter 'integrationId' when building request for DeleteConversationsMessagingIntegrationsLineIntegrationIdRequest.");
            }
            
			return request;
		}
	}
}
