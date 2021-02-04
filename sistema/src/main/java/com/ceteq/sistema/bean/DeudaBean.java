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

	private Date fechaAsignacion;

	private Date fechaLiquidacion;

	private Boolean liberado;

	private Integer idAlumno;

	public DeudaBean(int idDeuda, Double totalDeuda, Date fechaAsignacion, Date fechaLiquidacion, Boolean liberado,
			Integer idAlumno) {
		this.idDeuda = idDeuda;
		this.totalDeuda = totalDeuda;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaLiquidacion = fechaLiquidacion;
		this.liberado = liberado;
		this.idAlumno = idAlumno;
	}

	public DeudaBean() {
	}

	public DeudaBean(int idDeuda) {
		this.idDeuda = idDeuda;
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

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
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

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

}
