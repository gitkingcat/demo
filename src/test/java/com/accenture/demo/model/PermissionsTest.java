package com.accenture.demo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermissionsTest {

    @Test
    void getPermission() {
        User user = new User();
        User admin = new User();
        user.setRoles(Roles.USER);
        admin.setRoles(Roles.ADMIN);
        assertTrue(user.getRoles().getPermissionSet().contains(Permissions.USERS_READ));
        assertTrue(admin.getRoles().getPermissionSet().contains(Permissions.USERS_WRITE));
    }
}