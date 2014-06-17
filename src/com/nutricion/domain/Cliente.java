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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {

	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="CODIGO_CLIENTE")
	private int codigoCliente;
	@Column(name="NOMBRE")
	private String nombre;
	@Column(name="APELLIDO1")
	private String apellido1;
	@Column(name="APELLIDO2")
	private String apellido2;
	@Column(name="EDAD")
	private int edad;
	@Column(name="NACIONALIDAD")
	private String nacionalidad;
	@Column(name="OCUPACION")
	private String ocupacion;
	@Column(name="LUGAR_TRABAJO")
	private String lugarTrabajo;
	@Column(name="CORREO")
	private String correo;
	@Column(name="FUMADO")
	private boolean fumado;
	@Column(name="BEBIDAS_ALCOHOLICAS")
	private boolean bebidasAlcoholicas;
	@Column(name="FRECUENCIA_EJERCICIO")
	private String frecuenciaEjercicio;
	@Column(name="ESTILO_VIDA")
	private String estiloVida;
	
	@OneToOne(mappedBy="cliente", cascade=CascadeType.ALL)
    private HistoriaClinicaFamiliar historiaClinicaFamiliar;
    @OneToOne(mappedBy="cliente", cascade=CascadeType.ALL)
    private HistoriaClinicaPersonal historiaClinicaPersonal;
    @OneToOne(mappedBy="cliente", cascade=CascadeType.ALL)
    private ValoracionDietetica valoracionDietetica;
    @OneToOne(mappedBy="cliente", cascade=CascadeType.ALL)
    private ConductasRelSalud conductasRelSalud;
    @OneToOne(mappedBy="cliente", cascade=CascadeType.ALL)
    private AlimentacionaEvaluar alimentacionaEvaluar;
	
    @ManyToMany(cascade=CascadeType.ALL)
	@JoinTable (name="CLIENTE_TELEFONO", joinColumns=@JoinColumn(name="CODIGO_CLIENTE"),
	inverseJoinColumns=@JoinColumn(name="CODIGO_TELEFONO"))
	private Collection <Telefono> telefonos = new ArrayList <Telefono> ();
    
    @ManyToMany(cascade=CascadeType.ALL)
   	@JoinTable (name="CLIENTE_MEDICAMENTO", joinColumns=@JoinColumn(name="CODIGO_CLIENTE"),
   	inverseJoinColumns=@JoinColumn(name="CODIGO_MEDICAMENTO"))
    private Collection <Medicamento> medicamentos = new ArrayList <Medicamento> ();
    
    @ManyToMany(cascade=CascadeType.ALL)
   	@JoinTable (name="CLIENTE_SUPLEMENTO", joinColumns=@JoinColumn(name="CODIGO_CLIENTE"),
   	inverseJoinColumns=@JoinColumn(name="CODIGO_SUPLEMENTO"))
    private Collection <Suplemento> suplementos = new ArrayList <Suplemento> ();
	
    @ManyToMany(cascade=CascadeType.ALL)
   	@JoinTable (name="CLIENTE_EJERCICIO", joinColumns=@JoinColumn(name="CODIGO_CLIENTE"),
   	inverseJoinColumns=@JoinColumn(name="CODIGO_EJERCICIO"))
	private Collection <Ejercicio> ejercicios = new ArrayList <Ejercicio> ();
	
	@OneToMany(mappedBy="cliente")
	private Collection <DietaPrevia> dietasPrevias = new ArrayList <DietaPrevia> ();
	
	@OneToMany(mappedBy="cliente")
	private Collection <Meta> metas = new ArrayList <Meta> ();
	
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getOcupacion() {
		return ocupacion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public String getLugarTrabajo() {
		return lugarTrabajo;
	}
	public void setLugarTrabajo(String lugarTrabajo) {
		this.lugarTrabajo = lugarTrabajo;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public boolean isFumado() {
		return fumado;
	}
	public void setFumado(boolean fumado) {
		this.fumado = fumado;
	}
	public boolean isBebidasAlcoholicas() {
		return bebidasAlcoholicas;
	}
	public void setBebidasAlcoholicas(boolean bebidasAlcoholicas) {
		this.bebidasAlcoholicas = bebidasAlcoholicas;
	}
	public String getFrecuenciaEjercicio() {
		return frecuenciaEjercicio;
	}
	public void setFrecuenciaEjercicio(String frecuenciaEjercicio) {
		this.frecuenciaEjercicio = frecuenciaEjercicio;
	}
	public String getEstiloVida() {
		return estiloVida;
	}
	public void setEstiloVida(String estiloVida) {
		this.estiloVida = estiloVida;
	}
	public HistoriaClinicaFamiliar getHistoriaClinicaFamiliar() {
		return historiaClinicaFamiliar;
	}
	public void setHistoriaClinicaFamiliar(
			HistoriaClinicaFamiliar historiaClinicaFamiliar) {
		this.historiaClinicaFamiliar = historiaClinicaFamiliar;
	}
	public HistoriaClinicaPersonal getHistoriaClinicaPersonal() {
		return historiaClinicaPersonal;
	}
	public void setHistoriaClinicaPersonal(
			HistoriaClinicaPersonal historiaClinicaPersonal) {
		this.historiaClinicaPersonal = historiaClinicaPersonal;
	}
	public ValoracionDietetica getValoracionDietetica() {
		return valoracionDietetica;
	}
	public void setValoracionDietetica(ValoracionDietetica valoracionDietetica) {
		this.valoracionDietetica = valoracionDietetica;
	}
	public ConductasRelSalud getConductasRelSalud() {
		return conductasRelSalud;
	}
	public void setConductasRelSalud(ConductasRelSalud conductasRelSalud) {
		this.conductasRelSalud = conductasRelSalud;
	}
	public Collection<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Collection<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public Collection<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	public void setMedicamentos(Collection<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	public Collection<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	public void setEjercicios(Collection<Ejercicio> ejercicios) {
		this.ejercicios = ejercicios;
	}
	public Collection<DietaPrevia> getDietasPrevias() {
		return dietasPrevias;
	}
	public void setDietasPrevias(Collection<DietaPrevia> dietasPrevias) {
		this.dietasPrevias = dietasPrevias;
	}
	public Collection<Meta> getMetas() {
		return metas;
	}
	public void setMetas(Collection<Meta> metas) {
		this.metas = metas;
	}
	public AlimentacionaEvaluar getAlimentacionaEvaluar() {
		return alimentacionaEvaluar;
	}
	public void setAlimentacionaEvaluar(AlimentacionaEvaluar alimentacionaEvaluar) {
		this.alimentacionaEvaluar = alimentacionaEvaluar;
	}
	public Collection<Suplemento> getSuplementos() {
		return suplementos;
	}
	public void setSuplementos(Collection<Suplemento> suplementos) {
		this.suplementos = suplementos;
	}
}