package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "subordinado")
public class Subordinado {
	//Es la prueba la seccion de empleado 2
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	
	@Column(name = "id_Subordinado")
private int 	id_Subordinado;
	@Column(name = "dni_empleado")
private String	dni_empleado;
	@Column(name = "nombre_subordinado")
private String	nombre_subordinado;
	@Column(name = "sexo")
private String	sexo;
	@Column(name = "fecha_nac")
private String	Dni;
	@Column(name = "relacion")
private String	relacion;


public Subordinado() {}

public Subordinado(int idSubordinado, String dni_empleado, String nombreSubordinado, String sexo, String Fecha_nac, relacion) {
	
	
	this.idSubordinado = idSubordinado;
	
	
	
	
	
	
}






}