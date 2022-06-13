package com.sena.demo.controllers;

import javax.validation.Valid;

import com.sena.demo.models.Disquera;
import com.sena.demo.service.IDisqueraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("disquera")
@RequestMapping("/disquera")
public class DisqueraController {

    @Autowired
    private IDisqueraService disquerad;

    @GetMapping(path = { "/listar", "", "/" })
    public String listar(Model m) {
        m.addAttribute("disqueras", disquerad.findAll());
        return "disquera/listar";
    }

    @GetMapping("/ver/{id}")
    public String ver(@PathVariable Integer id, Model m) {
        Disquera disquera = null;
        if (id > 0) {
            disquera = disquerad.findOne(id);
        } else {
            return "redirect:listar";
        }
        m.addAttribute("disquera", disquera);
        m.addAttribute("accion", "Actualizar disquera");
        return "disquera/form";
    }

    @GetMapping("/form")
    public String form(Model m) {
        Disquera disquera = new Disquera();
        m.addAttribute("disquera", disquera);
        m.addAttribute("accion", "Agregar Cliente");
        return "disquera/form";
    }

    @PostMapping("/add")
    public String add(@Valid Disquera disquera, BindingResult res, Model m, SessionStatus status) {
        if (res.hasErrors()) {
            return "disquera/form";
        }
        disquerad.save(disquera);
        status.setComplete();
        return "redirect:listar";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        if (id > 0) {
            disquerad.delete(id);
        }
        return "redirect:listar";
    }
}
