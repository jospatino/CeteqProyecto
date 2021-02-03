package com.ceteq.sistema.bean;

import java.io.Serializable;
import java.util.Date;

public class DeudaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8080246570251530489L;

	private int idDeuda;

	private Double totalDeuda;

	private AsignacionBean fechaAsignacion;

	private Date fechaLiquidacion;

	private Boolean liberado;

	private AsignacionBean idAlumno;

	public DeudaBean(int idDeuda, Double totalDeuda, AsignacionBean fechaAsignacion, Date fechaLiquidacion,
			Boolean liberado, AsignacionBean idAlumno) {
		super();
		this.idDeuda = idDeuda;
		this.totalDeuda = totalDeuda;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaLiquidacion = fechaLiquidacion;
		this.liberado = liberado;
		this.idAlumno = idAlumno;
	}

	public DeudaBean(int idDeuda) {
		this.idDeuda = idDeuda;
	}

	public DeudaBean() {
		super();
	}

	@Override
	public String toString() {
		return "DeudaModel [idDeuda=" + idDeuda + ", totalDeuda=" + totalDeuda + ", fechaAsignacion=" + fechaAsignacion
				+ ", fechaLiquidacion=" + fechaLiquidacion + ", liberado=" + liberado + ", asignacionModel=" + idAlumno
				+ "]";
	}

	public int getIdDeuda() {
		return idDeuda;
	}

	public void setIdDeuda(int idDeuda) {
		this.idDeuda = idDeuda;
	}

	public Double getTotalDeuda() {
		return totalDeuda;
	}

	public void setTotalDeuda(Double totalDeuda) {
		this.totalDeuda = totalDeuda;
	}

	public AsignacionBean getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(AsignacionBean fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	public void setFechaLiquidacion(Date fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}

	public Boolean getLiberado() {
		return liberado;
	}

	public void setLiberado(Boolean liberado) {
		this.liberado = liberado;
	}

	public AsignacionBean getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(AsignacionBean idAlumno) {
		this.idAlumno = idAlumno;
	}

}
