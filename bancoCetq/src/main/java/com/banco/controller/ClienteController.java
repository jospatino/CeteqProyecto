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

import com.banco.bean.ClienteAuxBean;
import com.banco.bean.ClienteBean;
import com.banco.service.ClienteService;


@RequestMapping("/cliente")
@RestController
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/save")
	public ResponseEntity<Integer> save(@RequestBody ClienteBean clienteBean){
		return new ResponseEntity<>(this.clienteService.save(clienteBean), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findAll")
	public ResponseEntity<List<ClienteBean>> find(){
		return new ResponseEntity<> (this.clienteService.find(), HttpStatus.OK);
	}
	
	@GetMapping("/findById/{idCliente}")
	public ResponseEntity<ClienteBean> findId(@PathVariable("idCliente") Integer idCliente){
		return new ResponseEntity<>(this.clienteService.findId(idCliente), HttpStatus.FOUND);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> update(@RequestBody ClienteBean clienteBean){
		return new ResponseEntity<>(this.clienteService.update(clienteBean), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{idCliente}")
	public ResponseEntity <Boolean> deleteById (@PathVariable ("idCliente") Integer idCliente){
		return new ResponseEntity<Boolean>(this.clienteService.deleteById(idCliente),HttpStatus.OK);
	}
	@PutMapping ("/depositar/{idCliente}/{deposito}")
	public ResponseEntity<ClienteAuxBean>depositar(@PathVariable("idCliente")Integer idCliente, @PathVariable ("deposito") double deposito){
		return new ResponseEntity<ClienteAuxBean>(this.clienteService.depositar(idCliente, deposito),HttpStatus.OK);
	}
	
	@PutMapping("/abonarDeuda/{idCliente}/{abono}")
	public ResponseEntity<ClienteAuxBean>abonarDeuda(@PathVariable("idCliente") Integer idCliente, @PathVariable("abono") double abono){
		return new ResponseEntity<ClienteAuxBean>(this.clienteService.abonarDeuda(idCliente, abono),HttpStatus.OK);
	}
	@PutMapping ("/retiro/{idCliente}/{retirar}")
	public ResponseEntity<ClienteAuxBean>retiro(@PathVariable("idCliente")Integer idCliente, @PathVariable ("retirar") double retirar){
		return new ResponseEntity<ClienteAuxBean>(this.clienteService.retiro(idCliente, retirar),HttpStatus.OK);
	}
	@GetMapping("/clientesDeudas")
	public ResponseEntity<List<ClienteAuxBean>> clientesDeudas(){
		return new ResponseEntity<> (this.clienteService.clientesDeudas(), HttpStatus.OK);
	}
	@GetMapping("/eligibilidadPrestamo/{idCliente}")
	public ResponseEntity<Boolean> eligibilidadPrestamo(@PathVariable("idCliente") Integer idCliente){
		return new ResponseEntity<>(this.clienteService.eligibilidadPrestamo(idCliente), HttpStatus.OK);
	}
}
