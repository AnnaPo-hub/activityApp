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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import ru.otus.activity.client.model.LatLng;
import ru.otus.activity.client.model.SummaryPRSegmentEffort;
import ru.otus.activity.client.model.SummarySegmentEffort;

import java.util.Objects;

/**
 * SummarySegment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-31T23:26:10.837+03:00")
public class SummarySegment {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("name")
    private String name = null;
    @JsonProperty("activity_type")
    private ActivityTypeEnum activityType = null;
    @JsonProperty("distance")
    private Float distance = null;
    @JsonProperty("average_grade")
    private Float averageGrade = null;
    @JsonProperty("maximum_grade")
    private Float maximumGrade = null;
    @JsonProperty("elevation_high")
    private Float elevationHigh = null;
    @JsonProperty("elevation_low")
    private Float elevationLow = null;
    @JsonProperty("start_latlng")
    private LatLng startLatlng = null;
    @JsonProperty("end_latlng")
    private LatLng endLatlng = null;
    @JsonProperty("climb_category")
    private Integer climbCategory = null;
    @JsonProperty("city")
    private String city = null;
    @JsonProperty("state")
    private String state = null;
    @JsonProperty("country")
    private String country = null;
    @JsonProperty("private")
    private Boolean _private = null;
    @JsonProperty("athlete_pr_effort")
    private SummarySegmentEffort athletePrEffort = null;
    @JsonProperty("athlete_segment_stats")
    private SummaryPRSegmentEffort athleteSegmentStats = null;

    public SummarySegment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of this segment
     *
     * @return id
     **/
    @ApiModelProperty(value = "The unique identifier of this segment")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SummarySegment name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of this segment
     *
     * @return name
     **/
    @ApiModelProperty(value = "The name of this segment")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SummarySegment activityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * Get activityType
     *
     * @return activityType
     **/
    @ApiModelProperty(value = "")
    public ActivityTypeEnum getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityTypeEnum activityType) {
        this.activityType = activityType;
    }

    public SummarySegment distance(Float distance) {
        this.distance = distance;
        return this;
    }

    /**
     * The segment&#39;s distance, in meters
     *
     * @return distance
     **/
    @ApiModelProperty(value = "The segment's distance, in meters")
    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public SummarySegment averageGrade(Float averageGrade) {
        this.averageGrade = averageGrade;
        return this;
    }

    /**
     * The segment&#39;s average grade, in percents
     *
     * @return averageGrade
     **/
    @ApiModelProperty(value = "The segment's average grade, in percents")
    public Float getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Float averageGrade) {
        this.averageGrade = averageGrade;
    }

    public SummarySegment maximumGrade(Float maximumGrade) {
        this.maximumGrade = maximumGrade;
        return this;
    }

    /**
     * The segments&#39;s maximum grade, in percents
     *
     * @return maximumGrade
     **/
    @ApiModelProperty(value = "The segments's maximum grade, in percents")
    public Float getMaximumGrade() {
        return maximumGrade;
    }

    public void setMaximumGrade(Float maximumGrade) {
        this.maximumGrade = maximumGrade;
    }

    public SummarySegment elevationHigh(Float elevationHigh) {
        this.elevationHigh = elevationHigh;
        return this;
    }

    /**
     * The segments&#39;s highest elevation, in meters
     *
     * @return elevationHigh
     **/
    @ApiModelProperty(value = "The segments's highest elevation, in meters")
    public Float getElevationHigh() {
        return elevationHigh;
    }

    public void setElevationHigh(Float elevationHigh) {
        this.elevationHigh = elevationHigh;
    }

    public SummarySegment elevationLow(Float elevationLow) {
        this.elevationLow = elevationLow;
        return this;
    }

    /**
     * The segments&#39;s lowest elevation, in meters
     *
     * @return elevationLow
     **/
    @ApiModelProperty(value = "The segments's lowest elevation, in meters")
    public Float getElevationLow() {
        return elevationLow;
    }

    public void setElevationLow(Float elevationLow) {
        this.elevationLow = elevationLow;
    }

    public SummarySegment startLatlng(LatLng startLatlng) {
        this.startLatlng = startLatlng;
        return this;
    }

    /**
     * Get startLatlng
     *
     * @return startLatlng
     **/
    @ApiModelProperty(value = "")
    public LatLng getStartLatlng() {
        return startLatlng;
    }

    public void setStartLatlng(LatLng startLatlng) {
        this.startLatlng = startLatlng;
    }

    public SummarySegment endLatlng(LatLng endLatlng) {
        this.endLatlng = endLatlng;
        return this;
    }

    /**
     * Get endLatlng
     *
     * @return endLatlng
     **/
    @ApiModelProperty(value = "")
    public LatLng getEndLatlng() {
        return endLatlng;
    }

    public void setEndLatlng(LatLng endLatlng) {
        this.endLatlng = endLatlng;
    }

    public SummarySegment climbCategory(Integer climbCategory) {
        this.climbCategory = climbCategory;
        return this;
    }

    /**
     * The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.
     *
     * @return climbCategory
     **/
    @ApiModelProperty(value = "The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.")
    public Integer getClimbCategory() {
        return climbCategory;
    }

    public void setClimbCategory(Integer climbCategory) {
        this.climbCategory = climbCategory;
    }

    public SummarySegment city(String city) {
        this.city = city;
        return this;
    }

    /**
     * The segments&#39;s city.
     *
     * @return city
     **/
    @ApiModelProperty(value = "The segments's city.")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public SummarySegment state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The segments&#39;s state or geographical region.
     *
     * @return state
     **/
    @ApiModelProperty(value = "The segments's state or geographical region.")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SummarySegment country(String country) {
        this.country = country;
        return this;
    }

    /**
     * The segment&#39;s country.
     *
     * @return country
     **/
    @ApiModelProperty(value = "The segment's country.")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public SummarySegment _private(Boolean _private) {
        this._private = _private;
        return this;
    }

    /**
     * Whether this segment is private.
     *
     * @return _private
     **/
    @ApiModelProperty(value = "Whether this segment is private.")
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public SummarySegment athletePrEffort(SummarySegmentEffort athletePrEffort) {
        this.athletePrEffort = athletePrEffort;
        return this;
    }

    /**
     * Get athletePrEffort
     *
     * @return athletePrEffort
     **/
    @ApiModelProperty(value = "")
    public SummarySegmentEffort getAthletePrEffort() {
        return athletePrEffort;
    }

    public void setAthletePrEffort(SummarySegmentEffort athletePrEffort) {
        this.athletePrEffort = athletePrEffort;
    }

    public SummarySegment athleteSegmentStats(SummaryPRSegmentEffort athleteSegmentStats) {
        this.athleteSegmentStats = athleteSegmentStats;
        return this;
    }

    /**
     * Get athleteSegmentStats
     *
     * @return athleteSegmentStats
     **/
    @ApiModelProperty(value = "")
    public SummaryPRSegmentEffort getAthleteSegmentStats() {
        return athleteSegmentStats;
    }

    public void setAthleteSegmentStats(SummaryPRSegmentEffort athleteSegmentStats) {
        this.athleteSegmentStats = athleteSegmentStats;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SummarySegment summarySegment = (SummarySegment) o;
        return Objects.equals(this.id, summarySegment.id) &&
                Objects.equals(this.name, summarySegment.name) &&
                Objects.equals(this.activityType, summarySegment.activityType) &&
                Objects.equals(this.distance, summarySegment.distance) &&
                Objects.equals(this.averageGrade, summarySegment.averageGrade) &&
                Objects.equals(this.maximumGrade, summarySegment.maximumGrade) &&
                Objects.equals(this.elevationHigh, summarySegment.elevationHigh) &&
                Objects.equals(this.elevationLow, summarySegment.elevationLow) &&
                Objects.equals(this.startLatlng, summarySegment.startLatlng) &&
                Objects.equals(this.endLatlng, summarySegment.endLatlng) &&
                Objects.equals(this.climbCategory, summarySegment.climbCategory) &&
                Objects.equals(this.city, summarySegment.city) &&
                Objects.equals(this.state, summarySegment.state) &&
                Objects.equals(this.country, summarySegment.country) &&
                Objects.equals(this._private, summarySegment._private) &&
                Objects.equals(this.athletePrEffort, summarySegment.athletePrEffort) &&
                Objects.equals(this.athleteSegmentStats, summarySegment.athleteSegmentStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, activityType, distance, averageGrade, maximumGrade, elevationHigh, elevationLow, startLatlng, endLatlng, climbCategory, city, state, country, _private, athletePrEffort, athleteSegmentStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SummarySegment {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
        sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
        sb.append("    averageGrade: ").append(toIndentedString(averageGrade)).append("\n");
        sb.append("    maximumGrade: ").append(toIndentedString(maximumGrade)).append("\n");
        sb.append("    elevationHigh: ").append(toIndentedString(elevationHigh)).append("\n");
        sb.append("    elevationLow: ").append(toIndentedString(elevationLow)).append("\n");
        sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
        sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
        sb.append("    climbCategory: ").append(toIndentedString(climbCategory)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
        sb.append("    athletePrEffort: ").append(toIndentedString(athletePrEffort)).append("\n");
        sb.append("    athleteSegmentStats: ").append(toIndentedString(athleteSegmentStats)).append("\n");
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

    /**
     * Gets or Sets activityType
     */
    public enum ActivityTypeEnum {
        RIDE("Ride"),

        RUN("Run");

        private String value;

        ActivityTypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static ActivityTypeEnum fromValue(String text) {
            for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }

}

