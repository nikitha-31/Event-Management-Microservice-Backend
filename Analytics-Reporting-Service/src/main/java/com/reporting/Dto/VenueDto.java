package com.reporting.Dto;

public class VenueDto {

	private Long venueId;
    private String name;
    private String location;
    private int capacity;
    private long eventId;
	public Long getVenueId() {
		return venueId;
	}
	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public VenueDto(Long venueId, String name, String location, int capacity, long eventId) {
		super();
		this.venueId = venueId;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.eventId = eventId;
	}
	public VenueDto() {
		super();
	}
	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", name=" + name + ", location=" + location + ", capacity=" + capacity
				+ ", eventId=" + eventId + "]";
	}
    
    
}
