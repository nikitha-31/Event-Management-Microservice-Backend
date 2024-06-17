package com.venue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venue.model.Venue;

public interface VenueRepository extends JpaRepository<Venue, Long> {
	
}