package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Transmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepository extends CrudRepository<Transmission, Integer> {
    Transmission getTransmissionByTransmissionName(String transmissionName);
}
