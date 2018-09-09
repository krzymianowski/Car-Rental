package com.krzymianowski.application.service.car.impl;

import com.krzymianowski.application.model.car.Type;
import com.krzymianowski.application.model.car.repository.TypeRepository;
import com.krzymianowski.application.service.car.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public Type getTypeByTypeName(String typeName) {
        return typeRepository.getTypeByTypeName(typeName);
    }

    @Override
    public void save(Type type) {
        typeRepository.save(type);
    }
}
