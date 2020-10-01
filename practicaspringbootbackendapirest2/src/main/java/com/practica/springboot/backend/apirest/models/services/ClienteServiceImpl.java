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
	private IClienteDao  clienteDao;
	
	@Override
	@Transactional(readOnly= true)
	public List<Cliente> findall() {
	
		return (List<Cliente> )clienteDao.findAll();
	}

	@Override
	public Cliente findAndById(long id) {
		return this.clienteDao.findById(id).orElse(null);
	
	}

	@Override
	public Cliente save(Cliente cliente) {
		return this.clienteDao.save(cliente);
		
	}

	@Override
	public Cliente update(long id, Cliente cliente) {
		return this.clienteDao.save(cliente);
	
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		this.clienteDao.deleteById(id);
	}
	
}
