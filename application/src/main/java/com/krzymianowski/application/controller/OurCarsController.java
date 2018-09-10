package com.krzymianowski.application.controller;

import com.krzymianowski.application.model.car.Car;
import com.krzymianowski.application.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OurCarsController {

    @Autowired
    private CarService carService;

    @RequestMapping("/our-cars")
    public String showOurCarsPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "type", defaultValue = "all") String carType,
            @RequestParam(name = "brand", defaultValue = "all") String carBrand,
            @RequestParam(name = "model", defaultValue = "all") String carModel,
            @RequestParam(name = "fuel", defaultValue = "all") String carFuelType,
            @RequestParam(name = "sort", defaultValue = "price") String sortBy,
            @RequestParam(name = "dir", defaultValue = "asc") String sortDirection,
            Model model) {

        if (page < 1) page = 1;

        Page<Car> pageCars = carService.getOurCarsPageCars(
                carType,
                carBrand,
                carModel,
                carFuelType,
                sortBy,
                sortDirection,
                page - 1);

        model.addAttribute("cars", pageCars.getContent());

        return "our-cars";
    }
}
