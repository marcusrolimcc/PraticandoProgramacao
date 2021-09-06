package com.br.marcusrolim.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.marcusrolim.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
