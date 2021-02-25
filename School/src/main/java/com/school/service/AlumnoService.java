package com.school.service;

import java.util.List;

import com.school.bean.AlumnoBean;
import com.school.bean.AlumnoDetalleBean;
import com.school.bean.ProfesorDetalleBean;


public interface AlumnoService {
	
	
	public Integer saveAlumno (AlumnoBean alumnoBean);
	public List<AlumnoBean> list ();
	public List<AlumnoBean> listaReprobados ();
	public List<AlumnoDetalleBean> listaCalificaciones ();
	public AlumnoDetalleBean alumnoTutor (Integer id);
	public List<AlumnoBean> listaDeudores ();
	public AlumnoDetalleBean AlumnoProfesor (Integer id);
	public ProfesorDetalleBean AlumnoProfeId (Integer idProfesor);
	public List<AlumnoDetalleBean> listaAlumnoBeca ();
	public List<AlumnoBean> listaAlumnoDerechoExamen ();
	public AlumnoBean findIdAlumno (Integer idAlumno);
	public Boolean updateAlumno (AlumnoBean alumnoBean);
	public Boolean deleteById (Integer idAlumno);

}
