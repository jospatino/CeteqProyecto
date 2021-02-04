package com.ceteq.sistema.controller;

import java.util.List;

import com.ceteq.sistema.serviceImpl.AspiranteImpl;

import org.springframework.beans.factory.annotation.Autowired;
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
    public int countAspirantes(){
        return aspirante.countAll();
    } 

    @DeleteMapping("/{AspiranteId}")
    public void deleteAspirante(@PathVariable int AspiranteId){
        aspirante.deleteById(AspiranteId);
    }

    @GetMapping
    public List<AspiranteModel> all(){
        return aspirante.findAll();
    }

    @GetMapping("/{AspiranteId}")
    public AspiranteModel getAspiranteById(@PathVariable int AspiranteId){
        return aspirante.findById(AspiranteId);
    }

    @PostMapping
    public AspiranteModel addAspirante(@RequestBody AspiranteModel asp){
        asp.setIdAlumno(0);
        aspirante.save(asp);
        return asp;
    }

    @PutMapping
    public AspiranteModel updateAspirante(@RequestBody AspiranteModel asp){
        aspirante.save(asp);
        return asp;
    }

}

