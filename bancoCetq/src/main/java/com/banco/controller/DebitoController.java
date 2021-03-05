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


import com.banco.bean.DebitoBean;
import com.banco.service.DebitoService;
@RequestMapping("/debito")
@RestController
public class DebitoController {
	
@Autowired

private DebitoService debitoService;

	@PostMapping("/save")
	public ResponseEntity<Integer> save(@RequestBody DebitoBean debitoBean){
		return new ResponseEntity<>(this.debitoService.save(debitoBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<DebitoBean>> find(){
		return new ResponseEntity<> (this.debitoService.find(), HttpStatus.OK);
	}
	
	@GetMapping("/findId/{idDebito}")
	public ResponseEntity<DebitoBean> findId(@PathVariable("idDebito") Integer idDebito){
		return new ResponseEntity<>(this.debitoService.findId(idDebito), HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> update(@RequestBody DebitoBean clienteBean){
		return new ResponseEntity<>(this.debitoService.update(clienteBean), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/deleteById/{idDebito}")
	public ResponseEntity <Boolean> deleteById (@PathVariable ("idDebito") Integer idDebito){
		return new ResponseEntity<Boolean>(this.debitoService.deleteById(idDebito),HttpStatus.OK);
	}
}