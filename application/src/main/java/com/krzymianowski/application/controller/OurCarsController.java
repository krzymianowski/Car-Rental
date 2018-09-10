package com.krzymianowski.application.controller;

import com.krzymianowski.application.model.car.projection.OurCarsPageCar;
import com.krzymianowski.application.service.car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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

        Page<OurCarsPageCar> pageCars = carService.getOurCarsPageCars(
                carType,
                carBrand,
                carModel,
                carFuelType,
                sortBy,
                sortDirection,
                page - 1);

        List<OurCarsPageCar> content = pageCars.getContent();
        long total = pageCars.getTotalElements();
        long available = content.stream().filter(car -> car.getState().equals("Available")).count();
        long nonAvailable = total - available;

        model.addAttribute("cars", content);
        model.addAttribute("all_results", total);
        model.addAttribute("available", available);
        model.addAttribute("nonAvailable", nonAvailable);

        return "our-cars";
    }
}
