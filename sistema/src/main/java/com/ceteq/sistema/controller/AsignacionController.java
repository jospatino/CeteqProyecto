package com.ceteq.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceteq.sistema.service.AsignacionService;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {
	
	@Autowired
	private AsignacionService asignacionService;
	
	
	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.asignacionService.findByID(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/mostrarTodos")
	public ResponseEntity<?> mostrar() {
		return new ResponseEntity<>(this.asignacionService.findAll(), HttpStatus.OK);
	}

}
