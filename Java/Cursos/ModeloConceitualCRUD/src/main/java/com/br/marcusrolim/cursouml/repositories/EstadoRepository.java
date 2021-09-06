package com.br.marcusrolim.cursouml.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.marcusrolim.cursouml.domain.Estado;

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Integer>{}
