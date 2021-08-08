package com.accenture.demo.config;

import com.accenture.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigTest {


    @Mock
    UserService userService;
    @Test
    void bCryptPasswordEncoder() {
    SecurityConfig securityConfig = new SecurityConfig();
    assertTrue(securityConfig.bCryptPasswordEncoder().matches("user","$2y$12$TG4G4h5ijTqdXitCCteN8.wu1V0KXp6mCXKnC6SmnyJECbaDT1FMi"));
    }
}