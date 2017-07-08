package com.expedia.offer.search.validator.exception;

public class LessThanZeroMinimumNumberOfStarException extends RuntimeException{

	private static final long serialVersionUID = -7026755870860790647L;

	public LessThanZeroMinimumNumberOfStarException() {
		super();
	}

	public LessThanZeroMinimumNumberOfStarException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LessThanZeroMinimumNumberOfStarException(String message, Throwable cause) {
		super(message, cause);
	}

	public LessThanZeroMinimumNumberOfStarException(String message) {
		super(message);
	}

	public LessThanZeroMinimumNumberOfStarException(Throwable cause) {
		super(cause);
	}

}
