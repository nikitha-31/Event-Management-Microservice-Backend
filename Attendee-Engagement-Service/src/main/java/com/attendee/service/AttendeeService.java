package com.attendee.service;

import java.util.List;

import com.attendee.model.Attendee;

public interface AttendeeService {
	
	Attendee registerAttendee(Attendee attendee) throws Exception;
	
	Attendee getAttendeeById(Long id);
	
	List<Attendee> getAllAttendees();

}
