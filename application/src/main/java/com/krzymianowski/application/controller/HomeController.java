package com.krzymianowski.application.controller;

import com.krzymianowski.application.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private CarService carService;

    @RequestMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("homePageCars", carService.getHomePageCars());
        return "home-page";
    }

    @RequestMapping("/about-us")
    public String showAboutUsPage(){
        return "about-us";
    }
}
