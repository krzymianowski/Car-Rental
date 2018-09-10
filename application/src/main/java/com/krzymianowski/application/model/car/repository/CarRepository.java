package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface CarRepository extends CrudRepository<Car, Integer> {

    <T> Collection<T> findAllBy(Class<T> type);

    <T> Page<T> findAllBy(Pageable pageable, Class<T> type);

    default <T> Page<T> getAll(Pageable pageable, Class<T> tClass) {
        return findAllBy(pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandName(
            @Param("brandName") String brandName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrand(String brand, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandName(brand, pageable, tClass);
    }

    <T> Page<T> findByFuelType_TypeName(
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getFuel(String fuel, Pageable pageable, Class<T> tClass) {
        return findByFuelType_TypeName(fuel, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandFuel(String brand, String fuel, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndFuelType_TypeName(brand, fuel, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelFuel(String brand, String model, String fuel, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeName(brand, model, fuel, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandTypeFuel(String brand, String type, String fuel, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeName(brand, type, fuel, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelTypeFuel(String brand, String model, String type, String fuel, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeName(brand, model, type, fuel, pageable, tClass);
    }

    <T> Page<T> findByType_TypeNameAndFuelType_TypeName(
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getTypeFuel(String type, String fuel, Pageable pageable, Class<T> tClass) {
        return findByType_TypeNameAndFuelType_TypeName(type, fuel, pageable, tClass);
    }

    <T> Page<T> findByType_TypeName(
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getType(String type, Pageable pageable, Class<T> tClass) {
        return findByType_TypeName(type, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndType_TypeName(
            @Param("brandName") String brandName,
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandType(String brand, String type, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndType_TypeName(brand, type, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModel(String brand, String model, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndModel_ModelName(brand, model, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("typeName") String typeName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelType(String brand, String model, String type, Pageable pageable, Class<T> tClass) {
        return findByModel_brand_brandNameAndModel_ModelNameAndType_TypeName(brand, model, type, pageable, tClass);
    }
}
