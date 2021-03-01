package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.CreditoModel;

@Repository
public interface CreditoRepository extends JpaRepository<CreditoModel, Integer>{

}
