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
@Table(name = "tb_clases")
public class ClaseModel implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -4470089561339367010L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clase")
	private int idClase;

	@Column(name = "nombre_clase", length = 50, nullable = false)
	private String nombreClase;

	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;

	@Column(name = "fecha_fin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFin;

	@ManyToOne
	@JoinColumn(name = "id_instructor")
	private InstructorModel instructor;

	@ManyToOne
	@JoinColumn(name = "id_alumno")
	private ProcesoModel proceso;

	public ClaseModel(int idClase, String nombreClase, Date fechaInicio, Date fechaFin, InstructorModel instructor,
			ProcesoModel proceso) {
		super();
		this.idClase = idClase;
		this.nombreClase = nombreClase;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.instructor = instructor;
		this.proceso = proceso;
	}

	public ClaseModel() {
	}

	public ClaseModel(int idClase) {
		this.idClase = idClase;
	}
	
	public ClaseModel(int id) {
		this.idClase = id;
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

	public InstructorModel getInstructor() {
		return this.instructor;
	}

	public void setInstructor(InstructorModel instructor) {
		this.instructor = instructor;
	}

	public ProcesoModel getProceso() {
		return this.proceso;
	}

	public void setProceso(ProcesoModel proceso) {
		this.proceso = proceso;
	}

	@Override
	public String toString() {
		return "ClaseModel [idClase=" + idClase + ", nombreClase=" + nombreClase + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", instructor=" + instructor + ", proceso=" + proceso + "]";
	}

}
