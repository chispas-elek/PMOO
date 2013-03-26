
package org.pmoo.packlaboratorio5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CatalogoTest extends TestCase
{
	
	private Libro l1;
	private Libro l2;
	private Libro l3;
	private Libro l4;
	
	private Usuario e1;
	private Usuario e2;
	
	@Before
	public void setUp()
	{
		l1 = new Libro("Construcción de software orientado a objetos", "Bertrand Meyer",1);
		l2 = new Libro("Cien años de soledad", "Gabriel García Márquez",2); 
		l3 = new Libro("El hobbit", "JRR Tolkien",3);
		l4=  new Libro("El perfume", "Patrick Suskind",4);
		
		e1=new Usuario("Kepa Sarasola", 2);	
	    e2=new Usuario("Armando Guerra", 1);
				
		
		Catalogo.getCatalogo().catalogarLibro(l1);
		Catalogo.getCatalogo().catalogarLibro(l2);
		Catalogo.getCatalogo().catalogarLibro(l3);
		
		ListaUsuarios.getListaUsuarios().darDeAltaUsuario(e1);
		ListaUsuarios.getListaUsuarios().darDeAltaUsuario(e2);
	}
	
	@After
	public void tearDown()
	{
		l1 = null;
		l2 = null;
		l3 = null;
		
		e1=null;
		e2=null;
		
		Catalogo.getCatalogo().resetear();
		ListaUsuarios.getListaUsuarios().resetear();
	}
	
	
	@Test
	public void testimprimir()
	{
		assertEquals(3,Catalogo.getCatalogo().getTamano());
	
		System.out.println("\n===============================================================");
		System.out.println("\nCaso de prueba del método imprimir de la clase Catalogo");
		System.out.println("\nLa información de la lista de usuarios debería mostrarse de este modo:\n");
		System.out.println("El catálogo tiene un total de 3 títulos.");
		System.out.println("* Construcción de software orientado a objetos, escrito por Bertrand Meyer.");
		System.out.println("* Cien años de soledad, escrito por Gabriel García Márquez.");
		System.out.println("* El hobbit, escrito por JRR Tolkien.");

		System.out.println("\nY tu programa lo muestra de este modo:");
		Catalogo.getCatalogo().imprimir();
		System.out.println("\n===============================================================");
		
		Catalogo.getCatalogo().descatalogarLibro(1);
		Catalogo.getCatalogo().descatalogarLibro(2);
		Catalogo.getCatalogo().descatalogarLibro(3);
		//Habrá que revisar ésta parte porque se supone que no puedes eliminar un libro si lo tiene un usuario
		//assertEquals(0,Catalogo.getCatalogo().getTamano());	
		
	}
		
	@Test
	public void testGetCatalogo() {
		assertEquals(3,Catalogo.getCatalogo().getTamano());
	}
	
	@Test
	public void testBuscarLibroPorId() {
		assertEquals(l1,Catalogo.getCatalogo().buscarLibroPorId(1));
		assertEquals(null,Catalogo.getCatalogo().buscarLibroPorId(23));
	}
	
	@Test
	public void testPrestarLibro() {
		Usuario u1 = ListaUsuarios.getListaUsuarios().buscarUsuarioPorId(2);
		//El usuario no tiene ningun libro prestado
		Catalogo.getCatalogo().prestarLibro(1, 2);
		assertFalse(u1.haAlcanzadoElMaximo());
		//El libro no existe
		Catalogo.getCatalogo().prestarLibro(23, 2);
		assertFalse(u1.haAlcanzadoElMaximo());
		//El usuario no existe
		Catalogo.getCatalogo().prestarLibro(1, 4);
		assertFalse(u1.haAlcanzadoElMaximo());
		//Hemos insertado el mismo libro otra vez
		Catalogo.getCatalogo().prestarLibro(1, 2);
		assertFalse(u1.haAlcanzadoElMaximo());
		//El usuario ha alcanzado el limite de libros
		Catalogo.getCatalogo().prestarLibro(2, 2);
		Catalogo.getCatalogo().prestarLibro(3, 2);
		Catalogo.getCatalogo().catalogarLibro(l4);
		Catalogo.getCatalogo().prestarLibro(4, 2);
		assertTrue(u1.haAlcanzadoElMaximo());
	}
	
	@Test
	public void testDevolverLibro() {
		Usuario u1 = ListaUsuarios.getListaUsuarios().buscarUsuarioPorId(2);
		Catalogo.getCatalogo().prestarLibro(1, 2);
		//El libro no existe
		Catalogo.getCatalogo().devolverLibro(5);
		assertFalse(u1.haAlcanzadoElMaximo());
		//El usuario no tiene ese libro
		Catalogo.getCatalogo().devolverLibro(3);
		assertFalse(u1.haAlcanzadoElMaximo());
		//El usuario devuelve el libro
		u1.imprimir();
		Catalogo.getCatalogo().devolverLibro(1);
		u1.imprimir();
		assertFalse(u1.haAlcanzadoElMaximo());
	}
	
	@Test
	public void  testCatalogarLibro() {
		Catalogo.getCatalogo().resetear();
		Catalogo.getCatalogo().catalogarLibro(l1);
		assertEquals(1,Catalogo.getCatalogo().getTamano());
		//Comprobamos que no se pueda introducir 2 veces
		Catalogo.getCatalogo().catalogarLibro(l1);
		assertEquals(1,Catalogo.getCatalogo().getTamano());
	}
	
	@Test
	public void testDescatalogarLibro() {
		//Intenamos quitar un libro que ya está prestado
		Catalogo.getCatalogo().prestarLibro(1, 2);
		Catalogo.getCatalogo().descatalogarLibro(1);
		assertEquals(3,Catalogo.getCatalogo().getTamano());
		//Intenamos quitar un libro que no existe
		Catalogo.getCatalogo().descatalogarLibro(23);
		assertEquals(3,Catalogo.getCatalogo().getTamano());
		//Eliminamos el libro
		Catalogo.getCatalogo().devolverLibro(1);
		Catalogo.getCatalogo().descatalogarLibro(1);
		assertEquals(2,Catalogo.getCatalogo().getTamano());
	}
	
	@Test
	public void testResetear() {
		Catalogo.getCatalogo().resetear();
		assertEquals(0,Catalogo.getCatalogo().getTamano());
	}
}
