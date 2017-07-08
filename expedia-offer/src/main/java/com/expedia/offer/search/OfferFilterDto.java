package com.expedia.offer.search;

import java.time.LocalDate;

public class OfferFilterDto {

	private final String cityName;
	private final LocalDate checkInDate;
	private final LocalDate checkOutDate;
	private final Integer minmimumNumberOfStar;

	public OfferFilterDto(String cityName, LocalDate checkInDate, LocalDate checkOutDate,
			Integer minmimumNumberOfStar) {
		this.cityName = cityName;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.minmimumNumberOfStar = minmimumNumberOfStar;
	}

	public String getCityName() {
		return cityName;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public Integer getMinmimumNumberOfStar() {
		return minmimumNumberOfStar;
	}


	
	@Override
	public String toString() {
		return "OfferFilterDto [cityName=" + cityName + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", minmimumNumberOfStar=" + minmimumNumberOfStar + "]";
	}



	public static class Builder {
		private String cityName;
		private Integer minmimumNumberOfStar;
		private LocalDate checkOutDate;
		private LocalDate checkInDate;

		public static Builder newInstance(){
			return new Builder();
		}
		
		private Builder(){}
		
		public Builder minimumNumberOfStar(Integer minmimumNumberOfStar) {
			this.minmimumNumberOfStar = minmimumNumberOfStar;
			return this;
		}

		public Builder checkOutDate(LocalDate checkOutDate) {
			this.checkOutDate = checkOutDate;
			return this;
		}

		public Builder checkInDate(LocalDate checkInDate) {
			this.checkInDate = checkInDate;
			return this;
		}

		public Builder cityName(String cityName) {
			this.cityName = cityName;
			return this;
		}

		public OfferFilterDto build() {
			return new OfferFilterDto(cityName, checkInDate, checkOutDate, minmimumNumberOfStar);
		}
		
	}
}
