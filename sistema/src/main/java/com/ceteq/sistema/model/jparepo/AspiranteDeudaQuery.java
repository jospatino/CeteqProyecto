package com.ceteq.sistema.model.jparepo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AspiranteDeudaQuery implements Serializable{

	private static final long serialVersionUID = -8080246570251530489L;

    @Id
    @Column(name = "id_alumno")
    private Integer id_alumno;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido_paterno")
    private String apellido_paterno;

    @Column(name = "apellido_materno")
    private String apellido_materno;

    @Column(name = "deuda_total")
    private Double deuda_total;

    public AspiranteDeudaQuery() {
    }

    public AspiranteDeudaQuery(Integer id_alumno, String nombre, String apellido_paterno, String apellido_materno,
            Double deuda_total) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.deuda_total = deuda_total;
    }

    public Integer getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Integer id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public void setApellido_paterno(String apellido_paterno) {
        this.apellido_paterno = apellido_paterno;
    }

    public String getApellido_materno() {
        return apellido_materno;
    }

    public void setApellido_materno(String apellido_materno) {
        this.apellido_materno = apellido_materno;
    }

    public Double getDeuda_total() {
        return deuda_total;
    }

    public void setDeuda_total(Double deuda_total) {
        this.deuda_total = deuda_total;
    }

    @Override
    public String toString() {
        return "AspiranteDeudaBean [apellido_materno=" + apellido_materno + ", apellido_paterno=" + apellido_paterno
                + ", deuda_total=" + deuda_total + ", nombre=" + nombre + "]";
    }

}
