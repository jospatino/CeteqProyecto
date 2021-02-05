package com.ceteq.sistema.repository;

import com.ceteq.sistema.model.AspiranteModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AspiranteRepository extends JpaRepository<AspiranteModel, Integer> {

}
