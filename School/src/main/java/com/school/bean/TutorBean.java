package com.school.bean;

import java.util.List;

import com.school.model.Alumnos;

public class TutorBean {


	private Integer idTutor;
	
	private String nombreTutor;
	
	private String correo;
	
    private List<Alumnos> alumnoList;
	

	public TutorBean() {
	}

	public TutorBean(Integer id) {
		this.idTutor = id;
	}

	public Integer getId() {
		return idTutor;
	}

	public void setId(Integer id) {
		this.idTutor = id;
	}

	public String getNombreTutor() {
		return nombreTutor;
	}

	public void setNombreTutor(String nombreTutor) {
		this.nombreTutor = nombreTutor;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Alumnos> getAlumnoList() {
		return alumnoList;
	}

	public void setAlumnoList(List<Alumnos> alumnoList) {
		this.alumnoList = alumnoList;
	}
	
	
}
