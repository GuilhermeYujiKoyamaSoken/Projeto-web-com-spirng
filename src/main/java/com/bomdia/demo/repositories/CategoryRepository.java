package com.bomdia.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bomdia.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
