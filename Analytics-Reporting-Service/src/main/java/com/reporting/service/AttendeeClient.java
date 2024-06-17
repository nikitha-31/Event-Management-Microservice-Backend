package com.reporting.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


import com.reporting.Dto.AttendeeDto;



@FeignClient(name = "ATTENDEE-ENGAGEMENT-SERVICE", url = "http://localhost:8003")
public interface AttendeeClient {

	@GetMapping("/attendees/get/all")
	List<AttendeeDto> getAllAttendees();
}
