package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.DrivingGear;
import com.krzymianowski.application.model.car.repository.DrivingGearRepository;
import com.krzymianowski.application.service.car.DrivingGearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrivingGearServiceImpl implements DrivingGearService {

    @Autowired
    private DrivingGearRepository drivingGearRepository;

    @Override
    public DrivingGear getDrivingGearByDrivingGearName(String drivingGearName) {
        return drivingGearRepository.getDrivingGearByDrivingGearName(drivingGearName);
    }

    @Override
    public void save(DrivingGear drivingGear) {
        drivingGearRepository.save(drivingGear);
    }
}
