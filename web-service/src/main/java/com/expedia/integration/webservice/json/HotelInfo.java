
package com.expedia.integration.webservice.json;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hotelId",
    "hotelName",
    "hotelDestination",
    "hotelDestinationRegionID",
    "hotelLongDestination",
    "hotelStreetAddress",
    "hotelCity",
    "hotelProvince",
    "hotelCountryCode",
    "hotelLocation",
    "hotelLatitude",
    "hotelLongitude",
    "hotelStarRating",
    "hotelGuestReviewRating",
    "travelStartDate",
    "travelEndDate",
    "hotelImageUrl",
    "carPackageScore",
    "description",
    "distanceFromUser",
    "language",
    "movingAverageScore",
    "promotionAmount",
    "promotionDescription",
    "promotionTag",
    "rawAppealScore",
    "relevanceScore",
    "statusCode",
    "statusDescription",
    "carPackage",
    "allInclusive"
})
public class HotelInfo {

    @JsonProperty("hotelId")
    private String hotelId;
    @JsonProperty("hotelName")
    private String hotelName;
    @JsonProperty("hotelDestination")
    private String hotelDestination;
    @JsonProperty("hotelDestinationRegionID")
    private String hotelDestinationRegionID;
    @JsonProperty("hotelLongDestination")
    private String hotelLongDestination;
    @JsonProperty("hotelStreetAddress")
    private String hotelStreetAddress;
    @JsonProperty("hotelCity")
    private String hotelCity;
    @JsonProperty("hotelProvince")
    private String hotelProvince;
    @JsonProperty("hotelCountryCode")
    private String hotelCountryCode;
    @JsonProperty("hotelLocation")
    private String hotelLocation;
    @JsonProperty("hotelLatitude")
    private Double hotelLatitude;
    @JsonProperty("hotelLongitude")
    private Double hotelLongitude;
    @JsonProperty("hotelStarRating")
    private Double hotelStarRating;
    @JsonProperty("hotelGuestReviewRating")
    private Double hotelGuestReviewRating;
    @JsonProperty("travelStartDate")
    private String travelStartDate;
    @JsonProperty("travelEndDate")
    private String travelEndDate;
    @JsonProperty("hotelImageUrl")
    private String hotelImageUrl;
    @JsonProperty("carPackageScore")
    private Double carPackageScore;
    @JsonProperty("description")
    private String description;
    @JsonProperty("distanceFromUser")
    private Double distanceFromUser;
    @JsonProperty("language")
    private String language;
    @JsonProperty("movingAverageScore")
    private Double movingAverageScore;
    @JsonProperty("promotionAmount")
    private Double promotionAmount;
    @JsonProperty("promotionDescription")
    private String promotionDescription;
    @JsonProperty("promotionTag")
    private String promotionTag;
    @JsonProperty("rawAppealScore")
    private Double rawAppealScore;
    @JsonProperty("relevanceScore")
    private Double relevanceScore;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("statusDescription")
    private String statusDescription;
    @JsonProperty("carPackage")
    private Boolean carPackage;
    @JsonProperty("allInclusive")
    private Boolean allInclusive;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hotelId")
    public String getHotelId() {
        return hotelId;
    }

    @JsonProperty("hotelId")
    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @JsonProperty("hotelName")
    public String getHotelName() {
        return hotelName;
    }

    @JsonProperty("hotelName")
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @JsonProperty("hotelDestination")
    public String getHotelDestination() {
        return hotelDestination;
    }

    @JsonProperty("hotelDestination")
    public void setHotelDestination(String hotelDestination) {
        this.hotelDestination = hotelDestination;
    }

    @JsonProperty("hotelDestinationRegionID")
    public String getHotelDestinationRegionID() {
        return hotelDestinationRegionID;
    }

    @JsonProperty("hotelDestinationRegionID")
    public void setHotelDestinationRegionID(String hotelDestinationRegionID) {
        this.hotelDestinationRegionID = hotelDestinationRegionID;
    }

    @JsonProperty("hotelLongDestination")
    public String getHotelLongDestination() {
        return hotelLongDestination;
    }

    @JsonProperty("hotelLongDestination")
    public void setHotelLongDestination(String hotelLongDestination) {
        this.hotelLongDestination = hotelLongDestination;
    }

    @JsonProperty("hotelStreetAddress")
    public String getHotelStreetAddress() {
        return hotelStreetAddress;
    }

    @JsonProperty("hotelStreetAddress")
    public void setHotelStreetAddress(String hotelStreetAddress) {
        this.hotelStreetAddress = hotelStreetAddress;
    }

    @JsonProperty("hotelCity")
    public String getHotelCity() {
        return hotelCity;
    }

    @JsonProperty("hotelCity")
    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    @JsonProperty("hotelProvince")
    public String getHotelProvince() {
        return hotelProvince;
    }

    @JsonProperty("hotelProvince")
    public void setHotelProvince(String hotelProvince) {
        this.hotelProvince = hotelProvince;
    }

    @JsonProperty("hotelCountryCode")
    public String getHotelCountryCode() {
        return hotelCountryCode;
    }

    @JsonProperty("hotelCountryCode")
    public void setHotelCountryCode(String hotelCountryCode) {
        this.hotelCountryCode = hotelCountryCode;
    }

    @JsonProperty("hotelLocation")
    public String getHotelLocation() {
        return hotelLocation;
    }

    @JsonProperty("hotelLocation")
    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    @JsonProperty("hotelLatitude")
    public Double getHotelLatitude() {
        return hotelLatitude;
    }

    @JsonProperty("hotelLatitude")
    public void setHotelLatitude(Double hotelLatitude) {
        this.hotelLatitude = hotelLatitude;
    }

    @JsonProperty("hotelLongitude")
    public Double getHotelLongitude() {
        return hotelLongitude;
    }

    @JsonProperty("hotelLongitude")
    public void setHotelLongitude(Double hotelLongitude) {
        this.hotelLongitude = hotelLongitude;
    }

    @JsonProperty("hotelStarRating")
    public Double getHotelStarRating() {
        return hotelStarRating;
    }

    @JsonProperty("hotelStarRating")
    public void setHotelStarRating(Double hotelStarRating) {
        this.hotelStarRating = hotelStarRating;
    }

    @JsonProperty("hotelGuestReviewRating")
    public Double getHotelGuestReviewRating() {
        return hotelGuestReviewRating;
    }

    @JsonProperty("hotelGuestReviewRating")
    public void setHotelGuestReviewRating(Double hotelGuestReviewRating) {
        this.hotelGuestReviewRating = hotelGuestReviewRating;
    }

    @JsonProperty("travelStartDate")
    public String getTravelStartDate() {
        return travelStartDate;
    }

    @JsonProperty("travelStartDate")
    public void setTravelStartDate(String travelStartDate) {
        this.travelStartDate = travelStartDate;
    }

    @JsonProperty("travelEndDate")
    public String getTravelEndDate() {
        return travelEndDate;
    }

    @JsonProperty("travelEndDate")
    public void setTravelEndDate(String travelEndDate) {
        this.travelEndDate = travelEndDate;
    }

    @JsonProperty("hotelImageUrl")
    public String getHotelImageUrl() {
        return hotelImageUrl;
    }

    @JsonProperty("hotelImageUrl")
    public void setHotelImageUrl(String hotelImageUrl) {
        this.hotelImageUrl = hotelImageUrl;
    }

    @JsonProperty("carPackageScore")
    public Double getCarPackageScore() {
        return carPackageScore;
    }

    @JsonProperty("carPackageScore")
    public void setCarPackageScore(Double carPackageScore) {
        this.carPackageScore = carPackageScore;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("distanceFromUser")
    public Double getDistanceFromUser() {
        return distanceFromUser;
    }

    @JsonProperty("distanceFromUser")
    public void setDistanceFromUser(Double distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    @JsonProperty("movingAverageScore")
    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    @JsonProperty("movingAverageScore")
    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    @JsonProperty("promotionAmount")
    public Double getPromotionAmount() {
        return promotionAmount;
    }

    @JsonProperty("promotionAmount")
    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    @JsonProperty("promotionDescription")
    public String getPromotionDescription() {
        return promotionDescription;
    }

    @JsonProperty("promotionDescription")
    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    @JsonProperty("promotionTag")
    public String getPromotionTag() {
        return promotionTag;
    }

    @JsonProperty("promotionTag")
    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    @JsonProperty("rawAppealScore")
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    @JsonProperty("rawAppealScore")
    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @JsonProperty("relevanceScore")
    public Double getRelevanceScore() {
        return relevanceScore;
    }

    @JsonProperty("relevanceScore")
    public void setRelevanceScore(Double relevanceScore) {
        this.relevanceScore = relevanceScore;
    }

    @JsonProperty("statusCode")
    public String getStatusCode() {
        return statusCode;
    }

    @JsonProperty("statusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @JsonProperty("statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    @JsonProperty("statusDescription")
    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @JsonProperty("carPackage")
    public Boolean getCarPackage() {
        return carPackage;
    }

    @JsonProperty("carPackage")
    public void setCarPackage(Boolean carPackage) {
        this.carPackage = carPackage;
    }

    @JsonProperty("allInclusive")
    public Boolean getAllInclusive() {
        return allInclusive;
    }

    @JsonProperty("allInclusive")
    public void setAllInclusive(Boolean allInclusive) {
        this.allInclusive = allInclusive;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
