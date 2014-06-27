package com.nutricion.dao;

import org.hibernate.Query;

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

	@Override
	public int getLastClientId() {
		
		
		String query = "select max(codigoCliente) from Cliente";
		
		Query getLastIdQy = sessionFactory.getCurrentSession().createQuery(query);
		
		if(getLastIdQy.list().get(0) == null){
			return 1;
		}
		else
			return (int) getLastIdQy.uniqueResult()+1;
	}
}
