package com.nutricion.service;

import com.nutricion.domain.Cliente;

public interface ClienteService {

	public void saveCliente(Cliente cliente);
	
	public int getLastClientId();
}
