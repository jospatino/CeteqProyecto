package com.banco.service;

import java.util.List;

import com.banco.bean.CreditoBean;



public interface CreditoService {

	
	//create
		public Integer crearCredito(CreditoBean creditoNuevo);
		
		//read
		public List<CreditoBean> listaCreditos(); //muestra la lista
		public CreditoBean creditoPorId(Integer idCredito); //devuelve un alumno por id
		
		//update devuelve true si se actualizo
		public Boolean updateCredito(CreditoBean creditoBean);
		
		//delete por id
		public Boolean deleteCreditoById(Integer idCredito);
		
		

	
	
}
