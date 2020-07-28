package com.nagarro.NotificationSystemBackend.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Subscribers")
public class SubscriberList {
	
	public SubscriberList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SubscriberList(String email, String event, String urgent, String holiday, String news, String policy) {
		super();
		this.email = email;
		this.event = event;
		this.urgent = urgent;
		this.holiday = holiday;
		this.news = news;
		this.policy = policy;
	}
	@Id
	private String email;
	private String event;
	private String urgent;
	private String holiday;
	private String news;
	private String policy;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getUrgent() {
		return urgent;
	}
	public void setUrgent(String urgent) {
		this.urgent = urgent;
	}
	public String getHoliday() {
		return holiday;
	}
	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}
	public String getPolicy() {
		return policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}

}
