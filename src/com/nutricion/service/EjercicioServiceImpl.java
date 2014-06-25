package com.nutricion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutricion.dao.EjercicioDAO;
import com.nutricion.domain.Ejercicio;

@Service
public class EjercicioServiceImpl implements EjercicioService {
	
	@Autowired
	EjercicioDAO ejercicioDAO;

	@Override
	public List<Ejercicio> getAllEjercicios() {
		
		return ejercicioDAO.getAllEjercicios();
	}

}
