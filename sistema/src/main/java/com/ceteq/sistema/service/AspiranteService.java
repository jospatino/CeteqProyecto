package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.AspiranteBean;


public interface AspiranteService{

    public List<AspiranteBean> findAll();

    public AspiranteBean findById(int id); 

    public boolean save(AspiranteBean aspirante);

    public void deleteById(int id);

    public int countAll();

}

