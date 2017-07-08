package com.expedia.offer.search.validator;

import java.util.Objects;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.offer.search.validator.exception.LessThanZeroMinimumNumberOfStarException;
import com.expedia.offer.search.validator.exception.MoreThanFiveMinimumNumberOfStarException;

public class NumberOfHotelStarValidator implements OfferFilterValidator {

	public void validate(OfferFilterDto offerFilterDto) {
		Integer numberOfStar = offerFilterDto.getMinmimumNumberOfStar();
		if (Objects.nonNull(numberOfStar)) {
			if (numberOfStar < 0)
				throw new LessThanZeroMinimumNumberOfStarException();
			if (numberOfStar > 5)
				throw new MoreThanFiveMinimumNumberOfStarException();
		}
	}

}
