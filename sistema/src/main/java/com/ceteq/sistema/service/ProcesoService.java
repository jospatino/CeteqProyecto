package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.AspiranteBean;
import com.ceteq.sistema.bean.ClaseBean;
import com.ceteq.sistema.bean.InstructorBean;
import com.ceteq.sistema.bean.ProcesoBean;

public interface ProcesoService{
	public boolean crearProceso(ProcesoBean procesoBean, AspiranteBean aspiranteBean, ClaseBean claseBean, InstructorBean instructorBean );
	public boolean actualizaProceso(ProcesoBean procesoBean, AspiranteBean aspiranteBean, ClaseBean claseBean, InstructorBean instructorBean );
	public ProcesoBean getProceso(int idProceso);
	public List<ProcesoBean> getAllProceso();
	public boolean deleteProceso(int idProceso);
}
