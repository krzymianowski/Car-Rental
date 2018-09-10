package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;
import com.krzymianowski.application.model.car.projection.OurCarsPageCar;
import com.krzymianowski.application.model.car.repository.CarRepository;
import com.krzymianowski.application.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
        List<HomePageCar> allCar = (List<HomePageCar>) carRepository.findAllBy(HomePageCar.class);
        List<HomePageCar> homePageCars = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 8; i++)
            homePageCars.add(allCar.get(random.nextInt(allCar.size())));
        return homePageCars;
    }

    @Override
    public Page<OurCarsPageCar> getOurCarsPageCars(String carType, String carBrand, String carModel, String carFuelType, String sortBy, String sortDirection, int pageNr) {
        PageRequest page = PageRequest.of(pageNr, 10, sortOrder(sortBy, sortDirection));
        Class<OurCarsPageCar> tClass = OurCarsPageCar.class;

        boolean sType = (!carType.equals("") && !carType.equals("all"));
        boolean sBrand = (!carBrand.equals("") && !carBrand.equals("all"));
        boolean sModel = (!carModel.equals("") && !carModel.equals("all"));
        boolean sFuel = (!carFuelType.equals("") && !carFuelType.equals("all"));

        if (sFuel)
            if (sType)
                if (sBrand)
                    if (sModel)
                        return carRepository.getBrandModelTypeFuel(carBrand, carModel, carType, carFuelType, page, tClass);
                    else return carRepository.getBrandTypeFuel(carBrand, carType, carFuelType, page, tClass);
                else return carRepository.getTypeFuel(carType, carFuelType, page, tClass);
            else if (sBrand)
                if (sModel)
                    return carRepository.getBrandModelFuel(carBrand, carModel, carFuelType, page, tClass);
                else return carRepository.getBrandFuel(carBrand, carFuelType, page, tClass);
            else return carRepository.getFuel(carFuelType, page, tClass);

        if (sType)
            if (sBrand)
                if (sModel)
                    return carRepository.getBrandModelType(carBrand, carModel, carType, page, tClass);
                else return carRepository.getBrandType(carBrand, carType, page, tClass);
            else return carRepository.getType(carType, page, tClass);

        if (sBrand)
            if (sModel)
                return carRepository.getBrandModel(carBrand, carModel, page, tClass);
            else return carRepository.getBrand(carBrand, page, tClass);

        // Default
        return carRepository.getAll(page, tClass);
    }

    private Sort sortOrder(String sortBy, String direction) {
        direction = direction.toLowerCase();
        sortBy = sortBy.toLowerCase();
        Sort sort;

        switch (sortBy) {
            case "price":
                if (direction.equals("asc"))
                    sort = Sort.by(
                            new Sort.Order(Sort.Direction.ASC, "rentPrice"));
                else sort = Sort.by(
                        new Sort.Order(Sort.Direction.DESC, "rentPrice"));
                break;
            default:
                sort = Sort.by(
                        new Sort.Order(Sort.Direction.ASC, "rentPrice"));
                break;
        }
        return sort;
    }
}
