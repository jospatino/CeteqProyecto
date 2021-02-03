package com.ceteq.bean;

import java.io.Serializable;
import java.util.Date;

public class ProcesoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3786913387399563446L;

	private int idProceso;

	private Boolean estatus;

	private String descripcion;

	private Date fechaAlta;

	private Date fechaFin;

	private ClaseBean clase;

	private InstructorBean instructor;

	private AspiranteBean alumno;

	public ProcesoBean() {
	}

	public ProcesoBean(int idProceso, Boolean estatus, String descripcion, Date fechaAlta, Date fechaFin,
			ClaseBean clase, InstructorBean instructor, AspiranteBean alumno) {
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

	public Boolean getEstatus() {
		return estatus;
	}

	public void setEstatus(Boolean estatus) {
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

	public ClaseBean getClase() {
		return clase;
	}

	public void setClase(ClaseBean clase) {
		this.clase = clase;
	}

	public InstructorBean getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorBean instructor) {
		this.instructor = instructor;
	}

	public AspiranteBean getAlumno() {
		return alumno;
	}

	public void setAlumno(AspiranteBean alumno) {
		this.alumno = alumno;
	}

}
