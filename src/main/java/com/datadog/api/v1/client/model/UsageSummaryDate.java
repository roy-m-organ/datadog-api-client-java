/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.UsageSummaryDateOrg;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Response with hourly report of all data billed by Datadog all organizations.
 */
@ApiModel(description = "Response with hourly report of all data billed by Datadog all organizations.")
@JsonPropertyOrder({
  UsageSummaryDate.JSON_PROPERTY_AGENT_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_APM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_AWS_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT,
  UsageSummaryDate.JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM,
  UsageSummaryDate.JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_AVG,
  UsageSummaryDate.JSON_PROPERTY_CONTAINER_HWM,
  UsageSummaryDate.JSON_PROPERTY_CUSTOM_TS_AVG,
  UsageSummaryDate.JSON_PROPERTY_DATE,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG,
  UsageSummaryDate.JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM,
  UsageSummaryDate.JSON_PROPERTY_GCP_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_INFRA_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM,
  UsageSummaryDate.JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_NPM_HOST_TOP99P,
  UsageSummaryDate.JSON_PROPERTY_ORGS,
  UsageSummaryDate.JSON_PROPERTY_RUM_SESSION_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM,
  UsageSummaryDate.JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM
})

public class UsageSummaryDate {
  public static final String JSON_PROPERTY_AGENT_HOST_TOP99P = "agent_host_top99p";
  private Long agentHostTop99p;

  public static final String JSON_PROPERTY_APM_HOST_TOP99P = "apm_host_top99p";
  private Long apmHostTop99p;

  public static final String JSON_PROPERTY_AWS_HOST_TOP99P = "aws_host_top99p";
  private Long awsHostTop99p;

  public static final String JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT = "aws_lambda_func_count";
  private Long awsLambdaFuncCount;

  public static final String JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM = "aws_lambda_invocations_sum";
  private Long awsLambdaInvocationsSum;

  public static final String JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM = "billable_ingested_bytes_sum";
  private Long billableIngestedBytesSum;

  public static final String JSON_PROPERTY_CONTAINER_AVG = "container_avg";
  private Long containerAvg;

  public static final String JSON_PROPERTY_CONTAINER_HWM = "container_hwm";
  private Long containerHwm;

  public static final String JSON_PROPERTY_CUSTOM_TS_AVG = "custom_ts_avg";
  private Long customTsAvg;

  public static final String JSON_PROPERTY_DATE = "date";
  private OffsetDateTime date;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG = "fargate_tasks_count_avg";
  private Long fargateTasksCountAvg;

  public static final String JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM = "fargate_tasks_count_hwm";
  private Long fargateTasksCountHwm;

  public static final String JSON_PROPERTY_GCP_HOST_TOP99P = "gcp_host_top99p";
  private Long gcpHostTop99p;

  public static final String JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM = "indexed_events_count_sum";
  private Long indexedEventsCountSum;

  public static final String JSON_PROPERTY_INFRA_HOST_TOP99P = "infra_host_top99p";
  private Long infraHostTop99p;

  public static final String JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM = "ingested_events_bytes_sum";
  private Long ingestedEventsBytesSum;

  public static final String JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM = "netflow_indexed_events_count_sum";
  private Long netflowIndexedEventsCountSum;

  public static final String JSON_PROPERTY_NPM_HOST_TOP99P = "npm_host_top99p";
  private Long npmHostTop99p;

  public static final String JSON_PROPERTY_ORGS = "orgs";
  private List<UsageSummaryDateOrg> orgs = null;

  public static final String JSON_PROPERTY_RUM_SESSION_COUNT_SUM = "rum_session_count_sum";
  private Long rumSessionCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM = "synthetics_browser_check_calls_count_sum";
  private Long syntheticsBrowserCheckCallsCountSum;

  public static final String JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM = "synthetics_check_calls_count_sum";
  private Long syntheticsCheckCallsCountSum;

  public static final String JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM = "trace_search_indexed_events_count_sum";
  private Long traceSearchIndexedEventsCountSum;


  public UsageSummaryDate agentHostTop99p(Long agentHostTop99p) {
    
    this.agentHostTop99p = agentHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all agent hosts over all hours in the current date for all orgs.
   * @return agentHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all agent hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_AGENT_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAgentHostTop99p() {
    return agentHostTop99p;
  }


  public void setAgentHostTop99p(Long agentHostTop99p) {
    this.agentHostTop99p = agentHostTop99p;
  }


  public UsageSummaryDate apmHostTop99p(Long apmHostTop99p) {
    
    this.apmHostTop99p = apmHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct APM hosts over all hours in the current date for all orgs.
   * @return apmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct APM hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_APM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getApmHostTop99p() {
    return apmHostTop99p;
  }


  public void setApmHostTop99p(Long apmHostTop99p) {
    this.apmHostTop99p = apmHostTop99p;
  }


  public UsageSummaryDate awsHostTop99p(Long awsHostTop99p) {
    
    this.awsHostTop99p = awsHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all AWS hosts over all hours in the current date for all orgs.
   * @return awsHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all AWS hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_AWS_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsHostTop99p() {
    return awsHostTop99p;
  }


  public void setAwsHostTop99p(Long awsHostTop99p) {
    this.awsHostTop99p = awsHostTop99p;
  }


  public UsageSummaryDate awsLambdaFuncCount(Long awsLambdaFuncCount) {
    
    this.awsLambdaFuncCount = awsLambdaFuncCount;
    return this;
  }

   /**
   * Shows the average of the number of functions that executed 1 or more times each hour in the current date for all orgs.
   * @return awsLambdaFuncCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average of the number of functions that executed 1 or more times each hour in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_FUNC_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsLambdaFuncCount() {
    return awsLambdaFuncCount;
  }


  public void setAwsLambdaFuncCount(Long awsLambdaFuncCount) {
    this.awsLambdaFuncCount = awsLambdaFuncCount;
  }


  public UsageSummaryDate awsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
    return this;
  }

   /**
   * Shows the sum of all AWS Labmda invocations over all hours in the current date for all orgs.
   * @return awsLambdaInvocationsSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all AWS Labmda invocations over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_AWS_LAMBDA_INVOCATIONS_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAwsLambdaInvocationsSum() {
    return awsLambdaInvocationsSum;
  }


  public void setAwsLambdaInvocationsSum(Long awsLambdaInvocationsSum) {
    this.awsLambdaInvocationsSum = awsLambdaInvocationsSum;
  }


  public UsageSummaryDate billableIngestedBytesSum(Long billableIngestedBytesSum) {
    
    this.billableIngestedBytesSum = billableIngestedBytesSum;
    return this;
  }

   /**
   * Shows the sum of all log bytes ingested over all hours in the current date for all orgs.
   * @return billableIngestedBytesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log bytes ingested over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_BILLABLE_INGESTED_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBillableIngestedBytesSum() {
    return billableIngestedBytesSum;
  }


  public void setBillableIngestedBytesSum(Long billableIngestedBytesSum) {
    this.billableIngestedBytesSum = billableIngestedBytesSum;
  }


  public UsageSummaryDate containerAvg(Long containerAvg) {
    
    this.containerAvg = containerAvg;
    return this;
  }

   /**
   * Shows the average of all distinct containers over all hours in the current date for all orgs.
   * @return containerAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average of all distinct containers over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContainerAvg() {
    return containerAvg;
  }


  public void setContainerAvg(Long containerAvg) {
    this.containerAvg = containerAvg;
  }


  public UsageSummaryDate containerHwm(Long containerHwm) {
    
    this.containerHwm = containerHwm;
    return this;
  }

   /**
   * Shows the high watermark of all distinct containers over all hours in the current date for all orgs.
   * @return containerHwm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the high watermark of all distinct containers over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_CONTAINER_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getContainerHwm() {
    return containerHwm;
  }


  public void setContainerHwm(Long containerHwm) {
    this.containerHwm = containerHwm;
  }


  public UsageSummaryDate customTsAvg(Long customTsAvg) {
    
    this.customTsAvg = customTsAvg;
    return this;
  }

   /**
   * Shows the average number of distinct custom metrics over all hours in the current date for all orgs.
   * @return customTsAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average number of distinct custom metrics over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_TS_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCustomTsAvg() {
    return customTsAvg;
  }


  public void setCustomTsAvg(Long customTsAvg) {
    this.customTsAvg = customTsAvg;
  }


  public UsageSummaryDate date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date for the usage.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date for the usage.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public UsageSummaryDate fargateTasksCountAvg(Long fargateTasksCountAvg) {
    
    this.fargateTasksCountAvg = fargateTasksCountAvg;
    return this;
  }

   /**
   * Shows the high watermark of all Fargate tasks over all hours in the current date for all orgs.
   * @return fargateTasksCountAvg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the high watermark of all Fargate tasks over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_AVG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFargateTasksCountAvg() {
    return fargateTasksCountAvg;
  }


  public void setFargateTasksCountAvg(Long fargateTasksCountAvg) {
    this.fargateTasksCountAvg = fargateTasksCountAvg;
  }


  public UsageSummaryDate fargateTasksCountHwm(Long fargateTasksCountHwm) {
    
    this.fargateTasksCountHwm = fargateTasksCountHwm;
    return this;
  }

   /**
   * Shows the average of all Fargate tasks over all hours in the current date for all orgs.
   * @return fargateTasksCountHwm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the average of all Fargate tasks over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_FARGATE_TASKS_COUNT_HWM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFargateTasksCountHwm() {
    return fargateTasksCountHwm;
  }


  public void setFargateTasksCountHwm(Long fargateTasksCountHwm) {
    this.fargateTasksCountHwm = fargateTasksCountHwm;
  }


  public UsageSummaryDate gcpHostTop99p(Long gcpHostTop99p) {
    
    this.gcpHostTop99p = gcpHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all GCP hosts over all hours in the current date for all orgs.
   * @return gcpHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all GCP hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_GCP_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getGcpHostTop99p() {
    return gcpHostTop99p;
  }


  public void setGcpHostTop99p(Long gcpHostTop99p) {
    this.gcpHostTop99p = gcpHostTop99p;
  }


  public UsageSummaryDate indexedEventsCountSum(Long indexedEventsCountSum) {
    
    this.indexedEventsCountSum = indexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all log events indexed over all hours in the current date for all orgs.
   * @return indexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log events indexed over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIndexedEventsCountSum() {
    return indexedEventsCountSum;
  }


  public void setIndexedEventsCountSum(Long indexedEventsCountSum) {
    this.indexedEventsCountSum = indexedEventsCountSum;
  }


  public UsageSummaryDate infraHostTop99p(Long infraHostTop99p) {
    
    this.infraHostTop99p = infraHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for all orgs.
   * @return infraHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_INFRA_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getInfraHostTop99p() {
    return infraHostTop99p;
  }


  public void setInfraHostTop99p(Long infraHostTop99p) {
    this.infraHostTop99p = infraHostTop99p;
  }


  public UsageSummaryDate ingestedEventsBytesSum(Long ingestedEventsBytesSum) {
    
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
    return this;
  }

   /**
   * Shows the sum of all log bytes ingested over all hours in the current date for all orgs.
   * @return ingestedEventsBytesSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all log bytes ingested over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_INGESTED_EVENTS_BYTES_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getIngestedEventsBytesSum() {
    return ingestedEventsBytesSum;
  }


  public void setIngestedEventsBytesSum(Long ingestedEventsBytesSum) {
    this.ingestedEventsBytesSum = ingestedEventsBytesSum;
  }


  public UsageSummaryDate netflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Network flows indexed over all hours in the current date for all orgs.
   * @return netflowIndexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Network flows indexed over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_NETFLOW_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNetflowIndexedEventsCountSum() {
    return netflowIndexedEventsCountSum;
  }


  public void setNetflowIndexedEventsCountSum(Long netflowIndexedEventsCountSum) {
    this.netflowIndexedEventsCountSum = netflowIndexedEventsCountSum;
  }


  public UsageSummaryDate npmHostTop99p(Long npmHostTop99p) {
    
    this.npmHostTop99p = npmHostTop99p;
    return this;
  }

   /**
   * Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for all orgs.
   * @return npmHostTop99p
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_NPM_HOST_TOP99P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getNpmHostTop99p() {
    return npmHostTop99p;
  }


  public void setNpmHostTop99p(Long npmHostTop99p) {
    this.npmHostTop99p = npmHostTop99p;
  }


  public UsageSummaryDate orgs(List<UsageSummaryDateOrg> orgs) {
    
    this.orgs = orgs;
    return this;
  }

  public UsageSummaryDate addOrgsItem(UsageSummaryDateOrg orgsItem) {
    if (this.orgs == null) {
      this.orgs = new ArrayList<>();
    }
    this.orgs.add(orgsItem);
    return this;
  }

   /**
   * Organizations associated with a user.
   * @return orgs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizations associated with a user.")
  @JsonProperty(JSON_PROPERTY_ORGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UsageSummaryDateOrg> getOrgs() {
    return orgs;
  }


  public void setOrgs(List<UsageSummaryDateOrg> orgs) {
    this.orgs = orgs;
  }


  public UsageSummaryDate rumSessionCountSum(Long rumSessionCountSum) {
    
    this.rumSessionCountSum = rumSessionCountSum;
    return this;
  }

   /**
   * Shows the sum of all RUM Sessions over all hours in the current date for all orgs
   * @return rumSessionCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all RUM Sessions over all hours in the current date for all orgs")
  @JsonProperty(JSON_PROPERTY_RUM_SESSION_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getRumSessionCountSum() {
    return rumSessionCountSum;
  }


  public void setRumSessionCountSum(Long rumSessionCountSum) {
    this.rumSessionCountSum = rumSessionCountSum;
  }


  public UsageSummaryDate syntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Synthetic browser tests over all hours in the current date for all orgs.
   * @return syntheticsBrowserCheckCallsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Synthetic browser tests over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_BROWSER_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSyntheticsBrowserCheckCallsCountSum() {
    return syntheticsBrowserCheckCallsCountSum;
  }


  public void setSyntheticsBrowserCheckCallsCountSum(Long syntheticsBrowserCheckCallsCountSum) {
    this.syntheticsBrowserCheckCallsCountSum = syntheticsBrowserCheckCallsCountSum;
  }


  public UsageSummaryDate syntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
    return this;
  }

   /**
   * Shows the sum of all Synthetic API tests over all hours in the current date for all orgs.
   * @return syntheticsCheckCallsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all Synthetic API tests over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_SYNTHETICS_CHECK_CALLS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSyntheticsCheckCallsCountSum() {
    return syntheticsCheckCallsCountSum;
  }


  public void setSyntheticsCheckCallsCountSum(Long syntheticsCheckCallsCountSum) {
    this.syntheticsCheckCallsCountSum = syntheticsCheckCallsCountSum;
  }


  public UsageSummaryDate traceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
    return this;
  }

   /**
   * Shows the sum of all analyzed spans indexed over all hours in the current date for all orgs.
   * @return traceSearchIndexedEventsCountSum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shows the sum of all analyzed spans indexed over all hours in the current date for all orgs.")
  @JsonProperty(JSON_PROPERTY_TRACE_SEARCH_INDEXED_EVENTS_COUNT_SUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTraceSearchIndexedEventsCountSum() {
    return traceSearchIndexedEventsCountSum;
  }


  public void setTraceSearchIndexedEventsCountSum(Long traceSearchIndexedEventsCountSum) {
    this.traceSearchIndexedEventsCountSum = traceSearchIndexedEventsCountSum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSummaryDate usageSummaryDate = (UsageSummaryDate) o;
    return Objects.equals(this.agentHostTop99p, usageSummaryDate.agentHostTop99p) &&
        Objects.equals(this.apmHostTop99p, usageSummaryDate.apmHostTop99p) &&
        Objects.equals(this.awsHostTop99p, usageSummaryDate.awsHostTop99p) &&
        Objects.equals(this.awsLambdaFuncCount, usageSummaryDate.awsLambdaFuncCount) &&
        Objects.equals(this.awsLambdaInvocationsSum, usageSummaryDate.awsLambdaInvocationsSum) &&
        Objects.equals(this.billableIngestedBytesSum, usageSummaryDate.billableIngestedBytesSum) &&
        Objects.equals(this.containerAvg, usageSummaryDate.containerAvg) &&
        Objects.equals(this.containerHwm, usageSummaryDate.containerHwm) &&
        Objects.equals(this.customTsAvg, usageSummaryDate.customTsAvg) &&
        Objects.equals(this.date, usageSummaryDate.date) &&
        Objects.equals(this.fargateTasksCountAvg, usageSummaryDate.fargateTasksCountAvg) &&
        Objects.equals(this.fargateTasksCountHwm, usageSummaryDate.fargateTasksCountHwm) &&
        Objects.equals(this.gcpHostTop99p, usageSummaryDate.gcpHostTop99p) &&
        Objects.equals(this.indexedEventsCountSum, usageSummaryDate.indexedEventsCountSum) &&
        Objects.equals(this.infraHostTop99p, usageSummaryDate.infraHostTop99p) &&
        Objects.equals(this.ingestedEventsBytesSum, usageSummaryDate.ingestedEventsBytesSum) &&
        Objects.equals(this.netflowIndexedEventsCountSum, usageSummaryDate.netflowIndexedEventsCountSum) &&
        Objects.equals(this.npmHostTop99p, usageSummaryDate.npmHostTop99p) &&
        Objects.equals(this.orgs, usageSummaryDate.orgs) &&
        Objects.equals(this.rumSessionCountSum, usageSummaryDate.rumSessionCountSum) &&
        Objects.equals(this.syntheticsBrowserCheckCallsCountSum, usageSummaryDate.syntheticsBrowserCheckCallsCountSum) &&
        Objects.equals(this.syntheticsCheckCallsCountSum, usageSummaryDate.syntheticsCheckCallsCountSum) &&
        Objects.equals(this.traceSearchIndexedEventsCountSum, usageSummaryDate.traceSearchIndexedEventsCountSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentHostTop99p, apmHostTop99p, awsHostTop99p, awsLambdaFuncCount, awsLambdaInvocationsSum, billableIngestedBytesSum, containerAvg, containerHwm, customTsAvg, date, fargateTasksCountAvg, fargateTasksCountHwm, gcpHostTop99p, indexedEventsCountSum, infraHostTop99p, ingestedEventsBytesSum, netflowIndexedEventsCountSum, npmHostTop99p, orgs, rumSessionCountSum, syntheticsBrowserCheckCallsCountSum, syntheticsCheckCallsCountSum, traceSearchIndexedEventsCountSum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSummaryDate {\n");
    sb.append("    agentHostTop99p: ").append(toIndentedString(agentHostTop99p)).append("\n");
    sb.append("    apmHostTop99p: ").append(toIndentedString(apmHostTop99p)).append("\n");
    sb.append("    awsHostTop99p: ").append(toIndentedString(awsHostTop99p)).append("\n");
    sb.append("    awsLambdaFuncCount: ").append(toIndentedString(awsLambdaFuncCount)).append("\n");
    sb.append("    awsLambdaInvocationsSum: ").append(toIndentedString(awsLambdaInvocationsSum)).append("\n");
    sb.append("    billableIngestedBytesSum: ").append(toIndentedString(billableIngestedBytesSum)).append("\n");
    sb.append("    containerAvg: ").append(toIndentedString(containerAvg)).append("\n");
    sb.append("    containerHwm: ").append(toIndentedString(containerHwm)).append("\n");
    sb.append("    customTsAvg: ").append(toIndentedString(customTsAvg)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fargateTasksCountAvg: ").append(toIndentedString(fargateTasksCountAvg)).append("\n");
    sb.append("    fargateTasksCountHwm: ").append(toIndentedString(fargateTasksCountHwm)).append("\n");
    sb.append("    gcpHostTop99p: ").append(toIndentedString(gcpHostTop99p)).append("\n");
    sb.append("    indexedEventsCountSum: ").append(toIndentedString(indexedEventsCountSum)).append("\n");
    sb.append("    infraHostTop99p: ").append(toIndentedString(infraHostTop99p)).append("\n");
    sb.append("    ingestedEventsBytesSum: ").append(toIndentedString(ingestedEventsBytesSum)).append("\n");
    sb.append("    netflowIndexedEventsCountSum: ").append(toIndentedString(netflowIndexedEventsCountSum)).append("\n");
    sb.append("    npmHostTop99p: ").append(toIndentedString(npmHostTop99p)).append("\n");
    sb.append("    orgs: ").append(toIndentedString(orgs)).append("\n");
    sb.append("    rumSessionCountSum: ").append(toIndentedString(rumSessionCountSum)).append("\n");
    sb.append("    syntheticsBrowserCheckCallsCountSum: ").append(toIndentedString(syntheticsBrowserCheckCallsCountSum)).append("\n");
    sb.append("    syntheticsCheckCallsCountSum: ").append(toIndentedString(syntheticsCheckCallsCountSum)).append("\n");
    sb.append("    traceSearchIndexedEventsCountSum: ").append(toIndentedString(traceSearchIndexedEventsCountSum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

