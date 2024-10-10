package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodolphog.springProject.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
