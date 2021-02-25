package com.school.service;

import java.util.List;

import com.school.bean.AlumnoBean;
import com.school.bean.AlumnoDetalleBean;


public interface AlumnoService {
	
	
	public Integer saveAlumno (AlumnoBean alumnoBean);
	public List<AlumnoBean> list ();
	public List<AlumnoBean> listaReprobados ();
	public List<AlumnoDetalleBean> listaCalificaciones ();
	public List<AlumnoBean> listaAlumnoTutor ();
	public List<AlumnoBean> listaDeudores ();
	public List<AlumnoBean> listaAlumnoProfesor ();
	public List<AlumnoBean> listaAlumnoProfeId (Integer idProfesor);
	public List<AlumnoBean> listaAlumnoBeca (double promedio_Alumno);
	public List<AlumnoBean> listaAlumnoDerechoExamen ();
	public AlumnoBean findIdAlumno (Integer idAlumno);
	public Boolean updateAlumno (AlumnoBean alumnoBean);
	public Boolean deleteById (Integer idAlumno);

}
