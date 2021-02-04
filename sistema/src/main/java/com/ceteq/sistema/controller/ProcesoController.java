package com.ceteq.sistema.controller;

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

import com.ceteq.sistema.bean.ProcesoBean;
import com.ceteq.sistema.serviceImpl.ProcesoServiceImpl;

@RestController
@RequestMapping("/proceso")
public class ProcesoController {
	@Autowired
	private ProcesoServiceImpl procesoService;
	
	@PostMapping("/create")
	public ResponseEntity<Boolean> crearProceso(@RequestBody ProcesoBean procesoBean){
		return new ResponseEntity<Boolean>(this.procesoService.crearProceso(procesoBean), HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> updateProceso(@RequestBody ProcesoBean procesoBean){
		return new ResponseEntity<Boolean>(this.procesoService.actualizaProceso(procesoBean), HttpStatus.OK);
	}
	
	@GetMapping("/show/{idProceso}")
	public ResponseEntity<ProcesoBean> getProceso(@PathVariable int idProceso){
		return new ResponseEntity<ProcesoBean>(this.procesoService.getProceso(idProceso), HttpStatus.OK);
	}
	
	@GetMapping("/list")
	public ResponseEntity<List<ProcesoBean>> listProceso(){
		return new ResponseEntity<List<ProcesoBean>>(this.procesoService.getAllProceso(), HttpStatus.OK);
	}
	
	@DeleteMapping("delete/{idProceso}")
	public ResponseEntity<Boolean> deleteProceso(@PathVariable int idProceso){
		return new ResponseEntity<Boolean>(this.procesoService.deleteProceso(idProceso), HttpStatus.OK);
	}
	
}
