package com.expedia.integration.webservice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import com.expedia.integration.webservice.json.Hotel;
import com.expedia.integration.webservice.json.RequestResult;
import com.expedia.offer.OfferDto;

public class Converter {

	private static final String DOT_REGEX = ".";

	public Iterable<OfferDto> convert(RequestResult result) {
		if (Objects.isNull(result.getOffers()))
			return Collections.emptyList();
		List<OfferDto> offers = new ArrayList<>();
		if (Objects.nonNull(result.getOffers().getHotel()))
			for (Hotel hotel : result.getOffers().getHotel()) {
				OfferDto.Builder builder = new OfferDto.Builder();
				builder.hotelName(hotel.getHotelInfo().getHotelName());
				builder.checkInDate(getCheckInDate(hotel));
				builder.checkOutDate(getCheckOutDate(hotel));
				builder.cityName(hotel.getDestination().getLongName());
				builder.currentPrice(hotel.getHotelPricingInfo().getAveragePriceValue());
				builder.oldPrice(hotel.getHotelPricingInfo().getOriginalPricePerNight());
				builder.description(hotel.getHotelInfo().getDescription());
				builder.hotelImage(modifyHotelImageToBigSizeImageUtl(hotel.getHotelInfo().getHotelImageUrl()));
				builder.hotelUrl(hotel.getHotelUrls().getHotelInfositeUrl().replaceAll("%3A", ":")
						.replaceAll("%2F", "/").replaceAll("%3F", "?").replaceAll("%3D", "=").replaceAll("%26","&").replaceAll("%25", "%"));
				builder.hotelName(hotel.getHotelInfo().getHotelName());
				builder.numberOfStar(hotel.getHotelInfo().getHotelStarRating().intValue());
				builder.userRating(hotel.getHotelInfo().getHotelGuestReviewRating());
				offers.add(builder.build());
			}
		return offers;
	}

	private String modifyHotelImageToBigSizeImageUtl(String hotelImageSmallUrl) {
		int lastIndexOfDot = hotelImageSmallUrl.lastIndexOf(DOT_REGEX);
		if (lastIndexOfDot > 1) {
			char[] charArray = hotelImageSmallUrl.toCharArray();
			charArray[lastIndexOfDot - 1] = 'b';
			return new String(charArray);
		} else
			return hotelImageSmallUrl;
	}

	private LocalDate getCheckOutDate(Hotel hotel) {
		List<Integer> travelEndDate = hotel.getOfferDateRange().getTravelEndDate();
		LocalDate checkOutDate = LocalDate.of(travelEndDate.get(0), travelEndDate.get(1), travelEndDate.get(2));
		return checkOutDate;
	}

	private LocalDate getCheckInDate(Hotel hotel) {
		List<Integer> travelStartDate = hotel.getOfferDateRange().getTravelStartDate();
		LocalDate checkInDate = LocalDate.of(travelStartDate.get(0), travelStartDate.get(1), travelStartDate.get(2));
		return checkInDate;
	}
}
