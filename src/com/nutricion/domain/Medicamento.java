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
@Table(name="MEDICAMENTO")
public class Medicamento {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_MEDICAMENTO")
	private int codigoMedicamento;
	
	@Column(name="NOMBRE_MEDICAMENTO")
	private int nombreMedicamento;
	
	@ManyToMany
	@JoinTable (name="CLIENTE_MEDICAMENTO", joinColumns=@JoinColumn(name="CODIGO_MEDICAMENTO"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_CLIENTE"))
	private Collection <Cliente> clientes = new ArrayList <Cliente> ();
	
	public int getCodigoMedicamento() {
		return codigoMedicamento;
	}
	public void setCodigoMedicamento(int codigoMedicamento) {
		this.codigoMedicamento = codigoMedicamento;
	}
	public int getNombreMedicamento() {
		return nombreMedicamento;
	}
	public void setNombreMedicamento(int nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
}