package com.banco.bean;


public class CreditoBean {

	
	private Integer id_credito;
	private double monto_prestamo;
	private double adeudo_total;
	
	
	
	
	public CreditoBean() {
		// TODO Auto-generated constructor stub
	}



	public CreditoBean(Integer id_credito, double monto_prestamo, double adeudo_total) {
		this.id_credito = id_credito;
		this.monto_prestamo = monto_prestamo;
		this.adeudo_total = adeudo_total;
		
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



	



	@Override
	public String toString() {
		return "CreditoModel [id_credito=" + id_credito + ", monto_prestamo=" + monto_prestamo + ", adeudo_total="
				+ adeudo_total  + "]";
	}
	
	
	
	
	
	
	
}
