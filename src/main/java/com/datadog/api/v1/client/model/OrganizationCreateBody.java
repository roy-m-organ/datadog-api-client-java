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
import com.datadog.api.v1.client.model.OrganizationBilling;
import com.datadog.api.v1.client.model.OrganizationSubscription;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object describing an organization to create.
 */
@ApiModel(description = "Object describing an organization to create.")
@JsonPropertyOrder({
  OrganizationCreateBody.JSON_PROPERTY_BILLING,
  OrganizationCreateBody.JSON_PROPERTY_NAME,
  OrganizationCreateBody.JSON_PROPERTY_SUBSCRIPTION
})

public class OrganizationCreateBody {
  public static final String JSON_PROPERTY_BILLING = "billing";
  private OrganizationBilling billing;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private OrganizationSubscription subscription;


  public OrganizationCreateBody billing(OrganizationBilling billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BILLING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrganizationBilling getBilling() {
    return billing;
  }


  public void setBilling(OrganizationBilling billing) {
    this.billing = billing;
  }


  public OrganizationCreateBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the new child-organization, limited to 32 characters.
   * maximum: 32
   * @return name
  **/
  @ApiModelProperty(example = "New child org", required = true, value = "The name of the new child-organization, limited to 32 characters.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public OrganizationCreateBody subscription(OrganizationSubscription subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrganizationSubscription getSubscription() {
    return subscription;
  }


  public void setSubscription(OrganizationSubscription subscription) {
    this.subscription = subscription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreateBody organizationCreateBody = (OrganizationCreateBody) o;
    return Objects.equals(this.billing, organizationCreateBody.billing) &&
        Objects.equals(this.name, organizationCreateBody.name) &&
        Objects.equals(this.subscription, organizationCreateBody.subscription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billing, name, subscription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreateBody {\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

