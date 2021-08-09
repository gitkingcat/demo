package com.accenture.demo.model;

public enum Permissions {
    USERS_READ("read"),
    USERS_WRITE("write");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
