package com.nutricion.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nutricion.domain.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO{

	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void saveCliente(Cliente cliente) {
		
		sessionFactory.getCurrentSession().save(cliente);
	}
}
