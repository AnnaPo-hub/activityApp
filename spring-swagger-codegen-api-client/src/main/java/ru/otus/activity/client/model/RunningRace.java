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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * RunningRace
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-31T23:26:10.837+03:00")
public class RunningRace {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("running_race_type")
  private Integer runningRaceType = null;

  @JsonProperty("distance")
  private Float distance = null;

  @JsonProperty("start_date_local")
  private DateTime startDateLocal = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("route_ids")
  private List<Long> routeIds = null;

  /**
   * The unit system in which the race should be displayed.
   */
  public enum MeasurementPreferenceEnum {
    FEET("feet"),
    
    METERS("meters");

    private String value;

    MeasurementPreferenceEnum(String value) {
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
    public static MeasurementPreferenceEnum fromValue(String text) {
      for (MeasurementPreferenceEnum b : MeasurementPreferenceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("measurement_preference")
  private MeasurementPreferenceEnum measurementPreference = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("website_url")
  private String websiteUrl = null;

  public RunningRace id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this race.
   * @return id
  **/
  @ApiModelProperty(value = "The unique identifier of this race.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RunningRace name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this race.
   * @return name
  **/
  @ApiModelProperty(value = "The name of this race.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RunningRace runningRaceType(Integer runningRaceType) {
    this.runningRaceType = runningRaceType;
    return this;
  }

   /**
   * The type of this race.
   * @return runningRaceType
  **/
  @ApiModelProperty(value = "The type of this race.")
  public Integer getRunningRaceType() {
    return runningRaceType;
  }

  public void setRunningRaceType(Integer runningRaceType) {
    this.runningRaceType = runningRaceType;
  }

  public RunningRace distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The race&#39;s distance, in meters.
   * @return distance
  **/
  @ApiModelProperty(value = "The race's distance, in meters.")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public RunningRace startDateLocal(DateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the race begins started in the local timezone.
   * @return startDateLocal
  **/
  @ApiModelProperty(value = "The time at which the race begins started in the local timezone.")
  public DateTime getStartDateLocal() {
    return startDateLocal;
  }

  public void setStartDateLocal(DateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }

  public RunningRace city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The name of the city in which the race is taking place.
   * @return city
  **/
  @ApiModelProperty(value = "The name of the city in which the race is taking place.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public RunningRace state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The name of the state or geographical region in which the race is taking place.
   * @return state
  **/
  @ApiModelProperty(value = "The name of the state or geographical region in which the race is taking place.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public RunningRace country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The name of the country in which the race is taking place.
   * @return country
  **/
  @ApiModelProperty(value = "The name of the country in which the race is taking place.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public RunningRace routeIds(List<Long> routeIds) {
    this.routeIds = routeIds;
    return this;
  }

  public RunningRace addRouteIdsItem(Long routeIdsItem) {
    if (this.routeIds == null) {
      this.routeIds = new ArrayList<Long>();
    }
    this.routeIds.add(routeIdsItem);
    return this;
  }

   /**
   * The set of routes that cover this race&#39;s course.
   * @return routeIds
  **/
  @ApiModelProperty(value = "The set of routes that cover this race's course.")
  public List<Long> getRouteIds() {
    return routeIds;
  }

  public void setRouteIds(List<Long> routeIds) {
    this.routeIds = routeIds;
  }

  public RunningRace measurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
    return this;
  }

   /**
   * The unit system in which the race should be displayed.
   * @return measurementPreference
  **/
  @ApiModelProperty(value = "The unit system in which the race should be displayed.")
  public MeasurementPreferenceEnum getMeasurementPreference() {
    return measurementPreference;
  }

  public void setMeasurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
  }

  public RunningRace url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The vanity URL of this race on Strava.
   * @return url
  **/
  @ApiModelProperty(value = "The vanity URL of this race on Strava.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public RunningRace websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * The URL of this race&#39;s website.
   * @return websiteUrl
  **/
  @ApiModelProperty(value = "The URL of this race's website.")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunningRace runningRace = (RunningRace) o;
    return Objects.equals(this.id, runningRace.id) &&
        Objects.equals(this.name, runningRace.name) &&
        Objects.equals(this.runningRaceType, runningRace.runningRaceType) &&
        Objects.equals(this.distance, runningRace.distance) &&
        Objects.equals(this.startDateLocal, runningRace.startDateLocal) &&
        Objects.equals(this.city, runningRace.city) &&
        Objects.equals(this.state, runningRace.state) &&
        Objects.equals(this.country, runningRace.country) &&
        Objects.equals(this.routeIds, runningRace.routeIds) &&
        Objects.equals(this.measurementPreference, runningRace.measurementPreference) &&
        Objects.equals(this.url, runningRace.url) &&
        Objects.equals(this.websiteUrl, runningRace.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, runningRaceType, distance, startDateLocal, city, state, country, routeIds, measurementPreference, url, websiteUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunningRace {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runningRaceType: ").append(toIndentedString(runningRaceType)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    routeIds: ").append(toIndentedString(routeIds)).append("\n");
    sb.append("    measurementPreference: ").append(toIndentedString(measurementPreference)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

