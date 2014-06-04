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
@Table(name="META")
public class Meta {
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_META")
	private String codigoMeta;
	
	@Column(name="DESCRIPCION")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name="codigoCliente")
	private Cliente cliente;
	
	public String getCodigoMeta() {
		return codigoMeta;
	}
	public void setCodigoMeta(String codigoMeta) {
		this.codigoMeta = codigoMeta;
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
