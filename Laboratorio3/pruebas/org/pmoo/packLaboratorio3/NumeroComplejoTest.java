//Author Mulero Martínez, Rubén
//Author Esteban García, Asier

package org.pmoo.packLaboratorio3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumeroComplejoTest {
	
	//Variables
	private NumeroComplejo cnum1,cnum2,cnum3;

	@Before
	public void setUp() {
		cnum1 = new NumeroComplejo(2,3);
		cnum2 = new NumeroComplejo(1,-3);
		//cnum3 = new NumeroComplejo(0,0);
	}

	@After
	public void tearDown() {
		cnum1 = null;
		cnum2 = null;
		cnum3 = null;
	}

	@Test
	public void testNumeroComplejo() {
		assertEquals(2, cnum1.getParteReal());
		assertEquals(3, cnum1.getParteImaginaria());
		
	}

	@Test
	public void testGetAngulo() {
		double result = Math.atan2(3, 2);
		assertEquals(result, cnum1.getAngulo());
	}

	@Test
	public void testGetModulo() {
		double result = Math.sqrt((Math.pow(2, 2)+Math.pow(3, 2)));
		assertEquals(result, cnum1.getModulo());
	}

	@Test
	public void testSumar() {
		cnum3 = new NumeroComplejo(cnum1.sumar(cnum2).getParteReal(), cnum1.sumar(cnum2).getParteImaginaria());
		assertEquals(3, cnum3.getParteReal());
		assertEquals(0, cnum3.getParteImaginaria());
	}

	@Test
	public void testMultiplicar() {
		cnum3 = new NumeroComplejo(cnum1.multiplicar(cnum2).getParteReal(), cnum1.multiplicar(cnum2).getParteImaginaria());
		assertEquals(11, cnum3.getParteReal());
		assertEquals(-3, cnum3.getParteImaginaria());
	}

	@Test
	public void testEsIgual() {
		assertFalse(cnum1.esIgual(cnum2));
	}

}
