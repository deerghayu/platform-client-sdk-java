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

import com.mypurecloud.sdk.v2.model.Integration;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.IntegrationConfiguration;
import com.mypurecloud.sdk.v2.model.IntegrationEntityListing;
import com.mypurecloud.sdk.v2.model.Action;
import com.mypurecloud.sdk.v2.model.JsonSchemaDocument;
import com.mypurecloud.sdk.v2.model.DraftValidationResult;
import com.mypurecloud.sdk.v2.model.ActionEntityListing;
import com.mypurecloud.sdk.v2.model.CategoryEntityListing;
import com.mypurecloud.sdk.v2.model.ClientAppEntityListing;
import com.mypurecloud.sdk.v2.model.Credential;
import com.mypurecloud.sdk.v2.model.CredentialInfoListing;
import com.mypurecloud.sdk.v2.model.CredentialTypeListing;
import com.mypurecloud.sdk.v2.model.IntegrationEventEntityListing;
import com.mypurecloud.sdk.v2.model.IntegrationEvent;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.IntegrationTypeEntityListing;
import com.mypurecloud.sdk.v2.model.UpdateActionInput;
import com.mypurecloud.sdk.v2.model.UpdateDraftInput;
import com.mypurecloud.sdk.v2.model.CreateIntegrationRequest;
import com.mypurecloud.sdk.v2.model.PublishDraftInput;
import com.mypurecloud.sdk.v2.model.TestExecutionResult;
import com.mypurecloud.sdk.v2.model.PostActionInput;
import com.mypurecloud.sdk.v2.model.CredentialInfo;
import com.mypurecloud.sdk.v2.model.UserActionCategoryEntityListing;
import com.mypurecloud.sdk.v2.model.VendorConnectionRequest;

public class GetIntegrationsTypesRequest {
    
	private Integer pageSize;
	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public GetIntegrationsTypesRequest withPageSize(Integer pageSize) {
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

	public GetIntegrationsTypesRequest withPageNumber(Integer pageNumber) {
	    this.setPageNumber(pageNumber);
	    return this;
	} 
	
	private String sortBy;
	public String getSortBy() {
		return this.sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public GetIntegrationsTypesRequest withSortBy(String sortBy) {
	    this.setSortBy(sortBy);
	    return this;
	} 
	
	private List<String> expand;
	public List<String> getExpand() {
		return this.expand;
	}

	public void setExpand(List<String> expand) {
		this.expand = expand;
	}

	public GetIntegrationsTypesRequest withExpand(List<String> expand) {
	    this.setExpand(expand);
	    return this;
	} 
	
	private String nextPage;
	public String getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(String nextPage) {
		this.nextPage = nextPage;
	}

	public GetIntegrationsTypesRequest withNextPage(String nextPage) {
	    this.setNextPage(nextPage);
	    return this;
	} 
	
	private String previousPage;
	public String getPreviousPage() {
		return this.previousPage;
	}

	public void setPreviousPage(String previousPage) {
		this.previousPage = previousPage;
	}

	public GetIntegrationsTypesRequest withPreviousPage(String previousPage) {
	    this.setPreviousPage(previousPage);
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

    public GetIntegrationsTypesRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<Void> withHttpInfo() {
        

        return ApiRequestBuilder.create("GET", "/api/v2/integrations/types")
                .withQueryParameters("pageSize", "", pageSize)
        
                .withQueryParameters("pageNumber", "", pageNumber)
        
                .withQueryParameters("sortBy", "", sortBy)
        
                .withQueryParameters("expand", "multi", expand)
        
                .withQueryParameters("nextPage", "", nextPage)
        
                .withQueryParameters("previousPage", "", previousPage)
        
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
		private final GetIntegrationsTypesRequest request;

		private Builder() {
			request = new GetIntegrationsTypesRequest();
		}

		
		public Builder withPageSize(Integer pageSize) {
			request.setPageSize(pageSize);
			return this;
		}
		
		public Builder withPageNumber(Integer pageNumber) {
			request.setPageNumber(pageNumber);
			return this;
		}
		
		public Builder withSortBy(String sortBy) {
			request.setSortBy(sortBy);
			return this;
		}
		
		public Builder withExpand(List<String> expand) {
			request.setExpand(expand);
			return this;
		}
		
		public Builder withNextPage(String nextPage) {
			request.setNextPage(nextPage);
			return this;
		}
		
		public Builder withPreviousPage(String previousPage) {
			request.setPreviousPage(previousPage);
			return this;
		}
		

		

		public GetIntegrationsTypesRequest build() {
            
			return request;
		}
	}
}
