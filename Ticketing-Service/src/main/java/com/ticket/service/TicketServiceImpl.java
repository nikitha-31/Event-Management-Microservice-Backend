package com.ticket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.repository.TicketRepositoty;
import com.ticket.model.AttendeeDto;
import com.ticket.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private AttendeeClient attendeeClient;
	
	@Autowired
	private TicketRepositoty ticketRepositoty ;
	
	@Override
	public Ticket issueTicket(Ticket ticket,Long attendeeId) throws Exception{
		AttendeeDto attendee=attendeeClient.getAttendeeById(attendeeId);
		if(attendee!=null)
		{
			ticket.setAttendeeId(attendeeId);
			ticket.setEventId(attendee.getEventId());
			ticket.setStatus("issued");
			return ticketRepositoty.save(ticket);
		}
		throw new Exception("attendee not found by id"+attendeeId);
	}

	@Override
	public Ticket getTicketById(Long id) {
		Optional<Ticket> ticket= ticketRepositoty.findById(id);
        if (ticket.isPresent()) {
            return ticket.get();
        } else {
            System.out.println("No ticket found with ID: " + id);
            return null;
        }
	}

	@Override
	public List<Ticket> getAllTickets() {
		
		return ticketRepositoty.findAll() ;
	}

}
