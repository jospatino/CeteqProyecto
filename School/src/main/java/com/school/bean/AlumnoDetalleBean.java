package com.school.bean;

import com.school.model.InformacionAlumnoModel;

public class AlumnoDetalleBean {
private Integer idAlumno;
	
	private String nombreAlumno;
	
	private String apPaterno;
	
	private String apMaterno;
	
	private Integer edadAlumno;
	
	private InformacionAlumnoModel iddetalle;

	

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
