package com.mahmud.mydoc.common.exception;

public class EndLevelNotFoundException extends BusinessRuleViolationException {
	
	private static final long serialVersionUID = 5609264131141011746L;

	public EndLevelNotFoundException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public EndLevelNotFoundException(String message)
    {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public EndLevelNotFoundException(int errorCode)
    {
        super(errorCode);
        // TODO Auto-generated constructor stub
    }

    public EndLevelNotFoundException(String message, Throwable cause)
    {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }


    public EndLevelNotFoundException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}

