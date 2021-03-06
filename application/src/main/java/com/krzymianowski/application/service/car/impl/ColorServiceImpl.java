package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Color;
import com.krzymianowski.application.model.car.repository.ColorRepository;
import com.krzymianowski.application.service.car.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorRepository;

    @Override
    public Color getColorByColorName(String colorName) {
        return colorRepository.getColorByColorName(colorName);
    }

    @Override
    public void save(Color color) {
        colorRepository.save(color);
    }
}
