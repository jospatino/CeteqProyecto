package com.school.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.ProfesorBean;
import com.school.model.ProfesorModel;
import com.school.repository.ProfesorRepository;
import com.school.service.ProfesorService;


@Service
@Transactional
public class ProfeServiceImpl implements ProfesorService {

	@Autowired
	public ProfesorRepository profeRepo;

	@Override
	public Integer saveProfesor(ProfesorBean ProfesorIngresado) {

		ProfesorModel profesorNuevo = new ProfesorModel();
		
		profesorNuevo.setNombreProfesor(ProfesorIngresado.getNombreProfesor());
		profesorNuevo.setAppProfesor(ProfesorIngresado.getAppProfesor());
		profesorNuevo.setApmProfesor(ProfesorIngresado.getApmProfesor());
		profesorNuevo.setId(ProfesorIngresado.getId());
		
		profeRepo.save(profesorNuevo);
		
		return profesorNuevo.getId();
	}

	@Override
	public List<ProfesorBean> Profesorlist() {
		List<ProfesorModel> profesorListModel = profeRepo.findAll();
		List<ProfesorBean> profesorListBean = new ArrayList<ProfesorBean>();
		
		
		for (ProfesorModel profesorModel : profesorListModel) {
			
			ProfesorBean profesorBean = new ProfesorBean();
			
			profesorBean.setNombreProfesor(profesorModel.getNombreProfesor());
			profesorBean.setAppProfesor(profesorModel.getAppProfesor());
			profesorBean.setApmProfesor(profesorModel.getApmProfesor());
			profesorBean.setId(profesorModel.getId());
			
			profesorListBean.add(profesorBean);
			
		}
		
		return profesorListBean;
	}

	@Override
	public ProfesorBean ProfesorbyId(Integer id_profesor) {
		ProfesorModel profesorById = profeRepo.findById(id_profesor).orElse(null);
		ProfesorBean profesorBean =  new ProfesorBean();
		
		profesorBean.setNombreProfesor(profesorById.getNombreProfesor());
		profesorBean.setAppProfesor(profesorById.getAppProfesor());
		profesorBean.setApmProfesor(profesorById.getApmProfesor());
		profesorBean.setId(profesorById.getId());
		
		
		
		return profesorBean;
	}

	
	@Override
	public boolean updateProfesor(ProfesorBean UpdateProfesor) {
		
		ProfesorModel profesor = profeRepo.findById(UpdateProfesor.getId()).orElseThrow(null);
		
		profesor.setNombreProfesor(UpdateProfesor.getNombreProfesor());
		profesor.setAppProfesor(UpdateProfesor.getAppProfesor());
		profesor.setApmProfesor(UpdateProfesor.getApmProfesor());
		
		profeRepo.save(profesor);
		
		
		return true;
	}

	@Override
	public boolean deleteProfesor(Integer id_profesor) {
		
		ProfesorModel profesorById = profeRepo.findById(id_profesor).orElse(null);
		
		profeRepo.delete(profesorById);
		
		
		return true;
	}

	
	


}
