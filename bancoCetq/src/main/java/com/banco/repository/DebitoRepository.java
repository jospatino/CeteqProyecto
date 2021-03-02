package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.model.DebitoModel;

public interface DebitoRepository extends JpaRepository<DebitoModel, Integer> {

}
