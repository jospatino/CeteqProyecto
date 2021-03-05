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

		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
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
		ClienteModel cliente = clienteRepo.findById(clienteBean.getIdCliente()).orElseThrow(null);
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
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
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
   ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
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
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
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
				if( cliente.getCreditoModel() != null && cliente.getCreditoModel().getAdeudo_total() > 0) {
				
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
	
	@Override
	public Boolean eligibilidadPrestamo(Integer idCliente) {
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
		Boolean clienteSelecto = false;
		
		if (cliente.getDebitoModel().getSaldo()>= 50000 && cliente.getCreditoModel().getAdeudo_total()<=(cliente.getCreditoModel().getMonto_prestamo()*.50)) {
			clienteSelecto = true;	
		}
		
		return clienteSelecto;
	}
	
	

	@Override
	public List<ClienteAuxBean> clienteSelecto() {
		List<ClienteModel> clientesSelectos =clienteRepo.findAll();
		List<ClienteAuxBean> clientesSelectosBean = new ArrayList<ClienteAuxBean>();
		
		for (ClienteModel clienteSelecto : clientesSelectos) {
						
			if (clienteSelecto.getCreditoModel().getMonto_prestamo()>=80000 && clienteSelecto.getDebitoModel().getSaldo()>=50000) {
				ClienteAuxBean clienteBean = new ClienteAuxBean();
				
				clienteBean.setNombreCliente(clienteSelecto.getNombreCliente());
				clienteBean.setApPaterno(clienteSelecto.getApPaterno());
				clienteBean.setApMaterno(clienteSelecto.getApMaterno());
				//clienteBean.setEdad(clienteSelecto.getEdad());
				clienteBean.setIdCliente(clienteSelecto.getIdCliente());
				//clienteBean.getDebitoModel().setSaldo(clienteSelecto.getDebitoModel().getSaldo());
				//clienteBean.getCreditoModel().setMonto_prestamo(clienteSelecto.getCreditoModel().getMonto_prestamo());
				
				clientesSelectosBean.add(clienteBean);
			}
			
		}
		
		return clientesSelectosBean;
	}

	
	
	@Override
	public Boolean upgradecliente(Integer idCliente) {
		
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow(null);
		Boolean upgradeCliente = false;
		
		if (cliente.getCreditoModel().getMonto_prestamo()>=80000 && cliente.getDebitoModel().getSaldo()>=50000) {
			
			upgradeCliente = true;
		}
		
		return upgradeCliente;
	
	
	
	
	}

	@Override
	public ClienteAuxBean saldoUsuario(Integer idCliente) {
	
		ClienteModel cliente = clienteRepo.findById(idCliente).orElseThrow();
		ClienteAuxBean clienteBean = new ClienteAuxBean();
		
		clienteBean.setNombreCliente(cliente.getNombreCliente());
		clienteBean.setApPaterno(cliente.getApPaterno());
		clienteBean.setApMaterno(cliente.getApMaterno());
		clienteBean.setIdCliente(idCliente);
		clienteBean.setSaldo(cliente.getDebitoModel().getSaldo());
	
		return clienteBean;
	}

	@Override
	public Boolean transferirCliente(Integer idEmisor, Integer idReceptor, double monto) {
		ClienteModel cliente = clienteRepo.findById(idEmisor).orElseThrow(null);
		ClienteModel cliente1 = clienteRepo.findById(idReceptor).orElseThrow(null);
		
		cliente.getDebitoModel().setSaldo(cliente.getDebitoModel().getSaldo() - monto);
		cliente1.getDebitoModel().setSaldo(cliente1.getDebitoModel().getSaldo() + monto);
		
		
		return true;
	}
	
	//	public void transferencia(int transferencia, Persona persona) {
	//persona.getCuenta().setSaldo(persona.getCuenta().getSaldo() + transferencia);
	//this.cuenta.setSaldo(this.cuenta.getSaldo() - transferencia);
	
		
		
	}


