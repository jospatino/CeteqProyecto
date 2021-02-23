package com.school.bean;

import java.util.List;

import com.school.model.AlumnoModel;

public class TutorBean {


	private Integer idTutor;
	
	private String nombreTutor;
	
	private String correo;
	
    private List<AlumnoModel> alumnoList;
	

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

	public List<AlumnoModel> getAlumnoList() {
		return alumnoList;
	}

	public void setAlumnoList(List<AlumnoModel> alumnoList) {
		this.alumnoList = alumnoList;
	}
	
	
}
