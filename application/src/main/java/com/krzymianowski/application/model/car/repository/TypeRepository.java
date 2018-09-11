package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Type;
import com.krzymianowski.application.model.car.projection.OurCarsPageType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TypeRepository extends CrudRepository<Type, Integer> {

    Type getTypeByTypeName(String typeName);

    <T> Collection<T> findAllBy(Class<T> tClass);

    default <T> Collection<T>  getAll(Class<T> tClass){
        return findAllBy(tClass);
    }
}
