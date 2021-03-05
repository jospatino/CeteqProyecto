package com.banco.service;

import java.util.List;

import com.banco.bean.ClienteAuxBean;
import com.banco.bean.ClienteBean;

public interface ClienteService {

	public Integer save (ClienteBean clienteBean);
	public List<ClienteBean> find();
	public ClienteBean findId (Integer idCliente);
	public Boolean update (ClienteBean clienteBean);
	public Boolean deleteById (Integer idCliente);
	public ClienteAuxBean depositar ( Integer idCliente, double deposito);
	public ClienteAuxBean abonarDeuda (Integer idCliente, double abono);
	public ClienteAuxBean retiro (Integer idCliente, double retirar);
	public List<ClienteAuxBean> clientesDeudas();
	public Boolean eligibilidadPrestamo(Integer idCliente);
	public List<ClienteAuxBean> clienteSelecto();
	public Boolean upgradecliente(Integer idCliente);
	public ClienteAuxBean saldoUsuario (Integer idCliente);
	public Boolean transferirCliente (Integer idEmisor, Integer idReceptor, double monto);
	
}
