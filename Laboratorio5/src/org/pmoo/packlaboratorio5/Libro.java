//Author -> Mulero Martínez, Rubén
//Author -> Esteban García, Asier

package org.pmoo.packlaboratorio5;

public class Libro
{
	
	// atributos
	private String titulo;
	private String autor;
	private int idLibro;
	
	// constructora
	
	public Libro(String pTitulo, String pAutor, int pIdLibro)
	{
		this.titulo = pTitulo;
		this.autor = pAutor;
		this.idLibro = pIdLibro;
	} 

	// getters y setters
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public int getIdLibro()
	{
		return this.idLibro;
	}
	
	public String getAutor()
	{
		return this.autor;
	}
	
	// otros métodos
	
	public boolean tieneEsteId (int pIdLibro)
	{
		boolean result = false;
		if(this.getIdLibro() == pIdLibro) {
			result = true;
		}
		return result;
	}
	
	public void imprimir() 
	{
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Autor: "+this.getAutor());
		System.out.println("Identificador: "+this.getIdLibro());
	}
}
