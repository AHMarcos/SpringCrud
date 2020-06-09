package com.marcos.demo.controlador;

import com.marcos.demo.interfaceService.IPersonaService;
import com.marcos.demo.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.List;

@Controller
@RequestMapping
public class Controlador {

    @Autowired
    private IPersonaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Persona> personas=service.listar();
        model.addAttribute("personas", personas);
        return "index";
    }

}
