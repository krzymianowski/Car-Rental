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

    long countByState_StateName(@Param("stateName") String stateName);

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

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelTypeFuelState(String brand, String model, String type, String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndFuelType_TypeNameAndState_StateName(brand, model, type, fuel, state, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandTypeFuelState(String brand, String type, String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndType_TypeNameAndFuelType_TypeNameAndState_StateName(brand, type, fuel, state, pageable, tClass);
    }

    <T> Page<T> findByType_TypeNameAndFuelType_TypeNameAndState_StateName(
            @Param("Type_typeName") String typeName,
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getTypeFuelState(String type, String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByType_TypeNameAndFuelType_TypeNameAndState_StateName(type, fuel, state, pageable, tClass);
    }


    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelFuelState(String brand, String model, String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndModel_ModelNameAndFuelType_TypeNameAndState_StateName(brand, model, fuel, state, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndFuelType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandFuelState(String brand, String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndFuelType_TypeNameAndState_StateName(brand, fuel, state, pageable, tClass);
    }

    <T> Page<T> findByFuelType_TypeNameAndState_StateName(
            @Param("FuelType_typeName") String fuelTypeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getFuelState(String fuel, String state, Pageable pageable, Class<T> tClass){
        return findByFuelType_TypeNameAndState_StateName(fuel, state, pageable, tClass);
    }


    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("Type_typeName") String typeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelTypeState(String brand, String model, String type, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndModel_ModelNameAndType_TypeNameAndState_StateName(brand, model, type, state, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndType_TypeNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("Type_typeName") String typeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandTypeState(String brand, String type, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndType_TypeNameAndState_StateName(brand, type, state, pageable, tClass);
    }

    <T> Page<T> findByType_TypeNameAndState_StateName(
            @Param("Type_typeName") String typeName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getTypeState(String type, String state, Pageable pageable, Class<T> tClass){
        return findByType_TypeNameAndState_StateName(type, state, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndModel_ModelNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("modelName") String modelName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandModelState(String brand, String model, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndModel_ModelNameAndState_StateName(brand, model, state, pageable, tClass);
    }

    <T> Page<T> findByModel_brand_brandNameAndState_StateName(
            @Param("brandName") String brandName,
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getBrandState(String brand, String state, Pageable pageable, Class<T> tClass){
        return findByModel_brand_brandNameAndState_StateName(brand, state, pageable, tClass);
    }

    <T> Page<T> findByState_StateName(
            @Param("stateName") String stateName,
            Pageable pageable, Class<T> type);

    default <T> Page<T> getState(String state, Pageable pageable, Class<T> tClass){
        return findByState_StateName(state, pageable, tClass);
    }
}
