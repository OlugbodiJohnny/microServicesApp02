package com.example.johnny.microservice02.repositories;

import com.example.johnny.microservice02.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
}
