package com.expedia.offer.search.validator.exception;

public class CheckInIsAfterCheckOutException extends RuntimeException{

	private static final long serialVersionUID = -2063724081296504711L;

	public CheckInIsAfterCheckOutException() {
		super();
	}

	public CheckInIsAfterCheckOutException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CheckInIsAfterCheckOutException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckInIsAfterCheckOutException(String message) {
		super(message);
	}

	public CheckInIsAfterCheckOutException(Throwable cause) {
		super(cause);
	}

	
}
