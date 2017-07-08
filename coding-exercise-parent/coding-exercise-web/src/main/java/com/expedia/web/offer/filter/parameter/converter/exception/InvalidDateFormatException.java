package com.expedia.web.offer.filter.parameter.converter.exception;

public class InvalidDateFormatException extends RuntimeException{

	private static final long serialVersionUID = 3876958365509290327L;

	public InvalidDateFormatException() {
		super();
	}

	public InvalidDateFormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InvalidDateFormatException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidDateFormatException(String message) {
		super(message);
	}

	public InvalidDateFormatException(Throwable cause) {
		super(cause);
	}

	
}
