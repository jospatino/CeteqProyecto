package com.ceteq.sistema.controller;

import com.ceteq.sistema.serviceImpl.AspiranteImpl;

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

import com.ceteq.sistema.model.AspiranteModel;

@Controller
@RequestMapping("/aspirantes")
public class AspiranteController{

    @Autowired
    private AspiranteImpl aspirante;

    @GetMapping("/count")
    public ResponseEntity<?> countAspirantes(){
        return new ResponseEntity<>(aspirante.countAll(), HttpStatus.OK);
    } 

    @DeleteMapping("/{AspiranteId}")
    public ResponseEntity<?> deleteAspirante(@PathVariable int AspiranteId){
        aspirante.deleteById(AspiranteId);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> all(){
        return new ResponseEntity<>(aspirante.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{aspiranteId}")
    public ResponseEntity<?> byId(@PathVariable int aspiranteId){
        return new ResponseEntity<>(aspirante.findById(aspiranteId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addAspirante(@RequestBody AspiranteModel asp){
        asp.setIdAlumno(0);
        aspirante.save(asp);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateAspirante(@RequestBody AspiranteModel asp){
        aspirante.save(asp);
        return new ResponseEntity<>(asp, HttpStatus.OK);
    }

}

