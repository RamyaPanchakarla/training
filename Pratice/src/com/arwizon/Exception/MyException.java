package com.arwizon.Exception;


public class MyException extends Exception {
	
	String exceptionMsg;
	public MyException(String msg)
	{
		this.exceptionMsg=msg;
	}
	@Override
	public String getMessage() {
		
		return exceptionMsg;
	}
	

}
