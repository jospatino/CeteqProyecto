package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.model.AspiranteModel;

public interface AspiranteService {

	public List<AspiranteModel> findAll();

	public AspiranteModel findById(int id);

	public void save(AspiranteModel aspirante);

	public void deleteById(int id);

	public int countAll();

}
