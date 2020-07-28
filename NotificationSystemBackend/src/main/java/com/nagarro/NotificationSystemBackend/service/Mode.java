package com.nagarro.NotificationSystemBackend.service;

import java.util.List;

import com.nagarro.NotificationSystemBackend.Interface.ModeInterface;

public class Mode implements ModeInterface {

	@Override
	public void email(List list ,String message) {
		
		for(int i=0;i<list.size();i++) {
			System.out.println("This email is send to  " +list.get(i)+"   with Message  "+ message);
			
		}
		
	
	}

	@Override
	public void portal(List list ,String message) {
	
		for(int i=0;i<list.size();i++) {
			
		System.out.println("This message is send to   " +list.get(i)+" on  employee portal saying  "+ message);
		}
		
	}

	@Override
	public void sms(List list ,String message) {
		
		for(int i=0;i<list.size();i++) {
			
		System.out.println("This sms is send to  " +list.get(i)+"  with SMS   "+ message);
		}
	}


}
