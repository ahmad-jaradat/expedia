package com.expedia.offer.search;

import com.expedia.offer.OfferDto;

public interface OfferProviderGateway {

	Iterable<OfferDto> get(OfferFilterDto filterDto);

}
