package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ParejaTest {

	private Hombre h1,h2;
	private Mujer m1,m2;
	
	@Before
	public void setUp() throws Exception {
		this.h1 = new Hombre("32413323G","Manuel","Perez",23);
		this.h2 = new Hombre("23456786R","Jorge","Fernandez",55);
		this.m1 = new Mujer("23345673P","Lorena","Aguilar",42);
		this.m2 = new Mujer("12378954O","Claudia","Ramirez",19);
	}

	@After
	public void tearDown() throws Exception {
		this.h1 = null;
		this.h2 = null;
		this.m1 = null;
		this.m2 = null;
	}

	@Test
	public void testPareja() {
		//Añadimos dos hombre, debería salir un mensaje de error
		Pareja p1 = new Pareja(h1,h2);
		//Añadimos dos mujeres, debería salir un mensaje de error
		p1 = new Pareja(m1,m2);
		//Añadimos primero un hombre y luego una mujer
		p1 = new Pareja(h1,m1);
		assertEquals(h1,p1.getEl());
		assertEquals(m1,p1.getElla());
		//Añadimos primero la mujer y luego el hombre
		p1 = new Pareja(m2,h2);
		assertEquals(h2,p1.getEl());
		assertEquals(m2,p1.getElla());
	}

	@Test
	public void testGetEl() {
		Pareja p1 = new Pareja(h1,m1);
		assertEquals(h1,p1.getEl());
	}

	@Test
	public void testGetElla() {
		Pareja p1 = new Pareja(h1,m1);
		assertEquals(m1,p1.getElla());
	}

	@Test
	public void testEsta() {
		Pareja p1 = new Pareja(h1,m1);
		//Primero metemos un alumno cualquiera
		assertFalse(p1.esta(h2));
		//Ahora debería de estar
		assertTrue(p1.esta(h1));
	}

}
