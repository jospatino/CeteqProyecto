package com.ceteq.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_deudas")
public class DeudaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8080246570251530489L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_deuda")
	private int idDeuda;

	@Column(name = "deuda_total", nullable = false)
	private Double totalDeuda;

	@ManyToOne
	@JoinColumn(name = "fecha_asignacion")
	@Temporal(TemporalType.TIMESTAMP)
	private AsignacionModel fechaAsignacion;

	@Column(name = "fecha_liquidacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaLiquidacion;

	@Column(name = "liberacion", nullable = false)
	private Boolean liberado;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private AsignacionModel idAlumno;

	public DeudaModel(int idDeuda, Double totalDeuda, AsignacionModel fechaAsignacion, Date fechaLiquidacion,
			Boolean liberado, AsignacionModel idAlumno) {
		super();
		this.idDeuda = idDeuda;
		this.totalDeuda = totalDeuda;
		this.fechaAsignacion = fechaAsignacion;
		this.fechaLiquidacion = fechaLiquidacion;
		this.liberado = liberado;
		this.idAlumno = idAlumno;
	}

	public DeudaModel() {
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

	public AsignacionModel getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(AsignacionModel fechaAsignacion) {
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

	public AsignacionModel getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(AsignacionModel idAlumno) {
		this.idAlumno = idAlumno;
	}

}
