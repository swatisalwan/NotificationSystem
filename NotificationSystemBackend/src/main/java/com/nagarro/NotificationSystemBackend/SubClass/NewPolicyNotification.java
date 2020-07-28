package com.nagarro.NotificationSystemBackend.SubClass;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.Interface.Channel;
import com.nagarro.NotificationSystemBackend.Interface.Notifications;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.service.Mode;

public class NewPolicyNotification implements Notifications,Channel {
	
	Mode m=new Mode();
	private List<String> newPolicyObservers = new ArrayList<>();

	@Override
	public void attach(String o) {
		newPolicyObservers.add(o);
		
	}

	@Override
	public void detach(String o) {
		newPolicyObservers.remove(o);
		
	}

	 @Override
	 public void notifyUpdate(List<SubscriberList> list, String content) {
	  for (int i = 0; i < list.size(); i++) {
	   switch (list.get(i).getPolicy()) {
	   case "Subscribe": {
	    attach(list.get(i).getEmail());
	   }
	   }
	  }
	  m.email(newPolicyObservers, content);
	  m.portal(newPolicyObservers, content);
	 }

	@Override
	public void responseMessage() {
		System.out.print("Event Messages are Sent to Policy Observers");
		
	}

}
