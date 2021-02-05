package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.ProcesoBean;
import com.ceteq.sistema.model.AspiranteModel;
import com.ceteq.sistema.model.ClaseModel;
import com.ceteq.sistema.model.InstructorModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.ProcesoRepository;
import com.ceteq.sistema.service.ProcesoService;

@Service
@Transactional
public class ProcesoServiceImpl implements ProcesoService {
	@Autowired
	private ProcesoRepository procesoRepo;

	@Override
	public boolean crearProceso(ProcesoBean procesoBean) {
		ProcesoModel proceso = new ProcesoModel();
		AspiranteModel aspirante = new AspiranteModel();
		ClaseModel claseM = new ClaseModel();
		InstructorModel instructor = new InstructorModel();
		claseM.setIdClase(procesoBean.getClase());
		instructor.setIdInstructor(procesoBean.getInstructor());
		aspirante.setIdAlumno(procesoBean.getAlumno());
		proceso.setEstatus(procesoBean.getEstatus());
		proceso.setDescripcion(procesoBean.getDescripcion());
		proceso.setFechaAlta(procesoBean.getFechaAlta());
		proceso.setFechaFin(procesoBean.getFechaFin());
		proceso.setClase(claseM);
		proceso.setInstructor(instructor);
		proceso.setAlumno(aspirante);
		this.procesoRepo.save(proceso);
		return true;
	}

	@Override
	public boolean actualizaProceso(ProcesoBean procesoBean) {
		ProcesoModel proceso = this.procesoRepo.findById(procesoBean.getIdProceso()).orElseThrow();
		AspiranteModel aspirante = new AspiranteModel();
		ClaseModel claseM = new ClaseModel();
		InstructorModel instructor = new InstructorModel();
		claseM.setIdClase(procesoBean.getClase());
		instructor.setIdInstructor(procesoBean.getInstructor());
		aspirante.setIdAlumno(procesoBean.getAlumno());
		proceso.setEstatus(procesoBean.getEstatus());
		proceso.setDescripcion(procesoBean.getDescripcion());
		proceso.setFechaAlta(procesoBean.getFechaAlta());
		proceso.setFechaFin(procesoBean.getFechaFin());
		proceso.setClase(claseM);
		proceso.setInstructor(instructor);
		proceso.setAlumno(aspirante);
		this.procesoRepo.save(proceso);
		return true;
	}

	@Override
	public ProcesoBean getProceso(int idProceso) {
		ProcesoModel proceso = this.procesoRepo.findById(idProceso).orElseThrow();
		ProcesoBean procesoBean = new ProcesoBean();
		procesoBean.setIdProceso(proceso.getIdProceso());
		procesoBean.setDescripcion(proceso.getDescripcion());
		procesoBean.setEstatus(proceso.getEstatus());
		procesoBean.setFechaAlta(proceso.getFechaAlta());
		procesoBean.setFechaFin(proceso.getFechaFin());
		/*
		 * procesoBean.setAlumno(proceso.getAlumno().getIdAlumno());
		 * procesoBean.setClase(proceso.getClase().getIdClase());
		 * procesoBean.setInstructor(proceso.getInstructor().getIdInstructor());
		 */
		return procesoBean;
	}

	@Override
	public List<ProcesoBean> getAllProceso() {
		List<ProcesoModel> procesoList = this.procesoRepo.findAll();
		List<ProcesoBean> procesoBeanList = new ArrayList<>();
		for (ProcesoModel procesoM : procesoList) {
			ProcesoBean procesoBean = new ProcesoBean();
			procesoBean.setIdProceso(procesoM.getIdProceso());
			procesoBean.setDescripcion(procesoM.getDescripcion());
			procesoBean.setEstatus(procesoM.getEstatus());
			procesoBean.setFechaAlta(procesoM.getFechaAlta());
			procesoBean.setFechaFin(procesoM.getFechaFin());
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
