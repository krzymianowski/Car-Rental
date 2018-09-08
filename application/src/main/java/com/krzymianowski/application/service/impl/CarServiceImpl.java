package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.Car;
import com.krzymianowski.application.model.projection.HomePageCar;
import com.krzymianowski.application.model.repository.CarRepository;
import com.krzymianowski.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void save(Car car) {
        carRepository.save(car);
    }

    @Override
    public List<HomePageCar> getHomePageCars() {
        return null;
    }
}
