package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Type;

public interface TypeService {
    Type getTypeByTypeName(String typeName);

    void save(Type type);
}
