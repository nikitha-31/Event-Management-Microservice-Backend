package com.reporting.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.reporting.Dto.EventDto;





@FeignClient(name = "EVENT-REGISTRATION-SERVICE", url = "http://localhost:8001")

public interface EventClient {
	
	@GetMapping("/events/all")
	List<EventDto> getAllEvents();

}
