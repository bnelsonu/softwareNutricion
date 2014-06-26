package com.nutricion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE_EJERCICIO")
public class ClienteEjercicio {
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CLIENTE_EJERCICIO_ID")
	private int clienteEjercicioId;
	 
	@ManyToOne
	@JoinColumn(name="codigoCliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="codigoEjercicio")
	private Ejercicio ejercicio;
	 
	public int getClienteEjercicioId() {
		return clienteEjercicioId;
	}
	public void setClienteEjercicioId(int clienteEjercicioId) {
		this.clienteEjercicioId = clienteEjercicioId;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Ejercicio getEjercicio() {
		return ejercicio;
	}
	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}	
}
