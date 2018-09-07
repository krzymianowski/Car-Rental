package com.krzymianowski.application.model.repository;

import com.krzymianowski.application.model.Type;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRepository extends CrudRepository<Type, Integer>{

    Type getTypeByTypeName(String typeName);
}
