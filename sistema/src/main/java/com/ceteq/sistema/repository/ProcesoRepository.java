package com.ceteq.sistema.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ceteq.sistema.model.ProcesoModel;

@Repository
public interface ProcesoRepository extends JpaRepository<ProcesoModel, Integer> {

	@Transactional
	@Query(value = "select * from db_ceteq.tb_procesos where :estatus = 1", nativeQuery = true)
	public List<ProcesoModel> findAlumnoInProcess(short estatus);
}
