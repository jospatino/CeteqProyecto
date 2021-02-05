package com.ceteq.sistema.repository;

import java.util.List;

import com.ceteq.sistema.bean.AspiranteDeudaBean;
import com.ceteq.sistema.model.AspiranteModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AspiranteRepository extends JpaRepository<AspiranteModel, Integer>{
    
    @Transactional
    @Query(
        value="select a.id_alumno, a.nombre, a.apellido_paterno, a.apellido_materno, d.deuda_total from tb_aspirantes a, tb_deudas d where d.id_alumno = a.id_alumno and a.id_alumno = :aspiranteId",
        nativeQuery = true
    )
    List<?> findAspiranteDeuda(int aspiranteId);

}
