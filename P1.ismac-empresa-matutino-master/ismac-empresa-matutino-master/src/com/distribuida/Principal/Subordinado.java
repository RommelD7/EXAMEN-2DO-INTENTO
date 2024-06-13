package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


public static void main(String[] args) {
	
	
ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");


SubordinadoDAO subordinadoDAO = context.getBean("subordinadoDAOImpl",SubordinadoDAO.class);


List<Subordinado> subordinados = subordinadoDAO.findAll();


subordinados.forEach(item    ->{
	
	
	System.out.println(item.toString());
	
		
}	);

context.close();

	
	
}


}


