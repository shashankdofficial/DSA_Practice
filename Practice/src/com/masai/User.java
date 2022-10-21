package com.masai;

import java.time.LocalTime;

public class User {
	/*
	 userId,TimeStamp,Status

	 U1,5:40,loggedIn
	 U2,10:30,LoggedOut
	 U1,6:35,LoggedOut
	 U1,8:25,LoggedIN
	 U2,12:40,LoggedIn
	 U1,9:00,LoggedOut
	 */
	/*
	 5:40 - 6:35
	 12:40 - 10:30
	 8:25 - 9:00

	 */
	
	String userId;
	boolean status;
	LocalTime timeStamp;
	
	User(){
		
	}
	
	User(String userId,boolean status)
	{
		this.userId=userId;
		this.status=status;
		timeStamp=timeStamp.now();
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public boolean getStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public LocalTime getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(LocalTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
