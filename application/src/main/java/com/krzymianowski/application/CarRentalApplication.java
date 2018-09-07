package com.krzymianowski.application;

import com.krzymianowski.application.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CarRentalApplication {

    private final InitTempData initTempData;

	private final StorageService storageService;

	@Autowired
	public CarRentalApplication(StorageService storageService, InitTempData initTempData) {
		this.storageService = storageService;
        this.initTempData = initTempData;
    }

	@PostConstruct
	private void initStorage(){
//		storageService.deleteAll();
		storageService.init();
	}

	@PostConstruct
	private void initData(){
       initTempData.initDatabaseItems();
    }

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}
}
