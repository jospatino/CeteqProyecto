package com.ceteq.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceteq.sistema.bean.InstructorBean;
import com.ceteq.sistema.service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {

	@Autowired
	private InstructorService instructorService;

	@PostMapping(path = "/create")
	public ResponseEntity<?> createInstructor(@Validated @RequestBody InstructorBean instructorBean,
			BindingResult result) {
		return new ResponseEntity<>(this.instructorService.createInstructor(instructorBean), HttpStatus.OK);
	}

	@GetMapping(path = "/findByID/{id}")
	public ResponseEntity<?> findByIdInsctructor(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.instructorService.findByID(id), HttpStatus.OK);
	}

	@GetMapping(path = "/findAll")
	public ResponseEntity<?> findAllInstructor() {
		return new ResponseEntity<>(this.instructorService.findAll(), HttpStatus.OK);
	}

	@DeleteMapping("/deleteId/{id}")
	public ResponseEntity<Boolean> deleteInstructor(@PathVariable("id") Integer id) {
		return new ResponseEntity<>(this.instructorService.deleteInstructor(id), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Boolean> updateInsctructor(@Validated @RequestBody InstructorBean instructorBean) {
		return new ResponseEntity<>(this.instructorService.updateInstructor(instructorBean), HttpStatus.OK);
	}

}
