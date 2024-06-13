package com.distribuida.dao;

import java.util.List;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Empleado;


@Repository
public class subordinadoDAOImpl implements subordinadoDAO {	

	//cambio en el examen
	@Autowired

	private SessionFactory sessionFactory;
	
	
	
	//cambio
	
	@Override
	@Transactional
	
	public List<subordinado> findAll() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from subordinado", subordinado.class).getResultList();
		
		
	}

	@Override
	public subordinado findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(subordinado subordinado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(subordinado subordinado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}
}
