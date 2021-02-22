package com.school.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Kardex")
public class Kardex implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_kardex")
	private Integer idkardex;
	
	@Column(name = "año_kardex", nullable = false)
	private Integer año_kardex; 
	
	@Column(name = "calificacion_kardex", nullable = false)
	private double calificacion_kardex;
	
	@OneToOne(mappedBy="idkardex")
    private InformacionAlumno informacionalumno;

	public Kardex() {
	}

	public Kardex(Integer idkardex) {
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

	public InformacionAlumno getInformacionalumno() {
		return informacionalumno;
	}

	public void setInformacionalumno(InformacionAlumno informacionalumno) {
		this.informacionalumno = informacionalumno;
	} 
	
	
}
