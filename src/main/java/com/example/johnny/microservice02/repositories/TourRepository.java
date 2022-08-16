package com.example.johnny.microservice02.repositories;

import com.example.johnny.microservice02.domain.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour, Integer> {
}
