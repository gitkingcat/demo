package com.accenture.demo.model;

public enum Permissions {
    USERS_READ("reservations:read"),
    USERS_WRITE("reservations:write");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
