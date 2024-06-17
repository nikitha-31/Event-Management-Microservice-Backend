package com.attendee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attendee.model.Attendee;

public interface AttendeeRepository extends JpaRepository<Attendee, Long> {

}
