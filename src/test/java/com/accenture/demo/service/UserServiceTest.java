package com.accenture.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.userdetails.User;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void loadUserByUsername() {
        UserService userService = new UserService();
        User user = (User) userService.loadUserByUsername("user@user.com");
        assertEquals("user@user.com",user.getUsername());
        assertEquals("$2y$12$TG4G4h5ijTqdXitCCteN8.wu1V0KXp6mCXKnC6SmnyJECbaDT1FMi",user.getPassword());
    }
}