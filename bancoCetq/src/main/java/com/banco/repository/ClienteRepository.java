package com.banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {

}
