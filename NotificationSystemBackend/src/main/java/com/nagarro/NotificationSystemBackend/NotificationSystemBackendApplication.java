package com.nagarro.NotificationSystemBackend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@CrossOrigin(origins="*")
public class NotificationSystemBackendApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(NotificationSystemBackendApplication.class, args);
	}

}
