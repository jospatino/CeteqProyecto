package com.school.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bean.AlumnoBean;
import com.school.bean.AlumnoDetalleBean;
import com.school.model.AlumnoModel;
import com.school.repository.AlumnoRepository;
import com.school.service.AlumnoService;

@Service
@Transactional
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository alumnoRepo;
	@Override
	public Integer saveAlumno(AlumnoBean alumnoBean) {
		AlumnoModel alumno = new AlumnoModel();
		alumno.setNombreAlumno(alumnoBean.getNombreAlumno());
		alumno.setApMaterno(alumnoBean.getApMaterno());
		alumno.setApPaterno(alumnoBean.getApPaterno());
		alumno.setEdadAlumno(alumnoBean.getEdadAlumno());
		
		
		
		return alumno.getId();
	}

	@Override
	public List<AlumnoBean> list() {
		
		List<AlumnoModel> alumnoList = alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<AlumnoBean>();
		for(AlumnoModel alumno : alumnoList) {
			
			AlumnoBean alumnoBean = new AlumnoBean();
			
			alumnoBean.setNombreAlumno(alumno.getNombreAlumno());
			alumnoBean.setApPaterno(alumno.getApPaterno());
			alumnoBean.setApMaterno(alumno.getApMaterno());
			alumnoBean.setEdadAlumno(alumno.getEdadAlumno());
			alumnoBean.setId(alumno.getId());
			
			alumnoBeanList.add(alumnoBean);			
			
		}
			


		return alumnoBeanList;
	}

	@Override
	public AlumnoBean findIdAlumno(Integer idAlumno) {
		AlumnoModel alumno = alumnoRepo.findById(idAlumno).orElseThrow(null);
		AlumnoBean alumnoBean = new AlumnoBean();
		
		alumnoBean.setNombreAlumno(alumno.getNombreAlumno());
		alumnoBean.setApPaterno(alumno.getApPaterno());
		alumnoBean.setApMaterno(alumno.getApMaterno());
		alumnoBean.setEdadAlumno(alumno.getEdadAlumno());
		alumnoBean.setId(idAlumno);
		
		
		
		

		return alumnoBean;
	}

	@Override
	public Boolean updateAlumno(AlumnoBean alumnoBean) {
		AlumnoModel alumnoById = alumnoRepo.findById(alumnoBean.getId()).orElseThrow(null);
		
		alumnoById.setNombreAlumno(alumnoBean.getNombreAlumno());
		alumnoById.setApPaterno(alumnoBean.getApPaterno());
		alumnoById.setApMaterno(alumnoBean.getApMaterno());
		alumnoById.setEdadAlumno(alumnoBean.getEdadAlumno());
		
		alumnoRepo.save(alumnoById);

		return true;
	}

	
	
	@Override
	public Boolean deleteById(Integer idAlumno) {
		AlumnoModel alumnoById = alumnoRepo.findById(idAlumno).orElseThrow(null);
		alumnoRepo.delete(alumnoById);

		return true;
	}
	
	

	@Override
	public List<AlumnoBean> listaReprobados() {
		List<AlumnoModel> alumnoList = alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<AlumnoBean>();
		
		
		AlumnoModel alumnoDetalle = new AlumnoModel();
		
		if(alumnoDetalle.getIddetalle().getPromedio_Alumno() < 6) { 
				
		for(AlumnoModel alumno : alumnoList) {
			
			
			
			AlumnoBean alumnoBean = new AlumnoBean();
			
			alumnoBean.setNombreAlumno(alumno.getNombreAlumno());
			alumnoBean.setApPaterno(alumno.getApPaterno());
			alumnoBean.setApMaterno(alumno.getApMaterno());
			alumnoBean.setEdadAlumno(alumno.getEdadAlumno());
			alumnoBean.setId(alumno.getId());
			
			alumnoBeanList.add(alumnoBean);
		 }
		
		}
		return alumnoBeanList;
	}

	@Override
	public List<AlumnoDetalleBean> listaCalificaciones() {
		
	
		List<AlumnoModel> alumnoList = alumnoRepo.findAll();
		List<AlumnoDetalleBean> alumnoDetalleBeanList = new ArrayList<AlumnoDetalleBean>();
					
		
		for(AlumnoModel alumno : alumnoList) {
			
			AlumnoDetalleBean alumnoDetalleBean = new  AlumnoDetalleBean();
			
			alumnoDetalleBean.setNombreAlumno(alumno.getNombreAlumno());
			alumnoDetalleBean.setApPaterno(alumno.getApPaterno());
			alumnoDetalleBean.setApMaterno(alumno.getApMaterno());
			alumnoDetalleBean.setId(alumno.getId());
			alumnoDetalleBean.setCalificacionAlumno(alumno.getIddetalle().getPromedio_Alumno()); 
			
		
			alumnoDetalleBeanList.add(alumnoDetalleBean);
		
		
		}
		return alumnoDetalleBeanList; 
	}

	@Override
	public List<AlumnoBean> listaAlumnoTutor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoBean> listaDeudores() {
		
		List<AlumnoModel> alumnoList = alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<AlumnoBean>();
		AlumnoDetalleBean alumnodeuda = new AlumnoDetalleBean();
		
		if(alumnodeuda.getIddetalle().getDeuda_alumno() > 0) {
		
		
		
		for(AlumnoModel alumno : alumnoList) {
			
			AlumnoBean alumnoBean = new AlumnoBean();
			
			alumnoBean.setNombreAlumno(alumno.getNombreAlumno());
			alumnoBean.setApPaterno(alumno.getApPaterno());
			alumnoBean.setApMaterno(alumno.getApMaterno());
			alumnoBean.setEdadAlumno(alumno.getEdadAlumno());
			alumnoBean.setId(alumno.getId());
			
			alumnoBeanList.add(alumnoBean);
		}
			
		}

		return alumnoBeanList;
	}

	@Override
	public List<AlumnoBean> listaAlumnoProfesor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoBean> listaAlumnoProfeId(Integer idProfesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoBean> listaAlumnoBeca(double promedio_Alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumnoBean> listaAlumnoDerechoExamen() {
		
	
		List<AlumnoModel> alumnoList = alumnoRepo.findAll();
		List<AlumnoBean> alumnoBeanList = new ArrayList<AlumnoBean>();
		
		AlumnoDetalleBean alumnoDetalleBean = new AlumnoDetalleBean ();
		
		if(alumnoDetalleBean.getIddetalle().getDeuda_alumno() < 0.0 && alumnoDetalleBean.getIddetalle().getPromedio_Alumno() > 4.0 ) {
			
		
		for(AlumnoModel alumno : alumnoList) {
			
			AlumnoBean alumnoBean = new AlumnoBean();
			
			alumnoBean.setNombreAlumno(alumno.getNombreAlumno());
			alumnoBean.setApPaterno(alumno.getApPaterno());
			alumnoBean.setApMaterno(alumno.getApMaterno());
			alumnoBean.setEdadAlumno(alumno.getEdadAlumno());
			alumnoBean.setId(alumno.getId());
			
			alumnoBeanList.add(alumnoBean);				
			
			
		}
	}
		return alumnoBeanList;

}
}
