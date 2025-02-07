package com.Doer.models;

import jakarta.persistence.*;

@Entity                  			 // indica que esta clase se mapeara a una tabla en la BD
@Table(name = "usuarios")			// Especifica el nombre de la tabla en la BD
public class Usuario {

	@Id  						 										 // Marca este campo como clave primaria en la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY)  				// Genera el valor unico de manera autoincremental
    private long id;					  // Este campo se almacenara en la columna "id" de la tabla usuarios
    private String username;			 // Este campo se almacenara en la columna "username" de la tabla usuarios
    private String contraseña;			// Este campo se almacenará en la columna "contraseña" de la tabla usuarios

    
    public Usuario() {				 // Constructor vacio (obligatorio para JPA)
    }

    
    public Usuario(String username, String contraseña) {		// Constructor con parametros (opcional, para conveniencia)
        this.username = username;
        this.contraseña = contraseña;
    }

    
    // Getters y setters (necesarios para acceder y modificar las propiedades)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
	
}
