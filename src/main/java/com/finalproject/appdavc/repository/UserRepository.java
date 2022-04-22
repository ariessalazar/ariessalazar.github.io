package com.finalproject.appdavc.repository;

import com.finalproject.appdavc.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByEmailAddress(String emailAddress);

}
