package com.practica.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;


import org.springframework.lang.NonNull;
@Entity
@Table(name = "clientes")
public class Cliente  implements Serializable{

 @Id	
 @GeneratedValue(strategy= GenerationType.IDENTITY)
 private Long id;
 // @NotEmpty
 // @Size ( min=4,max=12, message= "debe tener un tamaño entre 4 y 12 caracteres)"
 @Column(nullable = false)
 private String nombre;
 // @NotEmpty (message = "no puede estar vacio")
 private String apellido;
 // @NotEmpty (message = "no puede estar vacio")
 // @Email (message = " no tiene un formato valido")
 @Column(nullable = false,unique = true)
 private String email;
 
 private Date createAt;

 
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
 * @param createAt
 */
public Cliente(Long id, String nombre, String apellido, String email, Date createAt) {
	this.id = id;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.createAt = createAt;
}

@PrePersist
public void prePersist()
{
	this.createAt = new Date();
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


public Date getCreateAt() {
	return createAt;
}


public void setCreateAt(Date createAt) {
	this.createAt = createAt;
}




 
}
