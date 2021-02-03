package com.ceteq.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

@Entity
@Table(name = "tb_aspirantes")
public class AspiranteModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3164690712079028588L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno")
	private int idAlumno;

	@Column(name = "nombre", length = 50, nullable = false)
	private String nombre;

	@Column(name = "apellido_paterno", length = 50, nullable = false)
	private String apP;

	@Column(name = "apellido_materno", length = 50, nullable = false)
	private String apM;

	@Column(name = "edad", nullable = false)
	private int edad;

	@Column(name = "direccion", length = 150, nullable = false)
	private String direccion;

	@Column(name = "ciudad", length = 50, nullable = false)
	private String ciudad;

	@Column(name = "telefono", length = 50, nullable = false)
	private String telefono;

	@Column(name = "correo", length = 50, nullable = false, unique = true)
	private String correo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_registro", length = 50, nullable = false)
	private Date fechaRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_baja", length = 50)
	private Date fechaBaja;

	public AspiranteModel() {
	}

	public AspiranteModel(int idAlumno, String nombre, String apP, String apM, int edad, String direccion,
			String ciudad, String telefono, String correo, Date fechaRegistro, Date fechaBaja) {
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
