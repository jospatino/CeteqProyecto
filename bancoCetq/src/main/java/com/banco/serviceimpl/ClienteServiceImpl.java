package com.banco.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bean.ClienteAuxBean;
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
		cliente.setEdad(clienteBean.getEdad());
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
			clienteBean.setEdad(cliente.getEdad());
			clienteBean.setIdCliente(cliente.getIdCliente());
			
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
		clienteBean.setEdad(cliente.getEdad());
		clienteBean.setEmail(cliente.getEmail());
		clienteBean.setIdCliente(idCliente);
		
		return clienteBean;
	}

	@Override
	public Boolean update(ClienteBean clienteBean) {
		ClienteModel cliente = clienteRepo.findById(clienteBean.getIdCliente()).orElseThrow();
		cliente.setNombreCliente(clienteBean.getNombreCliente());
		cliente.setApPaterno(clienteBean.getApPaterno());
		cliente.setApMaterno(clienteBean.getApMaterno());
		cliente.setEdad(clienteBean.getEdad());
		cliente.setEmail(clienteBean.getEmail());
		
		clienteRepo.save(cliente);
		return true;
	}

	@Override
	public Boolean deleteById(Integer idCliente) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
		clienteRepo.delete(cliente);
		return true;
	}

	@Override
	public ClienteAuxBean depositar(Integer idCliente, double deposito) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
        ClienteAuxBean clienteAuxBean = new ClienteAuxBean();

        
        cliente.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo()+deposito);
        
        clienteRepo.save(cliente);
        
        clienteAuxBean.setIdCliente(idCliente);
        clienteAuxBean.setNombreCliente(cliente.getNombreCliente());
        clienteAuxBean.setApPaterno(cliente.getApPaterno());
        clienteAuxBean.setApMaterno(cliente.getApMaterno());
        clienteAuxBean.setEmail(cliente.getEmail());
        clienteAuxBean.setSaldo(cliente.getDebitoModel().getSaldo());
        


        
        clienteRepo.save(cliente);
		return clienteAuxBean;
	}

	@Override
	public ClienteAuxBean abonarDeuda(Integer idCliente, double abono) {
   ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
   ClienteAuxBean clienteAuxBean = new ClienteAuxBean();
   
   cliente.getCreditoModel().setAdeudo_total(cliente.getCreditoModel().getAdeudo_total()-abono);
   clienteRepo.save(cliente);
   
   clienteAuxBean.setIdCliente(idCliente);
   clienteAuxBean.setNombreCliente(cliente.getNombreCliente());
   clienteAuxBean.setApPaterno(cliente.getApPaterno());
   clienteAuxBean.setApMaterno(cliente.getApMaterno());
   clienteAuxBean.setAdeudo_total(cliente.getCreditoModel().getAdeudo_total());
   
	return clienteAuxBean;
	}

	@Override
	public ClienteAuxBean retiro(Integer idCliente, double retirar) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
		ClienteAuxBean clienteAuxBean = new ClienteAuxBean();
		
		cliente.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo()-retirar);
		
		clienteRepo.save(cliente);
		
		clienteAuxBean.setIdCliente(idCliente);
        clienteAuxBean.setNombreCliente(cliente.getNombreCliente());
        clienteAuxBean.setApPaterno(cliente.getApPaterno());
        clienteAuxBean.setApMaterno(cliente.getApMaterno());
        clienteAuxBean.setEmail(cliente.getEmail());
        clienteAuxBean.setSaldo(cliente.getDebitoModel().getSaldo());
		
		
		return clienteAuxBean;
	}

	@Override
	public List<ClienteAuxBean> clientesDeudas() {

		List <ClienteModel> clienteList = clienteRepo.findAll();
		List <ClienteAuxBean> clienteAuxBeanList = new ArrayList<ClienteAuxBean>();
		
	
		
			
			for (ClienteModel cliente : clienteList) {
				if(cliente.getCreditoModel().getAdeudo_total() > 0) {
				
				ClienteAuxBean clienteBean = new ClienteAuxBean();
				
				clienteBean.setIdCliente(cliente.getIdCliente());
				clienteBean.setNombreCliente(cliente.getNombreCliente());
				clienteBean.setApPaterno(cliente.getApPaterno());
				clienteBean.setApMaterno(cliente.getApMaterno());
				clienteBean.setAdeudo_total(cliente.getCreditoModel().getAdeudo_total());
			
				clienteAuxBeanList.add(clienteBean);
				}
			}
		
		
		
		
		return clienteAuxBeanList;
	}
	
	
	
	
	
	
	
	
}
