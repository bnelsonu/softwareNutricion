package com.nutricion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nutricion.dao.ClienteEjercicioDAO;
import com.nutricion.domain.ClienteEjercicio;

@Service
public class ClienteEjercicioServiceImpl implements ClienteEjercicioService {

	@Autowired
	ClienteEjercicioDAO clienteEjercicioDAO;
	
	@Override
	@Transactional
	public void saveClienteEjericio(ClienteEjercicio clienteEjercicio) {
		
		clienteEjercicioDAO.saveClienteEjericio(clienteEjercicio);
	}

	@Override
	@Transactional
	public int getNextClienteEjercicioId() {
		return clienteEjercicioDAO.getNextClienteEjercicioId();
	}

	
}
