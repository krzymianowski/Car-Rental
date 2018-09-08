package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.car.repository.ImageRepository;
import com.krzymianowski.application.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;
}
