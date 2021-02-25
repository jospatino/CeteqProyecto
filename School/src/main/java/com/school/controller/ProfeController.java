package com.school.controller;

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


import com.school.bean.ProfesorBean;
import com.school.service.ProfesorService;

@RequestMapping("/profesor")
@RestController
public class ProfeController {

	@Autowired
	public ProfesorService profesorService;
	
	
	
	@PostMapping("save") // metodo que guarda @PostMapping asigna solicitudes HTTP POST a métodos de controlador específicos
	public ResponseEntity<Integer> guardar(@RequestBody ProfesorBean ProfesorIngresado){ //@RequestBody indica que un parámetro de método debe estar vinculado al valor del cuerpo de la solicitud HTTP. El HttpMessageConveter es responsable de convertir del mensaje de solicitud HTTP a objeto.
		return new ResponseEntity<>(profesorService.saveProfesor(ProfesorIngresado), HttpStatus.OK);
	}
	
	@GetMapping("profesorlist") //metodo consulta  @GetMapping asigna solicitudes HTTP GET a métodos de controlador específicos
	public ResponseEntity<List<ProfesorBean>> bandeja(){
		return new ResponseEntity<>(profesorService.Profesorlist(), HttpStatus.OK);
	}
	
	@GetMapping("profesorbyId/{idprofesor}") //metodo consulta @GetMapping asigna solicitudes HTTP GET a métodos de controlador específicos
	public ResponseEntity<ProfesorBean> ProfesorbyId(@PathVariable("idprofesor") Integer idprofesor){  //pathvariable para que se pueda modificar la ruta asignando la variable (id) desde la URI
		return new ResponseEntity<>(profesorService.ProfesorbyId(idprofesor), HttpStatus.OK);
	}
	
	@PutMapping("updateProfesor") // ---> la ruta put actualiza @PutMapping se utiliza para mapear solicitudes HTTP PUT en métodos de manejador específicos.
	public ResponseEntity<Boolean> updateProfesor(@RequestBody ProfesorBean updateProfesor){ //@RequestBody indica que un parámetro de método debe estar vinculado al valor del cuerpo de la solicitud HTTP. El HttpMessageConveter es responsable de convertir del mensaje de solicitud HTTP a objeto.
		return new ResponseEntity<>(profesorService.updateProfesor(updateProfesor), HttpStatus.OK);
	}
	
	@DeleteMapping("deleteProfesor/{idprofesor}") //metodo que borra @DeleteMapping asigna solicitudes HTTP DELETE a métodos de controlador específicos.
	public ResponseEntity<Boolean> eliminar(@PathVariable("idprofesor") Integer idprofesor){ //pathvariable para que se pueda modificar la ruta asignando la variable (id) desde la URI
		return new ResponseEntity<>(profesorService.deleteProfesor(idprofesor), HttpStatus.OK);
	}
	
	
	
}
