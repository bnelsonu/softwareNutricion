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
@Table(name="DIETA_PREVIA")
public class DietaPrevia {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_DIETA")
	private String codigoDieta;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="codigoCliente")
	private Cliente cliente;
	
	public String getCodigoDieta() {
		return codigoDieta;
	}
	public void setCodigoDieta(String codigoDieta) {
		this.codigoDieta = codigoDieta;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}