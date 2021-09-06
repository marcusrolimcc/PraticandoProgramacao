package com.br.marcusrolim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.marcusrolim.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
