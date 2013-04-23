package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ListaParejasTest {

	//Variables
	private Pareja pareja1,pareja2;
	private ListaParejas lParejas;
	private Hombre hom1,hom2;
	private Mujer muj1,muj2;
	
	@Before
	public void setUp() throws Exception {
		hom1 = new Hombre("1111","Paco","Rama",33);
		hom2 = new Hombre("1112","Lolo","Romo",38);
		muj1 = new Mujer("1113","Paca","Reme",21);
		muj2 = new Mujer("1113","Lola","Rimi",23);
		pareja1 = new Pareja(hom1,muj1);
		pareja2 = new Pareja(hom2,muj2);
		lParejas = ListaParejas.getListaParejas();
	}

	@After
	public void tearDown() throws Exception {
		hom1 = null;
		hom2 = null;
		muj1 = null;
		muj2 = null;
		pareja1 = null;
		pareja2 = null;
		lParejas.resetear();
	}

	@Test
	public void testGetListaParejas() {
		assertTrue(lParejas != null);
	}

	@Test
	public void testAnadirOrdenadoPareja() {
		lParejas.anadirOrdenadoPareja(pareja1);
		assertTrue(lParejas.obtenerParejaDe(hom1) != null);
	}

	@Test
	public void testObtenerParejaDe() {
		lParejas.anadirOrdenadoPareja(pareja1);
		assertTrue(lParejas.obtenerParejaDe(hom1) == muj1);
	}

	@Test
	public void testReajustarParejas() {
		muj1.anadirPreferencia(hom2);
		muj2.anadirPreferencia(hom1);
		hom1.anadirPreferencia(muj2);
		hom2.anadirPreferencia(muj1);
		lParejas.anadirOrdenadoPareja(pareja1);
		lParejas.anadirOrdenadoPareja(pareja2);
		lParejas.reajustarParejas();
		assertTrue(lParejas.obtenerParejaDe(muj1) == hom2);
		assertTrue(lParejas.obtenerParejaDe(hom1) == muj2);
	}

	@Test
	public void testResetear() {
		lParejas.resetear();
		assertTrue(lParejas.obtenerParejaDe(hom1) == null);
	}

}
