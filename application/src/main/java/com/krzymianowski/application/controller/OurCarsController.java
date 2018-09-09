package com.krzymianowski.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OurCarsController {

    @RequestMapping("/our-cars")
    public String showOurCarsPage(){
        return "our-cars";
    }
}
