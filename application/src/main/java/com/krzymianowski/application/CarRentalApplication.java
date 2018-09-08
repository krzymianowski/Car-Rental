package com.krzymianowski.application;

import com.krzymianowski.application.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CarRentalApplication {

    private final InitTempData initTempData;

    @Autowired
    public CarRentalApplication(InitTempData initTempData) {
        this.initTempData = initTempData;
    }

    public static void main(String[] args) {
        SpringApplication.run(CarRentalApplication.class, args);
    }

    @PostConstruct
    private void initData() {
        initTempData.initDatabaseItems();
    }
}
