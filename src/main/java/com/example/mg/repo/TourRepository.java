package com.example.mg.repo;

import com.example.mg.entity.Tour;
import org.springframework.data.repository.CrudRepository;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour, Integer> {
}
