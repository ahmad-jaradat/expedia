
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
    "averagePriceValue",
    "totalPriceValue",
    "originalPricePerNight",
    "hotelTotalBaseRate",
    "hotelTotalTaxesAndFees",
    "currency",
    "hotelTotalMandatoryTaxesAndFees",
    "percentSavings",
    "drr"
})
public class HotelPricingInfo {

    @JsonProperty("averagePriceValue")
    private Double averagePriceValue;
    @JsonProperty("totalPriceValue")
    private Double totalPriceValue;
    @JsonProperty("originalPricePerNight")
    private Double originalPricePerNight;
    @JsonProperty("hotelTotalBaseRate")
    private Double hotelTotalBaseRate;
    @JsonProperty("hotelTotalTaxesAndFees")
    private Double hotelTotalTaxesAndFees;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    private Double hotelTotalMandatoryTaxesAndFees;
    @JsonProperty("percentSavings")
    private Double percentSavings;
    @JsonProperty("drr")
    private Boolean drr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("averagePriceValue")
    public Double getAveragePriceValue() {
        return averagePriceValue;
    }

    @JsonProperty("averagePriceValue")
    public void setAveragePriceValue(Double averagePriceValue) {
        this.averagePriceValue = averagePriceValue;
    }

    @JsonProperty("totalPriceValue")
    public Double getTotalPriceValue() {
        return totalPriceValue;
    }

    @JsonProperty("totalPriceValue")
    public void setTotalPriceValue(Double totalPriceValue) {
        this.totalPriceValue = totalPriceValue;
    }

    @JsonProperty("originalPricePerNight")
    public Double getOriginalPricePerNight() {
        return originalPricePerNight;
    }

    @JsonProperty("originalPricePerNight")
    public void setOriginalPricePerNight(Double originalPricePerNight) {
        this.originalPricePerNight = originalPricePerNight;
    }

    @JsonProperty("hotelTotalBaseRate")
    public Double getHotelTotalBaseRate() {
        return hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalBaseRate")
    public void setHotelTotalBaseRate(Double hotelTotalBaseRate) {
        this.hotelTotalBaseRate = hotelTotalBaseRate;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public Double getHotelTotalTaxesAndFees() {
        return hotelTotalTaxesAndFees;
    }

    @JsonProperty("hotelTotalTaxesAndFees")
    public void setHotelTotalTaxesAndFees(Double hotelTotalTaxesAndFees) {
        this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    public Double getHotelTotalMandatoryTaxesAndFees() {
        return hotelTotalMandatoryTaxesAndFees;
    }

    @JsonProperty("hotelTotalMandatoryTaxesAndFees")
    public void setHotelTotalMandatoryTaxesAndFees(Double hotelTotalMandatoryTaxesAndFees) {
        this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
    }

    @JsonProperty("percentSavings")
    public Double getPercentSavings() {
        return percentSavings;
    }

    @JsonProperty("percentSavings")
    public void setPercentSavings(Double percentSavings) {
        this.percentSavings = percentSavings;
    }

    @JsonProperty("drr")
    public Boolean getDrr() {
        return drr;
    }

    @JsonProperty("drr")
    public void setDrr(Boolean drr) {
        this.drr = drr;
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
