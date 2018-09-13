package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.DrivingGear;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingGearRepository extends CrudRepository<DrivingGear, Integer> {
    DrivingGear getDrivingGearByDrivingGearName(String drivingGearName);
}
