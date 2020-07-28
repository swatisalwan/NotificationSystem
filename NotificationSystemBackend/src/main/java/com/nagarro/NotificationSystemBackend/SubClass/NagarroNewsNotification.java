package com.nagarro.NotificationSystemBackend.SubClass;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.Interface.Channel;

import com.nagarro.NotificationSystemBackend.Interface.Notifications;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.service.Mode;


public class NagarroNewsNotification implements Notifications,Channel {
	
	private List<String> newsObservers = new ArrayList<>();
	Mode m= new Mode();

	@Override
	public void attach(String o) {
		newsObservers.add(o);
		
	}

	@Override
	public void detach(String o) {
		newsObservers.remove(o);
		
	}

	 @Override
	 public void notifyUpdate(List<SubscriberList> list, String content) {
	  for (int i = 0; i < list.size(); i++) {
	   switch (list.get(i).getNews()) {
	   case "Subscribe": {
	    attach(list.get(i).getEmail());
	   }
	   }
	  }
	  m.email(newsObservers, content);
	  m.portal(newsObservers, content);
	 }

	@Override
	public void responseMessage() {
		System.out.print("Event Messages are Sent to News Observers");
		
	}

}
