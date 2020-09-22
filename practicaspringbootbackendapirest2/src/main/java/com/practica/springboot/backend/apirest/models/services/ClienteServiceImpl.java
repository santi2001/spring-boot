package com.practica.springboot.backend.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practica.springboot.backend.apirest.models.dao.IClienteDao;
import com.practica.springboot.backend.apirest.models.entity.Cliente;

@Service
public class ClienteServiceImpl  implements IClienteService{
	@Autowired
	IClienteDao  clienteDao;
	
	@Transactional(readOnly= true)
	public List<Cliente> findall() {
	
		return (List<Cliente> )clienteDao.findAll();
	}

}
