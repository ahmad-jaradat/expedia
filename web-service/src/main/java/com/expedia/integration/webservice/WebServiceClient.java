package com.expedia.integration.webservice;

import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expedia.integration.webservice.json.RequestResult;
import com.expedia.offer.OfferDto;
import com.expedia.offer.search.OfferFilterDto;
import com.expedia.offer.search.OfferProviderGateway;

public class WebServiceClient implements OfferProviderGateway {
	
	private static final String DEMO = "demo";
	private static final String UID = "uid";
	private static final String SCENARIO = "scenario";
	private static final String PRODUCT_TYPE = "productType";
	private static final String PAGE = "page";
	private static final String _1 = "1";
	private static final String HOTEL = "Hotel";
	private static final String DEAL_FINDER = "deal-finder";
	private static final String BASE_URL = "https://offersvc.expedia.com/offers/v2/getOffers";
	
	private static final Converter converter = new Converter();

	public Iterable<OfferDto> get(OfferFilterDto filterDto) {
		return converter.convert(getResult(filterDto));
	}

	public RequestResult getResult(OfferFilterDto offerFilter) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(BASE_URL);
		if (Objects.nonNull(offerFilter.getCityName())&&offerFilter.getCityName().length()>0)
			builder.queryParam("destinationName", offerFilter.getCityName());
		if (Objects.nonNull(offerFilter.getMinmimumNumberOfStar()))
			builder.queryParam("minStarRating", Integer.toString(offerFilter.getMinmimumNumberOfStar()));
		if (Objects.nonNull(offerFilter.getCheckInDate())) {
			builder.queryParam("minTripStartDate", offerFilter.getCheckInDate().format(DateTimeFormatter.ISO_DATE));
			builder.queryParam("maxTripStartDate", offerFilter.getCheckInDate().format(DateTimeFormatter.ISO_DATE));
		}
		if (Objects.nonNull(offerFilter.getCheckOutDate()) && Objects.nonNull(offerFilter.getCheckInDate())) {
			builder.queryParam("lengthOfStay", Integer
					.toString(Period.between(offerFilter.getCheckInDate(), offerFilter.getCheckOutDate()).getDays()));
		}
		builder.queryParam(UID, DEMO);
		builder.queryParam(SCENARIO, DEAL_FINDER);
		builder.queryParam(PRODUCT_TYPE, HOTEL);
		builder.queryParam(PAGE, _1);

		RestTemplate rt = new RestTemplate();

		RequestResult result = rt.getForObject(builder.toUriString(), RequestResult.class);
		return result;
	}

}
