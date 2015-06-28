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
public class Direccion implements Serializable, Comparable<Direccion>{
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	private String facturacion;
	@Persistent
	private String cuidad_f;
	@Persistent
	private String estado_f;
	@Persistent
	private Integer cp_f;
	@Persistent
	private String pais_f;
	@Persistent
	private String envio;
	@Persistent
	private String cuidad_e;
	@Persistent
	private String estado_e;
	@Persistent
	private Integer cp_e;
	@Persistent
	private String pais_e;
	@Persistent(mappedBy = "direccion")
	private Organizacion organizacion;
	
	public Direccion() {
		super();
	}
	public Key getKey() {
		return key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public String getFacturacion() {
		return facturacion;
	}
	public void setFacturacion(String facturacion) {
		this.facturacion = facturacion;
	}
	public String getCuidad_f() {
		return cuidad_f;
	}
	public void setCuidad_f(String cuidad_f) {
		this.cuidad_f = cuidad_f;
	}
	public String getEstado_f() {
		return estado_f;
	}
	public void setEstado_f(String estado_f) {
		this.estado_f = estado_f;
	}
	public Integer getCp_f() {
		return cp_f;
	}
	public void setCp_f(Integer cp_f) {
		this.cp_f = cp_f;
	}
	public String getPais_f() {
		return pais_f;
	}
	public void setPais_f(String pais_f) {
		this.pais_f = pais_f;
	}
	public String getEnvio() {
		return envio;
	}
	public void setEnvio(String envio) {
		this.envio = envio;
	}
	public String getCuidad_e() {
		return cuidad_e;
	}
	public void setCuidad_e(String cuidad_e) {
		this.cuidad_e = cuidad_e;
	}
	public String getEstado_e() {
		return estado_e;
	}
	public void setEstado_e(String estado_e) {
		this.estado_e = estado_e;
	}
	public Integer getCp_e() {
		return cp_e;
	}
	public void setCp_e(Integer cp_e) {
		this.cp_e = cp_e;
	}
	public String getPais_e() {
		return pais_e;
	}
	public void setPais_e(String pais_e) {
		this.pais_e = pais_e;
	}
	public Organizacion getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}
	public String toString() {
		return "Direccion ["
				+ "facturacion="+ facturacion + ","
				+ "cuidad_f=" + cuidad_f + ","
				+ "estado_f="+ estado_f + ","
				+ "cp_f=" + cp_f + ","
				+ "pais_f=" + pais_f+ ","
				+ "envio=" + envio + ","
				+ "cuidad_e=" + cuidad_e + ","
				+ "estado_e="+ estado_e + ","
				+ "cp_e=" + cp_e + ","
				+ "pais_e=" + pais_e + "]";
	}
	public int compareTo(Direccion direccion) {
		return facturacion.compareTo(direccion.getFacturacion());
	}
	

}
