package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;
import com.krzymianowski.application.model.car.projection.OurCarsPageCar;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarService {
    void save(Car car);

    List<HomePageCar> getHomePageCars();

    Page<OurCarsPageCar> getOurCarsPageCars(String carType, String carBrand, String carModel, String carFuelType, String sortBy, String sortDirection, String carState, int page);

    long getNumberOfCars();

    long getNumberOfAvailableCars();
}
