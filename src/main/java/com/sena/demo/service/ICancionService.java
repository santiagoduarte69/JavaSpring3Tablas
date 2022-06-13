package com.sena.demo.service;

import java.util.List;

import com.sena.demo.models.Cancion;

public interface ICancionService {

    public List<Cancion> findAll();

    public void save(Cancion cancion);

    public Cancion findOne(Integer id);

    public void delete(Integer id);
}
