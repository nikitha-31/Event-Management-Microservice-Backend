package com.ticket.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long attendeeId;
    private Long eventId;
    private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(Long attendeeId) {
		this.attendeeId = attendeeId;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Ticket(Long id, Long attendeeId, Long eventId, String status) {
		super();
		this.id = id;
		this.attendeeId = attendeeId;
		this.eventId = eventId;
		this.status = status;
	}
	public Ticket() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", attendeeId=" + attendeeId + ", eventId=" + eventId + ", status=" + status + "]";
	}
    
    
}
