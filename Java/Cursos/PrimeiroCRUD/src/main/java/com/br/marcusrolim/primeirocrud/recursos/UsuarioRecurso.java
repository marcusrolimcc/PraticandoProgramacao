package com.br.marcusrolim.primeirocrud.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.marcusrolim.primeirocrud.entidades.Usuario;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<Usuario> buscarTodos(){
		Usuario usuario = new Usuario(1, "Maria", "maria@gmail.com", "999999", "123");
		return ResponseEntity.ok().body(usuario);
	}
	

}
