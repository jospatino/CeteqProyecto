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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_procesos")
public class ProcesoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3786913387399563446L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int idProceso;

	@Column(name = "estatus", nullable = false)
	private Short estatus;

	@Column(name = "descripcion_proceso", length = 150)
	private String descripcion;

	@Column(name = "fecha_alta")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaAlta;

	@Column(name = "fecha_fin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaFin;

	@ManyToOne
	@JoinColumn(name = "id_clase")
	private ClaseModel clase;

	@ManyToOne
	@JoinColumn(name = "id_instructor")
	private InstructorModel instructor;

	@OneToOne
	@JoinColumn(name = "id_alumno")
	private AspiranteModel alumno;

	public ProcesoModel() {
	}

	public ProcesoModel(int idProceso) {
		this.idProceso = idProceso;
	}

	public ProcesoModel(int idProceso, Short estatus, String descripcion, Date fechaAlta, Date fechaFin,
			ClaseModel clase, InstructorModel instructor, AspiranteModel alumno) {
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

	public ClaseModel getClase() {
		return clase;
	}

	public void setClase(ClaseModel clase) {
		this.clase = clase;
	}

	public InstructorModel getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorModel instructor) {
		this.instructor = instructor;
	}

	public AspiranteModel getAlumno() {
		return alumno;
	}

	public void setAlumno(AspiranteModel alumno) {
		this.alumno = alumno;
	}

}
