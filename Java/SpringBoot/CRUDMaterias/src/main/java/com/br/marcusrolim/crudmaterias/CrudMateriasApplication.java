package com.br.marcusrolim.crudmaterias;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.marcusrolim.crudmaterias.domain.Coordenador;
import com.br.marcusrolim.crudmaterias.domain.Curso;
import com.br.marcusrolim.crudmaterias.domain.Grade;
import com.br.marcusrolim.crudmaterias.repositories.CoordenadorRepository;
import com.br.marcusrolim.crudmaterias.repositories.CursoRepository;
import com.br.marcusrolim.crudmaterias.repositories.GradeRepository;

@SpringBootApplication
public class CrudMateriasApplication implements CommandLineRunner{
	
	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private GradeRepository gradeRepository;
	
	@Autowired
	private CoordenadorRepository coordenadorRepository;

	public static void main(String[] args) {
		SpringApplication.run(CrudMateriasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Grade cc6Grade = new Grade(null, 2021, 2, "Ciência da Computação", 6);
		Coordenador ccCoordenador = new Coordenador(null, "Adriane");
		Curso cc = new Curso(null, "Ciência da Computação", cc6Grade, ccCoordenador);

		gradeRepository.saveAll(Arrays.asList(cc6Grade));
		coordenadorRepository.saveAll(Arrays.asList(ccCoordenador));
		cursoRepository.saveAll(Arrays.asList(cc));
		
	}
}
