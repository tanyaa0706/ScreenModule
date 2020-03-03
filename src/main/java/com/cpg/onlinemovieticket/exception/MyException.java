package com.cpg.onlinemovieticket.exception;

public class MyException extends Exception{
	
	String message;
	
	
	public MyException(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return this.message;
	}

}
