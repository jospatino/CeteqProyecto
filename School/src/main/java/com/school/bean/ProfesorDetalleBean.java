package com.school.bean;

import java.util.List;

public class ProfesorDetalleBean {

private String nombreProfesor;

private List<AlumnoBean> alumnoBean;

public ProfesorDetalleBean() {
}

public ProfesorDetalleBean(String nombreProfesor, List<AlumnoBean> alumnoBean) {
	this.nombreProfesor = nombreProfesor;
	this.alumnoBean = alumnoBean;
}

public String getNombreProfesor() {
	return nombreProfesor;
}

public void setNombreProfesor(String nombreProfesor) {
	this.nombreProfesor = nombreProfesor;
}

public List<AlumnoBean> getAlumnoBean() {
	return alumnoBean;
}

public void setAlumnoBean(List<AlumnoBean> alumnoBean) {
	this.alumnoBean = alumnoBean;
}




}
