package com.ceteq.sistema.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.ClaseModel;

@Repository
public interface ClaseRepository extends JpaRepository<ClaseModel, Integer>{
	@Transactional
	@Query(value="SELECT COUNT(id_clase) from db_ceteq.tb_clases where fecha_fin is null;", nativeQuery=true)
	int findNumeroClases();
}
