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
import com.mypurecloud.sdk.v2.model.Calibration;
import com.mypurecloud.sdk.v2.model.Evaluation;
import com.mypurecloud.sdk.v2.model.AgentActivityEntityListing;
import java.util.Date;
import com.mypurecloud.sdk.v2.model.CalibrationEntityListing;
import com.mypurecloud.sdk.v2.model.QualityAuditPage;
import com.mypurecloud.sdk.v2.model.EvaluationEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluatorActivityEntityListing;
import com.mypurecloud.sdk.v2.model.EvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationFormEntityListing;
import com.mypurecloud.sdk.v2.model.KeywordSet;
import com.mypurecloud.sdk.v2.model.KeywordSetEntityListing;
import com.mypurecloud.sdk.v2.model.AggregationQuery;
import com.mypurecloud.sdk.v2.model.AggregateQueryResponse;
import com.mypurecloud.sdk.v2.model.CalibrationCreate;
import com.mypurecloud.sdk.v2.model.EvaluationScoringSet;
import com.mypurecloud.sdk.v2.model.EvaluationFormAndScoringSet;

public class PutQualityFormRequest {
    
	private String formId;
	public String getFormId() {
		return this.formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public PutQualityFormRequest withFormId(String formId) {
	    this.setFormId(formId);
	    return this;
	}

	
	private EvaluationForm body;
	public EvaluationForm getBody() {
		return this.body;
	}

	public void setBody(EvaluationForm body) {
		this.body = body;
	}

	public PutQualityFormRequest withBody(EvaluationForm body) {
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

    public PutQualityFormRequest withCustomHeader(String name, String value) {
        this.addCustomHeader(name, value);
        return this;
    }

    public ApiRequest<EvaluationForm> withHttpInfo() {
        
        // verify the required parameter 'formId' is set
        if (this.formId == null) {
            throw new IllegalStateException("Missing the required parameter 'formId' when building request for PutQualityFormRequest.");
        }
        
        // verify the required parameter 'body' is set
        if (this.body == null) {
            throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualityFormRequest.");
        }
        

        return ApiRequestBuilder.create("PUT", "/api/v2/quality/forms/{formId}")
                .withPathParameter("formId", formId)
        
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

	
	public static Builder builder(String formId, EvaluationForm body) {
	    return new Builder()
	            .withRequiredParams(formId, body);
	}
	

	public static class Builder {
		private final PutQualityFormRequest request;

		private Builder() {
			request = new PutQualityFormRequest();
		}

		
		public Builder withFormId(String formId) {
			request.setFormId(formId);
			return this;
		}
		
		public Builder withBody(EvaluationForm body) {
			request.setBody(body);
			return this;
		}
		

		
		public Builder withRequiredParams(String formId, EvaluationForm body) {
			request.setFormId(formId);
						request.setBody(body);
			
			return this;
		}
		


		public PutQualityFormRequest build() {
            
            // verify the required parameter 'formId' is set
            if (request.formId == null) {
                throw new IllegalStateException("Missing the required parameter 'formId' when building request for PutQualityFormRequest.");
            }
            
            // verify the required parameter 'body' is set
            if (request.body == null) {
                throw new IllegalStateException("Missing the required parameter 'body' when building request for PutQualityFormRequest.");
            }
            
			return request;
		}
	}
}
