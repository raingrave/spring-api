package com.raintech.api.Entities.Repositories;

import com.raintech.api.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}