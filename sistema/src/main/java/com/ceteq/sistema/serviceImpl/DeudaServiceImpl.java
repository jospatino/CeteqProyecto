package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
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
		deudaModel.setFechaAsignacion(deudaBean.getFechaAsignacion());
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

		DeudaBean deudaBean = new DeudaBean();

		deudaBean.setIdDeuda(deudaModel.getIdDeuda());
		deudaBean.setIdAlumno(deudaModel.getIdAlumno().getIdAlumno().getAlumno().getIdAlumno());
		deudaBean.setFechaAsignacion(deudaModel.getFechaAsignacion());
		deudaBean.setFechaLiquidacion(deudaModel.getFechaLiquidacion());
		deudaBean.setLiberado(deudaModel.getLiberado());
		deudaBean.setTotalDeuda(deudaModel.getTotalDeuda());

		return deudaBean;
	}

	@Override
	public List<DeudaBean> findAll() {

		List<DeudaModel> deudaModelsList = deudaRepository.findAll();

		List<DeudaBean> deudaBeansList = new ArrayList<>();

		for (DeudaModel deudaModel : deudaModelsList) {

			DeudaBean deudaBean = new DeudaBean();

			deudaBean.setIdDeuda(deudaModel.getIdDeuda());
			deudaBean.setIdAlumno(deudaModel.getIdAlumno().getIdAlumno().getAlumno().getIdAlumno());
			deudaBean.setFechaAsignacion(deudaModel.getFechaAsignacion());
			deudaBean.setFechaLiquidacion(deudaModel.getFechaLiquidacion());
			deudaBean.setLiberado(deudaModel.getLiberado());
			deudaBean.setTotalDeuda(deudaModel.getTotalDeuda());

			deudaBeansList.add(deudaBean);

		}

		return deudaBeansList;
	}

	@Override
	public Boolean updateDeuda(DeudaBean deudabean) {

		DeudaModel deudaModel = this.deudaRepository.findById(deudabean.getIdDeuda()).orElseThrow();

		deudaModel.setIdAlumno(new AsignacionModel(deudabean.getIdAlumno()));
		deudaModel.setFechaAsignacion(deudabean.getFechaAsignacion());
		deudaModel.setFechaLiquidacion(deudabean.getFechaLiquidacion());
		deudaModel.setLiberado(deudabean.getLiberado());
		deudaModel.setTotalDeuda(deudabean.getTotalDeuda());

		this.deudaRepository.save(deudaModel);

		return true;
	}

	@Override
	public Boolean deleteDeuda(Integer id) {

		DeudaModel deudaModel = this.deudaRepository.findById(id).orElseThrow();
		this.deudaRepository.delete(deudaModel);

		return true;
	}

}
