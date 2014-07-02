package com.nutricion.dao;

import com.nutricion.domain.ClienteEjercicio;

public interface ClienteEjercicioDAO {

	public void saveClienteEjericio(ClienteEjercicio clienteEjercicio);
	
	public int getNextClienteEjercicioId();
}
