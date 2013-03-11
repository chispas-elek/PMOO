package org.pmoo.packlaboratorio4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	//Atributos
	Cliente cli1,cli2;
	@Before
	public void setUp() throws Exception {
		cli1 = new Cliente(1,"Paco","tridente",12548894,true);
		cli2 = new Cliente(2,"Remedios","espinete",00000123,false);
	}

	@After
	public void tearDown() throws Exception {
		cli1 = null;
		cli2 = null;
	}

	@Test
	public void testCliente() {
		//Al ser métodos privados, la única forma de saber que la constructora funciona es que al menos nos devuelva que los ids existen.
		assertTrue(cli1.tieneMismoId(1));
		assertFalse(cli1.tieneMismoId(3));
	}

	@Test
	public void testGetEsPreferente() {
		assertTrue(cli1.getEsPreferente());
		assertFalse(cli2.getEsPreferente());
	}

	@Test
	public void testTieneMismoId() {
		assertTrue(cli1.tieneMismoId(1));
		assertFalse(cli1.tieneMismoId(3));
	}

	@Test
	public void testObtenerSaldo() {
		assertEquals(12548894,cli1.obtenerSaldo("tridente"),0.0001);
		assertEquals(0.0,cli1.obtenerSaldo("hjhjhjhj"),0.0001);
	}

	@Test
	public void testActualizarSaldo() {
		cli1.actualizarSaldo("tridente", 4);
		assertEquals(12548890,cli1.obtenerSaldo("tridente"),0.0001);
		cli1.actualizarSaldo("tridente",-34);
		assertEquals(12548890,cli1.obtenerSaldo("tridente"),0.0001);
		cli1.actualizarSaldo("tridente", 12548899);
		assertEquals(12548890,cli1.obtenerSaldo("tridente"),0.0001);
		cli1.actualizarSaldo("charlie", 89);
		assertEquals(12548890,cli1.obtenerSaldo("tridente"),0.0001);
	}

}
