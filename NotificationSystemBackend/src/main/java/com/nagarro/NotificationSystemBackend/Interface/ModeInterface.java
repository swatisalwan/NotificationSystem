package com.nagarro.NotificationSystemBackend.Interface;


import java.util.List;

public interface ModeInterface {
	 
	 public void email(List list ,String message);
	 public void portal(List list ,String message);
	 public void sms(List list ,String message);


}
