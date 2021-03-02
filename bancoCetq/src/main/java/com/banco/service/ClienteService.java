package com.banco.service;

import java.util.List;

import com.banco.bean.ClienteBean;

public interface ClienteService {

	public Integer save (ClienteBean clienteBean);
	public List<ClienteBean> find();
	public ClienteBean findId (Integer idCliente);
	public Boolean update (ClienteBean clienteBean);
	public Boolean delete (Integer idCliente);
}
