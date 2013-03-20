package org.pmoo.packlaboratorio5;

import java.util.ArrayList;

public class Catalogo
{
	// atributos
	private static Catalogo miListaCatalogo = null;
	private ListaLibros lista;
	// constructora
	
	private Catalogo()
	{ 
		lista = new ListaLibros();
	}
	
	// getters y setters
	
 	public static Catalogo getCatalogo() 
	{
		if(miListaCatalogo == null) {
			miListaCatalogo = new Catalogo();
		}
		return miListaCatalogo;
	}

 	// otros métodos
 	
 	public int getTamano()
 	{
 	  return this.lista.getTamano();
 	}
 	 	
 	public Libro buscarLibroPorId(int pIdLibro)
 	{
 	 	  return this.lista.buscarLibroPorId(pIdLibro);
 	}
 	
 	public void prestarLibro(int pIdLibro, int pIdUsuario)
	{
 		Libro lib = this.lista.buscarLibroPorId(pIdLibro);
 		ListaUsuarios lUsu = ListaUsuarios.getListaUsuarios();
 		Usuario usu = lUsu.buscarUsuarioPorId(pIdUsuario);
		//Comprobar si existe el libro
		if(lib != null){
			//Comprobar si existe el usuario
			if(usu != null) {
				//Comprobar si ha alcanzado el limite de libros prestados
				if(!usu.haAlcanzadoElMaximo()) {
					//Comprobar que el libro no esté prestado
					if(lUsu.quienLoTienePrestado(lib) == null) {
						//Se añade el libro
						usu.anadirLibro(lib);
					}else {
						System.out.println("El libro que se intenta presta, lo tiene prestado otro usuario");
					}
				}else {
					System.out.println("El usuarios ha alcanzado el maximo de libros");
				}
			}else {
				System.out.println("El usuario introducido no existe");
			}
		}else {
			System.out.println("El libro introducido no existe");
		}
	}

 	public void devolverLibro(int pIdLibro)
	{
		ListaUsuarios lUsu = ListaUsuarios.getListaUsuarios();
		Libro lib = this.lista.buscarLibroPorId(pIdLibro);
		//Comprobamos que el libro exista.
	}
 	
 	public void catalogarLibro(Libro pLibro)
 	{
		
 	}

 	public void descatalogarLibro(int pIdLibro)
 	{
		
 	}

 	public void imprimir()
 	{
 		 		
 	}

 	public void resetear()
 	{
 		
 	}
 	
}	