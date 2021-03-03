package com.banco.service;

import java.util.List;

import com.banco.bean.ClienteBean;
import com.banco.model.ClienteModel;

public interface ClienteService {

	public Integer save (ClienteBean clienteBean);
	public List<ClienteBean> find();
	public ClienteBean findId (Integer idCliente);
	public ClienteModel update (ClienteBean clienteBean);
	public Boolean delete (Integer idCliente);
	public ClienteBean depositar ( Integer idCliente, double deposito);
	public ClienteBean abonarDeuda (Integer idCliente, double abono);
}
