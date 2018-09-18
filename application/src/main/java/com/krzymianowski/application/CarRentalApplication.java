package com.krzymianowski.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CarRentalApplication extends SpringBootServletInitializer{

//    private final InitTempData initTempData;
//
//    @Autowired
//    public CarRentalApplication(InitTempData initTempData) {
//        this.initTempData = initTempData;
//    }
//
//
//    @PostConstruct
//    private void initData() {
//        initTempData.initDatabaseItems();
//    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }
}
