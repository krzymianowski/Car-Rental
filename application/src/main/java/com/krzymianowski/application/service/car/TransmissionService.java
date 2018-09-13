package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Transmission;

public interface TransmissionService {

    Transmission getTransmissionByTransmissionName(String transmissionName);

    void save(Transmission transmission);
}
