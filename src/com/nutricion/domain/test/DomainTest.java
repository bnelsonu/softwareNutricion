package com.nutricion.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nutricion.domain.Alimento;
import com.nutricion.domain.Cliente;
import com.nutricion.domain.ConductasRelSalud;
import com.nutricion.domain.HistoriaClinicaFamiliar;
import com.nutricion.domain.HistoriaClinicaPersonal;
import com.nutricion.domain.Telefono;
import com.nutricion.domain.TipoAlimento;
import com.nutricion.domain.ValoracionDietetica;

public class DomainTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Brian");
		cliente.setApellido1("Nelson");
		cliente.setApellido2("Ulloa");
		cliente.setEdad(25);
		cliente.setOcupacion("Ing en informatica");
		cliente.setLugarTrabajo("Accenture");
		cliente.setFumado(false);
		cliente.setBebidasAlcoholicas(false);
		cliente.setFrecuenciaEjercicio("4 veces a la samana");
		cliente.setCorreo("bricardonelson@gmail.com");
		
		Telefono telefono1 = new Telefono();
		telefono1.setNumeroTelefono("5564833");
		
		Telefono telefono2 = new Telefono();
		telefono2.setNumeroTelefono("22780174");
		
		Telefono telefono3 = new Telefono();
		telefono3.setNumeroTelefono("87103425");
		
		cliente.getTelefonos().add(telefono1);
		cliente.getTelefonos().add(telefono2);
		cliente.getTelefonos().add(telefono3);
	
		//Historia clinica familiar
		
		HistoriaClinicaFamiliar historiaClinicaFamiliar = new HistoriaClinicaFamiliar();
		historiaClinicaFamiliar.setProblemasCardioVasculares(false);
		historiaClinicaFamiliar.setHta(false);
		historiaClinicaFamiliar.setDm(false);
		historiaClinicaFamiliar.setDislipidemia(false);
		historiaClinicaFamiliar.setEpilepsia(false);
		historiaClinicaFamiliar.setObesidad(true);
		historiaClinicaFamiliar.setOsteoporosis(false);
		historiaClinicaFamiliar.setTiroides(false);
		historiaClinicaFamiliar.setCa(true);
		historiaClinicaFamiliar.setOtros("Diabetes en familiares: padre y abuelo");
		
		cliente.setHistoriaClinicaFamiliar(historiaClinicaFamiliar);
		
		//Historia clinica personal
		
		HistoriaClinicaPersonal historiaClinicaPersonal =  new HistoriaClinicaPersonal();
		historiaClinicaPersonal.setAcidoUrico(false);
		historiaClinicaPersonal.setAlergiasIntolerancia(false);
		historiaClinicaPersonal.setCefaleas(false);
		historiaClinicaPersonal.setCiclosMestruales(false);
		historiaClinicaPersonal.setCx(false);
		historiaClinicaPersonal.setObB(false);
		historiaClinicaPersonal.setDm(false);
		historiaClinicaPersonal.setMetCHO(false);
		historiaClinicaPersonal.setDislipidemina(false);
		historiaClinicaPersonal.setHta(false);
		historiaClinicaPersonal.setTgi(false);
		historiaClinicaPersonal.setEstrenimiento(false);
		historiaClinicaPersonal.setDiarreas(false);
		historiaClinicaPersonal.setHemorroides(false);
		historiaClinicaPersonal.setColitis(false);
		historiaClinicaPersonal.setGastritis(false);
		historiaClinicaPersonal.setTiroides(false);
		historiaClinicaPersonal.setRinones(false);
		historiaClinicaPersonal.setOseos(false);
		historiaClinicaPersonal.setAnsiedad(false);
		historiaClinicaPersonal.setEstres(false);
		historiaClinicaPersonal.setCansancio(false);
		historiaClinicaPersonal.setCutaneos(false);
		historiaClinicaPersonal.setInsomnio(false);
		historiaClinicaPersonal.setAlergias(false);
		historiaClinicaPersonal.setHigado(false);
		historiaClinicaPersonal.setAudicion(false);
		historiaClinicaPersonal.setOlfato(false);
		historiaClinicaPersonal.setVision(false);
		historiaClinicaPersonal.setApnea(false);
		historiaClinicaPersonal.setRonca(false);
		historiaClinicaPersonal.setVarices(false);
		historiaClinicaPersonal.setCa(false);
		historiaClinicaPersonal.setDerrames(false);
		historiaClinicaPersonal.setMialgias(false);
		historiaClinicaPersonal.setOtros("Operacion de apendice en la adolecencia");
		
		cliente.setHistoriaClinicaPersonal(historiaClinicaPersonal);
		
		
		//Conductas relacionadas con la salud
		ConductasRelSalud conductasRelSalud =  new ConductasRelSalud();
		conductasRelSalud.setDesmayos("presenta desmayos cuando realiza ejercicios de manera prolongada y " +
				"su alimentacion no es la adecuada");
		conductasRelSalud.setProblemasArtiEspHueRodCad("problemas en la rodilla cuando se hace ejercicio en " +
				"exceso como por ejemplo 3 mejengas por semana, esto se da en superficies relativamente" +
				"duras como una cancha sintetica");
		cliente.setConductasRelSalud(conductasRelSalud);
		
		
		
		//valoracion dietetica
		TipoAlimento alimentoNoConsumido = new TipoAlimento();
		TipoAlimento alimentoPreferido = new TipoAlimento();
		
		alimentoNoConsumido.setNombreTipoAlimento("Alimento no consumido");
		alimentoPreferido.setNombreTipoAlimento("Alimento preferido");
		
		session.save(alimentoNoConsumido);
		session.save(alimentoPreferido);
		
		Alimento alimentoPreferido1 = new Alimento ();
		alimentoPreferido1.setNombreAlimento("filet de res");
		alimentoPreferido1.setTipoAlimento(alimentoPreferido);
	
		Alimento alimentoPreferido2 = new Alimento ();
		alimentoPreferido2.setNombreAlimento("ensalada");
		alimentoPreferido2.setTipoAlimento(alimentoPreferido);
		
		Alimento alimentoNoConsumido1 = new Alimento ();
		alimentoNoConsumido1.setNombreAlimento("lentejas");
		alimentoNoConsumido1.setTipoAlimento(alimentoNoConsumido);
			
		ValoracionDietetica valoracionDietetica = new ValoracionDietetica();
		valoracionDietetica.setPreparadorAlimentos("Empleada Domestica");
		
		
		valoracionDietetica.getAlimentosPreferidos().add(alimentoPreferido1);
		valoracionDietetica.getAlimentosPreferidos().add(alimentoPreferido2);
		
		valoracionDietetica.getAlimentosQueNoConsume().add(alimentoNoConsumido1);
			
		cliente.setValoracionDietetica(valoracionDietetica);
		
		session.save(cliente);
		session.getTransaction().commit();
	}

}
