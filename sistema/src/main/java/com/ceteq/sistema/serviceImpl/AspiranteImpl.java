package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import com.ceteq.sistema.bean.AspiranteBean;
import com.ceteq.sistema.bean.AspiranteDeudaBean;
import com.ceteq.sistema.model.AspiranteModel;
import com.ceteq.sistema.repository.AspiranteRepository;
import com.ceteq.sistema.service.AspiranteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AspiranteImpl implements AspiranteService{

    @Autowired
    private AspiranteRepository aspiranteRep; 

    @Override
    public int countAll() {
        return (int)aspiranteRep.count();
    }

    @Override
    public void deleteById(int id) {
        aspiranteRep.deleteById(id);  
    }

    @Override
    public List<AspiranteBean> findAll() {
        List<AspiranteModel> aspirantes = aspiranteRep.findAll();
        List<AspiranteBean> aspiranteBL = new ArrayList<>();
        for(AspiranteModel asp : aspirantes){
            AspiranteBean aspB = new AspiranteBean(
                    asp.getIdAlumno(), 
                    asp.getNombre(), 
                    asp.getApP(), 
                    asp.getApM(), 
                    asp.getEdad(), 
                    asp.getDireccion(),
                    asp.getCiudad(), 
                    asp.getTelefono(), 
                    asp.getCorreo(), 
                    asp.getFechaRegistro(),
                    asp.getFechaBaja());
            aspiranteBL.add(aspB);
        }
        return aspiranteBL;
    }

    @Override
    public AspiranteBean findById(int id) {
        AspiranteModel aspM = aspiranteRep.findById(id).orElseThrow();

        AspiranteBean aspB = new AspiranteBean(
               aspM.getIdAlumno(), 
               aspM.getNombre(), 
               aspM.getApP(), 
               aspM.getApM(), 
               aspM.getEdad(), 
               aspM.getDireccion(), 
               aspM.getCiudad(), 
               aspM.getTelefono(), 
               aspM.getCorreo(), 
               aspM.getFechaRegistro(), 
               aspM.getFechaBaja());
        return aspB;
    }

    public List<?> findAspiranteDeuda(int idAspirante){
        return aspiranteRep.findAspiranteDeuda(idAspirante);
    }

    @Override
    public boolean save(AspiranteBean aspiranteB) {
        AspiranteModel aspM = new AspiranteModel(
                aspiranteB.getIdAlumno(), 
                aspiranteB.getNombre(), 
                aspiranteB.getApP(), 
                aspiranteB.getApM(), 
                aspiranteB.getEdad(), 
                aspiranteB.getDireccion(), 
                aspiranteB.getCiudad(), 
                aspiranteB.getTelefono(),
                aspiranteB.getCorreo(), 
                aspiranteB.getFechaRegistro(), 
                aspiranteB.getFechaBaja()
        );

        aspiranteRep.save(aspM);
        return true;
    }


} 
