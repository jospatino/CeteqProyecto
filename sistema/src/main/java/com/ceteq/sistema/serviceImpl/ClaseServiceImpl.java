package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.ClaseBean;
import com.ceteq.sistema.bean.InstructorBean;
import com.ceteq.sistema.bean.ProcesoBean;
import com.ceteq.sistema.model.ClaseModel;
import com.ceteq.sistema.model.InstructorModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.ClaseRepository;
import com.ceteq.sistema.service.ClaseService;

@Service
@Transactional
public class ClaseServiceImpl implements ClaseService{
	@Autowired
	private ClaseRepository claseRepo;

	@Override
	public boolean guardaClase(ClaseBean claseBean) {
		ClaseModel claseM = new ClaseModel();
		InstructorModel instructor = new InstructorModel();
		ProcesoModel procesoModel = new ProcesoModel();
		instructor.setIdInstructor(claseBean.getInstructor().getIdInstructor());
		instructor.setApM(claseBean.getInstructor().getApP());
		instructor.setApM(claseBean.getInstructor().getApM());
		instructor.setEdad(claseBean.getInstructor().getEdad());
		instructor.setNombre(claseBean.getInstructor().getNombre());
		procesoModel.setIdProceso(claseBean.getProceso().getIdProceso());
		claseM.setNombreClase(claseBean.getNombreClase());
		claseM.setFechaInicio(claseBean.getFechaInicio());
		claseM.setFechaFin(claseBean.getFechaFin());
		claseM.setInstructor(instructor);
		claseM.setProceso(procesoModel);
		this.claseRepo.save(claseM);
		return true;
	}

	@Override
	public boolean actualizaClase(ClaseBean claseBean) {
		ClaseModel claseM = this.claseRepo.findById(claseBean.getIdClase()).orElseThrow();
		claseM.setNombreClase(claseBean.getNombreClase());
		InstructorModel instructor = new InstructorModel();
		ProcesoModel procesoModel = new ProcesoModel();
		procesoModel.setIdProceso(claseBean.getProceso().getIdProceso());
		instructor.setIdInstructor(claseBean.getInstructor().getIdInstructor());
		claseM.setFechaInicio(claseBean.getFechaInicio());
		claseM.setFechaFin(claseBean.getFechaFin());
		claseM.setInstructor(instructor);
		claseM.setProceso(procesoModel);
		this.claseRepo.save(claseM);
		return true;
	}

	@Override
	public ClaseBean getClase(int idClase) {
		ClaseModel claseM = this.claseRepo.findById(idClase).orElseThrow();
		ClaseBean claseBean = new ClaseBean();
		InstructorBean instructorB = new InstructorBean();
		ProcesoBean procesoBean = new ProcesoBean();
		procesoBean.setIdProceso(claseM.getProceso().getIdProceso());
		instructorB.setIdInstructor(claseM.getInstructor().getIdInstructor());
		claseBean.setIdClase(idClase);
		claseBean.setNombreClase(claseM.getNombreClase());
		claseBean.setFechaInicio(claseM.getFechaInicio());
		claseBean.setFechaFin(claseM.getFechaFin());
		claseBean.setInstructor(instructorB);
		claseBean.setProceso(procesoBean);
		return claseBean;
	}

	@Override
	public List<ClaseBean> getAllClase() {
		List<ClaseModel> claseModelList = this.claseRepo.findAll();
		List<ClaseBean> claseBeanList = new ArrayList<>();
		for(int i=0;i<claseModelList.size(); i++) {
			ClaseBean claseBean = new ClaseBean();
			InstructorBean instructorB = new InstructorBean();
			ProcesoBean procesoBean = new ProcesoBean();
			procesoBean.setIdProceso(claseModelList.get(i).getProceso().getIdProceso());
			instructorB.setIdInstructor(claseModelList.get(i).getInstructor().getIdInstructor());
			claseBean.setIdClase(claseModelList.get(i).getIdClase());
			claseBean.setNombreClase(claseModelList.get(i).getNombreClase());
			claseBean.setFechaInicio(claseModelList.get(i).getFechaInicio());
			claseBean.setFechaFin(claseModelList.get(i).getFechaFin());
			claseBean.setInstructor(instructorB);
			claseBean.setProceso(procesoBean);
			claseBeanList.add(claseBean);
		}
		return claseBeanList;
	}

	@Override
	public boolean deleteClase(int idClase) {
		ClaseModel clase = this.claseRepo.findById(idClase).orElseThrow();
		clase.setFechaFin(null);
		return true;
	}
	

}
