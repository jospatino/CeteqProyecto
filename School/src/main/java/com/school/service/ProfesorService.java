package com.school.service;

import java.util.List;

import com.school.bean.ProfesorBean;



public interface ProfesorService {
	
	
	
	//create integer objbean
		public Integer saveProfesor(ProfesorBean ProfesorIngresado);
		
		//read list de bean y objetobean
		public List<ProfesorBean> Profesorlist(); //muestra la lista
		
		public ProfesorBean ProfesorbyId(Integer id_profesor); //devuelve alumno por id
		
		//update devuelve true
		public boolean uptdateProfesor(Integer id_Producto);
		
		//deleted by id

		public boolean deleteProfesor(Integer id_alumno);
	

}
