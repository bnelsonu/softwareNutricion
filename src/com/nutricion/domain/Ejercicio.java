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
@Table(name="EJERCICIO")
public class Ejercicio {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_EJERCICIO")
	private int codigoEjercicio;/**Aficion, Ejercicio, Deporte*/
	@Column(name="TIPO")
	private String tipo;
	@Column(name="DESCRIPCION")
	private String descripcion;

	@ManyToMany
	@JoinTable (name="CLIENTE_EJERCICIO", joinColumns=@JoinColumn(name="CODIGO_EJERCICIO"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_CLIENTE"))
	private Collection <Cliente> clientes = new ArrayList <Cliente> ();
	
	
	public int getCodigoEjercicio() {
		return codigoEjercicio;
	}
	public void setCodigoEjercicio(int codigoEjercicio) {
		this.codigoEjercicio = codigoEjercicio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
}