package com.ciyama.request.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciyama.request.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
