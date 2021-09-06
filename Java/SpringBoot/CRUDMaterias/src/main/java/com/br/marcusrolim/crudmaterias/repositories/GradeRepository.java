package com.br.marcusrolim.crudmaterias.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.marcusrolim.crudmaterias.domain.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer>{

}
