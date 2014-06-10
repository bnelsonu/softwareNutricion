package com.nutricion.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CONDUCTAS_REL_SALUD")
public class ConductasRelSalud {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_CONDUCTA_REL_SALUD")
	private int codigoConductaRelSalud;
	
	@Column(name="DOLOR_TORAX")
	private String dolorTorax;
	
	@Column(name="DESMAYOS")
	private String desmayos;
	
	@Column(name="FALTA_DE_AIRE_REPOSO")
	private String faltaDeAireReposo;
	
	@Column(name="DOLOR_CABEZA_FRECUENTE")
	private String dolorCabezaFrecuente;
	
	@Column(name="PROBLEMAS_ARTI_ESP_HUE_ROD_CAD")
	private String problemasArtiEspHueRodCad;
	
	@Column(name="SITUACION_FISICA")
	private String situacionFisica;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CODIGO_CLIENTE")
	private Cliente cliente;
	
	public int getCodigoConductaRelSalud() {
		return codigoConductaRelSalud;
	}
	public void setCodigoConductaRelSalud(int codigoConductaRelSalud) {
		this.codigoConductaRelSalud = codigoConductaRelSalud;
	}
	public String getDolorTorax() {
		return dolorTorax;
	}
	public void setDolorTorax(String dolorTorax) {
		this.dolorTorax = dolorTorax;
	}
	public String getDesmayos() {
		return desmayos;
	}
	public void setDesmayos(String desmayos) {
		this.desmayos = desmayos;
	}
	public String getFaltaDeAireReposo() {
		return faltaDeAireReposo;
	}
	public void setFaltaDeAireReposo(String faltaDeAireReposo) {
		this.faltaDeAireReposo = faltaDeAireReposo;
	}
	public String getDolorCabezaFrecuente() {
		return dolorCabezaFrecuente;
	}
	public void setDolorCabezaFrecuente(String dolorCabezaFrecuente) {
		this.dolorCabezaFrecuente = dolorCabezaFrecuente;
	}
	
	public String getProblemasArtiEspHueRodCad() {
		return problemasArtiEspHueRodCad;
	}
	public void setProblemasArtiEspHueRodCad(String problemasArtiEspHueRodCad) {
		this.problemasArtiEspHueRodCad = problemasArtiEspHueRodCad;
	}
	public String getSituacionFisica() {
		return situacionFisica;
	}
	public void setSituacionFisica(String situacionFisica) {
		this.situacionFisica = situacionFisica;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
