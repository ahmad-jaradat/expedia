package com.expedia.offer.search;

import java.util.Iterator;

import com.expedia.offer.OfferDto;
import com.expedia.offer.search.validator.OfferFilterValidator;
import com.expedia.service.AppServiceLocator;

public class OfferFilter {

	private OfferProviderGateway offerProviderGateway = AppServiceLocator.getSingleService(OfferProviderGateway.class);
	private Iterator<OfferFilterValidator> offerFilterValidators = AppServiceLocator
			.getServices(OfferFilterValidator.class);
	private final OfferFilterDto dto;

	public OfferFilter(OfferFilterDto dto) {
		offerFilterValidators.forEachRemaining(validator -> validator.validate(dto));
		this.dto = dto;
	}

	public Iterable<OfferDto> getOffers() {
		return offerProviderGateway.get(dto);
	}
}
