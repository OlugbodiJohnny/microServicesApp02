package com.example.johnny.microservice02.repositories;

import com.example.johnny.microservice02.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
    /**
     * Find Tours associated with the Tour Package.
     *
     * @param code tour package code
     * @return List of found tours.
     */
    Page<Tour> findByTourPackageCode(@Param("code")String code, Pageable pageable);
}
