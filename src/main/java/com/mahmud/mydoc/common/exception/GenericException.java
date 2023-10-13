package com.mahmud.mydoc.common.exception;

public class GenericException extends Exception
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5401037492310840611L;

	public GenericException(String message)
    {
        super(message);
    }
    
    public GenericException()
    {
        
    }

    public GenericException(String message, Throwable cause)
    {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public GenericException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
    
}
