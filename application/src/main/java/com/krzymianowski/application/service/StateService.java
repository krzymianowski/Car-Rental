package com.krzymianowski.application.service;

import com.krzymianowski.application.model.State;

public interface StateService {
    State getStateByStateName(String stateName);

    void save(State state);
}
