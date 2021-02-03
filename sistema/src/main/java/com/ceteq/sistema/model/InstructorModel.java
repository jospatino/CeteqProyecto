package com.ceteq.sistema.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_instructores")
public class InstructorModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3701313633844842465L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_instructor")
	private int idInstructor;

	@Column(name = "nombre_instructor", length = 50, nullable = false)
	private String nombre;

	@Column(name = "apellido_paterno", length = 50, nullable = false)
	private String ApP;

	@Column(name = "apellido_materno", length = 50, nullable = false)
	private String ApM;

	@Column(name = "edad", nullable = false)
	private int edad;

	@ManyToOne
	@JoinColumn(name = "id_clase")
	private ClaseModel clase;

	public InstructorModel(int idInstructor, String nombre, String apP, String apM, int edad, ClaseModel clase) {
		super();
		this.idInstructor = idInstructor;
		this.nombre = nombre;
		ApP = apP;
		ApM = apM;
		this.edad = edad;
		this.clase = clase;
	}

	public InstructorModel() {
	}

	public int getIdInstructor() {
		return idInstructor;
	}

	public void setIdInstructor(int idInstructor) {
		this.idInstructor = idInstructor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApP() {
		return ApP;
	}

	public void setApP(String apP) {
		ApP = apP;
	}

	public String getApM() {
		return ApM;
	}

	public void setApM(String apM) {
		ApM = apM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ClaseModel getClase() {
		return clase;
	}

	public void setClase(ClaseModel clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "InstructorModel [idInstructor=" + idInstructor + ", nombre=" + nombre + ", ApP=" + ApP + ", ApM=" + ApM
				+ ", edad=" + edad + ", clase=" + clase + "]";
	}

}
