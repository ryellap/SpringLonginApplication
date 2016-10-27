package com.rahul.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
