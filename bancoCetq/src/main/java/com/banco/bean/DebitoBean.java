package com.banco.bean;

import java.io.Serializable;

public class DebitoBean implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

private Integer idDebito;

private Integer idCliente;

private double saldo;

private Integer idCredito;

public DebitoBean(Integer idDebito) {
	this.idDebito = idDebito;
}



public DebitoBean() {
}



public Integer getIdDebito() {
	return idDebito;
}

public void setIdDebito(Integer idDebito) {
	this.idDebito = idDebito;
}

public Integer getIdCliente() {
	return idCliente;
}

public void setIdCliente(Integer idCliente) {
	this.idCliente = idCliente;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public Integer getIdCredito() {
	return idCredito;
}

public void setIdCredito(Integer idCredito) {
	this.idCredito = idCredito;
}







}
