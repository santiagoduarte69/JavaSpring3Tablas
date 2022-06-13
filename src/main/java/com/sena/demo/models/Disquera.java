package com.sena.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disqueras")
public class Disquera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_Disquera;

    private String nit_Disquera;

    private String nombre_Disquera;

    private String telefono_Disquera;

    private String direccion_Disquera;

    private Boolean estado_Disquera;

    public Disquera() {
    }

    public Disquera(Integer id_Disquera, String nit_Disquera, String nombre_Disquera, String telefono_Disquera,
            String direccion_Disquera, Boolean estado_Disquera) {
        this.id_Disquera = id_Disquera;
        this.nit_Disquera = nit_Disquera;
        this.nombre_Disquera = nombre_Disquera;
        this.telefono_Disquera = telefono_Disquera;
        this.direccion_Disquera = direccion_Disquera;
        this.estado_Disquera = estado_Disquera;
    }

    public void setId_Disquera(int id_Disquera) {
        this.id_Disquera = id_Disquera;
    }

    public Integer getId_Disquera() {
        return id_Disquera;
    }

    public void setNit_Disquera(String nit_Disquera) {
        this.nit_Disquera = nit_Disquera;
    }

    public String getNit_Disquera() {
        return nit_Disquera;
    }

    public void setNombre_Disquera(String nombre_Disquera) {
        this.nombre_Disquera = nombre_Disquera;
    }

    public String getNombre_Disquera() {
        return nombre_Disquera;
    }

    public void setTelefono_Disquera(String telefono_Disquera) {
        this.telefono_Disquera = telefono_Disquera;
    }

    public String getTelefono_Disquera() {
        return telefono_Disquera;
    }

    public void setDireccion_Disquera(String direccion_Disquera) {
        this.direccion_Disquera = direccion_Disquera;
    }

    public String getDireccion_Disquera() {
        return direccion_Disquera;
    }

    public void setEstado_Disquera(Boolean estado_Disquera) {
        this.estado_Disquera = estado_Disquera;
    }

    public Boolean getEstado_Disquera() {
        return estado_Disquera;
    }

    public void save(Disquera disquera) {

    }
}