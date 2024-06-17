package com.venue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Venue {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
	public Venue(Long venueId, String name, String location, int capacity, long eventId) {
		super();
		this.venueId = venueId;
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.eventId = eventId;
	}
	public Venue() {
		super();
	}
	@Override
	public String toString() {
		return "Venue [venueId=" + venueId + ", name=" + name + ", location=" + location + ", capacity=" + capacity
				+ ", eventId=" + eventId + "]";
	}
    
    
}