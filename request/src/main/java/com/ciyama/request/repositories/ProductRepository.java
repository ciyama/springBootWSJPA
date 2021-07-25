package com.ciyama.request.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciyama.request.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
