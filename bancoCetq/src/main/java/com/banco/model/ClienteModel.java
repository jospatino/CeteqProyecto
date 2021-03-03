package com.banco.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Tb_Cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id")
	private Integer idCliente;
	
	
	@Column ( name = "nombre_cliente", nullable = false, length = 80)
	private String nombreCliente;
	
	@Column ( name = "apellido_materno", nullable = false, length = 80)
	private String apPaterno;
	
	@Column ( name = "apellido_paterno", nullable = false, length = 80)
	private String apMaterno;
	
	@Column ( name = "edad", nullable = false)
	private Integer edad;
	
	@Column ( name = "email", nullable = false, length = 80)
	private String email;
	
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "id_credito")
	private CreditoModel creditoModel;
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn (name = "id_debito")
	private DebitoModel debitoModel;
	

	public ClienteModel() {
	}

	public ClienteModel(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public CreditoModel getCreditoModel() {
		return creditoModel;
	}

	public void setCreditoModel(CreditoModel creditoModel) {
		this.creditoModel = creditoModel;
	}

	public DebitoModel getDebitoModel() {
		return debitoModel;
	}

	public void setDebitoModel(DebitoModel debitoModel) {
		this.debitoModel = debitoModel;
	}
	
	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	
	
	

	
}
