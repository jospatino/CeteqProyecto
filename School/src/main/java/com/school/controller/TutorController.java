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

import com.school.bean.TutorBean;
import com.school.serviceimpl.TutorServiceImpl;

@RestController
@RequestMapping("/servicio2")
public class TutorController {

	@Autowired
	private TutorServiceImpl tutorService;
	
	@PostMapping("/crear")//guardar
	public ResponseEntity<Integer>saveTutor(@Valid @RequestBody TutorBean tutorBean){
		return new ResponseEntity<Integer>(this.tutorService.saveTutor(tutorBean), HttpStatus.OK);
	}
	
	@GetMapping("/Mostrar_Todos")//Consultar todos
	public ResponseEntity<List<TutorBean>>findTutor(){
		return new ResponseEntity <List<TutorBean>>(this.tutorService.findTutor(), HttpStatus.OK);
	}
	
	@GetMapping("/Mostrar/{id}")//Consultar por id
	public ResponseEntity<TutorBean>findIdTutor(@PathVariable int id){
		return new ResponseEntity<TutorBean>(this.tutorService.findIdTutor(id), HttpStatus.FOUND);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Boolean>updateTutor(@Valid @RequestBody TutorBean tutorBean){
		return new ResponseEntity <Boolean>(this.tutorService.updateTutor(tutorBean), HttpStatus.FOUND);
	}
	
	@DeleteMapping("/borrar/{id}")
	public ResponseEntity<Boolean>deleteTutor(@PathVariable("id") Integer id){
		return new ResponseEntity<Boolean>(this.tutorService.deleteByIdTutor(id), HttpStatus.OK);
	}
	
}
