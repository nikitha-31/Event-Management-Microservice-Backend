package com.attendee.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.attendee.model.EventDto;



@FeignClient(name = "EVENT-REGISTRATION-SERVICE", url = "http://localhost:8001")

public interface EventClient {
	
	@GetMapping("/events/{id}")
	EventDto getEventById(@PathVariable Long id);

}
