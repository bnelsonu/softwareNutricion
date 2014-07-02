package com.nutricion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nutricion.dao.ClienteDAO;
import com.nutricion.domain.Cliente;
import com.nutricion.domain.ClienteEjercicio;

@Service
public class ClienteServiceImpl implements ClienteService{

	
	@Autowired
	private ClienteDAO clienteDAO;
	
	@Override
	@Transactional
	public void saveCliente(Cliente cliente){
		clienteDAO.saveCliente(cliente);
	}

	@Override
	@Transactional
	public int getLastClientId() {
		
		return clienteDAO.getLastClientId();
	}

	@Override
	@Transactional
	public void saveClienteEjercicio(ClienteEjercicio clienteEjercicio) {
		
		clienteDAO.saveClienteEjercicio(clienteEjercicio);
	}

	@Override
	@Transactional
	public int getLastClienteEjercicioId() {
		
		return clienteDAO.getLastClienteEjercicioId();
	}
}
