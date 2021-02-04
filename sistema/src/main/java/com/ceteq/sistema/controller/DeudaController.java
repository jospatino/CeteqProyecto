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

import com.ceteq.sistema.bean.DeudaBean;
import com.ceteq.sistema.service.DeudaService;

@RestController
@RequestMapping("/deuda")
public class DeudaController {

	@Autowired
	private DeudaService deudaService;

	@PostMapping(path = "/create")
	public ResponseEntity<?> agregar(@Validated @RequestBody DeudaBean deudaBean, BindingResult result) {
		return new ResponseEntity<>(this.deudaService.CreateDeuda(deudaBean), HttpStatus.OK);

	}

	@GetMapping(path = "/findById/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.deudaService.findByID(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> mostrar() {
		return new ResponseEntity<>(this.deudaService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> eliminar(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.deudaService.deleteDeuda(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizarUsuario(@Validated @RequestBody DeudaBean deudaBean) {
		return new ResponseEntity<>(this.deudaService.updateDeuda(deudaBean), HttpStatus.OK);
	}

}
