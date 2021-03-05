package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.banco.bean.CreditoBean;
import com.banco.service.CreditoService;

@RequestMapping("/credito")
@RestController
public class CreditoController {

	@Autowired
	private CreditoService creditoservice;
	
	@PostMapping("/crearCredito")
	public ResponseEntity<Integer> crearCredito(@RequestBody CreditoBean creditoNuevo){
		return new ResponseEntity<>(this.creditoservice.crearCredito(creditoNuevo), HttpStatus.OK);
	}
	
	@GetMapping("/listaCreditos")
	public ResponseEntity<List<CreditoBean>> listaCreditos(){
		return new ResponseEntity<> (creditoservice.listaCreditos(), HttpStatus.OK);
	}
	
	@GetMapping("/creditoPorId/{idCredito}")
	public ResponseEntity<CreditoBean> creditoPorId(@PathVariable("idCredito") Integer idCredito){
		return new ResponseEntity<>(this.creditoservice.creditoPorId(idCredito), HttpStatus.OK);
	}
	
	@PutMapping("/updateCredito")
	public ResponseEntity<Boolean> updateCredito(@RequestBody CreditoBean creditoActualizar){
		return new ResponseEntity<>(this.creditoservice.updateCredito(creditoActualizar), HttpStatus.OK);
	}
	@DeleteMapping("/deleteCreditoById/{idCredito}")
	public ResponseEntity <Boolean> deleteCreditoById (@PathVariable ("idCredito") Integer idCredito){
		return new ResponseEntity<Boolean>(this.creditoservice.deleteCreditoById(idCredito),HttpStatus.OK);
	}
	
}
