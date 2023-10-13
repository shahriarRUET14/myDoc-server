package com.mahmud.mydoc.common.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoEntityFoundException extends BusinessRuleViolationException
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5609264131141011746L;
	public NoEntityFoundException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public NoEntityFoundException(String message)
    {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public NoEntityFoundException(int errorCode)
    {
        super(errorCode);
        // TODO Auto-generated constructor stub
    }

    public NoEntityFoundException(String message, Throwable cause)
    {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }


    public NoEntityFoundException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}

