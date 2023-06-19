package com.emperor.Spring.Security.repository;

import com.emperor.Spring.Security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findById(String email);
    Optional<User> findByUsername(String username);
    Optional<User> findByUsernameOrEmail(String username,String email);
    Boolean existsByEmail (String email);
    Boolean existsByUsername (String email);
}
