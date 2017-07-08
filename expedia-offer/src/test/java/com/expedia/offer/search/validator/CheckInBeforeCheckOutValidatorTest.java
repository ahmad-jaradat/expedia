package com.expedia.offer.search.validator;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.offer.search.validator.exception.CheckInIsAfterCheckOutException;

public class CheckInBeforeCheckOutValidatorTest {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	private final static LocalDate DATE_2010_3_1 = LocalDate.of(2010, 3, 1);
	private final static LocalDate DATE_2010_5_1 = LocalDate.of(2010, 5, 1);

	private OfferFilterValidator offerFilterValidator;
	
	@Before
	public void setup() {
		offerFilterValidator = new CheckInBeforeCheckOutValidator();
	}


	@Test
	public void whenValidateCheckInIsAfterCheckOutDate_ThenWillThrowCheckInIsAfterCheckOutException() {
		expectedException.expect(CheckInIsAfterCheckOutException.class);
		OfferFilterDto offerFilterDto = OfferFilterDto.Builder.newInstance().checkInDate(DATE_2010_5_1).checkOutDate(DATE_2010_3_1).build();
		offerFilterValidator.validate(offerFilterDto);
	}

}
