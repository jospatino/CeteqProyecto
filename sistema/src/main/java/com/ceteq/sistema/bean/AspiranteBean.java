package com.ceteq.sistema.bean;

import java.util.Date;

public class AspiranteBean {

	private int idAlumno;

	private String nombre;

	private String apP;

	private String apM;

	private int edad;

	private String direccion;

	private String ciudad;

	private String telefono;

	private String correo;

	private Date fechaRegistro;

	private Date fechaBaja;

	public AspiranteBean() {
	}

	public AspiranteBean(int idAlumno, String nombre, String apP, String apM, int edad, String direccion, String ciudad,
			String telefono, String correo, Date fechaRegistro, Date fechaBaja) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apP = apP;
		this.apM = apM;
		this.edad = edad;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.correo = correo;
		this.fechaRegistro = fechaRegistro;
		this.fechaBaja = fechaBaja;
	}

	@Override
	public String toString() {
		return "aspiranteModel [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apP=" + apP + ", apM=" + apM
				+ ", edad=" + edad + ", direccion=" + direccion + ", ciudad=" + ciudad + ", telefono=" + telefono
				+ ", correo=" + correo + ", fechaRegistro=" + fechaRegistro + ", fechaBaja=" + fechaBaja + "]";
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApP() {
		return apP;
	}

	public void setApP(String apP) {
		this.apP = apP;
	}

	public String getApM() {
		return apM;
	}

	public void setApM(String apM) {
		this.apM = apM;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

}
