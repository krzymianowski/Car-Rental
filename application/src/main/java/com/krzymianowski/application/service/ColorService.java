package com.krzymianowski.application.service;

import com.krzymianowski.application.model.Color;

public interface ColorService {
    Color getColorByColorName(String colorName);

    void save(Color color);
}
