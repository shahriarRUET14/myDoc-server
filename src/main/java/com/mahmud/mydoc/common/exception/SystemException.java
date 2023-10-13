package com.mahmud.mydoc.common.exception;

public class SystemException extends GenericException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5797735759562318616L;
	private int errorCode;
 	public SystemException()
	{}
    
    /** Constructs a SystemException with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for 
     *          later retrieval by the {@link #getMessage()} method.
     */
    public SystemException(String message) 
    {
    	super(message);
    }

    /**
     * Constructs a new SystemException with the specified detail message and
     * cause.  <p>Note that the detail message associated with
     * <code>cause</code> is <i>not</i> automatically incorporated in
     * this runtime exception's detail message.
     *
     * @param  message the detail message (which is saved for later retrieval
     *         by the {@link #getMessage()} method).
     * @param  cause the cause (which is saved for later retrieval by the
     *         {@link #getCause()} method).  (A <tt>null</tt> value is
     *         permitted, and indicates that the cause is nonexistent or
     *         unknown.)
     * @since  1.4
     */
    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public SystemException(Throwable cause)
    {
        super(cause);
    }
    
    public SystemException(int errorCode)
    {
    	this.errorCode=errorCode;
    }

    public SystemException(int errorCode, String message)
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
}
