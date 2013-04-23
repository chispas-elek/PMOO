package org.pmoo.packlaboratorio7;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CursoBaileTest {

	//Variables
	private Hombre hom1,hom2;
	private Mujer muj1,muj2;
	private Pareja par1,par2;
	private ListaParejas lParejas;
	private ListaAlumnosCurso lAlums;
	private CursoBaile curso;
	
	@Before
	public void setUp() throws Exception {
		hom1 = new Hombre("1111","Paco","Porras",31);
		hom2 = new Hombre("1112","Poco","Parros",55);
		muj1 = new Mujer("1113","Paca","Tal",33);
		muj2 = new Mujer("1113","Poca","Tel",33);
		par1 = new Pareja(hom1,muj1);
		curso = CursoBaile.getCursoBaile();
		lAlums = 
		
	}

	@After
	public void tearDown() throws Exception {
		hom1 = null;
		hom2 = null;
		muj1 = null;
		muj2 = null;
		par1 = null;
		par2 = null;
		lParejas.resetear();
		lAlums.resetear();
	}

	@Test
	public void testGetCursoBaile() {
		fail("Not yet implemented");
	}

	@Test
	public void testDarDeAltaPareja() {
		fail("Not yet implemented");
	}

	@Test
	public void testDarDeAltaAlumno() {
		fail("Not yet implemented");
	}

	@Test
	public void testAnadirPreferencia() {
		fail("Not yet implemented");
	}

	@Test
	public void testEmpezarCurso() {
		fail("Not yet implemented");
	}

	@Test
	public void testAjustarParejasSegunPreferencias() {
		fail("Not yet implemented");
	}

}
