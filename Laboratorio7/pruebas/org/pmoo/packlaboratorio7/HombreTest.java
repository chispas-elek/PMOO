package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HombreTest {

	private Hombre h1;
	private Hombre h2;
	private Mujer m1;
	
	@Before
	public void setUp() throws Exception {
		this.h1 = new Hombre("32413323G","Manuel","Perez",23);
		this.h2 = new Hombre("45623412Z","Jaime","Otxoa",15);
		this.m1 = new Mujer("23345673P","Lorena","Aguilar",42);
	}

	@After
	public void tearDown() throws Exception {
		this.h1 = null;
		this.h2 = null;
		this.m1 = null;
	}

	@Test
	public void testAnadirPreferencia() {
		//Error de salida por consola
		this.h1.anadirPreferencia(h2);
		//Añade la mujer en su lista de preferencias
		this.h1.anadirPreferencia(m1);
		assertEquals(1,this.h1.getListaPreferencias().getTamano());
	}

	@Test
	public void testHombre() {
		assertEquals(23,this.h1.getEdad());
	}

	@Test
	public void testAceptar() {
		this.h1.anadirPreferencia(m1);
		assertTrue(this.h1.aceptar(m1));
	}

}
