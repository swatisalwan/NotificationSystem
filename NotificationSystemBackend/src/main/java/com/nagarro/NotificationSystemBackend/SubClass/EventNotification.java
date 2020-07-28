package com.nagarro.NotificationSystemBackend.SubClass;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.Interface.Channel;
import com.nagarro.NotificationSystemBackend.Interface.Notifications;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.service.Mode;

public class EventNotification implements Notifications,Channel {
	
	Mode m=new  Mode();
	private List<String> eventObservers = new ArrayList<>();

	@Override
	public void attach(String o) {
		eventObservers.add(o);
		
	}

	@Override
	public void detach(String o) {
		eventObservers.remove(o);
		
	}

	 @Override
	 public void notifyUpdate(List<SubscriberList> list, String content) {
	  for (int i = 0; i < list.size(); i++) {
	   switch (list.get(i).getEvent()) {
	   case "Subscribe": {
	    attach(list.get(i).getEmail());
	   }
	   }
	  }
	  m.email(eventObservers, content);
	  m.portal(eventObservers, content);
	 }

	@Override
	public void responseMessage() {
		System.out.print("Event Messages are Sent to Event Observers");
		
	}

}
