package com.school.bean;

import com.school.model.InformacionAlumnoModel;
import com.school.model.ProfesorModel;
import com.school.model.TutorModel;

public class AlumnoDetalleBean {
private Integer idAlumno;
	
	private String nombreAlumno;
	
	private String apPaterno;
	
	private String apMaterno;
	
	private Integer edadAlumno;
	
	private InformacionAlumnoModel iddetalle;
	
	private double calificacionAlumno;
	
	private TutorModel tutor;
	
	private ProfesorModel profesor;

	

	public TutorModel getTutor() {
		return tutor;
	}

	public void setTutor(TutorModel tutor) {
		this.tutor = tutor;
	}

	public ProfesorModel getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorModel profesor) {
		this.profesor = profesor;
	}

	public double getCalificacionAlumno() {
		return calificacionAlumno;
	}

	public void setCalificacionAlumno(double calificacionAlumno) {
		this.calificacionAlumno = calificacionAlumno;
	}

	public AlumnoDetalleBean() {
	}

	public AlumnoDetalleBean(Integer id) {
		this.idAlumno = id;
	}

	public Integer getId() {
		return idAlumno;
	}

	public void setId(Integer id) {
		this.idAlumno = id;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public Integer getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(Integer edadAlumno) {
		this.edadAlumno = edadAlumno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public InformacionAlumnoModel getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(InformacionAlumnoModel iddetalle) {
		this.iddetalle = iddetalle;
	}



}
