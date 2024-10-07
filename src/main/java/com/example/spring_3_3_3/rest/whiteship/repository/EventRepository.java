package com.example.spring_3_3_3.rest.whiteship.repository;

import com.example.spring_3_3_3.rest.whiteship.events.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}
