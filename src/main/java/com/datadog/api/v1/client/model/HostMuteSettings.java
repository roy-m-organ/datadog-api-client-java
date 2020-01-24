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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * HostMuteSettings
 */
@JsonPropertyOrder({
  HostMuteSettings.JSON_PROPERTY_END,
  HostMuteSettings.JSON_PROPERTY_MESSAGE,
  HostMuteSettings.JSON_PROPERTY_OVERRIDE
})

public class HostMuteSettings {
  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_OVERRIDE = "override";
  private Boolean override;


  public HostMuteSettings end(Long end) {
    
    this.end = end;
    return this;
  }

   /**
   * POSIX timestamp in seconds when the host is unmuted. If omitted, the host remains muted until explicitly unmuted.
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1579098130", value = "POSIX timestamp in seconds when the host is unmuted. If omitted, the host remains muted until explicitly unmuted.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getEnd() {
    return end;
  }


  public void setEnd(Long end) {
    this.end = end;
  }


  public HostMuteSettings message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Message to associate with the muting of this host.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Muting this host for a test!", value = "Message to associate with the muting of this host.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public HostMuteSettings override(Boolean override) {
    
    this.override = override;
    return this;
  }

   /**
   * If true and the host is already muted, replaces existing host mute settings.
   * @return override
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "If true and the host is already muted, replaces existing host mute settings.")
  @JsonProperty(JSON_PROPERTY_OVERRIDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOverride() {
    return override;
  }


  public void setOverride(Boolean override) {
    this.override = override;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostMuteSettings hostMuteSettings = (HostMuteSettings) o;
    return Objects.equals(this.end, hostMuteSettings.end) &&
        Objects.equals(this.message, hostMuteSettings.message) &&
        Objects.equals(this.override, hostMuteSettings.override);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, message, override);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostMuteSettings {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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

