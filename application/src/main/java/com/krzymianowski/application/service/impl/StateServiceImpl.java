package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.State;
import com.krzymianowski.application.model.repository.StateRepository;
import com.krzymianowski.application.service.StateService;
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
