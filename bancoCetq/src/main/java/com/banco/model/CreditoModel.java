package com.banco.model;

import javax.persistence.*;

@Entity
@Table (name = "credito")
public class CreditoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id_credito;
	
	@Column(name = "monto_prestamo")
	private double monto_prestamo;
	
	@Column(name = "adeudo_total")
	private double adeudo_total;
	
	@Column(name = "id_cliente")
	private ClienteModel id_cliente;
	
	@Column(name = "id_debito")
	private DebitoModel id_debito;
	
	
	
	public CreditoModel() {
		// TODO Auto-generated constructor stub
	}



	public CreditoModel(Integer id_credito, double monto_prestamo, double adeudo_total, ClienteModel id_cliente,
			DebitoModel id_debito) {
		this.id_credito = id_credito;
		this.monto_prestamo = monto_prestamo;
		this.adeudo_total = adeudo_total;
		this.id_cliente = id_cliente;
		this.id_debito = id_debito;
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



	public ClienteModel getId_cliente() {
		return id_cliente;
	}



	public void setId_cliente(ClienteModel id_cliente) {
		this.id_cliente = id_cliente;
	}



	public DebitoModel getId_debito() {
		return id_debito;
	}



	public void setId_debito(DebitoModel id_debito) {
		this.id_debito = id_debito;
	}



	@Override
	public String toString() {
		return "CreditoModel [id_credito=" + id_credito + ", monto_prestamo=" + monto_prestamo + ", adeudo_total="
				+ adeudo_total + ", id_cliente=" + id_cliente + "]";
	}
	
	
	
	
	
	
	
}
