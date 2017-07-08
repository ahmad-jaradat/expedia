package com.expedia.service;

public class NoUniqueServiceException extends RuntimeException{

	private static final long serialVersionUID = 5671737839832644376L;

	public NoUniqueServiceException() {
		super();
	}

	public NoUniqueServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoUniqueServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoUniqueServiceException(String message) {
		super(message);
	}

	public NoUniqueServiceException(Throwable cause) {
		super(cause);
	}

}
