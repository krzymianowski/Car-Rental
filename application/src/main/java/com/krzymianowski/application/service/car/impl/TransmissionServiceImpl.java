package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Transmission;
import com.krzymianowski.application.model.car.repository.TransmissionRepository;
import com.krzymianowski.application.service.car.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransmissionServiceImpl implements TransmissionService {

    @Autowired
    private TransmissionRepository transmissionRepository;

    @Override
    public Transmission getTransmissionByTransmissionName(String transmissionName) {
        return transmissionRepository.getTransmissionByTransmissionName(transmissionName);
    }

    @Override
    public void save(Transmission transmission) {
        transmissionRepository.save(transmission);
    }
}
