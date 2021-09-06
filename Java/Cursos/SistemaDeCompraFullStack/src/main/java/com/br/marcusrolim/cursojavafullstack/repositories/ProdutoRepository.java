package com.br.marcusrolim.cursojavafullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.marcusrolim.cursojavafullstack.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{}
