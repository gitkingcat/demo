package com.accenture.demo.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserRepositoryImplTest {

    UserRepositoryImpl userRepository = new UserRepositoryImpl();

    @Test
    void getRepository() {
        assertNotNull(userRepository.getRepository());
    }

    @Test
    void findUserByEmail() {
        assertEquals("user@user.com", userRepository.findUserByEmail("user@user.com").get().getEmail());
    }
}