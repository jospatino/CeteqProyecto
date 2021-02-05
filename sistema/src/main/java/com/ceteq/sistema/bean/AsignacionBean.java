package com.ceteq.sistema.bean;

import java.io.Serializable;
import java.util.Date;

public class AsignacionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5845239681012323337L;

	private int idAsignacion;

	private Integer idAlumno;

	private String empresa;

	private Double sueldo;

	private Integer DeudaId;

	private Date fechaAsignacion;

	public AsignacionBean() {
	}

	public AsignacionBean(int idAsignacion) {
		super();
		this.idAsignacion = idAsignacion;
	}

	public AsignacionBean(int idAsignacion, Integer idAlumno, String empresa, Double sueldo, Integer deudaId,
			Date fechaAsignacion) {
		super();
		this.idAsignacion = idAsignacion;
		this.idAlumno = idAlumno;
		this.empresa = empresa;
		this.sueldo = sueldo;
		DeudaId = deudaId;
		this.fechaAsignacion = fechaAsignacion;
	}

	public int getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(int idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
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

	public Integer getDeudaId() {
		return DeudaId;
	}

	public void setDeudaId(Integer deudaId) {
		DeudaId = deudaId;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

}
