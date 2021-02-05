package com.ceteq.sistema.bean;

import java.io.Serializable;

public class AspiranteDeudaBean implements Serializable{

	private static final long serialVersionUID = -8080246570251530489L;

    private Integer id_alumno;

    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;

    private Double deuda_total;

    public AspiranteDeudaBean() {
    }

    public AspiranteDeudaBean(Integer id_alumno, String nombre, String apellido_paterno, String apellido_materno,
            Double deuda_total) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.deuda_total = deuda_total;
    }

    public int getId_alumno() {
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

}
