package com.accenture.demo.repository;

import com.accenture.demo.model.Roles;
import com.accenture.demo.model.User;

import java.util.HashMap;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository{

    private static HashMap<String, User> repository = new HashMap<>();

    public HashMap<String, User> getRepository() {
        repository.put("admin@admin.com",new User(0L,"admin@admin.com", "$2y$12$TG4G4h5ijTqdXitCCteN8.wu1V0KXp6mCXKnC6SmnyJECbaDT1FMi", Roles.ADMIN));
        repository.put("user@user.com",new User(1L,"user@user.com", "$2y$12$TG4G4h5ijTqdXitCCteN8.wu1V0KXp6mCXKnC6SmnyJECbaDT1FMi", Roles.USER));

        return repository;
    }

    @Override
    public Optional<User> findUserByEmail(String email) {
        return Optional.of(getRepository().get(email));
    }
}
