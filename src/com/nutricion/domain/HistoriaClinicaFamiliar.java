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
@Table(name="HISTORIA_CLINICA_FAMILIAR")
public class HistoriaClinicaFamiliar {


	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_HISTORIA_CLINICA_FAMILIAR")
	private int codigoHistoriaClinicaFamiliar;
	@Column(name="PROBLEMAS_CARDIO_VASCULARES")
	private boolean problemasCardioVasculares;
	@Column(name="HTA")
	private boolean hta;
	@Column(name="DM")
	private boolean dm;
	@Column(name="DISLIPIDEMIA")
	private boolean dislipidemia;
	@Column(name="EPILEPSIA")
	private boolean epilepsia;
	@Column(name="OBESIDAD")
	private boolean obesidad;
	@Column(name="OSTEOPOROSIS")
	private boolean osteoporosis;
	@Column(name="TIROIDES")
	private boolean tiroides;
	@Column(name="CA")
	private boolean ca;
	@Column(name="OTROS")
	private String otros;
	
	@OneToOne
    @PrimaryKeyJoinColumn
	private Cliente cliente;
		
	
	public int getCodigoHistoriaClinicaFamiliar() {
		return codigoHistoriaClinicaFamiliar;
	}
	public void setCodigoHistoriaClinicaFamiliar(int codigoHistoriaClinicaFamiliar) {
		this.codigoHistoriaClinicaFamiliar = codigoHistoriaClinicaFamiliar;
	}
	public boolean isProblemasCardioVasculares() {
		return problemasCardioVasculares;
	}
	public void setProblemasCardioVasculares(boolean problemasCardioVasculares) {
		this.problemasCardioVasculares = problemasCardioVasculares;
	}
	public boolean isHta() {
		return hta;
	}
	public void setHta(boolean hta) {
		this.hta = hta;
	}
	public boolean isDm() {
		return dm;
	}
	public void setDm(boolean dm) {
		this.dm = dm;
	}
	public boolean isDislipidemia() {
		return dislipidemia;
	}
	public void setDislipidemia(boolean dislipidemia) {
		this.dislipidemia = dislipidemia;
	}
	public boolean isEpilepsia() {
		return epilepsia;
	}
	public void setEpilepsia(boolean epilepsia) {
		this.epilepsia = epilepsia;
	}
	public boolean isObesidad() {
		return obesidad;
	}
	public void setObesidad(boolean obesidad) {
		this.obesidad = obesidad;
	}
	public boolean isOsteoporosis() {
		return osteoporosis;
	}
	public void setOsteoporosis(boolean osteoporosis) {
		this.osteoporosis = osteoporosis;
	}
	public boolean isTiroides() {
		return tiroides;
	}
	public void setTiroides(boolean tiroides) {
		this.tiroides = tiroides;
	}
	public boolean isCa() {
		return ca;
	}
	public void setCa(boolean ca) {
		this.ca = ca;
	}
	public String getOtros() {
		return otros;
	}
	public void setOtros(String otros) {
		this.otros = otros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
