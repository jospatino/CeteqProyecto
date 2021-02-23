package com.school.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.school.bean.AlumnoBean;
import com.school.service.AlumnoService;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService {

	@Override
	public Integer saveAlumno(AlumnoBean alumnoBean) {
		
		return null;
	}

	@Override
	public List<AlumnoBean> list() {

		return null;
	}

	@Override
	public AlumnoBean findIdAlumno(Integer idAlumnos) {

		return null;
	}

	@Override
	public Boolean updateAlumno(AlumnoBean alumnosBean) {

		return null;
	}

	@Override
	public Boolean deleteById(Integer idAlumnos) {

		return null;
	}

}
