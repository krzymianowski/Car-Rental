package com.krzymianowski.application.service;

import com.krzymianowski.application.model.car.Color;

public interface ColorService {
    Color getColorByColorName(String colorName);

    void save(Color color);
}
