package com.reporting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reporting.Dto.AttendeeDto;
import com.reporting.Dto.EventDto;
import com.reporting.Dto.TicketDto;
import com.reporting.Dto.VenueDto;
import com.reporting.service.AttendeeClient;
import com.reporting.service.EventClient;
import com.reporting.service.TicketClient;
import com.reporting.service.VenueClient;

@RestController
@RequestMapping("/api")
public class ReportingController {
	
	@Autowired
    private EventClient eventClient;

    @Autowired
    private AttendeeClient attendeeClient;

    @Autowired
    private TicketClient ticketClient;

    @Autowired
    private VenueClient venueClient;
    
    @GetMapping("/events")
    public ResponseEntity<List<EventDto>> getAllEvents() {
        List<EventDto> events = eventClient.getAllEvents();
        return ResponseEntity.status(HttpStatus.OK).body(events);
    }

    @GetMapping("/attendees")
    public ResponseEntity<List<AttendeeDto>> getAllAttendees() {
        List<AttendeeDto> attendees = attendeeClient.getAllAttendees();
        return ResponseEntity.status(HttpStatus.OK).body(attendees);
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<TicketDto>> getAllTickets() {
        List<TicketDto> tickets = ticketClient.getAllTickets();
        return ResponseEntity.status(HttpStatus.OK).body(tickets);
    }

    @GetMapping("/venues")
    public ResponseEntity<List<VenueDto>> getAllVenues() {
        List<VenueDto> venues = venueClient.getAllVenues();
        return ResponseEntity.status(HttpStatus.OK).body(venues);
    }

}
