package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.AlumnoModel;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoModel, Integer>{
	
}
