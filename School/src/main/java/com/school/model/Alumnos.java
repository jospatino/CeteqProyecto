package com.school.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Alumnos")
public class Alumnos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_Alumno")
	private Integer id;
	
	@Column (name = "nombre_alumno", nullable = false, length = 80)
	private String nombreAlumno;
	
	@Column (name = "apellido_paterno", nullable = false , length = 80)
	private String apPaterno;
	
	@Column (name = "apellido_materno", nullable = false , length = 80)
	private String apMaterno;
	
	@Column (name = "edad_alumno", nullable = false )
	private Integer edadAlumno;

	public Alumnos() {
	}

	public Alumnos(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public Integer getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(Integer edadAlumno) {
		this.edadAlumno = edadAlumno;
	}
	
	
	

}
