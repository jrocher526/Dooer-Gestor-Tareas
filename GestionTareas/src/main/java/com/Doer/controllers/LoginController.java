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
    @GetMapping("/login")
    public String mostrarLoginForm() {
        return "login";  
    }

    // Procesar la información del formulario de login
    @PostMapping("/login")
    public String procesarLogin(@RequestParam("username") String username,
                                @RequestParam("password") String password, 
                                Model model) {

        Usuario usuario = usuarioService.findByUsername(username);

        if (usuario != null && usuario.getContraseña().equals(password)) {
            return "redirect:/home";  
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login";  
        }
    }

    
    @GetMapping("/home")
    public String mostrarHome() {
        return "home";  
    }
}
