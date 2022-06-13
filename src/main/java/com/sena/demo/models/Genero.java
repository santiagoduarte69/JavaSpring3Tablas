package com.sena.demo.models;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Genero;

    @Column(length = 50)
    @NotEmpty
    private String nombre_Genero;

    @Column(nullable = true)
    private Boolean estado_Genero;

    public Genero() {
    }

    public Genero(Integer id_Genero, String nombre_Genero, Boolean estado_Genero) {
        this.id_Genero = id_Genero;
        this.nombre_Genero = nombre_Genero;
        this.estado_Genero = estado_Genero;
    }

    public void setid_Genero(Integer id_Genero) {
        this.id_Genero = id_Genero;
    }

    public Integer getId_Genero() {
        return id_Genero;
    }

    public void setNombre_Genero(String nombre_Genero) {
        this.nombre_Genero = nombre_Genero;
    }

    public String getNombre_Genero() {
        return nombre_Genero;
    }

    public void setEstado_Genero(Boolean estado_Genero) {
        this.estado_Genero = estado_Genero;
    }

    public Boolean getEstado_Genero() {
        return estado_Genero;
    }

}
