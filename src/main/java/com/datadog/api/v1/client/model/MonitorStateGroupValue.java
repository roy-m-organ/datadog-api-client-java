/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MonitorStateGroupValue
 */
@JsonPropertyOrder({
  MonitorStateGroupValue.JSON_PROPERTY_FROM_TS,
  MonitorStateGroupValue.JSON_PROPERTY_LEFT,
  MonitorStateGroupValue.JSON_PROPERTY_RIGHT,
  MonitorStateGroupValue.JSON_PROPERTY_TO_TS,
  MonitorStateGroupValue.JSON_PROPERTY_VALUE
})

public class MonitorStateGroupValue {
  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_LEFT = "left";
  private Float left;

  public static final String JSON_PROPERTY_RIGHT = "right";
  private Float right;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Float value;


  public MonitorStateGroupValue fromTs(Long fromTs) {
    
    this.fromTs = fromTs;
    return this;
  }

   /**
   * Get fromTs
   * @return fromTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFromTs() {
    return fromTs;
  }


  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }


  public MonitorStateGroupValue left(Float left) {
    
    this.left = left;
    return this;
  }

   /**
   * Get left
   * @return left
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEFT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getLeft() {
    return left;
  }


  public void setLeft(Float left) {
    this.left = left;
  }


  public MonitorStateGroupValue right(Float right) {
    
    this.right = right;
    return this;
  }

   /**
   * Get right
   * @return right
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getRight() {
    return right;
  }


  public void setRight(Float right) {
    this.right = right;
  }


  public MonitorStateGroupValue toTs(Long toTs) {
    
    this.toTs = toTs;
    return this;
  }

   /**
   * Get toTs
   * @return toTs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getToTs() {
    return toTs;
  }


  public void setToTs(Long toTs) {
    this.toTs = toTs;
  }


  public MonitorStateGroupValue value(Float value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getValue() {
    return value;
  }


  public void setValue(Float value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorStateGroupValue monitorStateGroupValue = (MonitorStateGroupValue) o;
    return Objects.equals(this.fromTs, monitorStateGroupValue.fromTs) &&
        Objects.equals(this.left, monitorStateGroupValue.left) &&
        Objects.equals(this.right, monitorStateGroupValue.right) &&
        Objects.equals(this.toTs, monitorStateGroupValue.toTs) &&
        Objects.equals(this.value, monitorStateGroupValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, left, right, toTs, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorStateGroupValue {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    left: ").append(toIndentedString(left)).append("\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

