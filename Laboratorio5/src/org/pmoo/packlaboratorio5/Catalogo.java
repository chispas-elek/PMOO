package org.pmoo.packlaboratorio5;

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
		if(lib != null) {
			//Buscar el usuario que tiene el libro.
			Usuario usu = lUsu.quienLoTienePrestado(lib);
			if(usu != null) {
				usu.eliminarLibro(lib);
			}else {
				System.out.println("No existe ningun usuario con el libro prestado");
			}
		}else {
			System.out.println("El libro que intentas devolver no existe");
		}
	}
 	
 	public void catalogarLibro(Libro pLibro)
 	{
 		if(!this.lista.esta(pLibro)) {
 			this.lista.anadirLibro(pLibro);
 		}else {
 			System.out.println("El libro que intentas introducir ya existe");
 		}
 	}

 	public void descatalogarLibro(int pIdLibro)
 	{
 		Libro l1 = this.lista.buscarLibroPorId(pIdLibro);
 		//Comprobamos si existe el libro
 		if(l1 != null) {
 			//Comprobamos si un usuario al menos tiene el libro
 			ListaUsuarios usu = ListaUsuarios.getListaUsuarios();
 			if(usu.quienLoTienePrestado(l1) != null) {
 				this.lista.eliminarLibro(l1);
 			}else {
 				System.out.println("Un usuario tiene el libro en préstamo, no puedes descatalogarlo hasta que dicho usuario lo devuelva");
 			}
 		}else {
 			System.out.println("El libro que intentas descatalogar no existe");
 		}
 	}

 	public void imprimir()
 	{
 		System.out.println("El catálogo tiene un tamaño de "+this.lista.getTamano());
 		this.lista.imprimir();
 	}

 	public void resetear()
 	{
 		this.lista = null;
 		this.lista = new ListaLibros();
 	}
 	
}	