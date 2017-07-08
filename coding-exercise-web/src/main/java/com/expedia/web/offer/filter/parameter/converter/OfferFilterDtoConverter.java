package com.expedia.web.offer.filter.parameter.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.web.offer.filter.parameter.OfferFilterParameter;
import com.expedia.web.offer.filter.parameter.converter.exception.InvalidDateFormatException;
import com.expedia.web.offer.filter.parameter.converter.exception.MinimumNumberOfStarInvalidFormatException;

public class OfferFilterDtoConverter {

	private final static DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("M/d/yyyy");

	public OfferFilterDto convert(OfferFilterParameter filterParameter) {
		OfferFilterDto.Builder filterDataBuilder = OfferFilterDto.Builder.newInstance();

		filterDataBuilder.cityName(filterParameter.getCityName());

		filterDataBuilder.checkInDate(parseDate(filterParameter.getCheckInDate()));
		filterDataBuilder.checkOutDate(parseDate(filterParameter.getCheckOutDate()));

		if (isThereDataOnMinNumberOfStar(filterParameter))
			filterDataBuilder.minimumNumberOfStar(getMinimumNumberOfStar(filterParameter.getMinimumNumberOfStart()));

		return filterDataBuilder.build();
	}

	private LocalDate parseDate(String date) {
		try {
			return Objects.nonNull(date) ? (date.length() == 0 ? null : LocalDate.parse(date, DATE_FORMAT)) : null;
		} catch (DateTimeParseException ex) {
			throw new InvalidDateFormatException("Date Format must satisfy Month-dayOfMonth-Year patern", ex);
		}
	}

	private boolean isThereDataOnMinNumberOfStar(OfferFilterParameter filterParameter) {
		return Objects.nonNull(filterParameter.getMinimumNumberOfStart())
				&& !filterParameter.getMinimumNumberOfStart().isEmpty();
	}

	private Integer getMinimumNumberOfStar(String minimumNumberOfStart) {
		return Objects.nonNull(minimumNumberOfStart) ? getNumber(minimumNumberOfStart) : null;
	}

	private Integer getNumber(String minimumNumberOfStart) {
		try {
			return Integer.valueOf(minimumNumberOfStart);
		} catch (NumberFormatException ex) {
			throw new MinimumNumberOfStarInvalidFormatException(ex);
		}
	}
}
