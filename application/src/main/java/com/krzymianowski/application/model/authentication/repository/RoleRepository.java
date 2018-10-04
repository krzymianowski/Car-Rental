package com.krzymianowski.application.model.authentication.repository;

import com.krzymianowski.application.model.authentication.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role getRoleByRoleName(String roleName);
}
