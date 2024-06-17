package com.venue.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.venue.model.EventDto;
import com.venue.model.Venue;
import com.venue.repository.VenueRepository;

@Service
public class VenueServiceImpl implements VenueService {

	@Autowired
	private EventClient eventClient;
	
	@Autowired
	private VenueRepository venueRepository;
	
	@Override
	public Venue bookVenue(Venue venue,Long eventId) throws Exception {
		EventDto event= eventClient.getEventById(eventId);
		if(event!=null)
		{
			venue.setEventId(eventId);
			return venueRepository.save(venue);
		}
		throw new Exception("event not found by id"+eventId);
	}

	

	@Override
	public String deleteVenue(Long id) {
		Optional<Venue> existingVenue = venueRepository.findById(id);
        if (existingVenue.isPresent()) {
            venueRepository.deleteById(id);
            return "Event deleted with ID: " + id;
        } else {
            return "No event found with ID: " + id;
        }
	}

	@Override
	public Venue getVenueById(Long id) {
		Optional<Venue> venue = venueRepository.findById(id);
        if (venue.isPresent()) {
            return venue.get();
        } else {
            System.out.println("No venue found with ID: " + id);
            return null;
        }
	}

	@Override
	public List<Venue> getAllVenues() {
		
		return venueRepository.findAll();
	}

}
