package com.practica.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica.springboot.backend.apirest.models.entity.Cliente;
import com.practica.springboot.backend.apirest.models.services.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteRestController {

	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("cliente")
	public List<Cliente> obtenerClientes()
	{
		return clienteService.findall();
	}
}
