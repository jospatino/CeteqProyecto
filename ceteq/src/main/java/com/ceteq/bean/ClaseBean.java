package com.ceteq.bean;

import java.io.Serializable;
import java.util.Date;

public class ClaseBean implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -4470089561339367010L;

	private int idClase;

	private String nombreClase;

	private Date fechaInicio;

	private Date fechaFin;

	private InstructorBean instructor;

	private ProcesoBean proceso;

	public ClaseBean(int idClase, String nombreClase, Date fechaInicio, Date fechaFin, InstructorBean instructor,
			ProcesoBean proceso) {
		super();
		this.idClase = idClase;
		this.nombreClase = nombreClase;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.instructor = instructor;
		this.proceso = proceso;
	}

	public ClaseBean() {
		super();
	}

	public int getIdClase() {
		return idClase;
	}

	public void setIdClase(int idClase) {
		this.idClase = idClase;
	}

	public String getNombreClase() {
		return nombreClase;
	}

	public void setNombreClase(String nombreClase) {
		this.nombreClase = nombreClase;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public InstructorBean getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorBean instructor) {
		this.instructor = instructor;
	}

	public ProcesoBean getProceso() {
		return proceso;
	}

	public void setProceso(ProcesoBean proceso) {
		this.proceso = proceso;
	}

	@Override
	public String toString() {
		return "ClaseModel [idClase=" + idClase + ", nombreClase=" + nombreClase + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", instructor=" + instructor + ", proceso=" + proceso + "]";
	}

}
