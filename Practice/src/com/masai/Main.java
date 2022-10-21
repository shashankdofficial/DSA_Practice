package com.masai;

import java.time.LocalTime;

public class Main {
	
//	public static void log(String userId,int i)
//	{
//		User u=new User(userId, true);
//		
//		if(i==1 && u.getStatus()==false)
//		{
//			u.setStatus(true);
//			u.setTimeStamp(LocalTime.now());
//		}
//		else if(i==0 && u.getStatus()==true)
//		{
//			u.setStatus(false);
//			u.setTimeStamp(LocalTime.now());
//		}
//	}
	
	public static void print(User u)
	{
		LocalTime intime = null;
		LocalTime outtime = null;
		if(u.getStatus()==true) {
			intime = u.getTimeStamp();
			outtime = LocalTime.now();
		}
		else if(u.getStatus()==false) {
			outtime = u.getTimeStamp();
			intime = LocalTime.now();
		}
//		System.out.println(u.getUserId()+" "+u.getTimeStamp());
		System.out.println(intime+" "+outtime);
	}

	public static void main(String[] args) {
		User u = new User();
		
		u.setUserId("U1");
		u.setStatus(true);
		u.setTimeStamp(LocalTime.now());
		print(u);

	}

}
