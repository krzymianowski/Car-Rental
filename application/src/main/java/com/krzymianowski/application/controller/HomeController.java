package com.krzymianowski.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("randomCars", Arrays.asList("car1", "car2", "car3", "car4", "car5", "car6", "car7", "car8"));
        return "home-page";
    }
}
