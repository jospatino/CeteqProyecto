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
import com.school.bean.InformacionAlumnoBean;
import com.school.serviceimpl.InformacionAlumnoServiceImpl;


@RestController
@RequestMapping("/servicio4")
public class InformacionAlumnoController {

@Autowired
private InformacionAlumnoServiceImpl informacionalumnoService;

@PostMapping("/crear")//guardar
public ResponseEntity<Boolean> saveInformacionAlumno(@Valid @RequestBody InformacionAlumnoBean informacionalumnoBean){
	return new ResponseEntity<Boolean> (this.informacionalumnoService.saveInformacionAlumno(informacionalumnoBean),HttpStatus.ACCEPTED);
}

@PutMapping("/actualizar")
public ResponseEntity<Boolean> updateInformacionAlumno(@Valid @RequestBody InformacionAlumnoBean informacionalumnoBean){
	return new ResponseEntity<Boolean>(this.informacionalumnoService.updateInformacionAlumno(informacionalumnoBean),HttpStatus.ACCEPTED);


}

@GetMapping("/visualizar/{idInformacionAlumno}")
public ResponseEntity<Integer> visualizarInformacionAlumno (@PathVariable int idInformacionAlumno){
return new ResponseEntity<Integer>(this.informacionalumnoService.getInformacionAlumno(idInformacionAlumno).getIddetalle(),HttpStatus.FOUND);

}

@DeleteMapping("/borrar/{idInformacionAlumno}")
public ResponseEntity<String>deleteInformacionAlumno(@PathVariable int idInformacionAlumno){
return new ResponseEntity<String>(this.informacionalumnoService.deleteInformacionAlumno(idInformacionAlumno),HttpStatus.OK);

}

@GetMapping("/todos")
public ResponseEntity<List<InformacionAlumnoBean>> getALL(){
return new ResponseEntity<List<InformacionAlumnoBean>>(this.informacionalumnoService.getAllInformacionAlumno(),HttpStatus.OK);

}

}