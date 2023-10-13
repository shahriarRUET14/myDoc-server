package com.mahmud.mydoc.common.exception;

public class UniqueCodeRequiredException extends BusinessRuleViolationException
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5609264131141011746L;

	public UniqueCodeRequiredException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public UniqueCodeRequiredException(String message)
    {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public UniqueCodeRequiredException(int errorCode)
    {
        super(errorCode);
        // TODO Auto-generated constructor stub
    }

    public UniqueCodeRequiredException(String message, Throwable cause)
    {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }


    public UniqueCodeRequiredException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}

