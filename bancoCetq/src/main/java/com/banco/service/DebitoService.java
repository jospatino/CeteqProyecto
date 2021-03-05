package com.banco.service;

import java.util.List;

import com.banco.bean.DebitoBean;


public interface DebitoService  {
	
	public Integer save (DebitoBean debitoclienteBean);
	public List<DebitoBean> find();
	public DebitoBean findId (Integer idDebito);
	public Boolean update (DebitoBean debitoBean);
	public Boolean deleteById (Integer idDebito);

}
