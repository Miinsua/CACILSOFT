package com.cacil.cacilsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

    @GetMapping("/")
    public String mostrarInicio(Model model) {
        model.addAttribute("mensaje", "Bienvenido a CACILSOFT 🚀");
        return "inicio"; // nombre del archivo HTML
    }
}