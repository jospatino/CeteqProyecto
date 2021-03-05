package com.banco.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bean.DebitoBean;
import com.banco.model.DebitoModel;
import com.banco.repository.DebitoRepository;
import com.banco.service.DebitoService;

@Transactional
@Service
public class DebitoServiceImpl implements DebitoService {
@Autowired
private DebitoRepository debitoRepo;
	
	@Override
	public Integer save(DebitoBean debitoBean) {
		DebitoModel debito = new DebitoModel();
		debito.setSaldo(debitoBean.getSaldo());
		debitoRepo.save(debito);
		
		return debito.getIdDebito();
	}

	@Override
	public List<DebitoBean> find() {

		List <DebitoModel>debitoList = debitoRepo.findAll();
		List <DebitoBean>debitoBeanList = new ArrayList<DebitoBean>();
		
		for(DebitoModel debito : debitoList) {
			DebitoBean debitoBean = new DebitoBean();
		
			debitoBean.setIdCliente(debito.getClienteModel().getIdCliente());
			debitoBean.setIdDebito(debito.getIdDebito());
	        debitoBean.setIdCredito(debito.getCreditoModel().getId_credito());
			debitoBean.setIdDebito(debito.getIdDebito());
			debitoBean.setSaldo((long) debito.getSaldo());
			
			debitoBeanList.add(debitoBean);
			
			
		}
		return debitoBeanList;
	}

	@Override
	public DebitoBean findId(Integer idDebito) {

		DebitoModel debito = debitoRepo.findById(idDebito).orElseThrow(null);
        DebitoBean debitoBean = new DebitoBean();
		
        
        debitoBean.setIdDebito(debito.getIdDebito());
        debitoBean.setIdCredito(debito.getCreditoModel().getId_credito());
		debitoBean.setIdCliente(idDebito);
		debitoBean.setSaldo((long) debito.getSaldo());
		
		return debitoBean;
	}
	@Override
	public Boolean update(DebitoBean debitoBean) {

		DebitoModel debito = debitoRepo.findById(debitoBean.getIdDebito()).orElseThrow();
		debito.setSaldo(debitoBean.getSaldo());
		debito.getClienteModel().setIdCliente(debitoBean.getIdCliente());
		debitoRepo.save(debito);
	
		return true;
	}

	@Override
	public Boolean deleteById(Integer idDebito) {
		DebitoModel debito = debitoRepo.findById(idDebito).orElseThrow(null);
		debitoRepo.delete(debito);		
		return true;
	}

}