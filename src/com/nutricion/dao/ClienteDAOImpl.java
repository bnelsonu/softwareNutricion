package com.nutricion.dao;

import javax.persistence.Query;

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
		Query getLastIdQy = (Query) sessionFactory.getCurrentSession().createQuery("select max(CODIGO_CLIENTE) from CLIENTE");
		
		if(getLastIdQy == null){
			return 1;
		}
		else
			return (int) getLastIdQy.getSingleResult();
	}
}
