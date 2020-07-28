package com.nagarro.NotificationSystemBackend.Interface;

import java.util.List;

import com.nagarro.NotificationSystemBackend.Model.SubscriberList;

public interface Channel {
	
	 public void attach(String o);
	 public void detach(String o);
	
	void notifyUpdate(List<SubscriberList> list, String content);
	

}
