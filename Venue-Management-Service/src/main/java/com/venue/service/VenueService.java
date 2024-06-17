package com.venue.service;

import java.util.List;

import com.venue.model.Venue;

public interface VenueService {
	
	Venue bookVenue(Venue venue, Long eventId)throws Exception;
	
	
	
	String deleteVenue(Long id);
	
	Venue getVenueById(Long id);
	
	List<Venue> getAllVenues();

}
