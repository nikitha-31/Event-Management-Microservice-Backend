package com.attendee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AttendeeEngagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendeeEngagementServiceApplication.class, args);
	}

}
