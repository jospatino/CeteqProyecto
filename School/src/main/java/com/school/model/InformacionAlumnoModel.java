package com.school.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Informacion_Alumno")
public class InformacionAlumnoModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_detalle")
	private Integer iddetalle;
	
	@Column(name = "semestre_alumno", nullable = false, length = 100)
	private Integer semestre_Alumno; 
	
	@Column(name = "deuda_alumno", nullable = false, length = 100)
	private double deuda_alumno;
	
	@Column(name = "beca_alumno", nullable = false, length = 100)
	private boolean beca_alumno;
	
	@Column(name = "promedio_Alumno", nullable = false, length = 100)
	private double promedio_Alumno;

	@OneToOne
	@JoinColumn(name = "id_kardex")
	private KardexModel idKardex;
	
	@OneToOne(mappedBy="iddetalle")
    private AlumnoModel alumnos;
	
	public InformacionAlumnoModel() {
	}

	public InformacionAlumnoModel(Integer iddetalle) {
		this.iddetalle = iddetalle;
	}

	public Integer getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(Integer iddetalle) {
		this.iddetalle = iddetalle;
	}

	public Integer getSemestre_Alumno() {
		return semestre_Alumno;
	}

	public void setSemestre_Alumno(Integer semestre_Alumno) {
		this.semestre_Alumno = semestre_Alumno;
	}

	public double getDeuda_alumno() {
		return deuda_alumno;
	}

	public void setDeuda_alumno(double deuda_alumno) {
		this.deuda_alumno = deuda_alumno;
	}

	public boolean isBeca_alumno() {
		return beca_alumno;
	}

	public void setBeca_alumno(boolean beca_alumno) {
		this.beca_alumno = beca_alumno;
	}

	public double getPromedio_Alumno() {
		return promedio_Alumno;
	}

	public void setPromedio_Alumno(double promedio_Alumno) {
		this.promedio_Alumno = promedio_Alumno;
	}

	public KardexModel getIdKardex() {
		return idKardex;
	}

	public void setIdKardex(KardexModel idKardex) {
		this.idKardex = idKardex;
	}
	
	
	
	
}
