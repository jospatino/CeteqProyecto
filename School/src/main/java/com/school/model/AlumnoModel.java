package com.school.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Alumnos")
public class AlumnoModel {
		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_Alumno")
	private Integer idAlumno;
	
	@Column (name = "nombre_alumno")
	private String nombreAlumno;
	
	@Column (name = "apellido_paterno")
	private String apPaterno;
	
	@Column (name = "apellido_materno")
	private String apMaterno;
	
	@Column (name = "edad_alumno")
	private Integer edadAlumno;
	
	
	
	
	
	public ProfesorModel getProfesor() {
		return profesor;
	}

	public void setProfesor(ProfesorModel profesor) {
		this.profesor = profesor;
	}

	public TutorModel getTutor() {
		return tutor;
	}

	public void setTutor(TutorModel tutor) {
		this.tutor = tutor;
	}

	@ManyToOne
	@JoinColumn (name = "id_profesor")
	private ProfesorModel profesor;
	
	@ManyToOne
	@JoinColumn (name = "id_tutor")
	private TutorModel tutor;

	@OneToOne
	@JoinColumn(name = "id_detalle")
	private InformacionAlumnoModel iddetalle;
	
	public AlumnoModel() {
	}

	public AlumnoModel(Integer id) {
		this.idAlumno = id;
	}

	public Integer getId() {
		return idAlumno;
	}

	public void setId(Integer id) {
		this.idAlumno = id;
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

	public InformacionAlumnoModel getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(InformacionAlumnoModel iddetalle) {
		this.iddetalle = iddetalle;
	}

	public Integer getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(Integer edadAlumno) {
		this.edadAlumno = edadAlumno;
	}
	
	
	

}
