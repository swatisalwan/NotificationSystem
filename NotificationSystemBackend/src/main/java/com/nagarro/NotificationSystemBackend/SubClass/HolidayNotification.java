package com.nagarro.NotificationSystemBackend.SubClass;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.NotificationSystemBackend.Interface.Channel;
import com.nagarro.NotificationSystemBackend.Interface.Notifications;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.service.Mode;

public class HolidayNotification implements Notifications,Channel {
	
    Mode m=new Mode();
   private List<String> holidayObservers = new ArrayList<>();

	@Override
	public void attach(String o) {
		
		holidayObservers.add(o);
		System.out.println(holidayObservers.get(0));
		
	}

	@Override
	public void detach(String o) {
		holidayObservers.remove(o);
		
	}

	
	 @Override
	 public void notifyUpdate(List<SubscriberList> list, String content) {
	  for (int i = 0; i < list.size(); i++) {
	   switch (list.get(i).getHoliday()) {
	   case "Subscribe": {
	    attach(list.get(i).getEmail());
	   }
	   }
	  }
	
	  m.portal(holidayObservers, content);
	 }

	@Override
	public void responseMessage() {
		System.out.print("Event Messages are Sent to Holiday Observers");
		
	}

}
