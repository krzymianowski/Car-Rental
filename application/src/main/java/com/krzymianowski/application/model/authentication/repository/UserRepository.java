package com.krzymianowski.application.model.authentication.repository;

import com.krzymianowski.application.model.authentication.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User getUserByUsername(String username);
}
