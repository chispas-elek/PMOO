package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaAlumnosCursoTest {
	
	private Hombre al1;
	private Mujer al2;
	private ListaAlumnosCurso lAlumC;
	private ListaParejas lParejas;
	private Pareja par;

	@Before
	public void setUp() throws Exception {
		al1 = new Hombre("1111","Paco","Porras",32);
		al2 = new Mujer("1112","Paca","Porros",31);
		lAlumC = ListaAlumnosCurso.getListaAlumnosCurso();
		lParejas = ListaParejas.getListaParejas();
		par = new Pareja(al1,al2);
	}

	@After
	public void tearDown() throws Exception {
		al1 = null;
		al2 = null;
		lAlumC.resetear();
		lParejas.resetear();
		par = null;
	}

	@Test
	public void testGetListaAlumnosCurso() {
		assertNotNull(lAlumC);
	}

	@Test
	public void testAnadirAlumnoCurso() {
		lAlumC.anadirAlumnoCurso(al1);
		assertTrue(lAlumC.buscarAlumnoPorDNI("1111") == al1);
	}

	@Test
	public void testResetear() {
		lAlumC.anadirAlumnoCurso(al1);
		lAlumC.resetear();
		assertNull(lAlumC.buscarAlumnoPorDNI("1111"));
	}

	@Test
	public void testBuscarAlumnoPorDNI() {
		lAlumC.anadirAlumnoCurso(al1);
		assertTrue(lAlumC.buscarAlumnoPorDNI("1111") == al1);
	}

	@Test
	public void testHayAlumnosSinPareja() {
		lAlumC.anadirAlumnoCurso(al1);
		lAlumC.anadirAlumnoCurso(al2);
		assertTrue(lAlumC.hayAlumnosSinPareja());
		lParejas.anadirOrdenadoPareja(par);
		assertFalse(lAlumC.hayAlumnosSinPareja());
	}

}
