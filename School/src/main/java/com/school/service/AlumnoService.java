package com.school.service;

import java.util.List;

import com.school.bean.AlumnoBean;


public interface AlumnoService {
	
	
	public Integer saveAlumno (AlumnoBean alumnoBean);
	public List<AlumnoBean> list ();
	public AlumnoBean findIdAlumno (Integer idAlumno);
	public Boolean updateAlumno (AlumnoBean alumnoBean);
	public Boolean deleteById (Integer idAlumno);

}
