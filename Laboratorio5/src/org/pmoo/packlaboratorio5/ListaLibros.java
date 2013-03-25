package org.pmoo.packlaboratorio5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaLibros
{
    // atributos
	private ArrayList<Libro> lista;
	
	// constructora
	
	public ListaLibros()
	{
		this.lista = new ArrayList<Libro>();
	}

	// otros métodos
	
	public int getTamano()
	{  
		return this.lista.size();
	}
  
	private Iterator<Libro> getIterador()
	{
		return this.lista.iterator();
	}
  
	public Libro buscarLibroPorId(int pIdLibro)
	{
	   Iterator<Libro> it = this.getIterador();
	   Libro l1 = null;
	   boolean found = false;
	   while(it.hasNext() && !found) {
		   l1 = it.next();
		   if(l1.getIdLibro() == pIdLibro) {
			   found = true;
		   }else {
			   l1 = null;
		   }
	   }
	   return l1;
	}
  
	public boolean esta(Libro pLibro)
	{
		return this.lista.contains(pLibro);
	}
	public void anadirLibro(Libro pLibro)
	{
	   if(!this.esta(pLibro)) {
		   this.lista.add(pLibro);
	   }else {
		   System.out.println("El libro que intenta añadir ya existe");
	   }
	}
	public void eliminarLibro(Libro pLibro)
	{
	   if(this.esta(pLibro)) {
		   this.lista.remove(pLibro);
	   }else {
		   System.out.println("El libro que intenta eliminar no existe");
	   }
	}
	
	public void imprimir()
	{
		Iterator<Libro> it = this.getIterador();
		Libro l1;
		while(it.hasNext()) {
			l1 = it.next();
			l1.imprimir();
		}
	}
}
