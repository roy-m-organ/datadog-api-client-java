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
import com.datadog.api.v1.client.model.UsageSpecifiedCustomReportsPage;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * The object containing document metadata.
 */
@ApiModel(description = "The object containing document metadata.")
@JsonPropertyOrder({
  UsageSpecifiedCustomReportsMeta.JSON_PROPERTY_PAGE
})

public class UsageSpecifiedCustomReportsMeta {
  public static final String JSON_PROPERTY_PAGE = "page";
  private UsageSpecifiedCustomReportsPage page;


  public UsageSpecifiedCustomReportsMeta page(UsageSpecifiedCustomReportsPage page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UsageSpecifiedCustomReportsPage getPage() {
    return page;
  }


  public void setPage(UsageSpecifiedCustomReportsPage page) {
    this.page = page;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpecifiedCustomReportsMeta usageSpecifiedCustomReportsMeta = (UsageSpecifiedCustomReportsMeta) o;
    return Objects.equals(this.page, usageSpecifiedCustomReportsMeta.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSpecifiedCustomReportsMeta {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

