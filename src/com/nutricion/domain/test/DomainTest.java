package com.nutricion.domain.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nutricion.domain.AlimentacionaEvaluar;
import com.nutricion.domain.Alimento;
import com.nutricion.domain.Cliente;
import com.nutricion.domain.ConductasRelSalud;
import com.nutricion.domain.Ejercicio;
import com.nutricion.domain.HistoriaClinicaFamiliar;
import com.nutricion.domain.HistoriaClinicaPersonal;
import com.nutricion.domain.Medicamento;
import com.nutricion.domain.Meta;
import com.nutricion.domain.Suplemento;
import com.nutricion.domain.Telefono;
import com.nutricion.domain.TipoAlimento;
import com.nutricion.domain.ValoracionDietetica;

public class DomainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Cliente cliente = new Cliente();
		
		/****Datos Generales*****/
		//1. Nombre
		cliente.setNombre("Brian");
		cliente.setApellido1("Nelson");
		cliente.setApellido2("Ulloa");
		
		//2. Edad	
		cliente.setEdad(30);
		
		//3.Nacionalidad
		cliente.setNacionalidad("Costarricense");
		
		//4.Ocupacion
		cliente.setOcupacion("Ing. en informatica");
		
		//5.Correo
		cliente.setCorreo("bricardonelson@gmail.com");
		
		//6.Telefonos
		Telefono telefono1 = new Telefono();
		telefono1.setNumeroTelefono("5564833");
		
		Telefono telefono2 = new Telefono();
		telefono2.setNumeroTelefono("22780174");
		
		Telefono telefono3 = new Telefono();
		telefono3.setNumeroTelefono("87103425");
		
		cliente.getTelefonos().add(telefono1);
		cliente.getTelefonos().add(telefono2);
		cliente.getTelefonos().add(telefono3);
		
		
		//7.Medicamentos
		
		Medicamento medicamento1 = new Medicamento();
		medicamento1.setNombreMedicamento("pastilla para insomnio");
				
		Medicamento medicamento2 = new Medicamento();
		medicamento2.setNombreMedicamento("pastillas para la gastritis");
		
		cliente.getMedicamentos().add(medicamento1);
		cliente.getMedicamentos().add(medicamento2);
		
		//8.Suplementos
		
	    Suplemento suplemento1 = new Suplemento();
		suplemento1.setNombreSuplemento("Whey");
		
		Suplemento suplemento2 = new Suplemento();
		suplemento2.setNombreSuplemento("L Carnitina");
		
		cliente.getSuplementos().add(suplemento1);
		cliente.getSuplementos().add(suplemento2);
		
		//9. Fumado
		cliente.setFumado(false);
		
		//10.Bebidas Alcoholicas
		cliente.setBebidasAlcoholicas(false);
		
		
		//11.Lugar de trabajo
		cliente.setLugarTrabajo("Accenture");
		
		//12.Ejercicios
		Ejercicio ejercicio1 = new Ejercicio();
		ejercicio1.setDescripcion("soccer");
		ejercicio1.setTipo("Deporte");
		
		Ejercicio ejercicio2 = new Ejercicio();
		ejercicio2.setDescripcion("natacion");
		ejercicio2.setTipo("Deporte");
		
		cliente.getEjercicios().add(ejercicio1);
		cliente.getEjercicios().add(ejercicio2);
		
		//13.Frecuencia de Ejercicio
		cliente.setFrecuenciaEjercicio("4 veces a la semana");
		
		//14. Estilo de Vida		
		cliente.setEstiloVida("Activo");
				
		//15.Observaciones / Metas
		Meta meta1 = new Meta();
		meta1.setDescripcion("Hipertrofia muscular");
		Meta meta2 = new Meta();
		meta2.setDescripcion("Disminuir la grasa corporal a 10%");
		
		
		session.save(meta1);
		session.save(meta2);
		
		meta1.setCliente(cliente);
		meta2.setCliente(cliente);
			
		
		/****Historia clinica familiar*****/
		
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
		historiaClinicaFamiliar.setCliente(cliente);
		
		/****Historia clinica personal*****/

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
		historiaClinicaPersonal.setCliente(cliente);
		
		/**Conductas relacionadas con la salud*/
		
		ConductasRelSalud conductasRelSalud =  new ConductasRelSalud();
		conductasRelSalud.setDesmayos("presenta desmayos cuando realiza ejercicios de manera prolongada y " +
				"su alimentacion no es la adecuada");
		conductasRelSalud.setProblemasArtiEspHueRodCad("problemas en la rodilla cuando se hace ejercicio en " +
				"exceso como por ejemplo 3 mejengas por semana, esto se da en superficies relativamente" +
				"duras como una cancha sintetica");
		cliente.setConductasRelSalud(conductasRelSalud);
		conductasRelSalud.setCliente(cliente);
		
		/**Valoracion dietetica*/
		
		//Tipo alimento no consumido
		TipoAlimento alimentoNoConsumido = new TipoAlimento();
		//Tip alimento preferido
		TipoAlimento alimentoPreferido = new TipoAlimento();
		
		alimentoNoConsumido.setNombreTipoAlimento("Alimento no consumido");
		alimentoPreferido.setNombreTipoAlimento("Alimento preferido");
		
		//Salvar Tipo alimento 
		session.save(alimentoNoConsumido);
		session.save(alimentoPreferido);
		
		//Alimentos preferidos
		Alimento alimentoPreferido1 = new Alimento ();
		alimentoPreferido1.setNombreAlimento("filet de res");
		alimentoPreferido1.setTipoAlimento(alimentoPreferido);
	
		Alimento alimentoPreferido2 = new Alimento ();
		alimentoPreferido2.setNombreAlimento("ensalada");
		alimentoPreferido2.setTipoAlimento(alimentoPreferido);
		
		//Alimentos no consumidos
		Alimento alimentoNoConsumido1 = new Alimento ();
		alimentoNoConsumido1.setNombreAlimento("lentejas");
		alimentoNoConsumido1.setTipoAlimento(alimentoNoConsumido);
		
		//Objeto Valoracion Dietetica
		
		ValoracionDietetica valoracionDietetica = new ValoracionDietetica();
		valoracionDietetica.setPreparadorAlimentos("Empleada Domestica");
				
		valoracionDietetica.getAlimentosPreferidos().add(alimentoPreferido1);
		valoracionDietetica.getAlimentosPreferidos().add(alimentoPreferido2);
		
		valoracionDietetica.getAlimentosQueNoConsume().add(alimentoNoConsumido1);
		
		//anadir valoracion dietica al cliente	
		cliente.setValoracionDietetica(valoracionDietetica);
		valoracionDietetica.setCliente(cliente);
		
		
		/*Alimentacion de dia a evaluar*/
		
		AlimentacionaEvaluar alimentacionaEvaluar = new AlimentacionaEvaluar();
		alimentacionaEvaluar.setDesayuno("1 tostada con jamon de pavo, 1 manzana");
		alimentacionaEvaluar.setMeriendaMediaManana("1 galleta integral y cafe");
		alimentacionaEvaluar.setAlmuerzo("bistec, pollo o chuleta, vegetales: (zanahoria, vainica, papa)" +
				"ensalada con repollo, zanahoria, lechuga");
		alimentacionaEvaluar.setMeriendaTarde("1 galleta integral y cafe");
		alimentacionaEvaluar.setCena("bistec, pollo o chuleta, vegetales: (zanahoria, vainica, papa)" +
				"ensalada con repollo, zanahoria, lechuga");
		alimentacionaEvaluar.setColacionNocturna("1 vaso de whey protein");
		alimentacionaEvaluar.setConsumoComidaRapida("de vez en cuando alitas de pollo picantes");
		alimentacionaEvaluar.setHidratacion("2 litros de agua en todo el dia, tomo varias veces agua cuando hago ejercicio");
		
		cliente.setAlimentacionaEvaluar(alimentacionaEvaluar);
		alimentacionaEvaluar.setCliente(cliente);
		
		session.save(cliente);
		session.getTransaction().commit();
	}

}
