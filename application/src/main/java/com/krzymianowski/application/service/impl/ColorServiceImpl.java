package com.krzymianowski.application.service.impl;

import com.krzymianowski.application.model.Color;
import com.krzymianowski.application.model.repository.ColorRepository;
import com.krzymianowski.application.service.ColorService;
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
