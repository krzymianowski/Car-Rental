package com.krzymianowski.application.service;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;

import java.util.List;

public interface CarService {
    void save(Car car);

    List<HomePageCar> getHomePageCars();
}
