package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;
import com.krzymianowski.application.model.car.repository.CarRepository;
import com.krzymianowski.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        List<HomePageCar> allCar = (List<HomePageCar>) carRepository.findAllBy();
        List<HomePageCar> homePageCars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 8; i++)
            homePageCars.add(allCar.get(random.nextInt(allCar.size())));
        return homePageCars;
    }
}
