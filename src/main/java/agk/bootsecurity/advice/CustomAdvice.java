package agk.bootsecurity.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import agk.bootsecurity.exceptions.CustomException;

@RestControllerAdvice
public class CustomAdvice {
	
	@ExceptionHandler
	public String handleCustomException(CustomException ex)
	{
	  return ex.toString();
	}
}
