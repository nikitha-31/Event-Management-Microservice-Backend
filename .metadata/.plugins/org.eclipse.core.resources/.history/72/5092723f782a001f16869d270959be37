package com.ticket.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ticket.model.AttendeeDto;

@FeignClient(name = "ATTENDEE-ENGAGEMENT-SERVICE", url = "http://localhost:8003")
public interface AttendeeClient {

	@GetMapping("/attendees/{id}")
	AttendeeDto getAttendeeById(@PathVariable Long id);
}
