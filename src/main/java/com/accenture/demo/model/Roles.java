package com.accenture.demo.model;

import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public enum Roles {
    USER(Set.of(Permissions.USERS_READ)),
    ADMIN(Set.of(Permissions.USERS_WRITE, Permissions.USERS_READ));

    private final Set<Permissions> permissionSet;

    Roles(Set<Permissions> permissions) {
        this.permissionSet=permissions;
    }
    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermissionSet().stream()
                .map(permissions -> new SimpleGrantedAuthority(permissions.getPermission()))
                .collect(Collectors.toSet());
    }

}
