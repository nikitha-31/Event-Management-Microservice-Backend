package com.attendee.controller;

import com.attendee.model.Attendee;
import com.attendee.service.AttendeeServiceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeServiceImpl attendeeService;

    @PostMapping("/register")
    public ResponseEntity<Attendee> registerAttendee(@RequestBody Attendee attendee) throws Exception {
        
            Attendee registeredAttendee = attendeeService.registerAttendee(attendee);
            return ResponseEntity.status(HttpStatus.CREATED).body(registeredAttendee);
        
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAttendeeById(@PathVariable Long id) {
        Attendee attendee = attendeeService.getAttendeeById(id);
        if (attendee != null) {
            return new ResponseEntity<>(attendee, HttpStatus.OK);
        } else {
        	return new ResponseEntity<>("No attendee found with ID: " + id, HttpStatus.NOT_FOUND);
        }
    }
    
    
   
    @GetMapping("/get/all")
    public ResponseEntity<List<Attendee>> getAllAttendees() {
        List<Attendee> attendee=attendeeService.getAllAttendees();
        return ResponseEntity.status(HttpStatus.OK).body(attendee);
    }
}
