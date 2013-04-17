package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MujerTest {

	private Mujer m1;
	private Mujer m2;
	private Hombre h1;
	private Hombre h2;
	
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
	public void testAnadirPreferencia() {
		//Mensaje de error por añadir una mujer.
		this.m1.anadirPreferencia(m2);
		//Se añadeal hombre
		this.m1.anadirPreferencia(h1);
		assertEquals(1,this.m1.getListaPreferencias().getTamano());
	}

	@Test
	public void testMujer() {
		assertEquals("Lorena",this.m1.getNombre());
	}

	@Test
	public void testEmparejar() {
		ListaAlumnos l1 = new ListaAlumnos();
		l1.anadirAlumno(h1);
		l1.anadirAlumno(h2);
		this.m1.anadirPreferencia(m2);
		this.m1.anadirPreferencia(h2);
		this.m1.anadirPreferencia(h1);
		//Emparejamos...
		assertEquals(h2,this.m1.emparejar(l1));
	}

}
