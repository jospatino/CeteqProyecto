package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.ProcesoBean;

public interface ProcesoService{
	public boolean crearProceso(ProcesoBean procesoBean);
	public boolean actualizaProceso(ProcesoBean procesoBean);
	public ProcesoBean getProceso(int idProceso);
	public List<ProcesoBean> getAllProceso();
	public boolean deleteProceso(int idProceso);
	List <ProcesoBean> findByAlumnoInProcess(short estatus);
}
