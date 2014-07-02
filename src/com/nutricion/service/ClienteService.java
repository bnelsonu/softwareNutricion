package com.nutricion.service;

import com.nutricion.domain.Cliente;
import com.nutricion.domain.ClienteEjercicio;

public interface ClienteService {

	public void saveCliente(Cliente cliente);
	
	public void saveClienteEjercicio(ClienteEjercicio clienteEjercicio);
	
	public int getLastClientId();
	
	public int getLastClienteEjercicioId ();
}
