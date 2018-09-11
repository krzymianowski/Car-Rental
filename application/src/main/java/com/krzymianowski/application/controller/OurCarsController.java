package com.krzymianowski.application.controller;


import com.krzymianowski.application.model.car.projection.OurCarsPageCar;
import com.krzymianowski.application.service.car.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OurCarsController {

    private final String defaultPage = "1";
    private final String defaultType = "All";
    private final String defaultBrand = "All";
    private final String defaultModel = "All";
    private final String defaultFuel = "All";
    private final String defaultSort = "price";
    private final String defaultDir = "desc";

    @Autowired
    private CarService carService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private ModelService modelService;

    @Autowired
    private FuelTypeService fuelTypeService;

    @RequestMapping("/our-cars")
    public String showOurCarsPage(
            @RequestParam(name = "page", defaultValue = defaultPage) int page,
            @RequestParam(name = "type", defaultValue = defaultType) String carType,
            @RequestParam(name = "brand", defaultValue = defaultBrand) String carBrand,
            @RequestParam(name = "model", defaultValue = defaultModel) String carModel,
            @RequestParam(name = "fuel", defaultValue = defaultFuel) String carFuelType,
            @RequestParam(name = "sort", defaultValue = defaultSort) String sortBy,
            @RequestParam(name = "dir", defaultValue = defaultDir) String sortDirection,
            Model model) {

        // Check for negative page
        if (page < 1) page = 1;

        // Get page of cars
        Page<OurCarsPageCar> pageCars = carService.getOurCarsPageCars(
                carType.toLowerCase(), carBrand.toLowerCase(),
                carModel.toLowerCase(), carFuelType.toLowerCase(),
                sortBy.toLowerCase(), sortDirection.toLowerCase(),
                page - 1);

        // Get list of cars from page
        List<OurCarsPageCar> content = pageCars.getContent();

        long total = pageCars.getTotalElements();
        long available = content.stream().filter(car -> car.getState().equals("Available")).count(); // To jest źle ponieważ nie zwraca wszystkich dostępnych tylko te na stronie
        long nonAvailable = total - available;

        // Add request parameters into model (check if param is equals its default value and add result into model)
        model.addAttribute("pageParam", new Parameter("" + page, defaultPage, ("" + page).toLowerCase().equals(defaultPage.toLowerCase())));
        model.addAttribute("typeParam", new Parameter(carType, defaultType, carType.toLowerCase().equals(defaultType.toLowerCase())));
        model.addAttribute("brandParam", new Parameter(carBrand, defaultBrand, carBrand.toLowerCase().equals(defaultBrand.toLowerCase())));
        model.addAttribute("modelParam", new Parameter(carModel, defaultModel, carModel.toLowerCase().equals(defaultModel.toLowerCase())));
        model.addAttribute("fuelParam", new Parameter(carFuelType, defaultFuel, (carFuelType.toLowerCase().equals(defaultFuel.toLowerCase()))));
        model.addAttribute("sortParam", new Parameter(sortBy, defaultSort, (sortBy.toLowerCase().equals(defaultSort.toLowerCase()))));
        model.addAttribute("dirParam", new Parameter(sortDirection, defaultDir, (sortDirection.toLowerCase().equals(defaultDir.toLowerCase()))));

        // Add cars list into model
        model.addAttribute("cars", content);

        // Do poprawy
        model.addAttribute("all_results", total);
        model.addAttribute("available", available);
        model.addAttribute("nonAvailable", nonAvailable);

        // Add to model list of available items for searching
        model.addAttribute("carTypes", typeService.getOurCarsPageTypes());
        model.addAttribute("carBrands", brandService.getOurCarsPageBrands());
        model.addAttribute("carModels", modelService.getOurCarsPageModels(carBrand));
        model.addAttribute("carFuel", fuelTypeService.getOurCarsPageFuelTypes());

        return "our-cars";
    }

    @Setter
    @Getter
    @AllArgsConstructor
    public class Parameter {
        private String value;
        private String defaultValue;
        private boolean equalsDefaultValue;
    }
}
