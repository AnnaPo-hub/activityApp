/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ru.otus.activity.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ru.otus.activity.client.model.PhotosSummaryPrimary;

/**
 * PhotosSummary
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-31T23:26:10.837+03:00")
public class PhotosSummary {
  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("primary")
  private PhotosSummaryPrimary primary = null;

  public PhotosSummary count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * The number of photos
   * @return count
  **/
  @ApiModelProperty(value = "The number of photos")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PhotosSummary primary(PhotosSummaryPrimary primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @ApiModelProperty(value = "")
  public PhotosSummaryPrimary getPrimary() {
    return primary;
  }

  public void setPrimary(PhotosSummaryPrimary primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotosSummary photosSummary = (PhotosSummary) o;
    return Objects.equals(this.count, photosSummary.count) &&
        Objects.equals(this.primary, photosSummary.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, primary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotosSummary {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
