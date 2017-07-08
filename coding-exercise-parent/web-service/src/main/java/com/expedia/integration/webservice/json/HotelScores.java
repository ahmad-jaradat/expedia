
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
    "rawAppealScore",
    "movingAverageScore"
})
public class HotelScores {

    @JsonProperty("rawAppealScore")
    private Double rawAppealScore;
    @JsonProperty("movingAverageScore")
    private Double movingAverageScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rawAppealScore")
    public Double getRawAppealScore() {
        return rawAppealScore;
    }

    @JsonProperty("rawAppealScore")
    public void setRawAppealScore(Double rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @JsonProperty("movingAverageScore")
    public Double getMovingAverageScore() {
        return movingAverageScore;
    }

    @JsonProperty("movingAverageScore")
    public void setMovingAverageScore(Double movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
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
