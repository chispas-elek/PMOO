package org.pmoo.packlaboratorio5;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaUsuarios
{
	// atributos
	private ArrayList<Usuario> lista;
	private static ListaUsuarios miListaUsuarios = null;
	
	// constructora
	
    private ListaUsuarios()
    { 
    	lista = new ArrayList<Usuario>();
    }
   	
    // getters y setters
    
   	public synchronized static ListaUsuarios getListaUsuarios()
   	{
   		if(miListaUsuarios == null) {
   			miListaUsuarios = new ListaUsuarios();
   		}
   		return miListaUsuarios;
   	}

   	// otros métodos
   	
   	public int getTamano()
   	{
   		return lista.size();
   	}
   	
   	private Iterator<Usuario> getIterador()
   	{
   		return lista.iterator();
   	}
    
   	public Usuario buscarUsuarioPorId(int pId)
   	{
   		Iterator<Usuario> it = this.getIterador();
   		boolean encontrado = false;
   		Usuario usu = null;
   		while(it.hasNext() && encontrado == false) {
   			usu = it.next();
   			if(usu.tieneEsteId(pId)) {
   				encontrado = true;
   			}
   		}
   		return usu;
   	}
   	
   	public boolean existeUsuarioConMismoId(Usuario pUsuario)
   	{
   		Iterator<Usuario> it = this.getIterador();
   		boolean existe = false;
   		Usuario usu;
   		while(it.hasNext() && existe == false) {
   			usu = it.next();
   			if(usu.tieneMismoId(pUsuario)) {
   				existe = true;
   			}
   		}
   		return existe;
   	}
   	
   	public void darDeAltaUsuario(Usuario pUsuario)
   	{
	   	
   	}

	public void darDeBajaUsuario(int pIdUsuario)
	{
		
   	}

   	public Usuario quienLoTienePrestado(Libro pLibro)
   	{
   		
   	}

   	public void imprimir()
   	{	
   		 
   	}
   
   	public void resetear()
   	{
   		
   	}

}
