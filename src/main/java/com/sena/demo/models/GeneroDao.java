package com.sena.demo.models;

import java.util.List;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class GeneroDao implements IGenero {

    @PersistenceContext
    private EntityManager em;

    @Transactional(readOnly = true)
    @Override
    public List<Genero> findAll() {
        return em.createQuery("from Genero").getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Genero findOne(Integer id_Genero) {
        return em.find(Genero.class, id_Genero);
    }

    @Override
    @Transactional
    public void save(Genero genero) {
        if (genero.getId_Genero() != null && genero.getId_Genero() > 0) {
            em.merge(genero);
        } else {
            em.persist(genero);
        }
    }

    @Override
    @Transactional
    public void delete(Integer id_Genero) {
        em.remove(findOne(id_Genero));
    }
}
