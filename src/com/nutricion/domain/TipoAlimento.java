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


/**
 * @author brian.nelson.ulloa
 *
 */
@Entity
@Table(name="TIPO_ALIMENTO")
public class TipoAlimento {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_TIPO_ALIMENTO")
    private int codigoTipoAlimento;
	
	@Column(name="NOMBRE_TIPO_ALIMENTO")
    private String nombreTipoAlimento;
	
	@OneToMany(mappedBy="tipoAlimento")
	private Collection <Alimento> alimento = new ArrayList <Alimento> ();
	
	public int getCodigoTipoAlimento() {
		return codigoTipoAlimento;
	}

	public void setCodigoTipoAlimento(int codigoTipoAlimento) {
		this.codigoTipoAlimento = codigoTipoAlimento;
	}
	
	public String getNombreTipoAlimento() {
		return nombreTipoAlimento;
	}

	public void setNombreTipoAlimento(String nombreTipoAlimento) {
		this.nombreTipoAlimento = nombreTipoAlimento;
	}

	public Collection<Alimento> getAlimento() {
		return alimento;
	}

	public void setAlimento(Collection<Alimento> alimento) {
		this.alimento = alimento;
	}	
}