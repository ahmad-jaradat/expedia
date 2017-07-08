package com.expedia.integration.webservice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.expedia.integration.webservice.json.Destination;
import com.expedia.integration.webservice.json.Hotel;
import com.expedia.integration.webservice.json.HotelInfo;
import com.expedia.integration.webservice.json.HotelPricingInfo;
import com.expedia.integration.webservice.json.HotelUrls;
import com.expedia.integration.webservice.json.OfferDateRange;
import com.expedia.integration.webservice.json.Offers;
import com.expedia.integration.webservice.json.RequestResult;
import com.expedia.offer.OfferDto;

public class ConverterTest {
	private static final String HTTP_HOTEL_IMAGE_T_JPG = "http://hotel-image_t.jpg";
	private static final String HTTP_HOTEL_IMAGE_B_JPG = "http://hotel-image_b.jpg";
	private static final Double OLD_PRICE = 200.5;
	private static final Double CURRENT_PRICE = 150.0;
	private static final Integer STAR_RATING = 5;
	private static final Double GUEST_RATING = 4.3;
	private static final String DESCRIPTION_FOR_VECTOR_HOTEL = "Description For Vector Hotel";
	private static final String VECTORY_HOTEL = "Vectory-Hotel";
	private static final String AMMAN = "Amman";
	private static final String HOTEL_URL= "HOTEL_URL";
	private Converter converter;

	@Before
	public void setup() {
		converter = new Converter();
	}

	@Test
	public void whenSendRequestResultWithoutOffers_ThenReturnEmptyIterableOfOffer() {
		RequestResult result = new RequestResult();
		Iterator<OfferDto> offers = converter.convert(result).iterator();
		Assert.assertFalse(offers.hasNext());
	}

	@Test
	public void whenSendRequestResultWithOneOffer_ThenReturnIterableWithOneOffer() {
		RequestResult result = new RequestResult();
		setupOffer(result);
		Iterator<OfferDto> offers = converter.convert(result).iterator();
		assertTrue(offers.hasNext());
		OfferDto offer = offers.next();
		assertFalse(offers.hasNext());
		assertEquals(AMMAN, offer.getCityName());
		assertEquals(LocalDate.of(2012, 5, 5), offer.getCheckInDate());
		assertEquals(LocalDate.of(2012, 5, 13), offer.getCheckOutDate());
		assertEquals(CURRENT_PRICE, offer.getCurrentPrice());
		assertEquals(OLD_PRICE, offer.getOldPrice());
		assertEquals(GUEST_RATING, offer.getUserRating());
		assertEquals(STAR_RATING, offer.getNumberOfStar());
		assertEquals(VECTORY_HOTEL, offer.getHotelName());
		assertEquals(HOTEL_URL, offer.getHotelUrl());
		assertEquals(HTTP_HOTEL_IMAGE_B_JPG, offer.getHotelImage());

	}

	private void setupOffer(RequestResult result) {
		Offers offers = new Offers();
		List<Hotel> hotels = new ArrayList<>();
		hotels.add(setupHotel());
		offers.setHotel(hotels);
		result.setOffers(offers);
	}

	private Hotel setupHotel() {
		Hotel hotel = new Hotel();
		Destination destination = new Destination();
		destination.setLongName(AMMAN);
		hotel.setDestination(destination);
		hotel.setOfferDateRange(setupHotelDateRange());
		hotel.setHotelInfo(setupHotelInfo());
		hotel.setHotelPricingInfo(setupHotelPricingInfo());
		HotelUrls hotelUrls = new HotelUrls();
		hotelUrls.setHotelInfositeUrl(HOTEL_URL);
		hotel.setHotelUrls(hotelUrls);
		return hotel;
	}

	private HotelPricingInfo setupHotelPricingInfo() {
		HotelPricingInfo hotelPricingInfo = new HotelPricingInfo();
		hotelPricingInfo.setOriginalPricePerNight(OLD_PRICE);
		hotelPricingInfo.setAveragePriceValue(CURRENT_PRICE);
		return hotelPricingInfo;
	}

	private OfferDateRange setupHotelDateRange() {
		OfferDateRange offerDateRange = new OfferDateRange();
		offerDateRange.setTravelEndDate(Arrays.asList(2012, 5, 13));
		offerDateRange.setTravelStartDate(Arrays.asList(2012, 5, 5));
		return offerDateRange;
	}

	private HotelInfo setupHotelInfo() {
		HotelInfo hotelInfo = new HotelInfo();
		hotelInfo.setHotelName(VECTORY_HOTEL);
		hotelInfo.setDescription(DESCRIPTION_FOR_VECTOR_HOTEL);
		hotelInfo.setHotelImageUrl(HTTP_HOTEL_IMAGE_T_JPG);
		hotelInfo.setHotelStarRating(STAR_RATING.doubleValue());
		hotelInfo.setHotelGuestReviewRating(GUEST_RATING);
		return hotelInfo;
	}

}
