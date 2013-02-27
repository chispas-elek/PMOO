//Author Mulero Martínez, Rubén
//Author Esteban García, Asier

package org.pmoo.packLaboratorio3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.pmoo.packLaboratorio3.Operacion.Operador;

public class OperacionTest {

	private Operacion op1;
	
	
	@Before
	public void setUp() throws Exception {
		op1 = new Operacion(2, 3, Operador.SUMA);
		
	}

	@After
	public void tearDown() throws Exception {
		op1 = null;
	}

	@Test
	public void testOperacion() {
		assertEquals(2, op1.getOperando1());
		assertEquals(3, op1.getOperando2());
		assertEquals(Operador.SUMA, op1.getOperador());
	}

	@Test
	public void testSetOperando1() {
		op1.setOperando1(4);
		assertEquals(4, op1.getOperando1());
	}

	@Test
	public void testSetOperando2() {
		op1.setOperando2(7);
		assertEquals(7, op1.getOperando2());
	}

	@Test
	public void testSetOperador() {
		op1.setOperador(Operador.RESTO);
		assertEquals(Operador.RESTO, op1.getOperador());
	}

	@Test
	public void testObtenerResultado() {
		assertEquals(5,op1.obtenerResultado());
		op1.setOperador(Operador.RESTA);
		assertEquals(-1, op1.obtenerResultado());
		op1.setOperador(Operador.PRODUCTO);
		assertEquals(6, op1.obtenerResultado());
		op1.setOperador(Operador.COCIENTE);
		assertEquals(0, op1.obtenerResultado());
		op1.setOperador(Operador.RESTO);
		assertEquals(2, op1.obtenerResultado());
		//Caso de prueba por si divido entre 0
		
	}

}
