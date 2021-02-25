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

import com.school.bean.AlumnoBean;
import com.school.bean.AlumnoDetalleBean;
import com.school.bean.ProfesorDetalleBean;
import com.school.serviceimpl.AlumnoServiceImpl;
import com.school.serviceimpl.ProfeServiceImpl;

@RestController
@RequestMapping("/Servicios")
public class AlumnoController {
@Autowired
private AlumnoServiceImpl alumnoService;

@Autowired
private ProfeServiceImpl profeService;

@PostMapping("/save")
public ResponseEntity<Integer>saveAlumno(@Valid @RequestBody AlumnoBean alumnoBean){
	return new ResponseEntity<Integer>(this.alumnoService.saveAlumno(alumnoBean), HttpStatus.OK);
}

@GetMapping("/findAll")
public ResponseEntity<List<AlumnoBean>>list(){
	return new ResponseEntity <List<AlumnoBean>>(this.alumnoService.list(), HttpStatus.OK);
}

@GetMapping("/findId/{id}")
public ResponseEntity<AlumnoBean>findIdAlumno(@PathVariable int id){
	return new ResponseEntity<AlumnoBean>(this.alumnoService.findIdAlumno(id), HttpStatus.FOUND);
}

@PutMapping("/update")
public ResponseEntity<Boolean>updateAlumno(@Valid @RequestBody AlumnoBean alumnoBean){
	return new ResponseEntity <Boolean>(this.alumnoService.updateAlumno(alumnoBean), HttpStatus.FOUND);
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<Boolean>deleteById(@PathVariable("id") Integer id){
	return new ResponseEntity<Boolean>(this.alumnoService.deleteById(id), HttpStatus.OK);
}

@GetMapping("/ListaRepro")
public ResponseEntity<List<AlumnoBean>>listaReprobados(){
	return new ResponseEntity <List<AlumnoBean>>(this.alumnoService.listaReprobados(), HttpStatus.OK);
}

@GetMapping("/ListaCalif")
public ResponseEntity<List<AlumnoDetalleBean>>listaCalificaciones(){
	return new ResponseEntity <List<AlumnoDetalleBean>>(this.alumnoService.listaCalificaciones(), HttpStatus.OK);
}

@GetMapping("/alumnoTutor/{id}")
public ResponseEntity <AlumnoDetalleBean> alumnoTutor(@PathVariable int id){
	return new ResponseEntity<AlumnoDetalleBean>(this.alumnoService.alumnoTutor(id), HttpStatus.FOUND);
}

@GetMapping("/listaDeudores")
public ResponseEntity <List<AlumnoBean>> listaDeudores(){
	return new ResponseEntity <List<AlumnoBean>>(this.alumnoService.listaDeudores(), HttpStatus.OK);
}

@GetMapping("/alumnoProfesor/{id}")
public ResponseEntity <AlumnoDetalleBean> AlumnoProfesor(@PathVariable int id){
	return new ResponseEntity<AlumnoDetalleBean>(this.alumnoService.AlumnoProfesor(id), HttpStatus.FOUND);
}

@GetMapping("/alumnoProfeId/{id}")
public ResponseEntity <ProfesorDetalleBean> AlumnoProfeId(@PathVariable int id){
	return new ResponseEntity<ProfesorDetalleBean>(this.alumnoService.AlumnoProfeId(id), HttpStatus.FOUND);
}

@GetMapping("/listaAlumnoBeca")
public ResponseEntity <List<AlumnoDetalleBean>> listaAlumnoBeca(){
	return new ResponseEntity <List<AlumnoDetalleBean>>(this.alumnoService.listaAlumnoBeca(), HttpStatus.OK);
}

@GetMapping("/listaAlumnoDerechoExamen")
public ResponseEntity <List<AlumnoBean>> listaAlumnoDerechoExamen(){
	return new ResponseEntity <List<AlumnoBean>>(this.alumnoService.listaAlumnoDerechoExamen(), HttpStatus.OK);
}

}
