package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

    <T> Collection<T> findAllBy(Class<T> type);

    <T> Page<T> findAllBy(Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandName(
            @Param("brandName") String brandName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByFuelType_TypeName(
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByType_TypeNameAndFuelType_TypeName(
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByType_TypeName(
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndType_TypeName(
            @Param("brandName") String brandName,
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            Pageable pageable, Class<T> type);

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);


}
