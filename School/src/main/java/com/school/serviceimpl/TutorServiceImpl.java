package com.school.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.TutorBean;
import com.school.model.TutorModel;
import com.school.repository.TutorRepository;
import com.school.service.TutorService;

@Service
@Transactional
public class TutorServiceImpl implements TutorService {
	@Autowired
	private TutorRepository tutorRepository;
	
	@Override
	public Integer saveTutor(TutorBean tutorBean) {
		TutorModel tutorModel = new TutorModel();
		tutorModel.setNombreTutor(tutorBean.getNombreTutor());
		tutorModel.setCorreo(tutorBean.getCorreo());
		
		tutorRepository.save(tutorModel);
		return tutorModel.getId();
	}

	@Override
	public List<TutorBean> findTutor() {
		List<TutorModel> tutorModelList = this.tutorRepository.findAll();
		List<TutorBean> tutorBeanList = new ArrayList<TutorBean>();
		
		for(TutorModel tutorModel : tutorModelList) {
			TutorBean tutorBean = new TutorBean();
			tutorBean.setId(tutorModel.getId());
			tutorBean.setNombreTutor(tutorModel.getNombreTutor());
			tutorBean.setCorreo(tutorModel.getCorreo());
			
			tutorBeanList.add(tutorBean);
		}
		return tutorBeanList;
	}

	@Override
	public TutorBean findIdTutor(Integer idTutor) {
		TutorModel tutorModel = tutorRepository.findById(idTutor).orElseThrow(null);
		TutorBean tutorBean = new TutorBean();
		
		tutorBean.setId(tutorModel.getId());
		tutorBean.setNombreTutor(tutorModel.getNombreTutor());
		tutorBean.setCorreo(tutorModel.getCorreo());
		
		return tutorBean;
	}

	@Override
	public Boolean updateTutor(TutorBean tutorBean) {
		TutorModel tutorModel = this.tutorRepository.findById(tutorBean.getId()).orElseThrow(null);
		
		tutorModel.setId(tutorBean.getId());
		tutorModel.setNombreTutor(tutorBean.getNombreTutor());
		tutorModel.setCorreo(tutorBean.getCorreo());
		
		this.tutorRepository.save(tutorModel);
		return true;
	}

	@Override
	public Boolean deleteByIdTutor(Integer idTutor) {
		TutorModel tutorModel = tutorRepository.findById(idTutor).orElseThrow(null);
		tutorRepository.delete(tutorModel);
		return true;
	}

}
