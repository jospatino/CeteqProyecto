package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.InformacionAlumnoModel;

@Repository
public interface InformacionAlumnoRepository extends JpaRepository<InformacionAlumnoModel, Integer> {

}
