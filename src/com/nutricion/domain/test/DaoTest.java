package com.nutricion.domain.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nutricion.domain.Cliente;
import com.nutricion.domain.ClienteEjercicio;
import com.nutricion.domain.Ejercicio;

public class DaoTest {

	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Cliente cliente = new Cliente();
		

		cliente.setNombre("Brian");
		
		
	
		String query = "select max(codigoCliente) from Cliente";
		int lastId = 0;
		Query getLastIdQy = session.createQuery(query);
		
		if(getLastIdQy.list().get(0) == null){
			lastId = 1;
		}
		else
			lastId = (int) getLastIdQy.uniqueResult()+1;
		
		cliente.setCodigoCliente(lastId);
		
		List <Ejercicio> ejercicios = session.createCriteria(Ejercicio.class).list();
		Ejercicio ejercicio = ejercicios.get(0);			
				
		ClienteEjercicio clienteEjercicio = new ClienteEjercicio();
		clienteEjercicio.setCliente(cliente);
		clienteEjercicio.setEjercicio(ejercicio);
		
		session.save(clienteEjercicio);
		
		cliente.getClienteEjercicios().add(clienteEjercicio);
		
		session.save(cliente);
		session.getTransaction().commit();
		

	}

}
