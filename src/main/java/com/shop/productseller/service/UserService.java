package com.shop.productseller.service;

import com.shop.productseller.model.Role;
import com.shop.productseller.model.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void changeRole(Role newRole, String username);
}
