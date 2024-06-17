package com.ticket.model;

public class AttendeeDto {
	
	private Long id;
    private String name;
    private String email;
    private Long eventId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getEventId() {
		return eventId;
	}
	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}
	public AttendeeDto(Long id, String name, String email, Long eventId) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.eventId = eventId;
	}
	public AttendeeDto() {
		super();
	}
	@Override
	public String toString() {
		return "Attendee [id=" + id + ", name=" + name + ", email=" + email + ", eventId=" + eventId + "]";
	} 

}
