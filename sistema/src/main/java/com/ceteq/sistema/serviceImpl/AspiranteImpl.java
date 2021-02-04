package com.ceteq.sistema.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

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
    public List<AspiranteModel> findAll() {
        List<AspiranteModel> aspirantes = aspiranteRep.findAll();
        return aspirantes;
    }

    @Override
    public AspiranteModel findById(int id) {
        AspiranteModel aspM = aspiranteRep.findById(id).orElseThrow();
        return aspM;
    }

    @Override
    public void save(AspiranteModel aspirante) {
        aspiranteRep.save(aspirante);
    }

} 
