package com.school.service;

import java.util.List;


import com.school.bean.InformacionAlumnoBean;

public interface InformacionAlumnoService {

	public boolean saveInformacionAlumno(InformacionAlumnoBean informacionalumnoBean);
	public boolean updateInformacionAlumno(InformacionAlumnoBean informacionalumnoBean);
	public InformacionAlumnoBean getInformacionAlumno(int idInformacionAlumno);
	public List<InformacionAlumnoBean> getAllInformacionAlumno();
	public String deleteInformacionAlumno(int idInformacionAlumno);
}
