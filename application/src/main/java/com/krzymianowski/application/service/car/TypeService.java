package com.krzymianowski.application.service.car;

import com.krzymianowski.application.model.car.Type;
import com.krzymianowski.application.model.car.projection.OurCarsPageType;

import java.util.List;

public interface TypeService {
    Type getTypeByTypeName(String typeName);

    void save(Type type);

    List<OurCarsPageType> getOurCarsPageTypes();
}
