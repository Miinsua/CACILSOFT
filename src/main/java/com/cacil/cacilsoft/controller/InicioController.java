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
    
    @GetMapping("/creditos")
    public String mostrarCreditos(Model model) {
        model.addAttribute("titulo", "Módulo Créditos");
        return "Creditos"; // archivo modulo1.html
    }
    
    
    @GetMapping("/creditos/estadisticos/cartera")
    public String verCartera(Model model) {
        model.addAttribute("titulo", "Cartera Estadística");
        return "creditos/cartera";
    }
}
