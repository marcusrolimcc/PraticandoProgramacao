package com.br.marcusrolim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.marcusrolim.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
