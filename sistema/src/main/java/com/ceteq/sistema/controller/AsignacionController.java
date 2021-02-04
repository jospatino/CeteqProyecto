package com.ceteq.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceteq.sistema.bean.AsignacionBean;
import com.ceteq.sistema.service.AsignacionService;

@RestController
@RequestMapping("/asignacion")
public class AsignacionController {

	@Autowired
	private AsignacionService asignacionService;

	@PostMapping(path = "/create")
	public ResponseEntity<?> agregar(@Validated @RequestBody AsignacionBean asignacionBean, BindingResult result) {
		return new ResponseEntity<>(this.asignacionService.createAsignacion(asignacionBean), HttpStatus.OK);

	}

	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.asignacionService.findByID(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> mostrar() {
		return new ResponseEntity<>(this.asignacionService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> eliminar(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.asignacionService.deleteAsignacion(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarUsuario(@Validated @RequestBody AsignacionBean asignacionBean) {
		return new ResponseEntity<>(this.asignacionService.updateAsignacion(asignacionBean), HttpStatus.OK);
	}

}
