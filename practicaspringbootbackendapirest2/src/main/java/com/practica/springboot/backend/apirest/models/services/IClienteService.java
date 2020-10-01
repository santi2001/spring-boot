package com.practica.springboot.backend.apirest.models.services;

import java.util.List;

import com.practica.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findall();
	public Cliente findAndById(long id);
	public Cliente save(Cliente cliente);
	public Cliente update(long id, Cliente cliente);
	public void delete(long id);
}
