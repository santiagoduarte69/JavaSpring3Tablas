package com.sena.demo.controllers;

import com.sena.demo.models.Genero;
import com.sena.demo.models.IGenero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("genero")
@RequestMapping("/genero")

public class GeneroController {

    @Autowired
    private IGenero generod;

    @GetMapping(path = { "/listar", "/" })
    public String listar(Model model) {
        model.addAttribute("generosv", generod.findAll());
        return "genero/listageneros";

    }


    @GetMapping("/formgenero")
    public String form(Model model) {
        Genero genero = new Genero();
        model.addAttribute("genero", genero);
        model.addAttribute("accion", "Agregar Genero");

        return "genero/formgenero";
    }

    @PostMapping("/addgenero")
    public String add(@Valid Genero genero, BindingResult res, SessionStatus status, Model model) {
        if (res.hasErrors()) {
            return "genero/formgenero";
        }
        generod.save(genero);
        status.setComplete();
        return "redirect:listar";
    }

    @GetMapping("/editar/{id_Genero}")
    public String ver(@PathVariable Integer id_Genero, Model model) {
        Genero genero = null;
        if (id_Genero > 0) {
            genero = generod.findOne(id_Genero);
        } else {
            return "genero/listageneros";
        }
        model.addAttribute("genero", genero);
        model.addAttribute("accion", "actualizar genero");
        return "genero/formgenero";
    }

    @GetMapping("/eliminar/{id_Genero}")
    public String delete(@PathVariable Integer id_Genero, Model model) {
        if (id_Genero > 0) {
            generod.delete(id_Genero);
        }
        return "genero/listageneros";
    }
}
