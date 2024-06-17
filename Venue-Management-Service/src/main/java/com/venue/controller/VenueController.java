package com.venue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venue.model.Venue;
import com.venue.service.VenueServiceImpl;

@RestController
@RequestMapping("/venues")
public class VenueController {
	
    @Autowired
    private VenueServiceImpl venueService;

    @PostMapping("/book/{eventId}")
    public ResponseEntity<Venue> bookVenue(@RequestBody Venue venue, @PathVariable Long eventId)throws Exception{
        
            Venue bookedVenue = venueService.bookVenue(venue, eventId);
            return ResponseEntity.status(HttpStatus.CREATED).body(bookedVenue);
        
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteVenue(@PathVariable Long id) {
        String response = venueService.deleteVenue(id);
        if (response.contains("No event found")) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
        }
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Venue> getVenueById(@PathVariable Long id) {
        Venue venue = venueService.getVenueById(id);
        if (venue != null) {
            return ResponseEntity.status(HttpStatus.OK).body(venue);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Venue>> getAllVenues() {
        List<Venue> venues = venueService.getAllVenues();
        return ResponseEntity.status(HttpStatus.OK).body(venues);
    }
}
