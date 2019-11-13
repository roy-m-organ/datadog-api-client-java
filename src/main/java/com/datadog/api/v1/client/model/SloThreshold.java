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
import com.datadog.api.v1.client.model.SloTimeframe;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SloThreshold
 */
@JsonPropertyOrder({
  SloThreshold.JSON_PROPERTY_TARGET,
  SloThreshold.JSON_PROPERTY_TARGET_DISPLAY,
  SloThreshold.JSON_PROPERTY_TIMEFRAME,
  SloThreshold.JSON_PROPERTY_WARNING,
  SloThreshold.JSON_PROPERTY_WARNING_DISPLAY
})

public class SloThreshold {
  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TARGET_DISPLAY = "target_display";
  private String targetDisplay;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SloTimeframe timeframe;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Double warning;

  public static final String JSON_PROPERTY_WARNING_DISPLAY = "warning_display";
  private String warningDisplay;


  public SloThreshold target(Double target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target value for the service level indicator within the corresponding timeframe.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The target value for the service level indicator within the corresponding timeframe.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTarget() {
    return target;
  }


  public void setTarget(Double target) {
    this.target = target;
  }


  public SloThreshold targetDisplay(String targetDisplay) {
    
    this.targetDisplay = targetDisplay;
    return this;
  }

   /**
   * A string representation of the target that indicates its precision (e.g. \&quot;99.9\&quot;). It uses trailing zeros to show significant decimal places (e.g. \&quot;98.00\&quot;). Always included in service level objective responses. Ignored in create/update requests.
   * @return targetDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string representation of the target that indicates its precision (e.g. \"99.9\"). It uses trailing zeros to show significant decimal places (e.g. \"98.00\"). Always included in service level objective responses. Ignored in create/update requests.")
  @JsonProperty(JSON_PROPERTY_TARGET_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetDisplay() {
    return targetDisplay;
  }


  public void setTargetDisplay(String targetDisplay) {
    this.targetDisplay = targetDisplay;
  }


  public SloThreshold timeframe(SloTimeframe timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SloTimeframe getTimeframe() {
    return timeframe;
  }


  public void setTimeframe(SloTimeframe timeframe) {
    this.timeframe = timeframe;
  }


  public SloThreshold warning(Double warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * Get warning
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWarning() {
    return warning;
  }


  public void setWarning(Double warning) {
    this.warning = warning;
  }


  public SloThreshold warningDisplay(String warningDisplay) {
    
    this.warningDisplay = warningDisplay;
    return this;
  }

   /**
   * A string representation of the warning target (see the description of the \&quot;target_display\&quot; field for details). Included in service level objective responses if a warning target exists. Ignored in create/update requests.
   * @return warningDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string representation of the warning target (see the description of the \"target_display\" field for details). Included in service level objective responses if a warning target exists. Ignored in create/update requests.")
  @JsonProperty(JSON_PROPERTY_WARNING_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWarningDisplay() {
    return warningDisplay;
  }


  public void setWarningDisplay(String warningDisplay) {
    this.warningDisplay = warningDisplay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SloThreshold sloThreshold = (SloThreshold) o;
    return Objects.equals(this.target, sloThreshold.target) &&
        Objects.equals(this.targetDisplay, sloThreshold.targetDisplay) &&
        Objects.equals(this.timeframe, sloThreshold.timeframe) &&
        Objects.equals(this.warning, sloThreshold.warning) &&
        Objects.equals(this.warningDisplay, sloThreshold.warningDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, targetDisplay, timeframe, warning, warningDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SloThreshold {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetDisplay: ").append(toIndentedString(targetDisplay)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningDisplay: ").append(toIndentedString(warningDisplay)).append("\n");
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

