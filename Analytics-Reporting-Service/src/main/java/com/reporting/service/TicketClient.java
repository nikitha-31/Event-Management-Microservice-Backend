package com.reporting.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.reporting.Dto.TicketDto;

@FeignClient(name = "TICKETING-SERVICE", url = "http://localhost:8004")
public interface TicketClient {
	
	@GetMapping("/tickets/all")
	List<TicketDto> getAllTickets();

}
