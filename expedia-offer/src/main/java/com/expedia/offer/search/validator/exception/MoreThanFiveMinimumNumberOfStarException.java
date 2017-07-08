package com.expedia.offer.search.validator.exception;

public class MoreThanFiveMinimumNumberOfStarException extends RuntimeException{

	private static final long serialVersionUID = 897472355881229777L;

	public MoreThanFiveMinimumNumberOfStarException() {
		super();
	}

	public MoreThanFiveMinimumNumberOfStarException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MoreThanFiveMinimumNumberOfStarException(String message, Throwable cause) {
		super(message, cause);
	}

	public MoreThanFiveMinimumNumberOfStarException(String message) {
		super(message);
	}

	public MoreThanFiveMinimumNumberOfStarException(Throwable cause) {
		super(cause);
	}

	
}
