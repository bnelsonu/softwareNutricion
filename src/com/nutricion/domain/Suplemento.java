package com.nutricion.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUPLEMENTO")
public class Suplemento {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_SUPLEMENTO")
	private int codigoSuplemento;
	
	@Column(name="NOMBRE_SUPLEMENTO")
	private String nombreSuplemento;
	
	@ManyToMany
	@JoinTable (name="CLIENTE_SUPLEMENTO", joinColumns=@JoinColumn(name="CODIGO_SUPLEMENTO"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_CLIENTE"))
	private Collection <Cliente> clientes = new ArrayList <Cliente> ();
	
	public int getCodigoSuplemento() {
		return codigoSuplemento;
	}
	public void setCodigoSuplemento(int codigoSuplemento) {
		this.codigoSuplemento = codigoSuplemento;
	}
	public String getNombreSuplemento() {
		return nombreSuplemento;
	}
	public void setNombreSuplemento(String nombreSuplemento) {
		this.nombreSuplemento = nombreSuplemento;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
}