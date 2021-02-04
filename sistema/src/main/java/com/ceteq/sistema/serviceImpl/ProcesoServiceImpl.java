package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.AspiranteBean;
import com.ceteq.sistema.bean.ClaseBean;
import com.ceteq.sistema.bean.InstructorBean;
import com.ceteq.sistema.bean.ProcesoBean;
import com.ceteq.sistema.model.AspiranteModel;
import com.ceteq.sistema.model.ClaseModel;
import com.ceteq.sistema.model.InstructorModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.ProcesoRepository;
import com.ceteq.sistema.service.ProcesoService;

@Service
@Transactional
public class ProcesoServiceImpl implements ProcesoService{
	@Autowired
	private ProcesoRepository procesoRepo;
	
	@Override
	public boolean crearProceso(ProcesoBean procesoBean, AspiranteBean aspiranteBean, ClaseBean claseBean, InstructorBean instructorBean) {
	ProcesoModel proceso = new ProcesoModel();
	AspiranteModel aspirante = new AspiranteModel();
	ClaseModel claseM = new ClaseModel();
	InstructorModel instructor = new InstructorModel();
	proceso.setIdProceso(procesoBean.getIdProceso());
	proceso.setEstatus(procesoBean.getEstatus());
	proceso.setDescripcion(procesoBean.getDescripcion());
	proceso.setFechaAlta(procesoBean.getFechaAlta());
	proceso.setFechaFin(procesoBean.getFechaFin());
	claseM.setIdClase(claseBean.getIdClase());
	instructor.setIdInstructor(instructorBean.getIdInstructor());
	aspirante.setIdAlumno(aspiranteBean.getIdAlumno());
	aspirante.setNombre(aspiranteBean.getNombre());
	aspirante.setApP(aspiranteBean.getApP());
	aspirante.setApM(aspiranteBean.getApM());
	aspirante.setEdad(aspiranteBean.getEdad());
	aspirante.setDireccion(aspiranteBean.getDireccion());
	aspirante.setCiudad(aspiranteBean.getCiudad());
	aspirante.setTelefono(aspiranteBean.getTelefono());
	aspirante.setCorreo(aspiranteBean.getCorreo());
	aspirante.setFechaRegistro(aspiranteBean.getFechaRegistro());
	aspirante.setFechaBaja(aspiranteBean.getFechaBaja());
	proceso.setAlumno(aspirante);
	this.procesoRepo.save(proceso);
	return true;
	}

	@Override
	public boolean actualizaProceso(ProcesoBean procesoBean, AspiranteBean aspiranteBean, ClaseBean claseBean, InstructorBean instructorBean ) {
		ProcesoModel proceso = this.procesoRepo.findById(procesoBean.getIdProceso()).orElseThrow();
		AspiranteModel aspirante = new AspiranteModel();
		ClaseModel claseM = new ClaseModel();
		InstructorModel instructor = new InstructorModel();
		proceso.setEstatus(procesoBean.getEstatus());
		proceso.setDescripcion(procesoBean.getDescripcion());
		proceso.setFechaAlta(procesoBean.getFechaAlta());
		proceso.setFechaFin(procesoBean.getFechaFin());
		claseM.setIdClase(claseBean.getIdClase());
		instructor.setIdInstructor(instructorBean.getIdInstructor());
		aspirante.setIdAlumno(aspiranteBean.getIdAlumno());
		aspirante.setNombre(aspiranteBean.getNombre());
		aspirante.setApP(aspiranteBean.getApP());
		aspirante.setApM(aspiranteBean.getApM());
		aspirante.setEdad(aspiranteBean.getEdad());
		aspirante.setDireccion(aspiranteBean.getDireccion());
		aspirante.setCiudad(aspiranteBean.getCiudad());
		aspirante.setTelefono(aspiranteBean.getTelefono());
		aspirante.setCorreo(aspiranteBean.getCorreo());
		aspirante.setFechaRegistro(aspiranteBean.getFechaRegistro());
		aspirante.setFechaBaja(aspiranteBean.getFechaBaja());
		proceso.setAlumno(aspirante);
		this.procesoRepo.save(proceso);
		return true;
	}

	@Override
	public ProcesoBean getProceso(int idProceso) {
		ProcesoModel proceso = this.procesoRepo.findById(idProceso).orElseThrow();
		AspiranteBean aspiranteB = new AspiranteBean();
		ProcesoBean procesoBean = new ProcesoBean();
		ClaseBean claseB = new ClaseBean();
		InstructorBean instructorB = new InstructorBean();
		aspiranteB.setIdAlumno(proceso.getAlumno().getIdAlumno());
		claseB.setIdClase(proceso.getClase().getIdClase());
		instructorB.setIdInstructor(proceso.getInstructor().getIdInstructor());
		procesoBean.setEstatus(proceso.getEstatus());
		procesoBean.setDescripcion(proceso.getDescripcion());
		procesoBean.setFechaAlta(proceso.getFechaAlta());
		procesoBean.setFechaFin(proceso.getFechaFin());
		procesoBean.setClase(claseB);
		procesoBean.setInstructor(instructorB);
		procesoBean.setAlumno(aspiranteB);
		return procesoBean;
	}


	@Override
	public List<ProcesoBean> getAllProceso() {
		List<ProcesoModel> procesoList = this.procesoRepo.findAll();
		List<ProcesoBean> procesoBeanList = new ArrayList<>();
		for(int i=0 ; i<procesoList.size(); i++) {
			AspiranteBean aspiranteB = new AspiranteBean();
			ProcesoBean procesoBean = new ProcesoBean();
			ClaseBean claseB = new ClaseBean();
			InstructorBean instructorB = new InstructorBean();
			aspiranteB.setIdAlumno(procesoList.get(i).getAlumno().getIdAlumno());
			claseB.setIdClase(procesoList.get(i).getClase().getIdClase());
			instructorB.setIdInstructor(procesoList.get(i).getInstructor().getIdInstructor());
			procesoBean.setEstatus(procesoList.get(i).getEstatus());
			procesoBean.setDescripcion(procesoList.get(i).getDescripcion());
			procesoBean.setFechaAlta(procesoList.get(i).getFechaAlta());
			procesoBean.setFechaFin(procesoList.get(i).getFechaFin());
			procesoBean.setClase(claseB);
			procesoBean.setInstructor(instructorB);
			procesoBean.setAlumno(aspiranteB);
			procesoBeanList.add(procesoBean);
		}
		return procesoBeanList;
	}

	@Override
	public boolean deleteProceso(int idProceso) {
		ProcesoModel proceso = this.procesoRepo.findById(idProceso).orElseThrow();
		proceso.setFechaFin(null);
		return true;
	}
}
