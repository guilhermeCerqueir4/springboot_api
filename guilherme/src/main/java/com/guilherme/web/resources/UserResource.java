package com.guilherme.web.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.web.entities.User;

//Controlador REST

@RestController 				   //diz que a classe é um recurso Web que é implemetado por um controlador REST.
@RequestMapping(value = "/users")  //nome do recurso.
public class UserResource {

	
	@GetMapping //GetMapping indica que o método que responde a requisição do tipo GET do Http.
	public ResponseEntity<User> findAll() { 
		User u = new User(1L , "Guilherme", "guilherme@gmail.com", "1193999393", "12345");
		return ResponseEntity.ok().body(u);
		
		//metodo de EndPoint para acesar os users;
		//ResponseEntity é um tipo de retorno do Spring para retornar respostas de requisições Web.
		
	}
	
	
	
}
