package com.school.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.school.bean.KardexBean;
import com.school.serviceimpl.KardexServiceImpl;

@RestController
@RequestMapping("/servicio")
public class KardexController {

	@Autowired
	private KardexServiceImpl kardexService;
	
	@PostMapping("/crear")//guardar
	public ResponseEntity<Integer>saveKardex(@Valid @RequestBody KardexBean kardexBean){
		return new ResponseEntity<Integer>(this.kardexService.saveKardex(kardexBean), HttpStatus.OK);
	}
	
	@GetMapping("/Mostrar_Todos")//Consultar todos
	public ResponseEntity<List<KardexBean>>findkardex(){
		return new ResponseEntity <List<KardexBean>>(this.kardexService.findKardex(), HttpStatus.OK);
	}
	
	@GetMapping("/Mostrar/{id}")//Consultar por id
	public ResponseEntity<KardexBean>findIdKardex(@PathVariable int id){
		return new ResponseEntity<KardexBean>(this.kardexService.findIdKardex(id), HttpStatus.FOUND);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Boolean>updateKardex(@Valid @RequestBody KardexBean kardexBean){
		return new ResponseEntity <Boolean>(this.kardexService.updateKardex(kardexBean), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<Boolean>deleteKardex(@PathVariable("id") Integer id){
		return new ResponseEntity<Boolean>(this.kardexService.deleteByIdKardex(id), HttpStatus.OK);
	}
	
}
