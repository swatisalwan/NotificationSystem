package com.nagarro.NotificationSystemBackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.repository.SubscriberRepository;

@Service
public class SubscribeService {
	
	@Autowired
	private SubscriberRepository subscriberRepo;
	
	 public void subscribe(SubscriberList model) {
		 System.out.println(model.getEmail() + " "+model.getEvent() + " for Email Notification");
		  System.out.println(model.getEmail() + " "+model.getHoliday() + " for Holiday Notification");
		  System.out.println(model.getEmail() + " "+model.getUrgent() + " for Urgent Help Notification");
		  System.out.println(model.getEmail() + " "+model.getNews() + " for nagarro News Notification");
		  System.out.println(model.getEmail() + " "+model.getPolicy() + " for New Policy Notification");
		 subscriberRepo.save(model);
	}
	 
	 public List<SubscriberList> getAll() {
		return  subscriberRepo.findAll();
	}
}
