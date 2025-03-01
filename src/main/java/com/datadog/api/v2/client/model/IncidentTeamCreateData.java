/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.IncidentTeamCreateAttributes;
import com.datadog.api.v2.client.model.IncidentTeamRelationships;
import com.datadog.api.v2.client.model.IncidentTeamType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Incident Team data for a create request.
 */
@ApiModel(description = "Incident Team data for a create request.")
@JsonPropertyOrder({
  IncidentTeamCreateData.JSON_PROPERTY_ATTRIBUTES,
  IncidentTeamCreateData.JSON_PROPERTY_RELATIONSHIPS,
  IncidentTeamCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IncidentTeamCreateData {
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private IncidentTeamCreateAttributes attributes;

  public static final String JSON_PROPERTY_RELATIONSHIPS = "relationships";
  private IncidentTeamRelationships relationships;

  public static final String JSON_PROPERTY_TYPE = "type";
  private IncidentTeamType type = IncidentTeamType.TEAMS;


  public IncidentTeamCreateData attributes(IncidentTeamCreateAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IncidentTeamCreateAttributes getAttributes() {
    return attributes;
  }


  public void setAttributes(IncidentTeamCreateAttributes attributes) {
    this.attributes = attributes;
  }


  public IncidentTeamCreateData relationships(IncidentTeamRelationships relationships) {
    this.relationships = relationships;
    return this;
  }

   /**
   * Get relationships
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIONSHIPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IncidentTeamRelationships getRelationships() {
    return relationships;
  }


  public void setRelationships(IncidentTeamRelationships relationships) {
    this.relationships = relationships;
  }


  public IncidentTeamCreateData type(IncidentTeamType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IncidentTeamType getType() {
    return type;
  }


  public void setType(IncidentTeamType type) {
    this.type = type;
  }


  /**
   * Return true if this IncidentTeamCreateData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentTeamCreateData incidentTeamCreateData = (IncidentTeamCreateData) o;
    return Objects.equals(this.attributes, incidentTeamCreateData.attributes) &&
        Objects.equals(this.relationships, incidentTeamCreateData.relationships) &&
        Objects.equals(this.type, incidentTeamCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, relationships, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentTeamCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

