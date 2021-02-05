package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.ClaseBean;
import com.ceteq.sistema.model.ClaseModel;
import com.ceteq.sistema.model.InstructorModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.ClaseRepository;
import com.ceteq.sistema.service.ClaseService;

@Service
@Transactional
public class ClaseServiceImpl implements ClaseService {
	@Autowired
	private ClaseRepository claseRepo;

	@Override
	public boolean guardaClase(ClaseBean claseBean) {
		ClaseModel claseM = new ClaseModel();
		InstructorModel instructorM = new InstructorModel();
		ProcesoModel procesoM = new ProcesoModel();
		instructorM.setIdInstructor(claseBean.getInstructor());
		procesoM.setIdProceso(claseBean.getProceso());
		claseM.setNombreClase(claseBean.getNombreClase());
		claseM.setFechaInicio(claseBean.getFechaInicio());
		claseM.setFechaFin(claseBean.getFechaFin());
		claseM.setInstructor(instructorM);
		claseM.setProceso(procesoM);
		this.claseRepo.save(claseM);
		return true;
	}

	@Override
	public boolean actualizaClase(ClaseBean claseBean) {
		ClaseModel claseM = this.claseRepo.findById(claseBean.getIdClase()).orElseThrow();
		InstructorModel instructorM = new InstructorModel();
		ProcesoModel procesoM = new ProcesoModel();
		instructorM.setIdInstructor(claseBean.getInstructor());
		procesoM.setIdProceso(claseBean.getProceso());
		claseM.setNombreClase(claseBean.getNombreClase());
		claseM.setFechaInicio(claseBean.getFechaInicio());
		claseM.setFechaFin(claseBean.getFechaFin());
		claseM.setInstructor(instructorM);
		claseM.setProceso(procesoM);
		this.claseRepo.save(claseM);
		return true;
	}

	@Override
	public ClaseBean getClase(int idClase) {
		ClaseModel claseM = this.claseRepo.findById(idClase).orElseThrow();
		ClaseBean claseBean = new ClaseBean();
		claseBean.setIdClase(claseM.getIdClase());
		claseBean.setNombreClase(claseM.getNombreClase());
		claseBean.setFechaInicio(claseM.getFechaInicio());
		claseBean.setFechaFin(claseBean.getFechaFin());
		return claseBean;
	}

	@Override
	public List<ClaseBean> getAllClase() {
		List<ClaseModel> claseModelList = this.claseRepo.findAll();
		List<ClaseBean> claseBeanList = new ArrayList<>();
		for (ClaseModel claseModel : claseModelList) {
			ClaseBean claseBean = new ClaseBean();
			claseBean.setIdClase(claseModel.getIdClase());
			claseBean.setNombreClase(claseModel.getNombreClase());
			claseBean.setFechaInicio(claseModel.getFechaInicio());
			claseBean.setFechaFin(claseModel.getFechaFin());
			claseBeanList.add(claseBean);
		}
		return claseBeanList;
	}

	@Override
	public boolean deleteClase(int idClase) {
		ClaseModel clase = this.claseRepo.findById(idClase).orElseThrow();
		this.claseRepo.delete(clase);
		return true;
	}

}
