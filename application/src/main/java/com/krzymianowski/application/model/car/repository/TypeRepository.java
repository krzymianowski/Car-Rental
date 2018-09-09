package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Integer> {

    Type getTypeByTypeName(String typeName);
}
