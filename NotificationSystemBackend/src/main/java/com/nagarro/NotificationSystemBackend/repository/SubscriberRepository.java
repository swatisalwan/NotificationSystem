package com.nagarro.NotificationSystemBackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.NotificationSystemBackend.Model.SubscriberList;



@Repository
public interface SubscriberRepository extends JpaRepository<SubscriberList, String>{
	
	public SubscriberList findByEmail(String email);
	


}
