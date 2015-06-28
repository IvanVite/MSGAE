package com.ms.gae.model.entity;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Industria implements Serializable, Comparable<Industria> {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String nombre;
	@Persistent
	private String tipo_i;
	@Persistent
	private String asignadoA;
	@Persistent(mappedBy = "industria")
	private Organizacion organizacion;
	
	public Industria() {
		super();
	}
	
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo_i;
	}

	public void setTipo(String tipo_i) {
		this.tipo_i = tipo_i;
	}

	public String getAsignadoA() {
		return asignadoA;
	}
	public void setAsignadoA(String asignadoA) {
		this.asignadoA = asignadoA;
	}
	public String getTipo_i() {
		return tipo_i;
	}

	public void setTipo_i(String tipo_i) {
		this.tipo_i = tipo_i;
	}

	public Organizacion getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

	public String toString() {
		return(
				"NOMBRE        : "+nombre+"\n"+
				"TIPO		   : "+tipo_i+"\n"+ 
				"ASIGANDOA     : "+asignadoA+"\n"+
				"");
	}

	public int compareTo(Industria indiIndustria) {
		return nombre.compareTo(indiIndustria.getNombre());
	}
	
	
}
