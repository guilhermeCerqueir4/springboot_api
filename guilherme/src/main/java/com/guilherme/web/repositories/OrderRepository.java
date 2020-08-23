package com.guilherme.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.web.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
