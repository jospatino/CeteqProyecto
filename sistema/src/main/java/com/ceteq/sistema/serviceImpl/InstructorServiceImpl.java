package com.ceteq.sistema.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceteq.sistema.bean.InstructorBean;
import com.ceteq.sistema.model.ClaseModel;
import com.ceteq.sistema.model.InstructorModel;
import com.ceteq.sistema.repository.InstructorRepository;
import com.ceteq.sistema.service.InstructorService;

@Service
@Transactional
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorRepository instructorRepository;

	@Override
	public String createInstructor(InstructorBean instructorBean) {

		InstructorModel instructorModel = new InstructorModel();

		instructorModel.setNombre(instructorBean.getNombre());
		instructorModel.setApP(instructorBean.getApP());
		instructorModel.setApM(instructorBean.getApM());
		instructorModel.setEdad(instructorBean.getEdad());
		instructorModel.setClase(new ClaseModel(instructorBean.getClase()));

		instructorRepository.save(instructorModel);

		String result = "Seguardo el Instructor con el nombre: " + instructorModel.getNombre();

		return result;
	}

	@Override
	public InstructorBean findByID(Integer id) {
		InstructorModel instructorModel = this.instructorRepository.findById(id).orElseThrow();
		InstructorBean insBean = new InstructorBean();

		insBean.setIdInstructor(instructorModel.getIdInstructor());
		insBean.setNombre(instructorModel.getNombre());
		insBean.setApP(instructorModel.getApP());
		insBean.setApM(instructorModel.getApM());
		insBean.setEdad(instructorModel.getEdad());
		insBean.setClase(instructorModel.getClase().getIdClase());

		return insBean;
	}

	@Override
	public List<InstructorBean> findAll() {

		List<InstructorModel> instructorModelsList = instructorRepository.findAll();

		List<InstructorBean> instructorBeansList = new ArrayList<>();

		for (InstructorModel instructorModel : instructorModelsList) {

			InstructorBean instructorBean = new InstructorBean();

			instructorBean.setIdInstructor(instructorModel.getIdInstructor());
			instructorBean.setNombre(instructorModel.getNombre());
			instructorBean.setApP(instructorModel.getApP());
			instructorBean.setApM(instructorModel.getApM());
			instructorBean.setEdad(instructorModel.getEdad());
			instructorBean.setClase(instructorModel.getClase().getIdClase());

			instructorBeansList.add(instructorBean);

		}
		return instructorBeansList;
	}

	@Override
	public Boolean updateInstructor(InstructorBean instructorBean) {
		InstructorModel instructorModel = this.instructorRepository.findById(instructorBean.getIdInstructor())
				.orElseThrow();

		instructorModel.setNombre(instructorBean.getNombre());
		instructorModel.setApP(instructorBean.getApP());
		instructorModel.setApM(instructorBean.getApM());
		instructorModel.setEdad(instructorBean.getEdad());
		instructorModel.setClase(new ClaseModel(instructorBean.getClase()));

		this.instructorRepository.save(instructorModel);

		return true;
	}

	@Override
	public Boolean deleteInstructor(int id) {

		InstructorModel instructorModel = this.instructorRepository.findById(id).orElseThrow();
		this.instructorRepository.delete(instructorModel);

		return true;
	}

}
