package com.Doer.controllers;

import com.Doer.models.Usuario;
import com.Doer.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller  
public class LoginController {

    @Autowired
    private UsuarioService usuarioService;

    // Mostrar la página de login
    @GetMapping("/inicio")
    public String mostrarInicioForm() {
        return "inicio";  
    }

   

    
    @GetMapping("/tablero")
    public String mostrarHome() {
        return "tablero";  
    }
}
