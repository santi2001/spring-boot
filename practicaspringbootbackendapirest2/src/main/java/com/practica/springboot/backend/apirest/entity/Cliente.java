package com.practica.springboot.backend.apirest.entity;

import java.io.Serializable;
import java.util.Date;

public class Cliente  implements Serializable{
 private Long id;
 private String nombre;
 private String apellido;
 private String email;
 private Date fecha;

 
 // contructores 
 /**
  * 
  */
 public Cliente() {
 }


/**
 * @param id
 * @param nombre
 * @param apellido
 * @param email
 * @param fecha
 */
public Cliente(Long id, String nombre, String apellido, String email, Date fecha) {
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.fecha = fecha;
}

// getters and setters
public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getApellido() {
	return apellido;
}


public void setApellido(String apellido) {
	this.apellido = apellido;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public Date getFecha() {
	return fecha;
}


public void setFecha(Date fecha) {
	this.fecha = fecha;
}
 

 
}
