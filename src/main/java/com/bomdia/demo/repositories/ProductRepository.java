package com.bomdia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bomdia.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
