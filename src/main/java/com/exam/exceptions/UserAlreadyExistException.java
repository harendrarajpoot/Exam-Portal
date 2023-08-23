package com.exam.exceptions;

public class UserAlreadyExistException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;

	public UserAlreadyExistException(String message) {
		super();
		this.message = message;
	}
	
	public UserAlreadyExistException() {
		// TODO Auto-generated constructor stub
	}

}
