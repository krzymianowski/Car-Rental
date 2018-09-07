package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.Image;
import com.krzymianowski.application.model.repository.ImageRepository;
import com.krzymianowski.application.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public Image getImageByUrl(String url) {
        return imageRepository.getImageByUrl(url);
    }
}
