package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CursoBaileTest {

	//Variables
	private Hombre hom1,hom2;
	private Mujer muj1,muj2;
	private ListaParejas lParejas;
	private ListaAlumnosCurso lAlums;
	private CursoBaile curso;
	
	@Before
	public void setUp() throws Exception {
		hom1 = new Hombre("1111","Paco","Porras",31);
		hom2 = new Hombre("1112","Poco","Parros",55);
		muj1 = new Mujer("1113","Paca","Tal",33);
		muj2 = new Mujer("1114","Poca","Tel",33);
		curso = CursoBaile.getCursoBaile();
		lAlums = ListaAlumnosCurso.getListaAlumnosCurso();
		lParejas = ListaParejas.getListaParejas();
		
		
	}

	@After
	public void tearDown() throws Exception {
		hom1 = null;
		hom2 = null;
		muj1 = null;
		muj2 = null;
		curso.empezarCurso();
	}

	@Test
	public void testGetCursoBaile() {
		assertNotNull(curso);
	}

	@Test
	public void testDarDeAltaPareja() {
		lAlums.anadirAlumnoCurso(hom1);
		lAlums.anadirAlumnoCurso(muj1);
		curso.darDeAltaPareja(hom1.getDNI(), muj1.getDNI());
		assertTrue(lParejas.obtenerParejaDe(hom1) == muj1);
	}

	@Test
	public void testDarDeAltaAlumno() {
		lAlums.anadirAlumnoCurso(hom2);
		curso.darDeAltaAlumno(hom2.getDNI(), hom2.getNombre(), hom2.getApellido(), hom2.getEdad(), 'm');
		curso.darDeAltaAlumno(hom2.getDNI(), hom2.getNombre(), hom2.getApellido(), hom2.getEdad(), 'M');
		curso.darDeAltaAlumno(hom2.getDNI(), hom2.getNombre(), hom2.getApellido(), hom2.getEdad(), 'h');
		curso.darDeAltaAlumno(hom2.getDNI(), hom2.getNombre(), hom2.getApellido(), hom2.getEdad(), 'H');
		curso.darDeAltaAlumno(hom2.getDNI(), hom2.getNombre(), hom2.getApellido(), hom2.getEdad(), 'z');
		assertTrue(lAlums.buscarAlumnoPorDNI("1112") == hom2);
	}

	@Test
	public void testAnadirPreferencia() {
		lAlums.anadirAlumnoCurso(hom1);
		lAlums.anadirAlumnoCurso(muj2);
		curso.anadirPreferencia("1111", "1114");
		curso.anadirPreferencia("11", "12");
		assertTrue(lAlums.buscarAlumnoPorDNI(hom1.getDNI()).getListaPreferencias().esta(muj2));
	}

	@Test
	public void testEmpezarCurso() {
		lAlums.anadirAlumnoCurso(hom1);
		lAlums.anadirAlumnoCurso(muj1);
		curso.darDeAltaPareja(hom1.getDNI(), muj1.getDNI());
		curso.empezarCurso();
		assertNull(lAlums.buscarAlumnoPorDNI(hom1.getDNI()));
		assertNull(lParejas.obtenerParejaDe(hom1));
	}

	@Test
	public void testAjustarParejasSegunPreferencias() {
		lAlums.anadirAlumnoCurso(hom1);
		lAlums.anadirAlumnoCurso(muj1);
		curso.darDeAltaPareja(hom1.getDNI(), muj1.getDNI());
		lAlums.anadirAlumnoCurso(hom2);
		lAlums.anadirAlumnoCurso(muj2);
		curso.darDeAltaPareja(hom2.getDNI(), muj2.getDNI());
		hom1.anadirPreferencia(muj2);
		muj2.anadirPreferencia(hom1);
		hom2.anadirPreferencia(muj1);
		muj1.anadirPreferencia(hom2);
		curso.ajustarParejasSegunPreferencias();
		assertTrue(lParejas.obtenerParejaDe(hom1) == muj2);
		assertTrue(lParejas.obtenerParejaDe(hom2) == muj1);
	}

}
