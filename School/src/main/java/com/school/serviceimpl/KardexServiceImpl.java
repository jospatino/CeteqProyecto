package com.school.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.KardexBean;
import com.school.model.KardexModel;
import com.school.repository.KardexRepository;
import com.school.service.KardexService;

@Service
@Transactional
public class KardexServiceImpl implements KardexService {
	
	@Autowired
	private KardexRepository kardexRepository;

	@Override
	public Integer saveKardex(KardexBean kardexBean) {
		KardexModel kardexModel = new KardexModel();
		kardexModel.setAño_kardex(kardexBean.getAño_kardex());
		kardexModel.setCalificacion_kardex(kardexBean.getCalificacion_kardex());
		
		kardexRepository.save(kardexModel);
		return kardexModel.getIdkardex();
	}

	@Override
	public List<KardexBean> findKardex() {
		List<KardexModel> kardexModelList = kardexRepository.findAll();
		List<KardexBean> kardexBeanList = new ArrayList<KardexBean>();
		
		for(KardexModel kardexModel : kardexModelList) {
			KardexBean kardexBean = new KardexBean();
			kardexBean.setIdkardex(kardexModel.getIdkardex());
			kardexBean.setAño_kardex(kardexModel.getAño_kardex());
			kardexBean.setCalificacion_kardex(kardexModel.getCalificacion_kardex());
			
			kardexBeanList.add(kardexBean);
		}
		return kardexBeanList;
	}

	@Override
	public KardexBean findIdKardex(Integer idKardex) {
		KardexModel kardexModel = kardexRepository.findById(idKardex).orElseThrow(null);
		KardexBean kardexBean = new KardexBean();
		
		kardexBean.setAño_kardex(kardexModel.getAño_kardex());
		kardexBean.setCalificacion_kardex(kardexModel.getCalificacion_kardex());
		kardexBean.setIdkardex(kardexModel.getIdkardex());
		
		return kardexBean;
	}

	@Override
	public Boolean updateKardex(KardexBean kardexBean) {
        KardexModel kardexModel = this.kardexRepository.findById(kardexBean.getIdkardex()).orElseThrow(null);
		
        kardexModel.setIdkardex(kardexBean.getIdkardex());
		kardexModel.setAño_kardex(kardexBean.getAño_kardex());
		kardexModel.setCalificacion_kardex(kardexBean.getCalificacion_kardex());
		
		this.kardexRepository.save(kardexModel);
		return true;
	}

	@Override
	public Boolean deleteByIdKardex(Integer idKardex) {
		KardexModel kardexModel = kardexRepository.findById(idKardex).orElseThrow(null);
		kardexRepository.delete(kardexModel);
		return true;
	}


}
