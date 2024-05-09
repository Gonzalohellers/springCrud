package com.example.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
//import Models.usuarioScheme;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
public class datoController {

	@GetMapping(value = "/saludar/{Nombre:[a-zA-z]+}")
	public String getValor(@PathVariable String Nombre) {
		return String.valueOf(new ResponseEntity<>("Hola"+Nombre, HttpStatus.OK));
	}

	/*@PostMapping("/users")
	public void addUser( @RequestBody usuarioScheme usuario){

	}*/


	
}
