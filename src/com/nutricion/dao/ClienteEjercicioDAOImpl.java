package com.nutricion.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nutricion.domain.ClienteEjercicio;

@Repository
public class ClienteEjercicioDAOImpl implements ClienteEjercicioDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	

	@Override
	public void saveClienteEjericio(ClienteEjercicio clienteEjercicio) {
		
		sessionFactory.getCurrentSession().save(clienteEjercicio);
		
	}
	
	@Override
	public int getNextClienteEjercicioId() {
	
		String query = "select max(clienteEjercicioId) from ClienteEjercicio";
		
		Query getLastIdQy = sessionFactory.getCurrentSession().createQuery(query);
		
		if(getLastIdQy.list().get(0) == null){
			return 1;
		}
		else{
			return (int) getLastIdQy.uniqueResult()+1;
		}

	}
	
}
