package com.krzymianowski.application;

import com.krzymianowski.application.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CarRentalApplication {

	private final StorageService storageService;

	@Autowired
	public CarRentalApplication(StorageService storageService) {
		this.storageService = storageService;
	}

	@PostConstruct
	private void initStorage(){
//		storageService.deleteAll();
		storageService.init();
	}

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);
	}
}
