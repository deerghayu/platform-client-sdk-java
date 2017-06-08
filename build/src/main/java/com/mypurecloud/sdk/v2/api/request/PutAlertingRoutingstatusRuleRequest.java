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
import com.mypurecloud.sdk.v2.model.HeartBeatAlert;
import com.mypurecloud.sdk.v2.model.HeartBeatAlertContainer;
import com.mypurecloud.sdk.v2.model.HeartBeatRule;
import com.mypurecloud.sdk.v2.model.HeartBeatRuleContainer;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlert;
import com.mypurecloud.sdk.v2.model.InteractionStatsAlertContainer;
import com.mypurecloud.sdk.v2.model.UnreadMetric;
import com.mypurecloud.sdk.v2.model.InteractionStatsRule;
import com.mypurecloud.sdk.v2.model.InteractionStatsRuleContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlert;
import com.mypurecloud.sdk.v2.model.RoutingStatusAlertContainer;
import com.mypurecloud.sdk.v2.model.RoutingStatusRule;
import com.mypurecloud.sdk.v2.model.RoutingStatusRuleContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceAlert;
import com.mypurecloud.sdk.v2.model.UserPresenceAlertContainer;
import com.mypurecloud.sdk.v2.model.UserPresenceRule;
import com.mypurecloud.sdk.v2.model.UserPresenceRuleContainer;
import com.mypurecloud.sdk.v2.model.UnreadStatus;

public class PutAlertingRoutingstatusRuleRequest {
    
	private String ruleId;
	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	public PutAlertingRoutingstatusRuleRequest withRuleId(String ruleId) {
	    this.setRuleId(ruleId);
	    return this;
	}

	
	private RoutingStatusRule body;
	public RoutingStatusRule getBody() {
		return this.body;
	}

	public void setBody(RoutingStatusRule body) {
		this.body = body;
	}

	public PutAlertingRoutingstatusRuleRequest withBody(RoutingStatusRule body) {
	    this.setBody(body);
	    return this;
	}

	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public PutAlertingRoutingstatusRuleRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
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

    public PutAlertingRoutingstatusRuleRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<RoutingStatusRule> withHttpInfo() {
        
        // verify the required parameter 'ruleId' is set
        if (this.ruleId == null) {
            throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PutAlertingRoutingstatusRuleRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingRoutingstatusRuleRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/alerting/routingstatus/rules/{ruleId}")
                .withPathParameter("ruleId", ruleId)
        
                .withQueryParameters("expand", "multi", expand)
        
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

	
	public static Builder builder(String ruleId, RoutingStatusRule body) {
	    return new Builder()
	            .withRequiredParams(ruleId, body);
	}
	

	public static class Builder {
		private final PutAlertingRoutingstatusRuleRequest request;

		private Builder() {
			request = new PutAlertingRoutingstatusRuleRequest();
		}

		
		public Builder withRuleId(String ruleId) {
			request.setRuleId(ruleId);
			return this;
		}
		
		public Builder withBody(RoutingStatusRule body) {
			request.setBody(body);
			return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		

		
		public Builder withRequiredParams(String ruleId, RoutingStatusRule body) {
			request.setRuleId(ruleId);
						request.setBody(body);
			
			return this;
		}
		


		public PutAlertingRoutingstatusRuleRequest build() {
            
            // verify the required parameter 'ruleId' is set
            if (request.ruleId == null) {
                throw new IllegalStateException("Missing the required parameter 'ruleId' when building request for PutAlertingRoutingstatusRuleRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutAlertingRoutingstatusRuleRequest.");
            }
            
			return request;
		}
	}
}
