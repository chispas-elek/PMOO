package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AlumnoTest {

	private Hombre h1;
	private Mujer m1;
	
	@Before
	public void setUp() throws Exception {
		h1 = new Hombre("32413323G","Manuel","Perez",23);
		m1 = new Mujer("23345673P","Lorena","Aguilar",42);
	}

	@After
	public void tearDown() throws Exception {
		h1 = null;
		m1 = null;
	}

	@Test
	public void testGetNombre() {
		assertEquals("Manuel",this.h1.getNombre());
		assertEquals("Lorena",this.m1.getNombre());
	}

	@Test
	public void testGetApellido() {
		assertEquals("Perez",this.h1.getApellido());
		assertEquals("Aguilar",this.m1.getApellido());
	}

	@Test
	public void testGetEdad() {
		assertEquals(23,this.h1.getEdad());
		assertEquals(42,this.m1.getEdad());
	}

	@Test
	public void testGetDNI() {
		assertEquals("32413323G",this.h1.getDNI());
		assertEquals("23345673P",this.m1.getDNI());
	}

}
