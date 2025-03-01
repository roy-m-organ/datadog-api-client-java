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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * If an alert event is enabled, set its type. For example, &#x60;error&#x60;, &#x60;warning&#x60;, &#x60;info&#x60;, &#x60;success&#x60;, &#x60;user_update&#x60;, &#x60;recommendation&#x60;, and &#x60;snapshot&#x60;.
 */
public enum EventAlertType {
  
  ERROR("error"),
  
  WARNING("warning"),
  
  INFO("info"),
  
  SUCCESS("success"),
  
  USER_UPDATE("user_update"),
  
  RECOMMENDATION("recommendation"),
  
  SNAPSHOT("snapshot");

  private String value;

  EventAlertType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static EventAlertType fromValue(String value) {
    for (EventAlertType b : EventAlertType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

