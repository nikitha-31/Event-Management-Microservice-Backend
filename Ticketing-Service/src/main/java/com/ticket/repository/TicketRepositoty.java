package com.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.model.Ticket;

public interface TicketRepositoty extends JpaRepository<Ticket, Long> {

}
