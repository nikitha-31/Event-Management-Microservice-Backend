package com.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TicketingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingServiceApplication.class, args);
	}

}
