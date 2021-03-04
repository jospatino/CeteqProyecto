package com.banco.bean;

public class ClienteAuxBean {

	private Integer idCliente;
	private String  nombreCliente;
	private String apPaterno;
	private String apMaterno;
	private String Email;
	private double saldo;
	private double adeudo_total;
	
	
	public ClienteAuxBean() {
	}

	public ClienteAuxBean(Integer idCliente) {
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
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public double getAdeudo_total() {
		return adeudo_total;
	}

	public void setAdeudo_total(double adeudo_total) {
		this.adeudo_total = adeudo_total;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}