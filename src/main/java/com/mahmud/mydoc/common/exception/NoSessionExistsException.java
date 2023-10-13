package com.mahmud.mydoc.common.exception;

public class NoSessionExistsException extends BusinessRuleViolationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5752962479956656671L;

	public NoSessionExistsException() {
		super();
	}

	public NoSessionExistsException(String msg) {
		super(msg);
	}

}
