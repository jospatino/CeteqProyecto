package com.banco.model;

import javax.persistence.*;

@Entity
@Table (name = "credito")
public class CreditoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id_credito;
	
	@Column(name = "monto_prestamo", nullable = false)
	private double monto_prestamo;
	
	@Column(name = "adeudo_total", nullable = false)
	private double adeudo_total;
	
	
	@OneToOne (mappedBy = "creditoModel")
	private DebitoModel debitoModel;
	
	@OneToOne (mappedBy = "creditoModel")
	private ClienteModel clienteModel;
	
	
	
	public CreditoModel() {

	}



	public CreditoModel(Integer id_credito) {
		this.id_credito = id_credito;
	
	}

	
	public Integer getId_credito() {
		return id_credito;
	}



	public void setId_credito(Integer id_credito) {
		this.id_credito = id_credito;
	}



	public double getMonto_prestamo() {
		return monto_prestamo;
	}



	public void setMonto_prestamo(double monto_prestamo) {
		this.monto_prestamo = monto_prestamo;
	}



	public double getAdeudo_total() {
		return adeudo_total;
	}



	public void setAdeudo_total(double adeudo_total) {
		this.adeudo_total = adeudo_total;
	}



	public DebitoModel getDebitoModel() {
		return debitoModel;
	}



	public void setDebitoModel(DebitoModel debitoModel) {
		this.debitoModel = debitoModel;
	}



	public ClienteModel getClienteModel() {
		return clienteModel;
	}



	public void setClienteModel(ClienteModel clienteModel) {
		this.clienteModel = clienteModel;
	}



	
	
	
	
}
