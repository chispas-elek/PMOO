//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaOperacionesTest {

	//Atributos
	ListaOperaciones lO1;
	
	@Before
	public void setUp() throws Exception {
		lO1 = ListaOperaciones.getListaOperaciones();
	}

	@After
	public void tearDown() throws Exception {
		lO1.resetear();
		lO1 = null;
	}

	@Test
	public void testGetListaOperaciones() {
		boolean result = false;
		if(lO1 != null) {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void testCantidadOperaciones() {
		lO1.anadirOperacion(111, 1, "tridente", 4.0000001);
		assertEquals(1,lO1.cantidadOperaciones());
	}

	@Test
	public void testAnadirOperacion() {
		lO1.anadirOperacion(111, 1, "tridente", 4.0000001);
		assertEquals(1,lO1.cantidadOperaciones());
		
	}
	
	@Test
	buscarOperacionPorId
	

	@Test
	public void testRealizarOperaciones() {
		lO1.anadirOperacion(111, 1, "tridente", 4.0000001);
		ListaClientes l1 = ListaClientes.getListaClientes();
		l1.anadirCliente(1,"Paco","tridente",12548894.0000001,true);
		lO1.realizarOperaciones();
		Cliente cl1 = l1.buscarClientePorId(1);
		assertEquals(12548890.000000,cl1.obtenerSaldo("tridente"),0.0001);
	}

	@Test
	public void testResetear() {
		lO1.anadirOperacion(111, 1, "tridente", 4.0000001);
		lO1.resetear();
		assertEquals(0,lO1.cantidadOperaciones());
	}

}
