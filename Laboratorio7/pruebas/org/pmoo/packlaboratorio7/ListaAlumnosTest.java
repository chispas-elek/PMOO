package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaAlumnosTest {

	//Variables
	private Hombre hom1;
	private Mujer muj1;
	private ListaAlumnos lAlumnos;
	@Before
	public void setUp() throws Exception {
		hom1 = new Hombre("1111","Paco","Leto",32);
		muj1 = new Mujer("1112","Paca","Lata",21);
		lAlumnos = new ListaAlumnos();
	}

	@After
	public void tearDown() throws Exception {
		hom1 = null;
		muj1 = null;
		lAlumnos = null;
	}

	@Test
	public void testListaAlumnos() {
		assertTrue(lAlumnos != null);
	}

	@Test
	public void testAnadirAlumno() {
		lAlumnos.anadirAlumno(hom1);
		assertTrue(lAlumnos.getTamano() == 1);
	}

	@Test
	public void testRetirarAlumno() {
		lAlumnos.anadirAlumno(hom1);
		lAlumnos.retirarAlumno(hom1);
		assertTrue(lAlumnos.getTamano() == 0);
	}

	@Test
	public void testEsta() {
		lAlumnos.anadirAlumno(hom1);
		assertTrue(lAlumnos.esta(hom1));
	}

	@Test
	public void testGetTamano() {
		lAlumnos.anadirAlumno(hom1);
		lAlumnos.anadirAlumno(muj1);
		assertTrue(lAlumnos.getTamano() == 2);
	}

	@Test
	public void testGetAlumnoEnPos() {
		lAlumnos.anadirAlumno(hom1);
		assertEquals(hom1,lAlumnos.getAlumnoEnPos(0));
	}

}
