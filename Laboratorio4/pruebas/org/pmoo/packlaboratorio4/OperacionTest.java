//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperacionTest {

	//Atributos
	Operacion op1;
	@Before
	public void setUp() throws Exception {
		op1 = new Operacion(111,1,"tridente",4);
	}

	@After
	public void tearDown() throws Exception {
		op1 = null;
	}

	@Test
	public void testOperacion() {
		assertTrue(op1.tieneMismoId(111));
	}

	@Test
	public void testTieneMismoId() {
		assertTrue(op1.tieneMismoId(111));
	}

	@Test
	public void testRealizarOperacion() {
		//Creamos una lista de clientes
		ListaClientes l1 = ListaClientes.getListaClientes();
		l1.anadirCliente(1,"Paco","tridente",12548894,true);
		op1.realizarOperacion();
		Cliente cl1 = l1.buscarClientePorId(1);
		assertEquals(12548890,cl1.obtenerSaldo("tridente"),0.0001);
	}

}
