package com.ceteq.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.InstructorModel;

@Repository
public interface InstructorRepository extends JpaRepository<InstructorModel, Integer>{

}
