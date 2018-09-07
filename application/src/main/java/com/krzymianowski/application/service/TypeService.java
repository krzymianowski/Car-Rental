package com.krzymianowski.application.service;

import com.krzymianowski.application.model.Type;

public interface TypeService {
    Type getTypeByTypeName(String typeName);

    void save(Type type);
}
