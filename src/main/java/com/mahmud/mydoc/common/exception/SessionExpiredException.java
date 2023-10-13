package com.mahmud.mydoc.common.exception;

public class SessionExpiredException extends BusinessRuleViolationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -88800881152888323L;

	public SessionExpiredException() {
		super();
	}

	public SessionExpiredException(String msg) {
		super(msg);
	}

}