package com.nutricion.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="ALIMENTACION_A_EVALUAR")
public class AlimentacionaEvaluar {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_ALIMENTACIONEVALUAR")
	private int codigoAlimentacionEvaluar;
	@Column(name="DESAYUNO")
	private String desayuno;
	@Column(name="MERIENDA_MEDIA_MANANA")
	private String meriendaMediaManana;
	@Column(name="ALMUERZO")
	private String almuerzo;
	@Column(name="MERIENDA_TARDE")
	private String meriendaTarde;
	@Column(name="CENA")
	private String cena;
	@Column(name="COALICION_NOCTURNA")
	private String colacionNocturna;
	@Column(name="CONSUMO_COMIDA_RAPIDA")
	private String consumoComidaRapida;
	@Column(name="HIDRATACION")
	private String hidratacion;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Cliente cliente;
	
	public int getCodigoAlimentacionEvaluar() {
		return codigoAlimentacionEvaluar;
	}
	public void setCodigoAlimentacionEvaluar(int codigoAlimentacionEvaluar) {
		this.codigoAlimentacionEvaluar = codigoAlimentacionEvaluar;
	}
	public String getDesayuno() {
		return desayuno;
	}
	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	public String getMeriendaMediaManana() {
		return meriendaMediaManana;
	}
	public void setMeriendaMediaManana(String meriendaMediaManana) {
		this.meriendaMediaManana = meriendaMediaManana;
	}
	public String getAlmuerzo() {
		return almuerzo;
	}
	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}
	public String getMeriendaTarde() {
		return meriendaTarde;
	}
	public void setMeriendaTarde(String meriendaTarde) {
		this.meriendaTarde = meriendaTarde;
	}
	public String getCena() {
		return cena;
	}
	public void setCena(String cena) {
		this.cena = cena;
	}
	public String getColacionNocturna() {
		return colacionNocturna;
	}
	public void setColacionNocturna(String colacionNocturna) {
		this.colacionNocturna = colacionNocturna;
	}
	public String getConsumoComidaRapida() {
		return consumoComidaRapida;
	}
	public void setConsumoComidaRapida(String consumoComidaRapida) {
		this.consumoComidaRapida = consumoComidaRapida;
	}
	public String getHidratacion() {
		return hidratacion;
	}
	public void setHidratacion(String hidratacion) {
		this.hidratacion = hidratacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}