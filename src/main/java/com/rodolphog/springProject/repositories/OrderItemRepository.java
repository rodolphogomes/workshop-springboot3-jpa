package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolphog.springProject.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
