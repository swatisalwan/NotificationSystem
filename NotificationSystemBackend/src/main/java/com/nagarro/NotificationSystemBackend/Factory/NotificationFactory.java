package com.nagarro.NotificationSystemBackend.Factory;
import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.Enum.NotificationType;
import com.nagarro.NotificationSystemBackend.Interface.Channel;
import com.nagarro.NotificationSystemBackend.Interface.Notifications;
import com.nagarro.NotificationSystemBackend.SubClass.EventNotification;
import com.nagarro.NotificationSystemBackend.SubClass.HolidayNotification;
import com.nagarro.NotificationSystemBackend.SubClass.NagarroNewsNotification;
import com.nagarro.NotificationSystemBackend.SubClass.NewPolicyNotification;
import com.nagarro.NotificationSystemBackend.SubClass.UrgentNotification;


@Service
public class NotificationFactory {
	
	public Channel getNotification(NotificationType type) 
	{
		switch(type){
		
		case EVENT :{
			return new EventNotification();
		}
		case URGENT :{
			return new UrgentNotification();
		}
		case HOLIDAY :{
			return new HolidayNotification();
		}
		case NAGARRONEWS :{
			return new NagarroNewsNotification();
		}
		case NEWPOLICY:{
			return new NewPolicyNotification();
		}
		default :{
			return null;
		}
		
		}
	
	}

}
