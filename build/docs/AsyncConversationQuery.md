---
title: AsyncConversationQuery
---
## AsyncConversationQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **interval** | <!----><!---->**String**<!----> | Specifies the date and time range of data being queried. Results will include conversations that both started on a day touched by the interval AND either started, ended, or any activity during the interval. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **conversationFilters** | <!----><!---->[**List&lt;ConversationDetailQueryFilter&gt;**](ConversationDetailQueryFilter.html)<!----> | Filters that target conversation-level data |  [optional] |
| **segmentFilters** | <!----><!---->[**List&lt;SegmentDetailQueryFilter&gt;**](SegmentDetailQueryFilter.html)<!----> | Filters that target individual segments within a conversation |  [optional] |
| **evaluationFilters** | <!----><!---->[**List&lt;EvaluationDetailQueryFilter&gt;**](EvaluationDetailQueryFilter.html)<!----> | Filters that target evaluations |  [optional] |
| **mediaEndpointStatFilters** | <!----><!---->[**List&lt;MediaEndpointStatDetailQueryFilter&gt;**](MediaEndpointStatDetailQueryFilter.html)<!----> | Filters that target mediaEndpointStats |  [optional] |
| **surveyFilters** | <!----><!---->[**List&lt;SurveyDetailQueryFilter&gt;**](SurveyDetailQueryFilter.html)<!----> | Filters that target surveys |  [optional] |
| **order** | [**OrderEnum**](#OrderEnum)<!----> | Sort the result set in ascending/descending order. Default is ascending |  [optional] |
| **orderBy** | [**OrderByEnum**](#OrderByEnum)<!----> | Specify which data element within the result set to use for sorting. The options  to use as a basis for sorting the results: conversationStart, segmentStart, and segmentEnd. If not specified, the default is conversationStart |  [optional] |
| **limit** | <!----><!---->**Integer**<!----> | Specify number of results to be returned |  [optional] |
| **startOfDayIntervalMatching** | <!----><!---->**Boolean**<!----> | Add a filter to only include conversations that started after the beginning of the interval start date (UTC) |  [optional] |
{: class="table table-striped"}


<a name="OrderEnum"></a>

## Enum: OrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ASC | &quot;asc&quot; |
| DESC | &quot;desc&quot; |
{: class="table table-striped"}


<a name="OrderByEnum"></a>

## Enum: OrderByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CONVERSATIONSTART | &quot;conversationStart&quot; |
| CONVERSATIONEND | &quot;conversationEnd&quot; |
| SEGMENTSTART | &quot;segmentStart&quot; |
| SEGMENTEND | &quot;segmentEnd&quot; |
{: class="table table-striped"}



