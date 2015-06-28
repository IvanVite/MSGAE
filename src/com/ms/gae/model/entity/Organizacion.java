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
public class Organizacion implements Serializable,Comparable<Organizacion>{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private Key industriaa;
	@Persistent
	private String nombre;
	@Persistent
	private String descripcion;
	@Persistent
	private String sitio_web;
	@Persistent
	private Integer telefono;
	@Persistent
	private String empleado;
	@Persistent
	private String correo_p;
	@Persistent
	private String correo_s;
	@Persistent
	private double ingreso_anual;
	
	@Persistent(defaultFetchGroup = "true")
	private Direccion direccion;
	@Persistent(defaultFetchGroup = "true")
	private Industria industria;
	
	public Organizacion() {
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSitio_web() {
		return sitio_web;
	}

	public void setSitio_web(String Sitio_web) {
		this.sitio_web = Sitio_web;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo_p() {
		return correo_p;
	}

	public void setCorreo_p(String correo_p) {
		this.correo_p = correo_p;
	}

	public String getCorreo_s() {
		return correo_s;
	}

	public void setCorreo_s(String correo_s) {
		this.correo_s = correo_s;
	}

	public double getIngreso_anual() {
		return ingreso_anual;
	}

	public void setIngreso_anual(double ingreso_anual) {
		this.ingreso_anual = ingreso_anual;
	}
		
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public Industria getIndustria() {
		return industria;
	}

	public void setIndustria(Industria industria) {
		this.industria = industria;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	
	

	public Key getIndustriaa() {
		return industriaa;
	}

	public void setIndustriaa(Key industriaa) {
		this.industriaa = industriaa;
	}

	public String toString() {
		return(
				"NOMBRE         : "+nombre+"\n"+
				"DESCRIPCION    : "+descripcion+"\n"+
				"SITIO_WEB    	: "+sitio_web+"\n"+
				"TELEFONO   	: "+telefono+"\n"+
				"EMPLEADO   	: "+empleado+"\n"+
				"DIRECCION		: "+direccion+"\n"+
				"CORREO_P		: "+correo_p+"\n"+
				"CORREO_S		: "+correo_s+"\n"+
				"INGRESO_ANUAL	: "+ingreso_anual+"\n"+
				"INDUSTRIA		: "+industria+"\n"+
				"");
	}
	public int compareTo(Organizacion organizacion) {
		return nombre.compareTo(organizacion.getNombre());
	}
	
	
	

}
