package com.expedia.offer;

import java.time.LocalDate;

public class OfferDto {

	private final String cityName;
	private final String description;
	private final Integer numberOfStar;
	private final LocalDate checkInDate;
	private final LocalDate checkOutDate;
	private final Double userRating;
	private final String hotelName;
	private final Double oldPrice;
	private final Double currentPrice;
	private final String hotelImage;
	private final String hotelUrl;

	public OfferDto(String cityName, String description, Integer numberOfStar, LocalDate checkInDate,
			LocalDate checkOutDate, Double userRating, String hotelName, Double oldPrice, Double currentPrice,
			String hotelImage, String hotelUrl) {
		this.cityName = cityName;
		this.description = description;
		this.numberOfStar = numberOfStar;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.userRating = userRating;
		this.hotelName = hotelName;
		this.oldPrice = oldPrice;
		this.currentPrice = currentPrice;
		this.hotelImage = hotelImage;
		this.hotelUrl = hotelUrl;
	}

	public String getCityName() {
		return cityName;
	}

	public String getDescription() {
		return description;
	}

	public Integer getNumberOfStar() {
		return numberOfStar;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public Double getUserRating() {
		return userRating;
	}

	public String getHotelName() {
		return hotelName;
	}

	public Double getOldPrice() {
		return oldPrice;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public String getHotelImage() {
		return hotelImage;
	}

	public String getHotelUrl(){
		return hotelUrl;
	}
	
	@Override
	public String toString() {
		return "OfferDto [cityName=" + cityName + ", description=" + description + ", numberOfStar=" + numberOfStar
				+ ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate + ", userRating=" + userRating
				+ ", hotelName=" + hotelName + ", oldPrice=" + oldPrice + ", currentPrice=" + currentPrice
				+ ", hotelImage=" + hotelImage + "]";
	}

	public static class Builder {

		private String cityName;
		private String description;
		private Integer numberOfStar;
		private LocalDate checkInDate;
		private LocalDate checkOutDate;
		private Double userRating;
		private String hotelName;
		private Double oldPrice;
		private Double currentPrice;
		private String hotelImage;
		private String hotelUrl;

		public Builder cityName(String cityName) {
			this.cityName = cityName;
			return this;
		}

		public Builder description(String description) {
			this.description = description;
			return this;
		}

		public Builder numberOfStar(Integer numberOfStar) {
			this.numberOfStar = numberOfStar;
			return this;
		}

		public Builder checkInDate(LocalDate checkInDate) {
			this.checkInDate = checkInDate;
			return this;
		}

		public Builder checkOutDate(LocalDate checkOutDate) {
			this.checkOutDate = checkOutDate;
			return this;
		}

		public Builder userRating(Double userRating) {
			this.userRating = userRating;
			return this;
		}

		public Builder hotelName(String hotelName) {
			this.hotelName = hotelName;
			return this;
		}

		public Builder oldPrice(Double oldPrice) {
			this.oldPrice = oldPrice;
			return this;
		}

		public Builder currentPrice(Double currentPrice) {
			this.currentPrice = currentPrice;
			return this;
		}

		public Builder hotelImage(String hotelImage) {
			this.hotelImage = hotelImage;
			return this;
		}

		public Builder hotelUrl(String hotelUrl) {
			this.hotelUrl = hotelUrl;
			return this;
		}

		public OfferDto build() {
			return new OfferDto(cityName, description, numberOfStar, checkInDate, checkOutDate, userRating, hotelName,
					oldPrice, currentPrice, hotelImage, hotelUrl);
		}
	}

}
