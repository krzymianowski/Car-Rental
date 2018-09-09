package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.State;

public interface StateService {
    State getStateByStateName(String stateName);

    void save(State state);
}
