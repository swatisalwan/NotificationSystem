package com.nagarro.NotificationSystemBackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nagarro.NotificationSystemBackend.Model.NotificationEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity ,Integer> {
	
	public NotificationEntity  findById(int Id);
}
