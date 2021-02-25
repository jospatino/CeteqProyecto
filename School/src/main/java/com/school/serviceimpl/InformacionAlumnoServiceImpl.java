package com.school.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.school.bean.InformacionAlumnoBean;
import com.school.model.InformacionAlumnoModel;
import com.school.repository.InformacionAlumnoRepository;
import com.school.service.InformacionAlumnoService;

@Service
@Transactional
public class InformacionAlumnoServiceImpl implements InformacionAlumnoService {
@Autowired

private InformacionAlumnoRepository informacionalumnoRepo;

	@Override
	public boolean saveInformacionAlumno(InformacionAlumnoBean informacionalumnoBean) {
	InformacionAlumnoModel  informacionalumno = new InformacionAlumnoModel();
	informacionalumno.setSemestre_Alumno(informacionalumnoBean.getSemestre_Alumno());
	informacionalumno.setPromedio_Alumno(informacionalumnoBean.getPromedio_Alumno());
	informacionalumno.setDeuda_alumno(informacionalumnoBean.getDeuda_alumno());
	this.informacionalumnoRepo.save(informacionalumno);
	
		return true;
	}

	@Override
	public boolean updateInformacionAlumno(InformacionAlumnoBean informacionalumnoBean) {
		InformacionAlumnoModel informacionalumno = this.informacionalumnoRepo.findById(informacionalumnoBean.getIddetalle()).orElseThrow(null);
		informacionalumno.setSemestre_Alumno(informacionalumnoBean.getSemestre_Alumno());
		informacionalumno.setDeuda_alumno(informacionalumnoBean.getDeuda_alumno());
		informacionalumno.setPromedio_Alumno(informacionalumnoBean.getPromedio_Alumno());
		this.informacionalumnoRepo.save(informacionalumno);

		return true;
	}

	@Override
	public InformacionAlumnoBean getInformacionAlumno(int idInformacionAlumno) {
	InformacionAlumnoModel informacionalumno = this.informacionalumnoRepo.findById(idInformacionAlumno).orElseThrow(null);
	InformacionAlumnoBean informacionalumnoBean = new InformacionAlumnoBean();
	informacionalumnoBean.setIddetalle(informacionalumno.getIddetalle());
	informacionalumnoBean.setSemestre_Alumno(informacionalumno.getSemestre_Alumno());
	informacionalumnoBean.setPromedio_Alumno(informacionalumno.getPromedio_Alumno());
	informacionalumnoBean.setDeuda_alumno(informacionalumno.getDeuda_alumno());
	
	
	return informacionalumnoBean;
	
	}

	@Override
	public List<InformacionAlumnoBean> getAllInformacionAlumno() {
	List<InformacionAlumnoModel> informacionalumnoList = this.informacionalumnoRepo.findAll();
	List<InformacionAlumnoBean> informacionalumnoBeanList = new ArrayList<>();
	for(int i=0; i< informacionalumnoList.size(); i++) {
	InformacionAlumnoBean informacionalumnoBean = new InformacionAlumnoBean();
	informacionalumnoBean.setIddetalle(informacionalumnoList.get(i).getIddetalle());
	informacionalumnoBean.setSemestre_Alumno(informacionalumnoList.get(i).getSemestre_Alumno());
	informacionalumnoBean.setPromedio_Alumno(informacionalumnoList.get(i).getPromedio_Alumno());
	informacionalumnoBean.setDeuda_alumno(informacionalumnoList.get(i).getDeuda_alumno());
	informacionalumnoBeanList.add(informacionalumnoBean);
	
	}
	
	return informacionalumnoBeanList;
	
	}

	@Override
	public String deleteInformacionAlumno(int idInformacionAlumno) {
	
	InformacionAlumnoModel informacionalumno = this.informacionalumnoRepo.findById(idInformacionAlumno).orElseThrow(null);
	this.informacionalumnoRepo.deleteById(idInformacionAlumno);
	
		
	return "persona borrada";
	}
}
