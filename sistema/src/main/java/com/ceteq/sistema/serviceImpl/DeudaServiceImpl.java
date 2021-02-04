package com.ceteq.sistema.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.DeudaBean;
import com.ceteq.sistema.model.AsignacionModel;
import com.ceteq.sistema.model.DeudaModel;
import com.ceteq.sistema.repository.DeudaRepository;
import com.ceteq.sistema.service.DeudaService;

@Service
@Transactional
public class DeudaServiceImpl implements DeudaService {

	@Autowired
	private DeudaRepository deudaRepository;

	@Override
	public String CreateDeuda(DeudaBean deudaBean) {

		DeudaModel deudaModel = new DeudaModel();

		deudaModel.setIdAlumno(new AsignacionModel(deudaBean.getIdAlumno()));
		deudaModel.setFechaAsignacion(new AsignacionModel(deudaBean.getFechaAsignacion()));
		deudaModel.setFechaLiquidacion(deudaBean.getFechaLiquidacion());
		deudaModel.setLiberado(deudaBean.getLiberado());
		deudaModel.setTotalDeuda(deudaBean.getTotalDeuda());

		deudaRepository.save(deudaModel);

		String result = "Registro guardado";

		return result;
	}

	@Override
	public DeudaBean findByID(Integer id) {
		DeudaModel deudaModel = this.deudaRepository.findById(id).orElseThrow();
		return null;
	}

	@Override
	public List<DeudaBean> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateDeuda(DeudaBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteDeuda(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
