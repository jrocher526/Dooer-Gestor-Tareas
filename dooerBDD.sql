-- Base de datos de prueba

DROP DATABASE IF EXISTS dooer_db;
CREATE DATABASE IF NOT EXISTS dooer_bd;

USE dooer_bd;

DROP TABLE IF EXISTS Usuario;
CREATE TABLE IF NOT EXISTS Usuario (
id INT AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(50) NOT NULL,
apellido VARCHAR(60) NOT NULL,
username VARCHAR(255) UNIQUE NOT NULL,
contraseña VARCHAR(255) NOT NULL,
email VARCHAR(255) UNIQUE NOT NULL CHECK (email LIKE '%@%') 
);

INSERT INTO Usuario VALUES
(
null,
'Jhonal',
'Roca',
'Jrocher',
'rocherjh',
'jhonajrh@gmail.com'
);
