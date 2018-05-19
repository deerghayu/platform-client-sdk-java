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
import com.mypurecloud.sdk.v2.model.UserScheduleAdherence;
import com.mypurecloud.sdk.v2.model.ActivityCodeContainer;
import com.mypurecloud.sdk.v2.model.WfmIntradayQueueListing;
import com.mypurecloud.sdk.v2.model.TimeOffRequestResponse;
import com.mypurecloud.sdk.v2.model.TimeOffRequestList;
import com.mypurecloud.sdk.v2.model.WfmUserEntityListing;
import com.mypurecloud.sdk.v2.model.ManagementUnitListing;
import com.mypurecloud.sdk.v2.model.AdminTimeOffRequestPatch;
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.CreateActivityCodeRequest;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceResponse;
import com.mypurecloud.sdk.v2.model.WfmHistoricalAdherenceQuery;
import com.mypurecloud.sdk.v2.model.IntradayResponse;
import com.mypurecloud.sdk.v2.model.IntradayQueryDataCommand;
import com.mypurecloud.sdk.v2.model.UserScheduleContainer;
import com.mypurecloud.sdk.v2.model.UserListScheduleRequestBody;

public class PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest {
    
	private String muId;
	public String getMuId() {
		return this.muId;
	}

	public void setMuId(String muId) {
		this.muId = muId;
	}

	public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest withMuId(String muId) {
	    this.setMuId(muId);
	    return this;
	} 
	
	private String userId;
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest withUserId(String userId) {
	    this.setUserId(userId);
	    return this;
	} 
	
	private String timeOffRequestId;
	public String getTimeOffRequestId() {
		return this.timeOffRequestId;
	}

	public void setTimeOffRequestId(String timeOffRequestId) {
		this.timeOffRequestId = timeOffRequestId;
	}

	public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest withTimeOffRequestId(String timeOffRequestId) {
	    this.setTimeOffRequestId(timeOffRequestId);
	    return this;
	} 
	
	private AdminTimeOffRequestPatch body;
	public AdminTimeOffRequestPatch getBody() {
		return this.body;
	}

	public void setBody(AdminTimeOffRequestPatch body) {
		this.body = body;
	}

	public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest withBody(AdminTimeOffRequestPatch body) {
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

    public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<AdminTimeOffRequestPatch> withHttpInfo() {
        
        // verify the required parameter 'muId' is set
        if (this.muId == null) {
            throw new IllegalStateException("Missing the required parameter 'muId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
        }
        
        // verify the required parameter 'userId' is set
        if (this.userId == null) {
            throw new IllegalStateException("Missing the required parameter 'userId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
        }
        
        // verify the required parameter 'timeOffRequestId' is set
        if (this.timeOffRequestId == null) {
            throw new IllegalStateException("Missing the required parameter 'timeOffRequestId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
        }
        

        return ApiRequestBuilder.create("PATCH", "/api/v2/workforcemanagement/managementunits/{muId}/users/{userId}/timeoffrequests/{timeOffRequestId}")
                .withPathParameter("muId", muId)
        
                .withPathParameter("userId", userId)
        
                .withPathParameter("timeOffRequestId", timeOffRequestId)
        
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

	
	public static Builder builder(String muId, String userId, String timeOffRequestId) {
	    return new Builder()
	            .withRequiredParams(muId, userId, timeOffRequestId);
	}
	

	public static class Builder {
		private final PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest request;

		private Builder() {
			request = new PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest();
		}

		
		public Builder withMuId(String muId) {
			request.setMuId(muId);
			return this;
		}
		
		public Builder withUserId(String userId) {
			request.setUserId(userId);
			return this;
		}
		
		public Builder withTimeOffRequestId(String timeOffRequestId) {
			request.setTimeOffRequestId(timeOffRequestId);
			return this;
		}
		
		public Builder withBody(AdminTimeOffRequestPatch body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String muId, String userId, String timeOffRequestId) {
			request.setMuId(muId);
						request.setUserId(userId);
						request.setTimeOffRequestId(timeOffRequestId);
			
			return this;
		}
		

		public PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest build() {
            
            // verify the required parameter 'muId' is set
            if (request.muId == null) {
                throw new IllegalStateException("Missing the required parameter 'muId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
            }
            
            // verify the required parameter 'userId' is set
            if (request.userId == null) {
                throw new IllegalStateException("Missing the required parameter 'userId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
            }
            
            // verify the required parameter 'timeOffRequestId' is set
            if (request.timeOffRequestId == null) {
                throw new IllegalStateException("Missing the required parameter 'timeOffRequestId' when building request for PatchWorkforcemanagementManagementunitUserTimeoffrequestRequest.");
            }
            
			return request;
		}
	}
}
