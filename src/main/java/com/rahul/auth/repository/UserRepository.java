package com.rahul.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
