package com.krzymianowski.application.model.contact.repository;

import com.krzymianowski.application.model.contact.WantToContact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WantToContactRepository extends CrudRepository<WantToContact, Integer> {
}
