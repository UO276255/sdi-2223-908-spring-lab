package com.uniovi.sdi2223908spring.repositories;

import com.uniovi.sdi2223908spring.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Long> {
    User findByDni(String dni);
}
