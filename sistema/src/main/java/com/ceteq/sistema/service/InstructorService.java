package com.ceteq.sistema.service;

import java.util.List;

import com.ceteq.sistema.bean.InstructorBean;

public interface InstructorService {

	public String createInstructor(InstructorBean instructorBean);

	public InstructorBean findByID(Integer id);

	List<InstructorBean> findAll();

	public Boolean updateInstructor(InstructorBean instructorBean);

	public Boolean deleteInstructor(int id);
}
