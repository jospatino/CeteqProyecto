package com.banco.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bean.CreditoBean;
import com.banco.model.ClienteModel;
import com.banco.model.CreditoModel;
import com.banco.repository.CreditoRepository;
import com.banco.service.CreditoService;


@Service
@Transactional
public class CreditoServiceImplement implements CreditoService  {

	@Autowired
	private CreditoRepository creditoRepo;
	
	
	
	@Override
	public Integer crearCredito(CreditoBean creditoNuevo) {
		
		CreditoModel creditoNuevoModel = new CreditoModel(); 
		
		creditoNuevoModel.setId_credito(creditoNuevo.getId_credito());
		creditoNuevoModel.setMonto_prestamo(creditoNuevo.getMonto_prestamo());
		creditoNuevoModel.setAdeudo_total(creditoNuevo.getAdeudo_total());
		
		creditoRepo.save(creditoNuevoModel);
		
		return creditoNuevoModel.getId_credito();
	}

	@Override
	public List<CreditoBean> listaCreditos() {
		List<CreditoModel> listacreditos = creditoRepo.findAll();
		List<CreditoBean> listacreditoBean = new ArrayList<CreditoBean>();
		
		for (CreditoModel creditoModel : listacreditos) {
			CreditoBean creditoBean = new CreditoBean();
			
			creditoBean.setId_credito(creditoModel.getId_credito());
			creditoBean.setMonto_prestamo(creditoModel.getMonto_prestamo());
			creditoBean.setAdeudo_total(creditoModel.getAdeudo_total());
			
			listacreditoBean.add(creditoBean);
		}
		
		return listacreditoBean;
	}
	

	@Override
	public CreditoBean creditoPorId(Integer idCredito) {
		CreditoModel creditomodel  = creditoRepo.findById(idCredito).orElseThrow(null);
		CreditoBean creditobean =  new CreditoBean();
		
		
		creditobean.setId_credito(creditomodel.getId_credito());
		creditobean.setMonto_prestamo(creditomodel.getMonto_prestamo());
		creditobean.setAdeudo_total(creditomodel.getAdeudo_total());
		
		return creditobean;
	}

	@Override
	public Boolean updateCredito(CreditoBean creditoBean) {
		
		CreditoModel creditoupgrade = new CreditoModel();
		
		creditoupgrade.setId_credito(creditoBean.getId_credito());
		creditoupgrade.setMonto_prestamo(creditoBean.getMonto_prestamo());
		creditoupgrade.setAdeudo_total(creditoBean.getAdeudo_total());

		creditoRepo.save(creditoupgrade);
		
		return true;
	}

	@Override
	public Boolean deleteCreditoById(Integer idCredito) {
		CreditoModel deleteCredito = creditoRepo.findById(idCredito).orElseThrow(null);
		creditoRepo.delete(deleteCredito);	
		
		return true;
	}

}
