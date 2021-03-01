package com.banco.model;

import javax.persistence.*;

@Entity
@Table (name = "debito")

public class DebitoModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idDebito;
	
	@Column (name = "idCliente", nullable = false)
	private ClienteModel idCliente;
	
	@Column (name = "saldo", nullable = false)
	private DebitoModel saldo;
	
	@Column (name = "idCredito", nullable = false)
	private CreditoModel idCredito;

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

	public ClienteModel getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(ClienteModel idCliente) {
		this.idCliente = idCliente;
	}

	public DebitoModel getSaldo() {
		return saldo;
	}

	public void setSaldo(DebitoModel saldo) {
		this.saldo = saldo;
	}

	public CreditoModel getIdCredito() {
		return idCredito;
	}

	public void setIdCredito(CreditoModel idCredito) {
		this.idCredito = idCredito;
	}

	@Override
	public String toString() {
		return "DebitoModel [idDebito=" + idDebito + ", idCliente=" + idCliente + ", saldo=" + saldo + ", idCredito="
				+ idCredito + "]";
	}
	
	
	
	




}
	
	
	



