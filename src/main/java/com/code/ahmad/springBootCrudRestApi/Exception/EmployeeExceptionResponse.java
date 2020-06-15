package com.code.ahmad.springBootCrudRestApi.Exception;

public class EmployeeExceptionResponse {

	private int status;
	
	private String message;
	
	private long timeStamp;
	
	
	public EmployeeExceptionResponse() {
		
	}


	public EmployeeExceptionResponse(int status, String message, long timeStamp) {

		this.status= status;
		this.message = message;
		this.timeStamp = timeStamp;
	}


	public int getstatus() {
		return status;
	}


	public void setstatus(int status) {
		this.status = status;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public long getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}


	@Override
	public String toString() {
		return "EmployeeException [status=" + status + ", message=" + message + ", timeStamp=" + timeStamp + "]";
	}



	

}
