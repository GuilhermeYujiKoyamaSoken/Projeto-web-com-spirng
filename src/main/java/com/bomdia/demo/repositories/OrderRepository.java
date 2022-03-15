package com.bomdia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bomdia.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
