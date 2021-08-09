package com.accenture.demo.repository;

import com.accenture.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {

    Optional<User> findUserByEmail(String email);
}
