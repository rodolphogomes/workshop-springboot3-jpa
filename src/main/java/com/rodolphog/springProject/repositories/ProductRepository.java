package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodolphog.springProject.entities.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
