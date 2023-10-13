package com.mahmud.mydoc.common.exception;

import lombok.Getter;

@Getter
public class AlreadyExistsDataException extends BusinessRuleViolationException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3843607250422363286L;
    private String uniqueCode;
  
    
	public AlreadyExistsDataException()
    {
        super();
    }

    public AlreadyExistsDataException(String message)
    {
        super(message);
    }
    
   

    public AlreadyExistsDataException( String message, String uniqueCode)
    {
    	super(message);
    	this.uniqueCode = uniqueCode;
    }

	

	

    public AlreadyExistsDataException(String message, Throwable cause)
    {
        super(message, cause);
        
    }

    public AlreadyExistsDataException(Throwable cause)
    {
        super(cause);
        
    }

	
}
