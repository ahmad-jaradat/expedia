package com.expedia.offer.search.validator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.offer.search.validator.exception.LessThanZeroMinimumNumberOfStarException;
import com.expedia.offer.search.validator.exception.MoreThanFiveMinimumNumberOfStarException;

public class HotelNumberOfStarValidatorTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	
	private OfferFilterValidator offerFilterValidator;

	@Before
	public void setup() {
		offerFilterValidator = new NumberOfHotelStarValidator();
	}

	@Test
	public void whenValidateNumberLessThanZeroForMinNumberOfStarParameter_ThenWillThrowLessThanZeroMinimumNumberOfStarException() {
		expectedException.expect(LessThanZeroMinimumNumberOfStarException.class);
		OfferFilterDto offerFilterDto = OfferFilterDto.Builder.newInstance().minimumNumberOfStar(-1).build();
		offerFilterValidator.validate(offerFilterDto);
	}

	@Test
	public void whenValidateNumberMoreThanFiveForMinNumberOfStarParameter_ThenWillThrowMoreThanFiveMinimumNumberOfStarException() {
		expectedException.expect(MoreThanFiveMinimumNumberOfStarException.class);
		OfferFilterDto offerFilterDto = OfferFilterDto.Builder.newInstance().minimumNumberOfStar(6).build();
		offerFilterValidator.validate(offerFilterDto);
	}

}
