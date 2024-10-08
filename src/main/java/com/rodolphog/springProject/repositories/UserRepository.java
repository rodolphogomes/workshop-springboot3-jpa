package com.rodolphog.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rodolphog.springProject.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
