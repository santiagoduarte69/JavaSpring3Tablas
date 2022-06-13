package com.sena.demo.service;

import java.util.List;

import com.sena.demo.models.Disquera;

public interface IDisqueraService {
    public List<Disquera> findAll();

    public void save(Disquera disquera);

    public Disquera findOne(Integer id);

    public void delete(Integer id);
}
