package com.sena.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cancion")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Cancion;

    private String nombre_Cancion;

    private String fecha_Grabacion;

    private String duracion_Cancion;

    private Boolean estado_Cancion;


    public Cancion() {
    }

    public Cancion(Integer id_Cancion, String nombre_Cancion, String fecha_Grabacion, String duracion_Cancion,
            Boolean estado_Cancion) {
        this.id_Cancion = id_Cancion;
        this.nombre_Cancion = nombre_Cancion;
        this.fecha_Grabacion = fecha_Grabacion;
        this.duracion_Cancion = duracion_Cancion;
        this.estado_Cancion = estado_Cancion;
    }

    public void setId_Cancion(int id_Cancion) {
        this.id_Cancion = id_Cancion;
    }

    public Integer getId_Cancion() {
        return id_Cancion;
    }

    public void setNombre_Cancion(String nombre_Cancion) {
        this.nombre_Cancion = nombre_Cancion;
    }

    public String getNombre_Cancion() {
        return nombre_Cancion;
    }

    public void setFecha_Grabacion(String fecha_Grabacion) {
        this.fecha_Grabacion = fecha_Grabacion;
    }

    public String getFecha_Grabacion() {
        return fecha_Grabacion;
    }

    public void setDuracion_Cancion(String duracion_Cancion) {
        this.duracion_Cancion = duracion_Cancion;
    }

    public String getDuracion_Cancion() {
        return duracion_Cancion;
    }

    public void setEstado_Cancion(Boolean estado_Cancion) {
        this.estado_Cancion = estado_Cancion;
    }

    public Boolean getEstado_Cancion() {
        return estado_Cancion;
    }

    public void save(Disquera disquera) {

    }
}