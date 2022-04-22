package com.finalproject.appdavc.repository;

import com.finalproject.appdavc.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>  {

    Role findByName(String name);

}
