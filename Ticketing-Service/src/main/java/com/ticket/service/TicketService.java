package com.ticket.service;

import java.util.List;

import com.ticket.model.Ticket;

public interface TicketService {
	
	Ticket issueTicket(Ticket ticket,Long attendeeId)throws Exception;

	Ticket getTicketById(Long id);
	
	List<Ticket> getAllTickets();
}
