package com.ceteq.sistema.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ceteq.sistema.bean.ClaseBean;
import com.ceteq.sistema.serviceImpl.ClaseServiceImpl;

@Controller
@RequestMapping("/clase")
public class ClaseController {
	@Autowired
	private ClaseServiceImpl claseService;
	
	@PostMapping("/create")
	public ResponseEntity<Boolean> crearClase(@RequestBody ClaseBean claseBean){
		return new ResponseEntity<Boolean>(this.claseService.guardaClase(claseBean), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> actualizaClase(@RequestBody ClaseBean clasebean){
		return new ResponseEntity<Boolean>(this.claseService.actualizaClase(clasebean), HttpStatus.OK);
	}
	
	@GetMapping("/show/{idClase}")
	public ResponseEntity<ClaseBean> getProceso(@PathVariable int idClase){
		return new ResponseEntity<ClaseBean>(this.claseService.getClase(idClase), HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<ClaseBean>> listClase(){
		return new ResponseEntity<List<ClaseBean>>(this.claseService.getAllClase(), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{idClase}")
	public ResponseEntity<Boolean> deleteClase(@PathVariable int idClase){
		return new ResponseEntity<Boolean>(this.claseService.deleteClase(idClase), HttpStatus.OK);
	}
}
