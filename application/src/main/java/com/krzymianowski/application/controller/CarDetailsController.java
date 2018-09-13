package com.krzymianowski.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarDetailsController {

    @RequestMapping("/car-details/{carId}")
    public String showCarDetailsPage(@PathVariable("carId") int carId){
        return "car-details";
    }
}
