package com.br.marcusrolim.crudmaterias.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.marcusrolim.crudmaterias.domain.Curso;
import com.br.marcusrolim.crudmaterias.repositories.CursoRepository;
import com.br.marcusrolim.crudmaterias.services.exceptions.ObjectNotFoundException;

@Service
public class CursoService {
	
	@Autowired
	private CursoRepository repository;
	
	public Curso busca(Integer id) {
		Optional<Curso> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id ));
		}
}
