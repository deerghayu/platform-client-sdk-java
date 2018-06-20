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

public class GetWorkforcemanagementManagementunitsRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetWorkforcemanagementManagementunitsRequest withPageSize(Integer pageSize) {
	    this.setPageSize(pageSize);
	    return this;
	} 
	
	private Integer pageNumber;
	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public GetWorkforcemanagementManagementunitsRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String expand;
	public String getExpand() {
		return this.expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public GetWorkforcemanagementManagementunitsRequest withExpand(String expand) {
	    this.setExpand(expand);
	    return this;
	} 

	public enum expandValues { 
		DETAILS("details");

		private String value;

		expandValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static expandValues fromString(String key) {
			if (key == null) return null;

			for (expandValues value : expandValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return expandValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String feature;
	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public GetWorkforcemanagementManagementunitsRequest withFeature(String feature) {
	    this.setFeature(feature);
	    return this;
	} 

	public enum featureValues { 
		AGENTS("Agents"), 
		ACTIVITYCODES("ActivityCodes"), 
		HISTORICALADHERENCE("HistoricalAdherence"), 
		INTRADAYMONITORING("IntradayMonitoring"), 
		MANAGEMENTUNITS("ManagementUnits"), 
		REALTIMEADHERENCE("RealTimeAdherence"), 
		SCHEDULES("Schedules"), 
		SERVICEGOALGROUPS("ServiceGoalGroups"), 
		SHORTTERMFORECASTS("ShortTermForecasts"), 
		TIMEOFFREQUESTS("TimeOffRequests"), 
		WORKPLANS("WorkPlans");

		private String value;

		featureValues(String value) {
		  this.value = value;
		}

		@JsonCreator
		public static featureValues fromString(String key) {
			if (key == null) return null;

			for (featureValues value : featureValues.values()) {
				if (key.equalsIgnoreCase(value.toString())) {
					return value;
				}
			}

			return featureValues.values()[0];
		}

		@Override
		@JsonValue
		public String toString() {
			return String.valueOf(value);
		}
	}
	
	private String divisionId;
	public String getDivisionId() {
		return this.divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public GetWorkforcemanagementManagementunitsRequest withDivisionId(String divisionId) {
	    this.setDivisionId(divisionId);
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

    public GetWorkforcemanagementManagementunitsRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/workforcemanagement/managementunits")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("expand", "", expand)
        
                .withQueryParameters("feature", "", feature)
        
                .withQueryParameters("divisionId", "", divisionId)
        
                .withCustomHeaders(customHeaders)
                .withContentTypes("application/json")
                .withAccepts("application/json")
                .withAuthNames("PureCloud Auth")
                .build();
    }

	public static Builder builder() {
		return new Builder();
	}

	

	public static class Builder {
		private final GetWorkforcemanagementManagementunitsRequest request;

		private Builder() {
			request = new GetWorkforcemanagementManagementunitsRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withExpand(String expand) {
			request.setExpand(expand);
			return this;
		}

		public Builder withExpand(expandValues expand) {
		    request.setExpand(expand.toString());
		    return this;
		}
		
		public Builder withFeature(String feature) {
			request.setFeature(feature);
			return this;
		}

		public Builder withFeature(featureValues feature) {
		    request.setFeature(feature.toString());
		    return this;
		}
		
		public Builder withDivisionId(String divisionId) {
			request.setDivisionId(divisionId);
			return this;
		}
		

		

		public GetWorkforcemanagementManagementunitsRequest build() {
            
			return request;
		}
	}
}
