package com.expedia.web.offer.filter.parameter;

public class OfferFilterParameter {
	
	private String cityName;
	private String checkInDate;
	private String checkOutDate;
	private String minimumNumberOfStart;
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCheckInDate() {
		return checkInDate;
	}
	
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	
	public String getCheckOutDate() {
		return checkOutDate;
	}
	
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	
	public String getMinimumNumberOfStart() {
		return minimumNumberOfStart;
	}

	public void setMinimumNumberOfStart(String minimumNumberOfStart) {
		this.minimumNumberOfStart = minimumNumberOfStart;
	}

	@Override
	public String toString() {
		return "FilterParameter [cityName=" + cityName + ", checkInDate=" + checkInDate + ", checkOutDate="
				+ checkOutDate + ", numberOfStart=" + minimumNumberOfStart + "]";
	}

	
}
