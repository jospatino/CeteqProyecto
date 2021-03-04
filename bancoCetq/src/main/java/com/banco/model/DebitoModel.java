package com.banco.model;

import javax.persistence.*;

@Entity
@Table (name = "debito")

public class DebitoModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idDebito;
	
	@Column (name = "saldo", nullable = false)
	private double saldo; 
	
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "id_credito")
	private CreditoModel creditoModel;
	
	@OneToOne (mappedBy = "debitoModel")
	private ClienteModel clienteModel;

	public DebitoModel() {
	
	}
	
	public DebitoModel(Integer idDebito) {
		
		this.idDebito = idDebito;
	}
	public Integer getIdDebito() {
		return idDebito;
	}

	public void setIdDebito(Integer idDebito) {
		
		this.idDebito = idDebito;
	}



	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public CreditoModel getCreditoModel() {
		return creditoModel;
	}

	public void setCreditoModel(CreditoModel creditoModel) {
		this.creditoModel = creditoModel;
	}

	public ClienteModel getClienteModel() {
		return clienteModel;
	}

	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}

	@Override
	public String toString() {
		return "DebitoModel [idDebito=" + idDebito + ", saldo=" + saldo ;
	}





}
	
	
	



