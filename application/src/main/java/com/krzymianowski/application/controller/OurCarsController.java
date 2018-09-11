package com.krzymianowski.application.controller;

import com.krzymianowski.application.model.car.projection.OurCarsPageCar;
import com.krzymianowski.application.service.car.BrandService;
import com.krzymianowski.application.service.car.CarService;
import com.krzymianowski.application.service.car.ModelService;
import com.krzymianowski.application.service.car.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@Controller
public class OurCarsController {

    @Autowired
    private CarService carService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private ModelService modelService;

    @RequestMapping("/our-cars")
    public String showOurCarsPage(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "type", defaultValue = "All") String carType,
            @RequestParam(name = "brand", defaultValue = "All") String carBrand,
            @RequestParam(name = "model", defaultValue = "All") String carModel,
            @RequestParam(name = "fuel", defaultValue = "All") String carFuelType,
            @RequestParam(name = "sort", defaultValue = "price") String sortBy,
            @RequestParam(name = "dir", defaultValue = "asc") String sortDirection,
            Model model) {

        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("page", "" + page);
        parameters.put("type", carType);
        parameters.put("brand", carBrand);
        parameters.put("model", carModel);
        parameters.put("fuel", carFuelType);
        parameters.put("sort", sortBy);
        parameters.put("dir", sortDirection);

        if (page < 1) page = 1;

        Page<OurCarsPageCar> pageCars = carService.getOurCarsPageCars(
                carType.toLowerCase(),
                carBrand.toLowerCase(),
                carModel.toLowerCase(),
                carFuelType.toLowerCase(),
                sortBy.toLowerCase(),
                sortDirection.toLowerCase(),
                page - 1);

        List<OurCarsPageCar> content = pageCars.getContent();
        long total = pageCars.getTotalElements();
        long available = content.stream().filter(car -> car.getState().equals("Available")).count();
        long nonAvailable = total - available;

        model.addAttribute("cars", content);
        model.addAttribute("all_results", total);
        model.addAttribute("available", available);
        model.addAttribute("nonAvailable", nonAvailable);
        model.addAttribute("carTypes", typeService.getOurCarsPageTypes());
        model.addAttribute("carBrands", brandService.getOurCarsPageBrands());
        model.addAttribute("carModels", modelService.getOurCarsPageModels(carBrand));
        model.addAttribute("parameters", parameters);

        return "our-cars";
    }
}
