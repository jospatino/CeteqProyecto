package com.ceteq.bean;

import java.io.Serializable;
import java.util.Date;

public class AsignacionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5845239681012323337L;

	private int idAsignacion;

	private ProcesoBean idAlumno;

	private String empresa;

	private Double sueldo;

	private DeudaBean Deuda;

	private Date fechaAsignacion;

	@Override
	public String toString() {
		return "AsignacionesModel [idAsignacion=" + idAsignacion + ", idAlumno=" + idAlumno + ", empresa=" + empresa
				+ ", sueldo=" + sueldo + ", Deuda=" + Deuda + ", fechaAsignacion=" + fechaAsignacion + "]";
	}

	public AsignacionBean() {
	}

	public int getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(int idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public ProcesoBean getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(ProcesoBean idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public DeudaBean getDeuda() {
		return Deuda;
	}

	public void setDeuda(DeudaBean deuda) {
		Deuda = deuda;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

}
