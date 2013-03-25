package org.pmoo.packlaboratorio5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class UsuarioTest extends TestCase
{

	Usuario usuario1;
	Libro l1,l2;
	
	@Before
	public void setUp()
	{
		usuario1= new Usuario("Lola Mento",1099);
		
		l1=new Libro("El Cuaderno Dorado", "Doris Lessing",1);
		l2=new Libro("Rayuela", "Julio Cortazar",2);
	}
    
	@After
	public void tearDown() {
		usuario1=null;
		l1=null;
		l2=null;
	}

	
	@Test
	public void testImprimir()
	{	
		assertNotNull(usuario1);
		
		System.out.println("\n===============================================================");
		System.out.println("\nCaso de prueba del metodo imprimir de la clase Usuario (0 libros)");
		System.out.println("\nLa informacion del usuario deberia mostrarse de este modo:\n");
		System.out.println("ID: 1: Lola Mento");
		System.out.println("---> No tiene libros en prestamo.");
		
		System.out.println("\nY tu programa lo muestra de este modo:\n");
		usuario1.imprimir();
		System.out.println("\n===============================================================");
	
		usuario1.anadirLibro(l1);
		
		System.out.println("\nCaso de prueba del metodo imprimir de la clase Usuario (1 libro)");
		System.out.println("\nLa informacion del usuario deberia mostrarse de este modo:\n");
		System.out.println("ID: 1: Lola Mento");
		System.out.println("---> Tiene el siguiente titulo en prestamo:");
		System.out.println("* El Cuaderno Dorado, escrito por Doris Lessing.");

		System.out.println("\nY tu programa lo muestra de este modo:\n");
		usuario1.imprimir();
		System.out.println("\n===============================================================");
	
		usuario1.anadirLibro(l2);		

		System.out.println("\nCaso de prueba del metodo imprimir de la clase Usuario (2 o mas libros)");
		System.out.println("\nLa informacion del usuario deberia mostrarse de este modo:\n");
		System.out.println("ID: 1: Lola Mento");
		System.out.println("---> Tiene los siguientes 2 titulos en prestamo:");
		System.out.println("* El Cuaderno Dorado, escrito por Doris Lessing.");
		System.out.println("* Rayuela, escrito por Julio Cortazar.");
		
		System.out.println("\nY tu programa lo muestra de este modo:\n");
		usuario1.imprimir();
		System.out.println("\n===============================================================");

		//fail("Mira los mensajes que se muestran en la consola del sistema, y si todo ha ido bien elimina o comenta este fail");
	}
	@Test
	public void testUsuario () {
		assertTrue(usuario1.tieneMismoId(usuario1));
	}
	
	@Test
	public void testTieneEsteId() {
		assertTrue(usuario1.tieneEsteId(1099));
	}
	
	@Test
	public void testTieneMismoId() {
		assertTrue(usuario1.tieneMismoId(usuario1));
	}
	
	@Test
	public void testHaAlcanzadoElMaximo() {
		assertFalse(usuario1.haAlcanzadoElMaximo());
		Libro l3=new Libro("Me lo he inventado", "Enigma Furgencio",3);
		usuario1.anadirLibro(l1);
		usuario1.anadirLibro(l2);
		usuario1.anadirLibro(l3);
		assertTrue(usuario1.haAlcanzadoElMaximo());
	}
	
	@Test
	public void testAnadirLibro() {
		Libro l3=new Libro("Me lo he inventado", "Enigma Furgencio",3);
		usuario1.anadirLibro(l1);
		assertFalse(usuario1.haAlcanzadoElMaximo());
		usuario1.anadirLibro(l2);
		assertFalse(usuario1.haAlcanzadoElMaximo());
		usuario1.anadirLibro(l3);
		assertTrue(usuario1.haAlcanzadoElMaximo());
	}
	
	@Test
	public void testEliminarLibro() {
		//Comprobar que sin libros es capaz de hacer algo o da error.
		//Comprobar que elimina un libro de forma correcta.
		usuario1.eliminarLibro(l1);
		assertFalse(usuario1.haAlcanzadoElMaximo());
		usuario1.anadirLibro(l1);
		usuario1.anadirLibro(l2);
		Libro l3=new Libro("Me lo he inventado", "Enigma Furgencio",3);
		usuario1.anadirLibro(l3);
		usuario1.eliminarLibro(l3);
		assertFalse(usuario1.haAlcanzadoElMaximo());
		usuario1.eliminarLibro(l3);
		assertFalse(usuario1.haAlcanzadoElMaximo());
	}
	
	@Test
	public void testLoTieneEnPrestamo() {
		assertFalse(usuario1.loTieneEnPrestamo(l1));
		usuario1.anadirLibro(l1);
		assertTrue(usuario1.loTieneEnPrestamo(l1));
		assertFalse(usuario1.loTieneEnPrestamo(l2));
	}
}

