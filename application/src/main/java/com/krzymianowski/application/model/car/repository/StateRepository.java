package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends CrudRepository<State, Integer> {

    State getStateByStateName(String stateName);
}
