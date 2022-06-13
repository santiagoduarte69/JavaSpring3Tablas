package com.sena.demo.models;

import java.util.List;

public interface IGenero {

    public List<Genero> findAll();

    public void save(Genero genero);

    public Genero findOne(Integer id_Genero);

    public void delete(Integer id_Genero);
}
