package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.model.AspiranteModel;

import com.ceteq.sistema.bean.AspiranteBean;


public interface AspiranteService {

	 public List<?> findAspiranteDeuda(int idAspirante);

	

	public void deleteById(int id);

    public List<AspiranteBean> findAll();

    public AspiranteBean findById(int id); 

    public boolean save(AspiranteBean aspirante);

	public int countAll();

}
