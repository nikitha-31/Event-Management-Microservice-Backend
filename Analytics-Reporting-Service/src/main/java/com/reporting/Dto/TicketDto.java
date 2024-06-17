package com.reporting.Dto;

public class TicketDto {
	
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
	public TicketDto(Long id, Long attendeeId, Long eventId, String status) {
		super();
		this.id = id;
		this.attendeeId = attendeeId;
		this.eventId = eventId;
		this.status = status;
	}
	public TicketDto() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", attendeeId=" + attendeeId + ", eventId=" + eventId + ", status=" + status + "]";
	}
    

}
