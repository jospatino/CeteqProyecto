package com.ceteq.sistema.bean;

import java.io.Serializable;
import java.util.Date;

public class ProcesoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3786913387399563446L;

	private int idProceso;

	private Short estatus;

	private String descripcion;

	private Date fechaAlta;

	private Date fechaFin;

	private int clase;

	private int instructor;

	private int alumno;

	public ProcesoBean() {
	}

<<<<<<< HEAD
	public ProcesoBean(int idProceso, Short estatus, String descripcion, Date fechaAlta, Date fechaFin,
			ClaseBean clase, InstructorBean instructor, AspiranteBean alumno) {
=======
	public ProcesoBean(int idProceso, Boolean estatus, String descripcion, Date fechaAlta, Date fechaFin,
			int clase, int instructor, int alumno) {
>>>>>>> 9e1987ea81357183364a4a60965c0dedf5de75eb
		super();
		this.idProceso = idProceso;
		this.estatus = estatus;
		this.descripcion = descripcion;
		this.fechaAlta = fechaAlta;
		this.fechaFin = fechaFin;
		this.clase = clase;
		this.instructor = instructor;
		this.alumno = alumno;
	}

	public int getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(int idProceso) {
		this.idProceso = idProceso;
	}

	public Short getEstatus() {
		return estatus;
	}

	public void setEstatus(Short estatus) {
		this.estatus = estatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getClase() {
		return this.clase ;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public int getInstructor() {
		return this.instructor;
	}

	public void setInstructor(int instructor) {
		this.instructor = instructor;
	}

	public int getAlumno() {
		return this.alumno;
	}

	public void setAlumno(int alumno) {
		this.alumno = alumno;
	}

}
