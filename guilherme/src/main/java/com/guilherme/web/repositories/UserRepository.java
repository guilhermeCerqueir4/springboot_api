package com.guilherme.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.web.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
