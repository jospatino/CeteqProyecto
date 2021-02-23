package com.school.bean;

import com.school.model.AlumnoModel;
import com.school.model.KardexModel;

public class InformacionAlumnoBean {

	private Integer iddetalle;
	
	private Integer semestre_Alumno; 
	
	private double deuda_alumno;
	
	private boolean beca_alumno;
	
	private double promedio_Alumno;

	private KardexModel idKardex;
	
    private AlumnoModel alumnos;
	
	public InformacionAlumnoBean() {
	}

	public InformacionAlumnoBean(Integer iddetalle) {
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

	public AlumnoModel getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(AlumnoModel alumnos) {
		this.alumnos = alumnos;
	}
	

}
