package com.practica.springboot.backend.apirest.models.services;

import java.util.List;

import com.practica.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findall();
}
