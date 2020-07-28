package com.nagarro.NotificationSystemBackend.Controller;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nagarro.NotificationSystemBackend.Enum.NotificationType;
import com.nagarro.NotificationSystemBackend.Factory.NotificationFactory;
import com.nagarro.NotificationSystemBackend.Interface.Channel;
import com.nagarro.NotificationSystemBackend.Model.NotificationEntity;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.service.NotificationService;
import com.nagarro.NotificationSystemBackend.service.SubscribeService;


@CrossOrigin(origins="*")
@RestController
public class Controller {
	
	@Autowired
	private NotificationService notificationService;
	
	
	@Autowired
	private NotificationFactory service;
	
	@Autowired
	private SubscribeService subService;
	
	
	
	@CrossOrigin(origins="*")
	@PostMapping("/sendNotification")
	public String sendResult(@RequestBody NotificationEntity data) throws IOException {
		
		notificationService.saveToDb(data);
		
		NotificationType value = NotificationType.valueOf(data.getType());
		Channel obj=service.getNotification(value);
		List<SubscriberList> list= subService.getAll();
		obj.notifyUpdate(list, data.getMessage());
		return "Message sent";
	}
	
	
	@CrossOrigin(origins="*")	
	@GetMapping("/getNotifications")
	public List<NotificationEntity> getTicketLists() {
		return notificationService.getNotifications();
	}
	
	@CrossOrigin(origins="*")	
	@DeleteMapping("/cancel/{id}")
	public List<NotificationEntity> cancelRegistration(@PathVariable int id){
		return notificationService.deleteNotification(id);
		
	}
	
	@CrossOrigin(origins="*")	
	 @PatchMapping("/editSubscriptions")
	 public String editSubscribers(@RequestBody SubscriberList model) {
		 subService.subscribe(model);
		 return "You are subscribed/unsubscribed in events as mentioned";
	  
	 }

}
