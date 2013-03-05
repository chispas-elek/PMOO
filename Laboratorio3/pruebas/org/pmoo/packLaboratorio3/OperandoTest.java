//Author -> Mulero Martínez, Rubén
//Auhtor -> Esteban García, Asier

package org.pmoo.packlaboratorio3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OperandoTest {
	
	//Variables
	private Operando op1, op2, resultado;

	@Before
	public void setUp() {
		
		op1 = new Operando(4);
		op2 = new Operando(2);
		resultado = new Operando(0);
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
		resultado = op1.sumar(op2);
		assertEquals(6, resultado.getValor());
	}

	@Test
	public void testRestar() {
		resultado = op1.restar(op2);
		assertEquals(2, resultado.getValor());
	}

	@Test
	public void testMultiplicar() {
		resultado = op1.multiplicar(op2);
		assertEquals(8, resultado.getValor());
	}

	@Test
	public void testDividir() {
		resultado = op1.dividir(op2);
		assertEquals(2, resultado.getValor());
	}

	@Test
	public void testGetResto() {
		resultado = op1.getResto(op2);
		assertEquals(0, resultado.getValor());
	}

}
