package com.bomdia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bomdia.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
