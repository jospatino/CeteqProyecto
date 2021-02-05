package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ceteq.sistema.bean.AsignacionBean;
import com.ceteq.sistema.model.AsignacionModel;
import com.ceteq.sistema.model.DeudaModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.AsignacionRepository;
import com.ceteq.sistema.service.AsignacionService;

@Service
@Transactional
public class AsignacionServiceImpl implements AsignacionService {

	@Autowired
	private AsignacionRepository asignacionRepository;

	@Override
	public String createAsignacion(AsignacionBean asignacionBean) {

		AsignacionModel asignacionModel = new AsignacionModel();

		asignacionModel.setIdAlumno(new ProcesoModel(asignacionBean.getIdAlumno()));
		asignacionModel.setEmpresa(asignacionBean.getEmpresa());
		asignacionModel.setFechaAsignacion(asignacionBean.getFechaAsignacion());
		asignacionModel.setSueldo(asignacionBean.getSueldo());
		asignacionModel.setDeuda(new DeudaModel(asignacionBean.getDeudaId()));

		asignacionRepository.save(asignacionModel);

		String result = "Registro guardado";

		return result;
	}

	@Override
	public AsignacionBean findByID(Integer id) {

		AsignacionModel asignacionModel = this.asignacionRepository.findById(id).orElseThrow();

		AsignacionBean asignacionBean = new AsignacionBean();

		asignacionBean.setIdAsignacion(asignacionModel.getIdAsignacion());
		asignacionBean.setIdAlumno(asignacionModel.getIdAlumno().getIdProceso());
		asignacionBean.setDeudaId(asignacionModel.getDeuda().getIdDeuda());
		asignacionBean.setFechaAsignacion(asignacionModel.getFechaAsignacion());
		asignacionBean.setEmpresa(asignacionModel.getEmpresa());
		asignacionBean.setSueldo(asignacionModel.getSueldo());

		return asignacionBean;
	}

	@Override
	public List<AsignacionBean> findAll() {

		List<AsignacionModel> asignacionModelList = asignacionRepository.findAll();

		List<AsignacionBean> asignacionBeansList = new ArrayList<>();

		for (AsignacionModel asignacionModel : asignacionModelList) {

			AsignacionBean asignacionBean = new AsignacionBean();

			asignacionBean.setIdAsignacion(asignacionModel.getIdAsignacion());
			asignacionBean.setIdAlumno(asignacionModel.getIdAlumno().getIdProceso());
			asignacionBean.setDeudaId(asignacionModel.getDeuda().getIdDeuda());
			asignacionBean.setFechaAsignacion(asignacionModel.getFechaAsignacion());
			asignacionBean.setEmpresa(asignacionModel.getEmpresa());
			asignacionBean.setSueldo(asignacionModel.getSueldo());

			asignacionBeansList.add(asignacionBean);
		}

		return asignacionBeansList;
	}

	@Override
	public Boolean updateAsignacion(AsignacionBean asignacionBean) {

		AsignacionModel asignacionModel = this.asignacionRepository.findById(asignacionBean.getIdAsignacion())
				.orElseThrow();

		asignacionModel.setIdAlumno(new ProcesoModel(asignacionBean.getIdAlumno()));
		asignacionModel.setEmpresa(asignacionBean.getEmpresa());
		asignacionModel.setFechaAsignacion(asignacionBean.getFechaAsignacion());
		asignacionModel.setSueldo(asignacionBean.getSueldo());
		asignacionModel.setDeuda(new DeudaModel(asignacionBean.getDeudaId()));

		this.asignacionRepository.save(asignacionModel);

		return true;
	}

	@Override
	public Boolean deleteAsignacion(Integer id) {

		AsignacionModel asignacionModel = this.asignacionRepository.findById(id).orElseThrow();
		this.asignacionRepository.delete(asignacionModel);

		return true;
	}

}
