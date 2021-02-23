package com.school.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Tutor")
public class TutorModel {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column (name = "id_Tutor")
	private Integer idTutor;
	
	@Column (name = "nombre_tutor", nullable = false, length = 80)
	private String nombreTutor;
	
	@Column (name = "correo_tutor", nullable = true, length = 80)
	private String correo;
	
	@OneToMany(mappedBy = "tutor")
    private List<AlumnoModel> alumnoList;
	

	public TutorModel() {
	}

	public TutorModel(Integer id) {
		this.idTutor = id;
	}

	public Integer getId() {
		return idTutor;
	}

	public void setId(Integer id) {
		this.idTutor = id;
	}

	public String getNombreTutor() {
		return nombreTutor;
	}

	public void setNombreTutor(String nombreTutor) {
		this.nombreTutor = nombreTutor;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	

}
