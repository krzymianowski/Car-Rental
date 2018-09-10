package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.model.car.projection.HomePageCar;
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
    public Page<Car> getOurCarsPageCars(String carType, String carBrand, String carModel, String carFuelType, String sortBy, String sortDirection, int page) {
        PageRequest pageRequest = PageRequest.of(page, 10, sortOrder(sortBy, sortDirection));

        boolean sType = (!carType.equals("") && !carType.equals("all"));
        boolean sBrand = (!carBrand.equals("") && !carBrand.equals("all"));
        boolean sModel = (!carModel.equals("") && !carModel.equals("all"));
        boolean sFuel = (!carFuelType.equals("") && !carFuelType.equals("all"));

        if (sFuel)
            if (sType)
                if (sBrand)
                    if (sModel)
                        return carRepository.findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeName(carBrand, carModel, carType, carFuelType, pageRequest, Car.class);
                    else return carRepository.findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeName(carBrand, carType, carFuelType, pageRequest, Car.class);
                else return carRepository.findByType_TypeNameAndFuelType_TypeName(carType, carFuelType, pageRequest, Car.class);
            else if (sBrand)
                if (sModel)
                    return carRepository.findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeName(carBrand, carModel, carFuelType, pageRequest, Car.class);
                else return carRepository.findByModel_brand_brandNameAndFuelType_TypeName(carBrand, carFuelType, pageRequest, Car.class);
            else return carRepository.findByFuelType_TypeName(carFuelType, pageRequest, Car.class);

        if (sType)
            if (sBrand)
                if (sModel)
                    return carRepository.findByModel_brand_brandNameAndModel_ModelNameAndType_TypeName(carBrand, carModel, carType, pageRequest, Car.class);
                else return carRepository.findByModel_brand_brandNameAndType_TypeName(carBrand, carType, pageRequest, Car.class);
            else return carRepository.findByType_TypeName(carType, pageRequest, Car.class);

        if (sBrand)
            if (sModel)
                return carRepository.findByModel_brand_brandNameAndModel_ModelName(carBrand, carModel, pageRequest, Car.class);
            else return carRepository.findByModel_brand_brandName(carBrand, pageRequest, Car.class);

        // Default
        return carRepository.findAllBy(pageRequest, Car.class);
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
