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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author brian.nelson.ulloa
 *
 */
@Entity
@Table(name="ALIMENTO")
public class Alimento {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_ALIMENTO")
	private int codigoAlimento;
	
	@Column(name="NOMBRE_ALIMENTO")
	private String nombreAlimento;
	
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable (name="ALIMENTO_VALORACION_DIETETICA", joinColumns=@JoinColumn(name="CODIGO_ALIMENTO"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_VALORACION_DIETETICA"))
	private Collection <ValoracionDietetica> valoracionDieteticas = new ArrayList <ValoracionDietetica> ();

    @ManyToOne
	@JoinColumn(name="codigoTipoAlimento")
	private TipoAlimento tipoAlimento;
	
	public int getCodigoAlimento() {
		return codigoAlimento;
	}
	public void setCodigoAlimento(int codigoAlimento) {
		this.codigoAlimento = codigoAlimento;
	}
	public String getNombreAlimento() {
		return nombreAlimento;
	}
	public void setNombreAlimento(String nombreAlimento) {
		this.nombreAlimento = nombreAlimento;
	}
	public Collection<ValoracionDietetica> getValoracionDieteticas() {
		return valoracionDieteticas;
	}
	public void setValoracionDieteticas(
			Collection<ValoracionDietetica> valoracionDieteticas) {
		this.valoracionDieteticas = valoracionDieteticas;
	}
	public TipoAlimento getTipoAlimento() {
		return tipoAlimento;
	}
	public void setTipoAlimento(TipoAlimento tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}
}