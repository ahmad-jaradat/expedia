package com.expedia.offer.search.validator;

import com.expedia.offer.search.OfferFilterDto;

@FunctionalInterface
public interface OfferFilterValidator {
	
	void validate(OfferFilterDto offerFilterDto);

}
