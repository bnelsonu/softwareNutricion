package com.nutricion.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy="ejercicio")
	private Collection <ClienteEjercicio> clienteEjercicios = new ArrayList<ClienteEjercicio> ();

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
	public Collection<ClienteEjercicio> getClienteEjercicios() {
		return clienteEjercicios;
	}
	public void setClienteEjercicios(Collection<ClienteEjercicio> clienteEjercicios) {
		this.clienteEjercicios = clienteEjercicios;
	}
}