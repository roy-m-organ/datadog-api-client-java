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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.LogsExclusionFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Represents the index exclusion filter object from configuration API.
 */
@ApiModel(description = "Represents the index exclusion filter object from configuration API.")
@JsonPropertyOrder({
  LogsExclusion.JSON_PROPERTY_FILTER,
  LogsExclusion.JSON_PROPERTY_IS_ENABLED,
  LogsExclusion.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LogsExclusion {
  public static final String JSON_PROPERTY_FILTER = "filter";
  private LogsExclusionFilter filter;

  public static final String JSON_PROPERTY_IS_ENABLED = "is_enabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public LogsExclusion filter(LogsExclusionFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogsExclusionFilter getFilter() {
    return filter;
  }


  public void setFilter(LogsExclusionFilter filter) {
    this.filter = filter;
  }


  public LogsExclusion isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

   /**
   * Whether or not the exclusion filter is active.
   * @return isEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the exclusion filter is active.")
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEnabled() {
    return isEnabled;
  }


  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }


  public LogsExclusion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the index exclusion filter.
   * @return name
  **/
  @ApiModelProperty(example = "payment", required = true, value = "Name of the index exclusion filter.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this LogsExclusion object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsExclusion logsExclusion = (LogsExclusion) o;
    return Objects.equals(this.filter, logsExclusion.filter) &&
        Objects.equals(this.isEnabled, logsExclusion.isEnabled) &&
        Objects.equals(this.name, logsExclusion.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, isEnabled, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsExclusion {\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

