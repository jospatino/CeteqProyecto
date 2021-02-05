package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.ClaseBean;

public interface ClaseService {
	public boolean guardaClase(ClaseBean claseBean );
	public boolean actualizaClase(ClaseBean claseBean);
	public ClaseBean getClase(int idClase);
	public List<ClaseBean> getAllClase();
	public boolean deleteClase(int idClase);
	public String numeroClases();
}
