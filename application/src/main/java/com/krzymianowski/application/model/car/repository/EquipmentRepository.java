package com.krzymianowski.application.model.car.repository;

import com.krzymianowski.application.model.car.Equipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, Integer> {
    Equipment getEquipmentByItemName(String itemName);
}
