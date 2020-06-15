package com.code.ahmad.springBootCrudRestApi.Exception;

public class EmployeeException {

	private String error;
	
	private String message;
	
	private String timeStamp;
	
	
	public EmployeeException() {
		
	}


	public EmployeeException(String error, String message, String timeStamp) {
		super();
		this.error = error;
		this.message = message;
		this.timeStamp = timeStamp;
	}


	public String getError() {
		return error;
	}


	public void setError(String error) {
		this.error = error;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}


	@Override
	public String toString() {
		return "EmployeeException [error=" + error + ", message=" + message + ", timeStamp=" + timeStamp + "]";
	}
	

}
