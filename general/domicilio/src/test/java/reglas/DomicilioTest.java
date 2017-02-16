package reglas;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import recursos.DomicilioDo;

public class DomicilioTest {
	//Probar que la lista de Domicilios de dominicana se puede instanciar
	@Test
	public void sePuedeCrearInstanciaDeDomiciliosDo() {
		DomicilioDo domicilioAlexander = new DomicilioDo();
		assertNotNull(domicilioAlexander);
	}
	
	@Test
	public void sePuedeCrearUnaDireccion() {
		DomicilioDo domicilioAlexander = new DomicilioDo();
	}
}
