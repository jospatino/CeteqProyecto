package com.ceteq.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.DeudaModel;

@Repository
public interface DeudaRepository extends JpaRepository<DeudaModel, Integer> {

}