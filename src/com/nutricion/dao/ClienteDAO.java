package com.nutricion.dao;

import com.nutricion.domain.Cliente;
import com.nutricion.domain.ClienteEjercicio;

public interface ClienteDAO {

	public void saveCliente(Cliente cliente);
	public int getLastClientId();
	
	//prueba
	public void saveClienteEjercicio(ClienteEjercicio clienteEjercicio);
	//prueba
	public int getLastClienteEjercicioId();
	
	
}
