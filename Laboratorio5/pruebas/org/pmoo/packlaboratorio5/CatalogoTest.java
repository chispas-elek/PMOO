
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
		assertEquals(0,Catalogo.getCatalogo().getTamano());	
		
		fail("Mira los mensajes que se muestran en la consola del sistema, y si todo ha ido bien elimina o comenta este fail");
		
	}
		
}
