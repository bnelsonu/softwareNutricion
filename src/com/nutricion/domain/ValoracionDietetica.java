package com.nutricion.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="VALORACION_DIETETICA")
public class ValoracionDietetica {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_VALORACION_DIETETICA")
	private int codigoValoracionDietetica;
	
	@Column(name="PREPARADOR_ALIMENTOS")
	private String preparadorAlimentos;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Cliente cliente;
	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable (name="ALIMENTO_VALORACION_DIETETICA", joinColumns=@JoinColumn(name="CODIGO_VALORACION_DIETETICA"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_ALIMENTO"))
	private Collection <Alimento> alimentosPreferidos = new ArrayList <Alimento> ();

	
	@ManyToMany(cascade=CascadeType.ALL)
    @JoinTable (name="ALIMENTO_VALORACION_DIETETICA", joinColumns=@JoinColumn(name="CODIGO_VALORACION_DIETETICA"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_ALIMENTO"))
	private Collection <Alimento> alimentosQueNoConsume = new ArrayList <Alimento> ();
	
	public int getCodigoValoracionDietetica() {
		return codigoValoracionDietetica;
	}

	public void setCodigoValoracionDietetica(int codigoValoracionDietetica) {
		this.codigoValoracionDietetica = codigoValoracionDietetica;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getPreparadorAlimentos() {
		return preparadorAlimentos;
	}

	public void setPreparadorAlimentos(String preparadorAlimentos) {
		this.preparadorAlimentos = preparadorAlimentos;
	}

	public Collection<Alimento> getAlimentosPreferidos() {
		return alimentosPreferidos;
	}

	public void setAlimentosPreferidos(Collection<Alimento> alimentosPreferidos) {
		this.alimentosPreferidos = alimentosPreferidos;
	}

	public Collection<Alimento> getAlimentosQueNoConsume() {
		return alimentosQueNoConsume;
	}

	public void setAlimentosQueNoConsume(Collection<Alimento> alimentosQueNoConsume) {
		this.alimentosQueNoConsume = alimentosQueNoConsume;
	}
}