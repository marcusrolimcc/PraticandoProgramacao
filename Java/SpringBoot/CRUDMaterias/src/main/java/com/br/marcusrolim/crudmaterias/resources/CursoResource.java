package com.br.marcusrolim.crudmaterias.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.marcusrolim.crudmaterias.domain.Curso;
import com.br.marcusrolim.crudmaterias.services.CursoService;


@RestController
@RequestMapping(value = "/cursos")
public class CursoResource {
	
	@Autowired
	private CursoService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> busca(@PathVariable Integer id){
		Curso obj = service.busca(id);
		return ResponseEntity.ok().body(obj);
	}
}

