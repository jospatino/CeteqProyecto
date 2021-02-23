package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.model.KardexModel;

@Repository
public interface KardexRepository extends JpaRepository<KardexModel, Integer>{

}
