package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.DrivingGear;

public interface DrivingGearService {
    DrivingGear getDrivingGearByDrivingGearName(String drivingGearName);

    void save(DrivingGear drivingGear);
}
