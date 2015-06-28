package com.ms.gae.model.entity;
import java.io.Serializable;
import java.lang.Comparable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
@PersistenceCapable (identityType=IdentityType.APPLICATION)
public class Departamento implements Serializable,Comparable<Departamento>{
	
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String nombre;
	@Persistent
	private String descripcion;

	public Departamento(){
		 super();
	}

	public Key getKey(){ 
		return key;
	}
	public String getNombre(){ 
		return nombre;
	}
	public String getDescripcion(){ 
		return descripcion;
	}
	public void setKey(Key key){ 
		this.key=key;
	}
	public void setNombre(String nombre ){ 
		 this.nombre=nombre;
	}
	public void setDescripcion(String descripcion ){ 
		 this.descripcion=descripcion;
	}

	public String toString(){ 
		return(
		"DATOS:::DEPARTAMENTO:::...\n"+
		"NOMBRE         : "+nombre+"\n"+
		"DESCRIPCION    : "+descripcion+"\n"+
		"");
	}

	public int compareTo(Departamento departamento){
		return nombre.compareTo(departamento.getNombre());
	}
}