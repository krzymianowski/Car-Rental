package com.krzymianowski.application.model.contact.repository;

import com.krzymianowski.application.model.contact.ContactState;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactStateRepository extends CrudRepository<ContactState, Integer>{
}
