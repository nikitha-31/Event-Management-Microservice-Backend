package com.reporting.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.reporting.Dto.VenueDto;

@FeignClient(name = "VENUE-MANAGEMENT-SERVICE", url = "http://localhost:8002")
public interface VenueClient {
	
	@GetMapping("/venues/get/all")
	List<VenueDto> getAllVenues();

}
