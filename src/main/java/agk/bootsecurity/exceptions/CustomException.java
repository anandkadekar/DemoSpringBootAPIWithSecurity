package agk.bootsecurity.exceptions;

public class CustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String error_message;
	public CustomException()
	{
		error_message="Unknown Error";
		
	}
	public  CustomException(String error_message) 
	{
	 	this.error_message=error_message;
	}
	public String toString()
	{
		
		return error_message;
	}
}
