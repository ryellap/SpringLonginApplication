package com.rahul.auth.service;

import com.rahul.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
