package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.AsignacionBean;

public interface AsignacionService {

	public String asignacion(AsignacionBean asignacionBean);

	public AsignacionBean findByID(Integer id);

	List<AsignacionBean> findAll();

	public Boolean updateAsignacion(AsignacionBean asignacionBean);

	public Boolean deleteAsignacion(Integer id);

}
