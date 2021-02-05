package com.ceteq.sistema.bean;

import java.io.Serializable;

public class InstructorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4877127589487249950L;

	/**
	 * 
	 */

	private int idInstructor;

	private String nombre;

	private String ApP;

	private String ApM;

	private int edad;

	private Integer clase;

	public InstructorBean(int idInstructor, String nombre, String apP, String apM, int edad, Integer clase) {
		this.idInstructor = idInstructor;
		this.nombre = nombre;
		ApP = apP;
		ApM = apM;
		this.edad = edad;
		this.clase = clase;
	}

	public InstructorBean() {
	}

	public InstructorBean(int idInstructor) {
		super();
		this.idInstructor = idInstructor;
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

	public Integer getClase() {
		return clase;
	}

	public void setClase(Integer clase) {
		this.clase = clase;
	}

}
