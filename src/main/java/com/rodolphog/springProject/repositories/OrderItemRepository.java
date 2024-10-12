package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodolphog.springProject.entities.OrderItem;
import com.rodolphog.springProject.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
}
