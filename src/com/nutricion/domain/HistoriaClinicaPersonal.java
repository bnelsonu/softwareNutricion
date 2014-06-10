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
@Table(name = "HISTORIA_CLINICA_PERSONAL")
public class HistoriaClinicaPersonal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_HISTORIA_CLINICA_PERSONAL")
	private int codigoHistoriaClinicaPersonal;

	@Column(name = "HERNIA_HIATAL")
	private boolean herniaHiatal;

	@Column(name = "CICLOS_MESTRUALES")
	private boolean ciclosMestruales;

	@Column(name = "ALERGIS_INTOLERANCIA")
	private boolean alergiasIntolerancia;

	@Column(name = "OBB")
	private boolean obB;

	@Column(name = "CX")
	private boolean cx;

	@Column(name = "DM")
	private boolean dm;

	@Column(name = "MET_CHO")
	private boolean metCHO;

	@Column(name = "DISLIPIDEMIA")
	private boolean dislipidemina;

	@Column(name = "HDL")
	private boolean hdl;

	@Column(name = "ACIDO_URICO")
	private boolean acidoUrico;

	@Column(name = "HTA")
	private boolean hta;

	@Column(name = "RETIENE_LIQUIDOS")
	private boolean retieneLiquidos;

	@Column(name = "SVC")
	private boolean svc;

	@Column(name = "CEFALEAS")
	private boolean cefaleas;

	@Column(name = "TGI")
	private boolean tgi;

	@Column(name = "ESTRENIMIENTO")
	private boolean estrenimiento;

	@Column(name = "DIARREAS")
	private boolean diarreas;

	@Column(name = "OSEOS")
	private boolean oseos;
	
	@Column(name = "HEMORROIDES")
	private boolean hemorroides;

	@Column(name = "GASTRITIS")
	private boolean gastritis;

	@Column(name = "TIROIDES")
	private boolean tiroides;

	@Column(name = "RINONES")
	private boolean rinones;

	@Column(name = "COLITIS")
	private boolean colitis;

	@Column(name = "ANSIEDAD")
	private boolean ansiedad;

	@Column(name = "ESTRES")
	private boolean estres;

	@Column(name = "CANSANCIO")
	private boolean cansancio;

	@Column(name = "CUTANEOS")
	private boolean cutaneos;

	@Column(name = "INSOMNIO")
	private boolean insomnio;

	@Column(name = "ALERGIAS")
	private boolean alergias;

	@Column(name = "HIGADO")
	private boolean higado;

	@Column(name = "AUDICION")
	private boolean audicion;

	@Column(name = "OLFATO")
	private boolean olfato;

	@Column(name = "VISION")
	private boolean vision;

	@Column(name = "APNEA")
	private boolean apnea;

	@Column(name = "RONCA")
	private boolean ronca;

	@Column(name = "VARICES")
	private boolean varices;

	@Column(name = "CIRCULATORIOS")
	private boolean circulatorios;

	@Column(name = "CA")
	private boolean ca;

	@Column(name = "DERRAMES")
	private boolean derrames;

	@Column(name = "MIALGIAS")
	private boolean mialgias;

	@Column(name = "FIBROMIALGIAS")
	private boolean fibromialgias;

	@Column(name = "OTROS")
	private String otros;

	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="CODIGO_CLIENTE")
	private Cliente cliente;

	public int getCodigoHistoriaClinicaPersonal() {
		return codigoHistoriaClinicaPersonal;
	}

	public void setCodigoHistoriaClinicaPersonal(int codigoHistoriaClinicaPersonal) {
		this.codigoHistoriaClinicaPersonal = codigoHistoriaClinicaPersonal;
	}

	public boolean isHerniaHiatal() {
		return herniaHiatal;
	}

	public void setHerniaHiatal(boolean herniaHiatal) {
		this.herniaHiatal = herniaHiatal;
	}

	public boolean isCiclosMestruales() {
		return ciclosMestruales;
	}

	public void setCiclosMestruales(boolean ciclosMestruales) {
		this.ciclosMestruales = ciclosMestruales;
	}

	public boolean isAlergiasIntolerancia() {
		return alergiasIntolerancia;
	}

	public void setAlergiasIntolerancia(boolean alergiasIntolerancia) {
		this.alergiasIntolerancia = alergiasIntolerancia;
	}

	public boolean isObB() {
		return obB;
	}

	public void setObB(boolean obB) {
		this.obB = obB;
	}

	public boolean isCx() {
		return cx;
	}

	public void setCx(boolean cx) {
		this.cx = cx;
	}

	public boolean isDm() {
		return dm;
	}

	public void setDm(boolean dm) {
		this.dm = dm;
	}

	public boolean isMetCHO() {
		return metCHO;
	}

	public void setMetCHO(boolean metCHO) {
		this.metCHO = metCHO;
	}

	public boolean isDislipidemina() {
		return dislipidemina;
	}

	public void setDislipidemina(boolean dislipidemina) {
		this.dislipidemina = dislipidemina;
	}

	public boolean isHdl() {
		return hdl;
	}

	public void setHdl(boolean hdl) {
		this.hdl = hdl;
	}

	public boolean isAcidoUrico() {
		return acidoUrico;
	}

	public void setAcidoUrico(boolean acidoUrico) {
		this.acidoUrico = acidoUrico;
	}

	public boolean isHta() {
		return hta;
	}

	public void setHta(boolean hta) {
		this.hta = hta;
	}

	public boolean isRetieneLiquidos() {
		return retieneLiquidos;
	}

	public void setRetieneLiquidos(boolean retieneLiquidos) {
		this.retieneLiquidos = retieneLiquidos;
	}

	public boolean isSvc() {
		return svc;
	}

	public void setSvc(boolean svc) {
		this.svc = svc;
	}

	public boolean isCefaleas() {
		return cefaleas;
	}

	public void setCefaleas(boolean cefaleas) {
		this.cefaleas = cefaleas;
	}

	public boolean isTgi() {
		return tgi;
	}

	public void setTgi(boolean tgi) {
		this.tgi = tgi;
	}

	public boolean isEstrenimiento() {
		return estrenimiento;
	}

	public void setEstrenimiento(boolean estrenimiento) {
		this.estrenimiento = estrenimiento;
	}

	public boolean isDiarreas() {
		return diarreas;
	}

	public void setDiarreas(boolean diarreas) {
		this.diarreas = diarreas;
	}

	public boolean isOseos() {
		return oseos;
	}

	public void setOseos(boolean oseos) {
		this.oseos = oseos;
	}

	public boolean isHemorroides() {
		return hemorroides;
	}

	public void setHemorroides(boolean hemorroides) {
		this.hemorroides = hemorroides;
	}

	public boolean isGastritis() {
		return gastritis;
	}

	public void setGastritis(boolean gastritis) {
		this.gastritis = gastritis;
	}

	public boolean isTiroides() {
		return tiroides;
	}

	public void setTiroides(boolean tiroides) {
		this.tiroides = tiroides;
	}

	public boolean isRinones() {
		return rinones;
	}

	public void setRinones(boolean rinones) {
		this.rinones = rinones;
	}

	public boolean isColitis() {
		return colitis;
	}

	public void setColitis(boolean colitis) {
		this.colitis = colitis;
	}

	public boolean isAnsiedad() {
		return ansiedad;
	}

	public void setAnsiedad(boolean ansiedad) {
		this.ansiedad = ansiedad;
	}

	public boolean isEstres() {
		return estres;
	}

	public void setEstres(boolean estres) {
		this.estres = estres;
	}

	public boolean isCansancio() {
		return cansancio;
	}

	public void setCansancio(boolean cansancio) {
		this.cansancio = cansancio;
	}

	public boolean isCutaneos() {
		return cutaneos;
	}

	public void setCutaneos(boolean cutaneos) {
		this.cutaneos = cutaneos;
	}

	public boolean isInsomnio() {
		return insomnio;
	}

	public void setInsomnio(boolean insomnio) {
		this.insomnio = insomnio;
	}

	public boolean isAlergias() {
		return alergias;
	}

	public void setAlergias(boolean alergias) {
		this.alergias = alergias;
	}

	public boolean isHigado() {
		return higado;
	}

	public void setHigado(boolean higado) {
		this.higado = higado;
	}

	public boolean isAudicion() {
		return audicion;
	}

	public void setAudicion(boolean audicion) {
		this.audicion = audicion;
	}

	public boolean isOlfato() {
		return olfato;
	}

	public void setOlfato(boolean olfato) {
		this.olfato = olfato;
	}

	public boolean isVision() {
		return vision;
	}

	public void setVision(boolean vision) {
		this.vision = vision;
	}

	public boolean isApnea() {
		return apnea;
	}

	public void setApnea(boolean apnea) {
		this.apnea = apnea;
	}

	public boolean isRonca() {
		return ronca;
	}

	public void setRonca(boolean ronca) {
		this.ronca = ronca;
	}

	public boolean isVarices() {
		return varices;
	}

	public void setVarices(boolean varices) {
		this.varices = varices;
	}

	public boolean isCirculatorios() {
		return circulatorios;
	}

	public void setCirculatorios(boolean circulatorios) {
		this.circulatorios = circulatorios;
	}

	public boolean isCa() {
		return ca;
	}

	public void setCa(boolean ca) {
		this.ca = ca;
	}

	public boolean isDerrames() {
		return derrames;
	}

	public void setDerrames(boolean derrames) {
		this.derrames = derrames;
	}

	public boolean isMialgias() {
		return mialgias;
	}

	public void setMialgias(boolean mialgias) {
		this.mialgias = mialgias;
	}

	public boolean isFibromialgias() {
		return fibromialgias;
	}

	public void setFibromialgias(boolean fibromialgias) {
		this.fibromialgias = fibromialgias;
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