package com.shop.productseller.service;

import com.shop.productseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
