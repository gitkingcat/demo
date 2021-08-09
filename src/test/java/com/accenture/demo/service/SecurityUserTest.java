package com.accenture.demo.service;

import com.accenture.demo.model.Roles;
import com.accenture.demo.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SecurityUserTest {
    String pwd= "$2y$12$TG4G4h5ijTqdXitCCteN8.wu1V0KXp6mCXKnC6SmnyJECbaDT1FMi";
    String username = "user@user.com";
    private  User user = new User(1l,username,pwd,Roles.USER);
    List<SimpleGrantedAuthority> authorities = new ArrayList<>();


    @Test
    void getPassword() {
    assertEquals(pwd,SecurityUser.fromUser(user).getPassword());
    }

    @Test
    void getUsername() {
        assertEquals(username,SecurityUser.fromUser(user).getUsername());
    }

    @Test
    void isAccountNonExpired() {
        assertTrue(SecurityUser.fromUser(user).isAccountNonExpired());
    }

    @Test
    void isAccountNonLocked() {
        assertTrue(SecurityUser.fromUser(user).isAccountNonLocked());
    }

    @Test
    void isCredentialsNonExpired() {
        assertTrue(SecurityUser.fromUser(user).isCredentialsNonExpired());
    }

    @Test
    void isEnabled() {
        assertTrue(SecurityUser.fromUser(user).isEnabled());
    }

    @Test
    void fromUser() {
        assertEquals(SecurityUser.fromUser(user).getUsername(),username);
        assertEquals(SecurityUser.fromUser(user).getPassword(),pwd);
    }


}