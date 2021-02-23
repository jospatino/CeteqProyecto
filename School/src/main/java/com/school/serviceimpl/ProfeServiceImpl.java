package com.school.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.AlumnoBean;
import com.school.repository.ProfesorRepository;
import com.school.service.AlumnoService;

@Service
@Transactional
public class ProfeServiceImpl implements AlumnoService {

	@Autowired
	public ProfesorRepository profeRepo;
	
	@Override
	public Integer saveAlumno(AlumnoBean alumnoBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoBean> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AlumnoBean findIdAlumno(Integer idAlumnos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateAlumno(AlumnoBean alumnosBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteById(Integer idAlumnos) {
		// TODO Auto-generated method stub
		return null;
	}

}
