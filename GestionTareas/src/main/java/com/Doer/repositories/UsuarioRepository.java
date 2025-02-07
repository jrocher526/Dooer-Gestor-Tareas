package com.Doer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Doer.models.Usuario;

@Repository  										  // Marca esta interfaz como un componente que gestiona acceso a datos
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
    												// Aquí también podemos definir métodos de consulta personalizados, por ejemplo:
    Usuario findByUsername(String username);
}
