package com.code.ahmad.springBootCrudRestApi.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeRestExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<EmployeeExceptionResponse> handleException(EmployeeNotFoundException enf) {

		EmployeeExceptionResponse exc = new EmployeeExceptionResponse();

		exc.setstatus(HttpStatus.NOT_FOUND.value());
		exc.setMessage(enf.getMessage());
		exc.setTimeStamp(System.currentTimeMillis());

		return new ResponseEntity<>(exc, HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler
	public ResponseEntity<EmployeeExceptionResponse> handleException(Exception exc){
		
		EmployeeExceptionResponse exr= new EmployeeExceptionResponse();
		
		exr.setstatus(HttpStatus.BAD_REQUEST.value());
		exr.setMessage("Sorry invalid entry");
		exr.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(exr, HttpStatus.BAD_REQUEST);
	}
	
}
