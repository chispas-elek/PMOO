package org.pmoo.packLaboratorio3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperandoTest {
	
	//Variables
	private Operando op1, op2;

	@Before
	public void setUp() {
		
		op1 = new Operando(4);
		op2 = new Operando(2);
	}

	@After
	public void tearDown() {
		op1 = null;
		op2 = null;
	}

	@Test
	public void testOperando() {
		assertEquals(4, op1.getValor());
	}

	@Test
	public void testSetValor() {
		op1.setValor(2);
		assertEquals(2, op1.getValor());
	}

	@Test
	public void testSumar() {
		assertEquals(6, op1.sumar(op2));
	}

	@Test
	public void testRestar() {
		assertEquals(2, op1.restar(op2));
	}

	@Test
	public void testMultiplicar() {
		assertEquals(8, op1.multiplicar(op2));
	}

	@Test
	public void testDividir() {
		assertEquals(2, op1.dividir(op2));
	}

	@Test
	public void testGetResto() {
		assertEquals(0, op1.getResto(op2));
	}

}
