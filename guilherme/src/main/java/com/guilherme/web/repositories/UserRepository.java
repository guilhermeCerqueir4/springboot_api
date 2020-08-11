package com.guilherme.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
