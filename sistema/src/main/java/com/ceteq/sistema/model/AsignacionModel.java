package com.ceteq.sistema.model;

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
@Table(name = "tb_asignaciones")
public class AsignacionModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5845239681012323337L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_asignacion")
	private int idAsignacion;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private ProcesoModel idAlumno;

	@Column(name = "empresa", length = 50, nullable = false)
	private String empresa;

	@Column(name = "sueldo", nullable = false)
	private Double sueldo;

	@ManyToOne
	@JoinColumn(name = "deuda")
	private DeudaModel Deuda;

	@Column(name = "fecha_asignacion", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAsignacion;

	@Override
	public String toString() {
		return "AsignacionesModel [idAsignacion=" + idAsignacion + ", idAlumno=" + idAlumno + ", empresa=" + empresa
				+ ", sueldo=" + sueldo + ", Deuda=" + Deuda + ", fechaAsignacion=" + fechaAsignacion + "]";
	}

	public AsignacionModel() {
	}

	public AsignacionModel(int idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public AsignacionModel(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public int getIdAsignacion() {
		return idAsignacion;
	}

	public void setIdAsignacion(int idAsignacion) {
		this.idAsignacion = idAsignacion;
	}

	public ProcesoModel getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(ProcesoModel idAlumno) {
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

	public DeudaModel getDeuda() {
		return Deuda;
	}

	public void setDeuda(DeudaModel deuda) {
		Deuda = deuda;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

}
