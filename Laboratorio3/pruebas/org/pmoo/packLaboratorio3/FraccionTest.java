//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packLaboratorio3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FraccionTest {
	
	//Variables
	Fraccion lfr1, pfr2, pfr3, pfr4, pfr5, pfr6, pfr7, pfr8;

	@Before
	public void setUp() {
		lfr1 = new Fraccion(64,24); //32/12 16/6 8/3
		pfr2 = new Fraccion(1,4);
		pfr3 = new Fraccion(0,1);
		pfr4 = new Fraccion(3,0);
		pfr5 = new Fraccion(2,-8);
		pfr6 = new Fraccion(-7,2);
		pfr7 = new Fraccion(-2,-3);
		pfr8 = new Fraccion(6,1);
	}

	@After
	public void tearDown() {
		lfr1 = null;
		pfr2 = null;
		pfr3 = null;
	}

	@Test
	public void testFraccion() {
		assertEquals(64, lfr1.getNumerador());
		assertEquals(24, lfr1.getDenominador());
	}

	@Test
	public void testSetNumerador() {
		lfr1.setNumerador(4);
		assertEquals(4, lfr1.getNumerador());
	}

	@Test
	public void testSetDenominador() {
		lfr1.setDenominador(8);
		assertEquals(8, lfr1.getDenominador());
	}

	@Test
	public void testSimplificar() {
		lfr1.simplificar();
		assertEquals(8, lfr1.getNumerador());
		assertEquals(3, lfr1.getDenominador());
		pfr2.simplificar();
		assertEquals(1, pfr2.getNumerador());
		assertEquals(4, pfr2.getDenominador());
		pfr3.simplificar();
		assertEquals(0, pfr3.getNumerador());
		assertEquals(1, pfr3.getDenominador());
		pfr5.simplificar();
		assertEquals(-1, pfr5.getNumerador());
		assertEquals(4, pfr5.getDenominador());
		pfr6.simplificar();
		assertEquals(-7, pfr6.getNumerador());
		assertEquals(2, pfr6.getDenominador());
		pfr7.simplificar();
		assertEquals(-2, pfr7.getNumerador());
		assertEquals(-3, pfr7.getDenominador());
		pfr8.simplificar();
		assertEquals(6, pfr8.getNumerador());
		assertEquals(1, pfr8.getDenominador());
		
	}

	@Test
	public void testSumar() {
		pfr3 = lfr1.sumar(pfr2);
		assertEquals(35, pfr3.getNumerador());
		assertEquals(12, pfr3.getDenominador());
		
	}

	@Test
	public void testRestar() {
		pfr3 = lfr1.restar(pfr2);
		assertEquals(1, pfr3.getNumerador());
		assertEquals(4, pfr3.getDenominador());
	}

	@Test
	public void testMultiplicar() {
		pfr3 = lfr1.multiplicar(pfr2);
		assertEquals(1, pfr3.getNumerador());
		assertEquals(8, pfr3.getDenominador());
	}

	@Test
	public void testDividir() {
		pfr3 = lfr1.dividir(pfr2);
		assertEquals(2, pfr3.getNumerador());
		assertEquals(1, pfr3.getDenominador());
	}

	@Test
	public void testEsIgualQue() {
		assertFalse(lfr1.esIgualQue(pfr2));
	}

	@Test
	public void testEsMayorQue() {
		assertTrue(lfr1.esMayorQue(pfr2));
	}

	@Test
	public void testEsMenorQue() {
		assertFalse(lfr1.esMenorQue(pfr2));
	}

	@Test
	public void testEsMayorOIgualQue() {
		assertTrue(lfr1.esMayorOIgualQue(pfr2));
	}

	@Test
	public void testEsMenorOIgualQue() {
		assertFalse(lfr1.esMenorOIgualQue(pfr2));
	}

}
