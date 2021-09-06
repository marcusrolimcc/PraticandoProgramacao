package com.br.marcusrolim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.marcusrolim.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
