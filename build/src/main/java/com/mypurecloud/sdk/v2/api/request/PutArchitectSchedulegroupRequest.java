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
import com.mypurecloud.sdk.v2.model.Operation;
import com.mypurecloud.sdk.v2.model.DependencyObjectEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyStatus;
import com.mypurecloud.sdk.v2.model.ConsumedResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.ConsumingResourcesEntityListing;
import com.mypurecloud.sdk.v2.model.DependencyObject;
import com.mypurecloud.sdk.v2.model.DependencyType;
import com.mypurecloud.sdk.v2.model.DependencyTypeEntityListing;
import com.mypurecloud.sdk.v2.model.EmergencyGroup;
import com.mypurecloud.sdk.v2.model.EmergencyGroupListing;
import com.mypurecloud.sdk.v2.model.IVR;
import com.mypurecloud.sdk.v2.model.IVREntityListing;
import com.mypurecloud.sdk.v2.model.Prompt;
import com.mypurecloud.sdk.v2.model.HistoryListing;
import com.mypurecloud.sdk.v2.model.PromptAsset;
import com.mypurecloud.sdk.v2.model.PromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.PromptEntityListing;
import com.mypurecloud.sdk.v2.model.Schedule;
import com.mypurecloud.sdk.v2.model.ScheduleGroup;
import com.mypurecloud.sdk.v2.model.ScheduleGroupEntityListing;
import com.mypurecloud.sdk.v2.model.ScheduleEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPrompt;
import com.mypurecloud.sdk.v2.model.SystemPromptAsset;
import com.mypurecloud.sdk.v2.model.SystemPromptAssetEntityListing;
import com.mypurecloud.sdk.v2.model.SystemPromptEntityListing;
import com.mypurecloud.sdk.v2.model.Flow;
import com.mypurecloud.sdk.v2.model.FlowVersion;
import com.mypurecloud.sdk.v2.model.FlowVersionEntityListing;
import com.mypurecloud.sdk.v2.model.FlowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTable;
import com.mypurecloud.sdk.v2.model.DataTableRowEntityListing;
import com.mypurecloud.sdk.v2.model.DataTablesDomainEntityListing;
import com.mypurecloud.sdk.v2.model.FlowDivisionViewEntityListing;
import com.mypurecloud.sdk.v2.model.PromptAssetCreate;

public class PutArchitectSchedulegroupRequest {
    
	private String scheduleGroupId;
	public String getScheduleGroupId() {
		return this.scheduleGroupId;
	}

	public void setScheduleGroupId(String scheduleGroupId) {
		this.scheduleGroupId = scheduleGroupId;
	}

	public PutArchitectSchedulegroupRequest withScheduleGroupId(String scheduleGroupId) {
	    this.setScheduleGroupId(scheduleGroupId);
	    return this;
	} 
	
	private ScheduleGroup body;
	public ScheduleGroup getBody() {
		return this.body;
	}

	public void setBody(ScheduleGroup body) {
		this.body = body;
	}

	public PutArchitectSchedulegroupRequest withBody(ScheduleGroup body) {
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

    public PutArchitectSchedulegroupRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<ScheduleGroup> withHttpInfo() {
        
        // verify the required parameter 'scheduleGroupId' is set
        if (this.scheduleGroupId == null) {
            throw new IllegalStateException("Missing the required parameter 'scheduleGroupId' when building request for PutArchitectSchedulegroupRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutArchitectSchedulegroupRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/architect/schedulegroups/{scheduleGroupId}")
                .withPathParameter("scheduleGroupId", scheduleGroupId)
        
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

	
	public static Builder builder(String scheduleGroupId, ScheduleGroup body) {
	    return new Builder()
	            .withRequiredParams(scheduleGroupId, body);
	}
	

	public static class Builder {
		private final PutArchitectSchedulegroupRequest request;

		private Builder() {
			request = new PutArchitectSchedulegroupRequest();
		}

		
		public Builder withScheduleGroupId(String scheduleGroupId) {
			request.setScheduleGroupId(scheduleGroupId);
			return this;
		}
		
		public Builder withBody(ScheduleGroup body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String scheduleGroupId, ScheduleGroup body) {
			request.setScheduleGroupId(scheduleGroupId);
						request.setBody(body);
			
			return this;
		}
		

		public PutArchitectSchedulegroupRequest build() {
            
            // verify the required parameter 'scheduleGroupId' is set
            if (request.scheduleGroupId == null) {
                throw new IllegalStateException("Missing the required parameter 'scheduleGroupId' when building request for PutArchitectSchedulegroupRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutArchitectSchedulegroupRequest.");
            }
            
			return request;
		}
	}
}
