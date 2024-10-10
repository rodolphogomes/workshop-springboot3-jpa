package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodolphog.springProject.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
