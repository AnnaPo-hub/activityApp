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
import ru.otus.activity.client.model.MetaClub;

/**
 * SummaryClub
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2021-10-31T23:26:10.837+03:00")
public class SummaryClub {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("resource_state")
  private Integer resourceState = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("profile_medium")
  private String profileMedium = null;

  @JsonProperty("cover_photo")
  private String coverPhoto = null;

  @JsonProperty("cover_photo_small")
  private String coverPhotoSmall = null;

  /**
   * Gets or Sets sportType
   */
  public enum SportTypeEnum {
    CYCLING("cycling"),
    
    RUNNING("running"),
    
    TRIATHLON("triathlon"),
    
    OTHER("other");

    private String value;

    SportTypeEnum(String value) {
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
    public static SportTypeEnum fromValue(String text) {
      for (SportTypeEnum b : SportTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sport_type")
  private SportTypeEnum sportType = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("private")
  private Boolean _private = null;

  @JsonProperty("member_count")
  private Integer memberCount = null;

  @JsonProperty("featured")
  private Boolean featured = null;

  @JsonProperty("verified")
  private Boolean verified = null;

  @JsonProperty("url")
  private String url = null;

  public SummaryClub id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * The club&#39;s unique identifier.
   * @return id
  **/
  @ApiModelProperty(value = "The club's unique identifier.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SummaryClub resourceState(Integer resourceState) {
    this.resourceState = resourceState;
    return this;
  }

   /**
   * Resource state, indicates level of detail. Possible values: 1 -&gt; \&quot;meta\&quot;, 2 -&gt; \&quot;summary\&quot;, 3 -&gt; \&quot;detail\&quot;
   * @return resourceState
  **/
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"")
  public Integer getResourceState() {
    return resourceState;
  }

  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }

  public SummaryClub name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The club&#39;s name.
   * @return name
  **/
  @ApiModelProperty(value = "The club's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SummaryClub profileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
    return this;
  }

   /**
   * URL to a 60x60 pixel profile picture.
   * @return profileMedium
  **/
  @ApiModelProperty(value = "URL to a 60x60 pixel profile picture.")
  public String getProfileMedium() {
    return profileMedium;
  }

  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }

  public SummaryClub coverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

   /**
   * URL to a ~1185x580 pixel cover photo.
   * @return coverPhoto
  **/
  @ApiModelProperty(value = "URL to a ~1185x580 pixel cover photo.")
  public String getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public SummaryClub coverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
    return this;
  }

   /**
   * URL to a ~360x176  pixel cover photo.
   * @return coverPhotoSmall
  **/
  @ApiModelProperty(value = "URL to a ~360x176  pixel cover photo.")
  public String getCoverPhotoSmall() {
    return coverPhotoSmall;
  }

  public void setCoverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
  }

  public SummaryClub sportType(SportTypeEnum sportType) {
    this.sportType = sportType;
    return this;
  }

   /**
   * Get sportType
   * @return sportType
  **/
  @ApiModelProperty(value = "")
  public SportTypeEnum getSportType() {
    return sportType;
  }

  public void setSportType(SportTypeEnum sportType) {
    this.sportType = sportType;
  }

  public SummaryClub city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The club&#39;s city.
   * @return city
  **/
  @ApiModelProperty(value = "The club's city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SummaryClub state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The club&#39;s state or geographical region.
   * @return state
  **/
  @ApiModelProperty(value = "The club's state or geographical region.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SummaryClub country(String country) {
    this.country = country;
    return this;
  }

   /**
   * The club&#39;s country.
   * @return country
  **/
  @ApiModelProperty(value = "The club's country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SummaryClub _private(Boolean _private) {
    this._private = _private;
    return this;
  }

   /**
   * Whether the club is private.
   * @return _private
  **/
  @ApiModelProperty(value = "Whether the club is private.")
  public Boolean getPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public SummaryClub memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

   /**
   * The club&#39;s member count.
   * @return memberCount
  **/
  @ApiModelProperty(value = "The club's member count.")
  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public SummaryClub featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

   /**
   * Whether the club is featured or not.
   * @return featured
  **/
  @ApiModelProperty(value = "Whether the club is featured or not.")
  public Boolean getFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public SummaryClub verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

   /**
   * Whether the club is verified or not.
   * @return verified
  **/
  @ApiModelProperty(value = "Whether the club is verified or not.")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public SummaryClub url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The club&#39;s vanity URL.
   * @return url
  **/
  @ApiModelProperty(value = "The club's vanity URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryClub summaryClub = (SummaryClub) o;
    return Objects.equals(this.id, summaryClub.id) &&
        Objects.equals(this.resourceState, summaryClub.resourceState) &&
        Objects.equals(this.name, summaryClub.name) &&
        Objects.equals(this.profileMedium, summaryClub.profileMedium) &&
        Objects.equals(this.coverPhoto, summaryClub.coverPhoto) &&
        Objects.equals(this.coverPhotoSmall, summaryClub.coverPhotoSmall) &&
        Objects.equals(this.sportType, summaryClub.sportType) &&
        Objects.equals(this.city, summaryClub.city) &&
        Objects.equals(this.state, summaryClub.state) &&
        Objects.equals(this.country, summaryClub.country) &&
        Objects.equals(this._private, summaryClub._private) &&
        Objects.equals(this.memberCount, summaryClub.memberCount) &&
        Objects.equals(this.featured, summaryClub.featured) &&
        Objects.equals(this.verified, summaryClub.verified) &&
        Objects.equals(this.url, summaryClub.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, name, profileMedium, coverPhoto, coverPhotoSmall, sportType, city, state, country, _private, memberCount, featured, verified, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClub {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profileMedium: ").append(toIndentedString(profileMedium)).append("\n");
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    coverPhotoSmall: ").append(toIndentedString(coverPhotoSmall)).append("\n");
    sb.append("    sportType: ").append(toIndentedString(sportType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

