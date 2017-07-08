package com.expedia.offer.filter.parameter.converter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.web.offer.filter.parameter.OfferFilterParameter;
import com.expedia.web.offer.filter.parameter.converter.OfferFilterDtoConverter;
import com.expedia.web.offer.filter.parameter.converter.exception.InvalidDateFormatException;
import com.expedia.web.offer.filter.parameter.converter.exception.MinimumNumberOfStarInvalidFormatException;

public class OfferFilterDtoConverterTest {

	private static final String AMMAN = "Amman";

	@Rule
	public final ExpectedException expectedExceotion = ExpectedException.none();

	private OfferFilterDtoConverter offerFilterDtoConverter;

	@Before
	public void setup() {
		offerFilterDtoConverter = new OfferFilterDtoConverter();
	}

	@Test
	public void whenCallConvertWithCityNameParameter_ThenWillReturnOfferFilterDataDtoWithSameCityName() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		OfferFilterDto dto = offerFilterDtoConverter.convert(filterParameter);
		assertEquals(filterParameter.getCityName(), dto.getCityName());
	}

	@Test
	public void whenCallConvertWithCheckInDateParameter_ThenWillReturnOfferFilterDataDtoWithSameCheckInDate() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckInDate("08/16/2017");
		OfferFilterDto dto = offerFilterDtoConverter.convert(filterParameter);
		assertEquals(LocalDate.of(2017, 8, 16), dto.getCheckInDate());
	}

	@Test
	public void whenCallConvertWithInvalidCheckInDateFormat_ThenThrowInvalidDateFormatExcpetion() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckInDate("2017");
		expectedExceotion.expect(InvalidDateFormatException.class);
		offerFilterDtoConverter.convert(filterParameter);
	}

	@Test
	public void whenCallConvertWithEmptyStringCheckInDateFormat_ThenValueForCheckInDateWillBeNull() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckInDate("");
		assertNull(offerFilterDtoConverter.convert(filterParameter).getCheckInDate());
	}

	@Test
	public void whenCallConvertWithCheckOutDateParameter_ThenWillReturnOfferFilterDataDtoWithSameCheckOutDate() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckOutDate("02/08/2016");
		OfferFilterDto dto = offerFilterDtoConverter.convert(filterParameter);
		assertEquals(LocalDate.of(2016, 2, 8), dto.getCheckOutDate());
	}

	@Test
	public void whenCallConvertWithInvalidCheckOutDateFormat_ThenThrowInvalidDateFormatExcpetion() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckOutDate("2017");
		expectedExceotion.expect(InvalidDateFormatException.class);
		offerFilterDtoConverter.convert(filterParameter);
	}

	@Test
	public void whenCallConvertWithEmptyStringCheckOutDateFormat_ThenValueForCheckOutDateWillBeNull() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setCheckOutDate("");
		assertNull(offerFilterDtoConverter.convert(filterParameter).getCheckOutDate());
	}

	@Test
	public void whenCallConvertWithMinNumberOfStarParameter_ThenWillReturnOfferFilterDataDtoWithSameMinNumberOfStar() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setMinimumNumberOfStart("5");
		OfferFilterDto dto = offerFilterDtoConverter.convert(filterParameter);
		assertEquals(Integer.valueOf(5), dto.getMinmimumNumberOfStar());
	}

	@Test
	public void whenCallConvertWithInvalidNumberForMinNumberOfStarParameter_ThenWillThrowMinimumNumberOfStarInvalidFormatException() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setMinimumNumberOfStart("a");
		expectedExceotion.expect(MinimumNumberOfStarInvalidFormatException.class);
		offerFilterDtoConverter.convert(filterParameter);
	}

	@Test
	public void whenCallConvertWithEmptyStringAsMinNumberOfStarParameter_ThenWillReturnMinNumberOfStarWithNullValue() {
		OfferFilterParameter filterParameter = new OfferFilterParameter();
		filterParameter.setCityName(AMMAN);
		filterParameter.setMinimumNumberOfStart("");
		OfferFilterDto dto = offerFilterDtoConverter.convert(filterParameter);
		assertNull(dto.getMinmimumNumberOfStar());
	}
}
