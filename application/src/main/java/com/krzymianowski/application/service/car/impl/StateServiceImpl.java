package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.State;
import com.krzymianowski.application.model.car.repository.StateRepository;
import com.krzymianowski.application.service.car.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public State getStateByStateName(String stateName) {
        return stateRepository.getStateByStateName(stateName);
    }

    @Override
    public void save(State state) {
        stateRepository.save(state);
    }
}
