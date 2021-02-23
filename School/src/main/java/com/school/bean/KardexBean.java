package com.school.bean;

import com.school.model.InformacionAlumnoModel;

public class KardexBean {
	
	

	private Integer idkardex;
	
	private Integer año_kardex; 
	
	private double calificacion_kardex;
	
    private InformacionAlumnoModel informacionalumno;

	public KardexBean() {
	}

	public KardexBean(Integer idkardex) {
		this.idkardex = idkardex;
	}

	public Integer getIdkardex() {
		return idkardex;
	}

	public void setIdkardex(Integer idkardex) {
		this.idkardex = idkardex;
	}

	public Integer getAño_kardex() {
		return año_kardex;
	}

	public void setAño_kardex(Integer año_kardex) {
		this.año_kardex = año_kardex;
	}

	public double getCalificacion_kardex() {
		return calificacion_kardex;
	}

	public void setCalificacion_kardex(double calificacion_kardex) {
		this.calificacion_kardex = calificacion_kardex;
	}

	public InformacionAlumnoModel getInformacionalumno() {
		return informacionalumno;
	}

	public void setInformacionalumno(InformacionAlumnoModel informacionalumno) {
		this.informacionalumno = informacionalumno;
	} 
}
