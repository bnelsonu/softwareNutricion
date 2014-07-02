package com.nutricion.service;

import com.nutricion.domain.ClienteEjercicio;

public interface ClienteEjercicioService {
	
	public void saveClienteEjericio(ClienteEjercicio clienteEjercicio);
	
	public int getNextClienteEjercicioId();

}
