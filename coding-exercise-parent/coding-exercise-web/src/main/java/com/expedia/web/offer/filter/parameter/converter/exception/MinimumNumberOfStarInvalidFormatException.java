package com.expedia.web.offer.filter.parameter.converter.exception;

public class MinimumNumberOfStarInvalidFormatException extends RuntimeException{

	private static final long serialVersionUID = 254089829512457549L;

	public MinimumNumberOfStarInvalidFormatException() {
		super();
	}

	public MinimumNumberOfStarInvalidFormatException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MinimumNumberOfStarInvalidFormatException(String message, Throwable cause) {
		super(message, cause);
	}

	public MinimumNumberOfStarInvalidFormatException(String message) {
		super(message);
	}

	public MinimumNumberOfStarInvalidFormatException(Throwable cause) {
		super(cause);
	}

}
