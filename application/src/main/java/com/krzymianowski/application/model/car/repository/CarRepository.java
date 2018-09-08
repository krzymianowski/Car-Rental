package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

    Collection<HomePageCar> findAllBy();
}
