package com.guilherme.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.web.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
