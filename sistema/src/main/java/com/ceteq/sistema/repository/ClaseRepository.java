package com.ceteq.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.ClaseModel;

@Repository
public interface ClaseRepository extends JpaRepository<ClaseModel, Integer>{

}
