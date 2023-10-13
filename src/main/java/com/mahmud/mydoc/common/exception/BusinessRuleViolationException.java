package com.mahmud.mydoc.common.exception;

public class BusinessRuleViolationException extends GenericException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -1981080309384901685L;
	private int errorCode;
    private String argument;
    private String argument2;
    
	public BusinessRuleViolationException()
    {
        super();
    }

    public BusinessRuleViolationException(String message)
    {
        super(message);
    }
    
    public BusinessRuleViolationException(int errorCode)
    {
    	this.errorCode=errorCode;
    }

    public BusinessRuleViolationException(int errorCode, String message)
    {
    	super(message);
    	this.errorCode=errorCode;
    }

	public int getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(int errorCode)
	{
		this.errorCode = errorCode;
	}

    public BusinessRuleViolationException(String message, Throwable cause)
    {
        super(message, cause);
        
    }

    public BusinessRuleViolationException(Throwable cause)
    {
        super(cause);
        
    }

	public String getArgument()
	{
		return argument;
	}

	public void setArgument(String argument)
	{
		this.argument = argument;
	}

	public String getArgument2()
	{
		return argument2;
	}

	public void setArgument2(String argument2)
	{
		this.argument2 = argument2;
	}
}

