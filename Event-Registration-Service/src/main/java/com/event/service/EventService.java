package com.event.service;


import java.util.List;

import com.event.model.Event;

public interface EventService {
	
	Event createEvent(Event event);
    Event updateEvent(Long id, Event event);
    String deleteEvent(Long id);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    //Attendee  registerAttendee(Long eventId, Attendee attendee);

}
