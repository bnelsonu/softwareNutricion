package com.nutricion.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.nutricion.domain.Ejercicio;

@Transactional
@Repository
public class EjercicioDAOImpl implements EjercicioDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Ejercicio> getAllEjercicios() {
		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Ejercicio.class);
		criteria.addOrder(Order.asc("codigoEjercicio"));
		return criteria.list();
	}

	

	
}
