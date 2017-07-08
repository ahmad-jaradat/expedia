package com.expedia.offer.search.validator;

import java.time.LocalDate;
import java.util.Objects;

import com.expedia.offer.search.OfferFilterDto;
import com.expedia.offer.search.validator.exception.CheckInIsAfterCheckOutException;

public class CheckInBeforeCheckOutValidator implements OfferFilterValidator {

	@Override
	public void validate(OfferFilterDto offerFilterDto) {
		LocalDate checkOutDate = offerFilterDto.getCheckOutDate();
		LocalDate checkInDate = offerFilterDto.getCheckInDate();
		if (Objects.nonNull(checkInDate) && Objects.nonNull(checkOutDate) && checkInDate.isAfter(checkOutDate))
			throw new CheckInIsAfterCheckOutException(
					String.format("check in date %s  check out date %s", checkInDate, checkOutDate));
	}

}
