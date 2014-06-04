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
@Table(name="TELEFONO")
public class Telefono {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_TELEFONO")
	private int codigoTelefono;
	
	@Column(name="NUMERO_TELEFONO")
	private String numeroTelefono;
	
	@ManyToMany
	@JoinTable (name="CLIENTE_TELEFONO", joinColumns=@JoinColumn(name="CODIGO_TELEFONO"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_CLIENTE"))
	private Collection <Cliente> clientes = new ArrayList <Cliente> ();
	
	public int getCodigoTelefono() {
		return codigoTelefono;
	}
	public void setCodigoTelefono(int codigoTelefono) {
		this.codigoTelefono = codigoTelefono;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
}
