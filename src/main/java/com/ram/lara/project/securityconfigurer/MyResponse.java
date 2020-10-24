package com.ram.lara.project.securityconfigurer;

public class MyResponse {
	
	private String message;
	public MyResponse(String message)
	{
		this.message=message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

}
