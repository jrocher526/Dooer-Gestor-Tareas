package com.Doer.services;

import java.util.List;
import com.Doer.models.Usuario;

public interface UsuarioService {

	Usuario findByUsername(String username);       // Buscar un usuario por su nombre
    Usuario saveUsuario(Usuario usuario);         // Guardar o actualizar un usuario
    List<Usuario> findAllUsuarios();             // Listar todos los usuarios
}
