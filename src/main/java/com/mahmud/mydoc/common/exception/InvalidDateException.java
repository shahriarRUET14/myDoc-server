package com.mahmud.mydoc.common.exception;

public class InvalidDateException extends BusinessRuleViolationException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3478794817767384393L;

	public InvalidDateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidDateException(int errorCode, String message) {
		super(errorCode, message);
		// TODO Auto-generated constructor stub
	}

	public InvalidDateException(int errorCode) {
		super(errorCode);
		// TODO Auto-generated constructor stub
	}

	public InvalidDateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidDateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidDateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
