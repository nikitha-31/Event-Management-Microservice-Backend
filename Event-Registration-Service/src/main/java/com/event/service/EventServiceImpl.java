package com.event.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.String;
import com.event.model.Event;

import com.event.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
    private EventRepository eventRepository;

    

    @Override
    public Event  createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            event.setId(id);
            return eventRepository.save(event);
        } else {
            return null;
        }
    }

    @Override
    public String deleteEvent(Long id) {
        Optional<Event> existingEvent = eventRepository.findById(id);
        if (existingEvent.isPresent()) {
            eventRepository.deleteById(id);
            return "Event deleted with ID: " + id;
        } else {
            return "No event found with ID: " + id;
        }
    }
    
    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        Optional<Event> event = eventRepository.findById(id);
        if (event.isPresent()) {
            return event.get();
        } else {
            System.out.println("No event found with ID: " + id);
            return null;
        }
    }
}
