package com.guardiango.controller;

import com.guardiango.dao.AlertaDAO;
import com.guardiango.model.Alerta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AlertaController {

    @Autowired
    private AlertaDAO alertaDAO;

    // Mostrar la lista de alertas desde MySQL
    @GetMapping("/alertas")
    public String mostrarAlertas(Model model) {
        List<Alerta> alertas = alertaDAO.obtenerTodas();
        model.addAttribute("alertas", alertas);
        return "alertas";
    }

    // Mostrar el formulario para registrar una nueva alerta
    @GetMapping("/nueva-alerta")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alerta", new Alerta());
        return "formulario";
    }

    // Guardar una nueva alerta en MySQL
    @PostMapping("/guardar-alerta")
    public String guardarAlerta(@ModelAttribute Alerta alerta) {
        alertaDAO.guardar(alerta);
        return "redirect:/alertas";
    }
    
    @GetMapping("/")
    public String redirigirARaiz() {
    return "redirect:/alertas";
}

}

