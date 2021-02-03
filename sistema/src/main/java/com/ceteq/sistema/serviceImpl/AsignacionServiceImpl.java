package com.ceteq.sistema.serviceImpl;



import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.AsignacionBean;
import com.ceteq.sistema.bean.DeudaBean;
import com.ceteq.sistema.bean.ProcesoBean;
import com.ceteq.sistema.model.AsignacionModel;
import com.ceteq.sistema.model.DeudaModel;
import com.ceteq.sistema.model.ProcesoModel;
import com.ceteq.sistema.repository.AsignacionRepository;
import com.ceteq.sistema.service.AsignacionService;


//Revisar el metodo findall para implementar el update


@Service
@Transactional
public class AsignacionServiceImpl implements AsignacionService {

	@Autowired
	private AsignacionRepository asignacionRepository;

	@Override
	public String asignacion(AsignacionBean asignacionBean) {

		AsignacionModel asignacionModel = new AsignacionModel();

		asignacionModel.setIdAlumno(new ProcesoModel(asignacionBean.getIdAlumno().getIdProceso()));
		asignacionModel.setDeuda(new DeudaModel(asignacionBean.getDeuda().getIdDeuda()));
		asignacionModel.setFechaAsignacion(asignacionBean.getFechaAsignacion());
		asignacionModel.setEmpresa(asignacionBean.getEmpresa());
		asignacionModel.setSueldo(asignacionBean.getSueldo());

		asignacionRepository.save(asignacionModel);
		String mensaje = "Registro guardado";

		return mensaje;
	}

	@Override
	public AsignacionBean findByID(Integer id) {

		AsignacionModel asignacionModel = this.asignacionRepository.findById(id).orElseThrow(null);
		AsignacionBean asignacionBean = new AsignacionBean();
		ProcesoBean procesoBean = new ProcesoBean();
		DeudaBean deudaBean = new DeudaBean();

		asignacionBean.setIdAsignacion(asignacionModel.getIdAsignacion());
		BeanUtils.copyProperties(asignacionModel.getIdAlumno(), procesoBean);
		asignacionBean.setIdAlumno(procesoBean);
		asignacionBean.setEmpresa(asignacionModel.getEmpresa());
		asignacionBean.setSueldo(asignacionModel.getSueldo());
		BeanUtils.copyProperties(asignacionModel.getDeuda(), deudaBean);

		return asignacionBean;
	}

	@Override
	public List<AsignacionBean> findAll() {

		List<AsignacionModel> asignacionModels = asignacionRepository.findAll();

		List<AsignacionBean> asignacionBeans = new ArrayList<>();

		for (AsignacionModel asignacionModel : asignacionModels) {
			AsignacionBean asignacionBean = new AsignacionBean();

			DeudaBean deudaBeaniD = new DeudaBean(asignacionModel.getDeuda().getIdDeuda());
//			ProcesoBean procesoBean = new AspiranteBean(asignacionModel.getIdAlumno().getAlumno().getIdAlumno());

			asignacionBean.setIdAsignacion(0);
			asignacionBean.setEmpresa(null);
			asignacionBean.setFechaAsignacion(null);
			asignacionBean.setSueldo(null);
			asignacionBean.setDeuda(deudaBeaniD);
			asignacionBean.setIdAlumno(null);

			asignacionBeans.add(asignacionBean);

		}

		return asignacionBeans;
	}

	@Override
	public Boolean updateAsignacion(AsignacionBean asignacionBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteAsignacion(Integer id) {

		AsignacionModel asignacionModel = this.asignacionRepository.findById(id).orElseThrow();
		this.asignacionRepository.delete(asignacionModel);

		return true;
	}

}
