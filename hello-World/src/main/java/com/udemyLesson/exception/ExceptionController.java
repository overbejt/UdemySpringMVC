package com.udemyLesson.exception;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * This is the class that will implement global exception handling.
 *
 */
@ControllerAdvice
public class ExceptionController {
	
	//Created a log object from the apache commons library
	private Log log = LogFactory.getLog(ExceptionController.class);
	
	@ExceptionHandler(value=Exception.class)
	public String handleException(HttpServletRequest request, Exception ex) {
		
		//Logging the exception
		log.error("Request " + request.getRequestURI() + " threw an exception.", ex);
		
		//Send the user to the error page
		return "error";
		
	}//End of the 'handleException' method
	

}//End of the 'ExceptionController' class
