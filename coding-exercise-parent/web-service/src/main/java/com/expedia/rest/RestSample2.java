package com.expedia.rest;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.expedia.integration.webservice.json.RequestResult;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RestSample2 {
	public static void main(String[] args) {
		RestTemplate rt = new RestTemplate();
		System.out.println(rt.getForObject(
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=New%20Orleans",
				String.class));
		RequestResult forObject = rt.getForObject(
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel&destinationName=New%20Orleans",
				RequestResult.class);

		System.out.println(forObject);
	}

	
}
