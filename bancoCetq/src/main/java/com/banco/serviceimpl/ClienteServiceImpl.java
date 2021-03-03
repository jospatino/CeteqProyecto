package com.banco.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bean.ClienteBean;
import com.banco.model.ClienteModel;
import com.banco.repository.ClienteRepository;
import com.banco.service.ClienteService;

@Service
@Transactional
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepo;

	@Override
	public Integer save(ClienteBean clienteBean) {
		
		ClienteModel cliente = new ClienteModel();
		cliente.setNombreCliente(clienteBean.getNombreCliente());
		cliente.setApPaterno(clienteBean.getApPaterno());
		cliente.setApMaterno(clienteBean.getApMaterno());
		cliente.setEmail(clienteBean.getEmail());
		cliente.setFechaNacimiento(clienteBean.getFechaNacimiento());
		clienteRepo.save(cliente);
		
		return cliente.getIdCliente();
	}

	@Override
	public List<ClienteBean> find() {
		
		List <ClienteModel> clienteList = clienteRepo.findAll();
		List <ClienteBean> clienteBeanList = new ArrayList<ClienteBean>();
		
		for( ClienteModel cliente : clienteList) {
			
			ClienteBean clienteBean = new ClienteBean();
			
			clienteBean.setNombreCliente(cliente.getNombreCliente());
			clienteBean.setApPaterno(cliente.getApPaterno());
			clienteBean.setApMaterno(cliente.getApMaterno());
			clienteBean.setEmail(cliente.getEmail());
			clienteBean.setFechaNacimiento(cliente.getFechaNacimiento());
			
			clienteBeanList.add(clienteBean);
			
		}

		
		return clienteBeanList;
	}

	@Override
	public ClienteBean findId(Integer idCliente) {

		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
		ClienteBean clienteBean = new ClienteBean();
		
		clienteBean.setNombreCliente(cliente.getNombreCliente());
		clienteBean.setApPaterno(cliente.getApPaterno());
		clienteBean.setApMaterno(cliente.getApMaterno());
		clienteBean.setFechaNacimiento(cliente.getFechaNacimiento());
		clienteBean.setEmail(cliente.getEmail());
		
		return clienteBean;
	}

	@Override
	public ClienteModel update(ClienteBean clienteBean) {
		ClienteModel cliente = clienteRepo.findById(clienteBean.getIdCliente()).orElseThrow();
		cliente.setNombreCliente(clienteBean.getNombreCliente());
		cliente.setApPaterno(clienteBean.getApPaterno());
		cliente.setApMaterno(clienteBean.getApMaterno());
		cliente.setFechaNacimiento(clienteBean.getFechaNacimiento());
		cliente.setEmail(clienteBean.getEmail());
		
		clienteRepo.save(cliente);
		return cliente;
	}

	@Override
	public Boolean delete(Integer idCliente) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
		clienteRepo.delete(cliente);
		return true;
	}

	@Override
	public ClienteBean depositar(Integer idCliente, double deposito) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElse(null);
       ClienteBean clienteBean = new ClienteBean();

        
        cliente.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo()+deposito);
        
        clienteRepo.save(cliente);
        
        clienteBean.setNombreCliente(cliente.getNombreCliente());
        clienteBean.setApPaterno(cliente.getApPaterno());
        clienteBean.setApMaterno(cliente.getApMaterno());
        clienteBean.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo());
        
		return clienteBean;
	}

	@Override
	public ClienteBean abonarDeuda(Integer idCliente, double abono) {
   ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
   ClienteBean clienteBean = new ClienteBean();
   
   cliente.getCreditoModel().setAdeudo_total(cliente.getCreditoModel().getAdeudo_total()-abono);
   clienteRepo.save(cliente);
   
   clienteBean.setNombreCliente(cliente.getNombreCliente());
   clienteBean.setApPaterno(cliente.getApPaterno());
   clienteBean.setApMaterno(cliente.getApMaterno());
   clienteBean.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo());
   
	return clienteBean;
	}
	
	
	
	
	
	
	
	
}
