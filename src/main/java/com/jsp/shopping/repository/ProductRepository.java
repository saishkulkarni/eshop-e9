package com.jsp.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopping.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	boolean existsByNameAndCategory(String name, String category);

}
