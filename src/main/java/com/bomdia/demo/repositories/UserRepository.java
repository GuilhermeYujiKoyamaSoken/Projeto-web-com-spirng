package com.bomdia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bomdia.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
