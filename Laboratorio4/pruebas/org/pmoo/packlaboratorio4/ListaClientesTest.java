//Author Mulero Martínez, Rubén
//Author Esteban García, Asier

package org.pmoo.packlaboratorio4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaClientesTest {

	//Atributos
	ListaClientes l1;
	@Before
	public void setUp() throws Exception {
		l1 = ListaClientes.getListaClientes();
	}

	@After
	public void tearDown() throws Exception {
		l1.resetear();
		l1 = null;
	}

	@Test
	public void testGetListaClientes() {
		//Si todo se inicializa bien podré añadir un cliente de forma correcta
		l1.anadirCliente(1, "Ambrosio", "espinete", 13234523, true);
		assertEquals(1,l1.cantidadClientes());
	}

	@Test
	public void testCantidadClientes() {
		l1.anadirCliente(1, "Ambrosio", "espinete", 13234523, true);
		assertEquals(1,l1.cantidadClientes());
	}

	@Test
	public void testAnadirCliente() {
		l1.anadirCliente(2, "Jon", "enjuto", 1211111, false);
		assertEquals(1,l1.cantidadClientes());
	}

	@Test
	public void testBuscarClientePorId() {
		Cliente cli1;
		l1.anadirCliente(1, "Ambrosio", "espinete", 13234523, true);
		cli1 = l1.buscarClientePorId(1);
		assertTrue(cli1.tieneMismoId(1));
	}

	@Test
	public void testResetear() {
		l1.anadirCliente(1, "Ambrosio", "espinete", 13234523, true);
		l1.resetear();
		assertEquals(0,l1.cantidadClientes());
	}

}
