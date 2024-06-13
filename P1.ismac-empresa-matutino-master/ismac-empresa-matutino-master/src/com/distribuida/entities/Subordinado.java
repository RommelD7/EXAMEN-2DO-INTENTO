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
	
	id_Subordinado = idSubordinado;
	dni_empleado = dni_empleado;
	nombre_subordinado = nombre_subordinado;
	sexo = sexo;
	fecha_nac = fecha_nac;
	relacion = relacion;
	

}


public int getidSubordinado() {
	return id_Subordinado;
}


public int getdni_empleado(int dni_empleado) {
	this.dni_empleado = dni_empleado;
}


public String getNombre() {
	return Nombre;
}


public String getnombre_subordinado() {
	return nombre_subordinado;
}


public String getsexo() {
	return sexo;
}





@Override

public String toString() {
	return"Subordinado[idSubordinado]"
	
	
	
}

























}