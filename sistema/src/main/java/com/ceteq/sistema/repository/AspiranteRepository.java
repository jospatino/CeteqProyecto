package com.ceteq.sistema.repository;

import com.ceteq.sistema.interface_projection.AspiranteDeudaProjection;
import com.ceteq.sistema.model.AspiranteModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AspiranteRepository extends JpaRepository<AspiranteModel, Integer>{
    
    @Transactional
    @Query(
        value = 
         "   Select "+
         "       a.id_alumno as idAlumno,"+
         "       a.nombre,"+
         "       a.apellido_paterno as apellidoPaterno,"+
         "       a.apellido_materno as apellidoMaterno,"+
         "       d.deuda_total as deuda"+
         "   from"+
         "       tb_asignaciones asign,"+
         "       tb_deudas d,"+
         "       tb_aspirantes a"+
         "   where"+
         "       asign.id_alumno = a.id_alumno AND"+
         "       asign.id_alumno = d.id_alumno AND"+
         "       asign.id_alumno = :aspitante_id",
        nativeQuery = true
    )
    AspiranteDeudaProjection findAspiranteDeuda(@Param("aspitante_id") int aspiranteId);

}
