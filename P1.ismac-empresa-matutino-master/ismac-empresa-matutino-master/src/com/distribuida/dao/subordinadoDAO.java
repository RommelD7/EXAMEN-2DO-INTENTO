package com.distribuida.dao;

import java.util.List;
import com.distribuida.entities.Empleado;
public interface subordinadoDAO {

	//CRUD BASICO
	public List<Subordinado> findAll();
	
	public Subordinado findOne(int id);
	
	public void add(Subordinado subordinado);
	
	public void up(Subordinado subordinado);
	
	public void del(int id);
	
    //CRUD AVANZADO
	
	
	
	
	

}