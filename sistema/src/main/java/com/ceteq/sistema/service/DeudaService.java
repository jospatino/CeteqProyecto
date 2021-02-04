package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.DeudaBean;

public interface DeudaService {

	public String CreateDeuda(DeudaBean deudaBean);

	public DeudaBean findByID(Integer id);

	List<DeudaBean> findAll();

	public Boolean updateDeuda(DeudaBean bean);

	public Boolean deleteDeuda(Integer id);

}
