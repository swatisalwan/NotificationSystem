package com.nagarro.NotificationSystemBackend.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.NotificationSystemBackend.Model.NotificationEntity;
import com.nagarro.NotificationSystemBackend.Model.SubscriberList;
import com.nagarro.NotificationSystemBackend.repository.NotificationRepository;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationRepository repo;
	
	
	public void saveToDb(NotificationEntity  data)
	{
	repo.save(data);
		
	}

	public List<NotificationEntity> getNotifications()
	{
		return repo.findAll();
	}
	
	public List<NotificationEntity> deleteNotification(int id)
	{
		 repo.deleteById(id);
		 return repo.findAll();
	}

}
