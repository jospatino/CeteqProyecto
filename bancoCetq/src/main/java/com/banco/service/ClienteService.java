package com.banco.service;

import java.util.List;

import com.banco.bean.ClienteBean;

public interface ClienteService {

	public Integer save (ClienteBean clienteBean);
	public List<ClienteBean> find();
	public ClienteBean findId (Integer idCliente);
	public Boolean update (ClienteBean clienteBean);
	public Boolean deleteById (Integer idCliente);
	public ClienteBean depositar ( Integer idCliente, double deposito);
	public ClienteBean abonarDeuda (Integer idCliente, double abono);
}
