package com.school.bean;


public class ProfesorBean {
private Integer id;
	
	private String nombreProfesor;
	
	private String appProfesor;
	
	private String apmProfesor;

	public ProfesorBean() {
	}

	public ProfesorBean(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public String getAppProfesor() {
		return appProfesor;
	}

	public void setAppProfesor(String appProfesor) {
		this.appProfesor = appProfesor;
	}

	public String getApmProfesor() {
		return apmProfesor;
	}

	public void setApmProfesor(String apmProfesor) {
		this.apmProfesor = apmProfesor;
	}
	
	
	

}
